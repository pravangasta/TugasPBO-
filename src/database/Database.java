package database;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Database {
        
    private Connection koneksi;
        
        public Connection connect(){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Berhasil Load Driver");
            } catch (ClassNotFoundException cnfe){
                System.out.println("Tidak Ditemukan Driver " +cnfe);
            }
                
            // Koneksi Ke Database
            try{
                String url = "jdbc:mysql://localhost:3306/kepegawaian"; //3306 adalah port mysql, coba lihat di control panel xampp
                koneksi = (Connection) DriverManager.getConnection(url,"root","");
                System.out.println("Berhasil Terkoneksi");     
            } catch(SQLException se){
                System.out.println("Gagal Terkoneksi" + "\n" + se);
                JOptionPane.showMessageDialog(null, "Gagal Terkoneksi ke Database : " + "\n" + se,
                "Peringatan",JOptionPane.WARNING_MESSAGE);
            }
            return koneksi;
        }
            
        public void insertDb(int nik, String nama, String pob, Date dob, String email, String jabatan, int gajiPokok, Date tglKerja, int absensi)throws SQLException { 
            // Mengambil objek dan memanggil koneksi method dari kelas Database
            koneksi = new Database().connect();
            try{
                String sql = "insert into pegawai values(?,?,?,?,?,?,?,?,?,?,?,?);";
                PreparedStatement stmt = koneksi.prepareStatement(sql);
                try{
                    int pensiun = new java.util.Date().getYear() - tglKerja.getYear();
                    int gajiAbsensi = absensi * 100000;
                    int gajiTotal = gajiPokok + gajiAbsensi;
                    System.out.println("Pensiun : " + pensiun);
                    System.out.println("Gaji Absensi : " + gajiAbsensi);
                    System.out.println("Gaji Total : " + gajiTotal);
                    
                    // Memasukkan data ke column pada tabel yang ada di database
                    stmt.setInt(1,nik);
                    stmt.setString(2,nama);
                    stmt.setString(3,pob);
                    stmt.setDate(4,dob);
                    stmt.setString(5,email);
                    stmt.setString(6,jabatan);
                    stmt.setDate(7,tglKerja);
                    stmt.setInt(8,pensiun);
                    stmt.setInt(9,absensi);
                    stmt.setInt(10,gajiPokok);
                    stmt.setInt(11,gajiAbsensi);
                    stmt.setInt(12,gajiTotal);
                    stmt.executeUpdate();
                    
                    JOptionPane.showMessageDialog(null, "Database Berhasil Menyimpan Data");
                    System.out.println("Database Berhasil Menyimpan Data");
                }catch (SQLException se){
                    JOptionPane.showMessageDialog(null,se.getMessage(), "Database Gagal Menyimpan Data", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Database Gagal Menyimpan Data\n" + se.getMessage());
                } stmt.close();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Koneksi Database Gagal", JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }
        }
        
        public DefaultTableModel selectDb(){
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("NIK");
            dtm.addColumn("Nama");
            dtm.addColumn("Tempat Lahir");
            dtm.addColumn("Tanggal Lahir");
            dtm.addColumn("Email");
            dtm.addColumn("Jabatan");
            dtm.addColumn("Tanggal Masuk Kerja");
            dtm.addColumn("Masa Pensiun");
            dtm.addColumn("Absensi");
            dtm.addColumn("Gaji Pokok");
            dtm.addColumn("Gaji Absensi");
            dtm.addColumn("Gaji Total");
            
            try{
                koneksi = new Database().connect();
                String sql = "select * from pegawai";
                java.sql.PreparedStatement stmt = koneksi.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()){
                    dtm.addRow(new Object[]{
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDate(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getDate(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10),
                        rs.getInt(11),
                        rs.getInt(12)});
                    /*
                     int kode_pegawai = rs.getInt("nik");
                     String nama = rs.getString("nama");
                     String pob = rs.getString("pob");
                     Date dob = rs.getDate("dob");
                     String email = rs.getString("email");
                     String jabatan = rs.getString("jabatan");
                     int gajiPokok = rs.getInt("gajiPokok");
                     Date tglKerja = rs.getDate("tglKerja");
                     int pensiun = rs.getInt("pensiun");
                     int absensi = rs.getInt("absensi");
                     int gajiAbsensi = rs.getInt("gajiAbsensi");
                     int totalGaji = rs.getInt("totalGaji");
                    */
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            return dtm;
       }
        
}