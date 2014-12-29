/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utama;

import com.toedter.calendar.JCalendar;
import database.Database;
import java.awt.BorderLayout;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Buqu Global
 */
public class ViewPegawai extends javax.swing.JFrame {

    /**
     * Creates new form TabelPegawai
     */
    public ViewPegawai() {
        initComponents();
    }
    
    private void tampilTabel(){
        Database db = new Database();
        DefaultTableModel dtmDb = db.selectDb(), dtm = new DefaultTableModel();
        /*
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
        tabelDb.setModel(dtm);
        */
        dtmDb.fireTableDataChanged();
        tabelDb.setModel(dtmDb);
    }
    
    private void refresh(){
        jtf_nik.setText("");
        jtf_nama.setText("");
        jtf_tmpLahir.setText("");
        jdc_tglLahir.setDate(null);
        jtf_email.setText("");
        jtf_jabatan.setText("");
        jtf_gajiPokok.setText("");
        jdc_tglKerja.setDate(null);
        jtf_absensi.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_header = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtf_nik = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtf_nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtf_tmpLahir = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jdc_tglLahir = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jtf_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtf_jabatan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtf_gajiPokok = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jdc_tglKerja = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jtf_absensi = new javax.swing.JTextField();
        jb_simpan = new javax.swing.JButton();
        jb_ubah = new javax.swing.JButton();
        jb_hapus = new javax.swing.JButton();
        jb_tampil = new javax.swing.JButton();
        jb_keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDb = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setAutoscrolls(true);

        lbl_header.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lbl_header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_header.setText("DATA KEPEGAWAIAN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("NIK");

        jtf_nik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nikActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nama");

        jtf_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_namaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Tempat Lahir");

        jtf_tmpLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_tmpLahirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Tanggal Lahir");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Email");

        jtf_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_emailActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Jabatan");

        jtf_jabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_jabatanActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Gaji Pokok");

        jtf_gajiPokok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_gajiPokokActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Tanggal Masuk Kerja");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Absensi");

        jtf_absensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_absensiActionPerformed(evt);
            }
        });

        jb_simpan.setText("Simpan");
        jb_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_simpanActionPerformed(evt);
            }
        });

        jb_ubah.setText("Ubah");
        jb_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ubahActionPerformed(evt);
            }
        });

        jb_hapus.setText("Hapus");

        jb_tampil.setText("Tampil");
        jb_tampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_tampilActionPerformed(evt);
            }
        });

        jb_keluar.setText("Keluar");
        jb_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_keluarActionPerformed(evt);
            }
        });

        tabelDb.setAutoCreateRowSorter(true);
        tabelDb.setBackground(new java.awt.Color(204, 255, 255));
        tabelDb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelDb.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabelDb.setCellSelectionEnabled(true);
        tabelDb.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tabelDb.setGridColor(new java.awt.Color(153, 51, 0));
        tabelDb.setMaximumSize(new java.awt.Dimension(2147483647, 1200000000));
        tabelDb.setMinimumSize(new java.awt.Dimension(60, 120));
        tabelDb.setPreferredSize(new java.awt.Dimension(500, 800));
        tabelDb.setRowHeight(20);
        jScrollPane1.setViewportView(tabelDb);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPane1))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(134, 134, 134)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(jLabel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(jLabel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jtf_email, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 308, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jtf_tmpLahir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 308, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jtf_nama, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 308, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jtf_gajiPokok, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 308, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jdc_tglLahir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jtf_jabatan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 308, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jdc_tglKerja, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jtf_absensi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 309, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(134, 134, 134)
                                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jtf_nik, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 308, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(246, 246, 246)
                                .add(lbl_header)))
                        .add(0, 302, Short.MAX_VALUE)))
                .addContainerGap())
            .add(jPanel1Layout.createSequentialGroup()
                .add(151, 151, 151)
                .add(jb_tampil)
                .add(18, 18, 18)
                .add(jb_simpan)
                .add(18, 18, 18)
                .add(jb_ubah)
                .add(18, 18, 18)
                .add(jb_hapus)
                .add(18, 18, 18)
                .add(jb_keluar)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(lbl_header)
                .add(23, 23, 23)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jtf_nik, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jtf_nama, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jtf_tmpLahir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4))
                .add(6, 6, 6)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel5)
                    .add(jdc_tglLahir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel6)
                    .add(jtf_email, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(jtf_jabatan, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(jtf_gajiPokok, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(jdc_tglKerja, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel9)
                    .add(jtf_absensi, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(23, 23, 23)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jb_ubah)
                    .add(jb_simpan)
                    .add(jb_tampil)
                    .add(jb_hapus)
                    .add(jb_keluar))
                .add(55, 55, 55)
                .add(jScrollPane1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_nikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nikActionPerformed

    private void jtf_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_namaActionPerformed

    private void jtf_tmpLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_tmpLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_tmpLahirActionPerformed

    private void jtf_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_emailActionPerformed

    private void jtf_gajiPokokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_gajiPokokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_gajiPokokActionPerformed

    private void jb_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_simpanActionPerformed
            int nik = Integer.parseInt(jtf_nik.getText());
            int gajiPokok = Integer.parseInt(jtf_gajiPokok.getText());
            int absensi = Integer.parseInt(jtf_absensi.getText());
            Date dob = new Date(jdc_tglLahir.getDate().getTime());
            Date tglKerja = new Date(jdc_tglKerja.getDate().getTime());
            
        try {
            Database db = new Database();
            db.insertDb(nik, jtf_nama.getText(), jtf_tmpLahir.getText(), dob, jtf_email.getText(), jtf_jabatan.getText(), gajiPokok, tglKerja, absensi);
            refresh();
            tampilTabel();
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, se, "Gagal Menyimpan Data", JOptionPane.ERROR_MESSAGE);
            System.out.println("Gagal menyimpan data\n" + se);
        }
        
    }//GEN-LAST:event_jb_simpanActionPerformed

    private void jtf_jabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_jabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_jabatanActionPerformed

    private void jtf_absensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_absensiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_absensiActionPerformed

    private void jb_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ubahActionPerformed
        
    }//GEN-LAST:event_jb_ubahActionPerformed

    private void jb_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_keluarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jb_keluarActionPerformed

    private void jb_tampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_tampilActionPerformed
        // TODO add your handling code here:
        Database db = new Database();
        tabelDb.setModel(db.selectDb());
    }//GEN-LAST:event_jb_tampilActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPegawai().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_hapus;
    private javax.swing.JButton jb_keluar;
    private javax.swing.JButton jb_simpan;
    private javax.swing.JButton jb_tampil;
    private javax.swing.JButton jb_ubah;
    private com.toedter.calendar.JDateChooser jdc_tglKerja;
    private com.toedter.calendar.JDateChooser jdc_tglLahir;
    private javax.swing.JTextField jtf_absensi;
    private javax.swing.JTextField jtf_email;
    private javax.swing.JTextField jtf_gajiPokok;
    private javax.swing.JTextField jtf_jabatan;
    private javax.swing.JTextField jtf_nama;
    private javax.swing.JTextField jtf_nik;
    private javax.swing.JTextField jtf_tmpLahir;
    private javax.swing.JLabel lbl_header;
    private javax.swing.JTable tabelDb;
    // End of variables declaration//GEN-END:variables
}
