package database;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



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
            
        public void setData(int kd_pegawai, String nama, String pob, Date dob, String Alamat, String Jenis_Kelamin, int Pensiun, String jabatan, int Gaji)throws SQLException { 
            //Mengambil Objek dan Memanggil Koneksi Metode dari Class Database
            koneksi = new Database().connect();
            try{
                String sql = "insert into pegawai values(?,?,?);";
                java.sql.PreparedStatement stmt = koneksi.prepareStatement(sql);
                try{
                    //Insert Data to the Table based on the Data Type that We Have Made
                    stmt.setInt(1,kd_pegawai);
                    stmt.setString(2,nama);
                    stmt.setString(3, pob);
                    stmt.setDate(4,dob);
                    stmt.setString(5,Alamat);
                    stmt.setString(6,Jenis_Kelamin);
                    stmt.setInt(7,Pensiun);
                    stmt.setString(8,jabatan);
                    stmt.setInt(9,Gaji);
                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
                }
                catch (SQLException se){
                    JOptionPane.showMessageDialog(null,"Data Gagal Disimpan" + se.getMessage());
                } stmt.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
       public void selectData(){
           koneksi = new Database().connect();
           try{
               String sql = "select * from hrd";
               java.sql.PreparedStatement stmt = koneksi.prepareStatement(sql);
               ResultSet rs = stmt.executeQuery(sql);
               while (rs.next()){
                    int Nomor_Pegawai = rs.getInt("kd_pegawai");
                    String Nama = rs.getString("nama");
                    String pob = rs.getString("pob");
                    Date dob = rs.getDate("dob");
                    String Alamat = rs.getString("alamat");
                    String kelamin = rs.getString("kelamin");
                    int Pensiun = rs.getInt("tgl_kerja");
                    String Jabatan = rs.getString("jabatan");
                    int Gaji = rs.getInt("gaji");
                   
                    System.out.println("\nDatabase Pegawai : " +rs.getRow());
                    System.out.println("NIK : " + Nomor_Pegawai);
                    System.out.println("Nama : " + Nama);
                    System.out.println("Tanggal Lahir : " + dob);
                    System.out.println("Alamat : " + Alamat);
                    System.out.println("Jenis Kelamin : " + kelamin);
                    System.out.println("Pensiun : " + Pensiun);
                    System.out.println("Jabatan : " + Jabatan);
                    System.out.println("Gaji : " + Gaji);
               }
           }
           catch (Exception e){
               System.out.println(e.getMessage());
           }
       }
}