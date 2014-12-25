/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utama;

import database.Database;
import com.mysql.jdbc.Connection;
import com.toedter.calendar.JDateChooser;
import java.sql.Date;
import javax.swing.JOptionPane;

public class hrd {
    public static void main(String[]args){

        Database db = new Database();

        try{
            String Nomor_Pegawai = JOptionPane.showInputDialog("Masukan Nomor pegawai");
            String Nama = JOptionPane.showInputDialog("Masukan nama ");
            String TTL = JOptionPane.showInputDialog("Masukan Tanggal & Tahun Lahir");
            String Alamat = JOptionPane.showInputDialog("Masukan Alamat ");
            String Jenis_Kelamin = JOptionPane.showInputDialog("Masukan Jenis Kelamin ");
            String Pensiun = JOptionPane.showInputDialog("Umur Pensiun ");
            String Jabatan = JOptionPane.showInputDialog("Masukan Jabatan ");
            String Gaji = JOptionPane.showInputDialog("Masukan Gaji ");
            
            JDateChooser date = new JDateChooser();
            date.setDate(null);

             int i = Integer.parseInt(Nomor_Pegawai);
             int g = Integer.parseInt(Gaji);
             Date ttl = Date.valueOf(TTL);
             int p = Integer.parseInt(Pensiun);
             
            db.setData(i, Nama, ttl, Alamat, Jenis_Kelamin, p, Jabatan, g);
            db.select();

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
}
