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
        }
        catch (ClassNotFoundException cnfe){
            System.out.println("Tidak Ditemukan Driver " +cnfe);
        }
                
            // Koneksi Ke Database
                try{
                    String url = "jdbc:mysql://locallhost/hed";
                    koneksi = (Connection) DriverManager.getConnection(url,"root","");
                    System.out.println("Berhasil Terkoneksi");     
                } catch(SQLException se){
                    System.out.println("Gagal Terkoneksi"+se);
                    JOptionPane.showMessageDialog(null, "Gagal Terkoneksi ke Database",
                "Peringatan",JOptionPane.WARNING_MESSAGE);
                }
                return koneksi;
        }
            
       public void setData(int Nomor_Pegawai,String Nama, Date TTL,String Alamat,String Jenis_Kelamin,int Pensiun,String Jabatan,int Gaji)throws SQLException { 
    //Mengambil Objek dan Memanggil Koneksi Metode dari Class Database
           koneksi = new Database().connect();
           try{
               String sql = "insert into pegawai values(?,?,?);";
        java.sql.PreparedStatement stmt = koneksi.prepareStatement(sql);
        try{
            //Insert Data to the Table based on the Data Type that We Have Made
            stmt.setInt(1,Nomor_Pegawai);
            stmt.setString(2,Nama);
            stmt.setDate(3,TTL);
            stmt.setString(4,Alamat);
            stmt.setString(5,Jenis_Kelamin);
            stmt.setInt(6,Pensiun);
            stmt.setString(7,Jabatan);
            stmt.setInt(8,Gaji);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Betrhasil Disimpan");
        }
        catch (SQLException se){
            JOptionPane.showMessageDialog(null,"Data Gagal Disimpan" + se.getMessage());
        } stmt.close();
           }catch (Exception e){
               System.out.println(e.getMessage());
           }
    }
       public void select(){
           koneksi = new Database().connect();
           try{
               String sql = "select * from pegawai";
               java.sql.PreparedStatement stmt = koneksi.prepareStatement(sql);
               ResultSet rs = stmt.executeQuery(sql);
               while (rs.next()){
                   int Nomor_Pegawai = rs.getInt("Nomor_Pegawai");
                   String Nama = rs.getString("Nama");
                   Date TTL = rs.getDate("TTL");
                   String Alamat = rs.getString("Alamat");
                   String Jenis_Kelamin = rs.getString("Jenis_Kelamin");
                   int Pensiun = rs.getInt("Pensiun");
                   String Jabatan = rs.getString("Jabatan");
                   int Gaji = rs.getInt("Gaji");
                   
                System.out.println("\n Database Pegawai :" +rs.getRow());
                System.out.println("Nomor_Pegawai :" +Nomor_Pegawai);
                System.out.println("Nama :" +Nama);
                System.out.println("TTL :" +TTL);
                System.out.println("Alamat :" +Alamat);
                System.out.println("Jenis_Kelamin :" +Jenis_Kelamin);
                System.out.println("Pensiun :" +Pensiun);
                System.out.println("Gaji :" +Gaji);
               }
           }
           catch (Exception e){
               System.out.println(e.getMessage());
           }
       }
}

