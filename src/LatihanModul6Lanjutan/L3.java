/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanModul6Lanjutan;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class L3 extends javax.swing.JFrame {

    /**
     * Creates new form L3
     */
    public L3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Panjang = new javax.swing.JTextField();
        Lebar = new javax.swing.JTextField();
        Tinggi = new javax.swing.JTextField();
        Hitung = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Sisi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Htgvolume = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Jarijari = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Volume = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("PROGRAM PENCARI VOLUME BANGUN RUANG");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 350, 30);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Masukkan Panjang :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 10, 110, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Masukkan Lebar    :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 50, 120, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Masukkan Tinggi   :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 90, 120, 20);

        Panjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PanjangActionPerformed(evt);
            }
        });
        jPanel1.add(Panjang);
        Panjang.setBounds(160, 10, 110, 30);

        Lebar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LebarActionPerformed(evt);
            }
        });
        jPanel1.add(Lebar);
        Lebar.setBounds(160, 50, 110, 30);

        Tinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TinggiActionPerformed(evt);
            }
        });
        jPanel1.add(Tinggi);
        Tinggi.setBounds(160, 90, 110, 30);

        Hitung.setText("HITUNG");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });
        jPanel1.add(Hitung);
        Hitung.setBounds(113, 160, 80, 30);

        jLabel7.setText("cm");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(280, 20, 34, 14);

        jLabel8.setText("cm");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(280, 60, 30, 14);

        jLabel9.setText("cm");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(280, 100, 30, 14);

        jTabbedPane1.addTab("Balok", jPanel1);

        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Masukkan Panjang Sisi   :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(28, 11, 190, 30);
        jPanel2.add(Sisi);
        Sisi.setBounds(30, 50, 140, 30);

        jLabel6.setText("cm");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(180, 60, 13, 20);

        Htgvolume.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Htgvolume.setText("VOLUME");
        Htgvolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HtgvolumeActionPerformed(evt);
            }
        });
        jPanel2.add(Htgvolume);
        Htgvolume.setBounds(30, 100, 100, 30);

        jTabbedPane1.addTab("Kubus", jPanel2);

        jPanel3.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Masukkan panjang jari - jari :");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(19, 11, 210, 30);

        Jarijari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JarijariActionPerformed(evt);
            }
        });
        jPanel3.add(Jarijari);
        Jarijari.setBounds(20, 40, 170, 40);

        jLabel11.setText("cm");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(200, 60, 40, 14);

        Volume.setText("VOLUME");
        Volume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolumeActionPerformed(evt);
            }
        });
        jPanel3.add(Volume);
        Volume.setBounds(30, 100, 90, 30);

        jTabbedPane1.addTab("Bola", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 60, 360, 340);

        setBounds(0, 0, 391, 449);
    }// </editor-fold>//GEN-END:initComponents

    private void TinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TinggiActionPerformed

    private void PanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PanjangActionPerformed

    private void LebarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LebarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LebarActionPerformed

    private void JarijariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JarijariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JarijariActionPerformed

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        // TODO add your handling code here:
        int panjang, lebar ,tinggi ;
        panjang = Integer.parseInt(Panjang.getText());
        lebar = Integer.parseInt(Lebar.getText());
        tinggi = Integer.parseInt(Tinggi.getText());
        int hasil = panjang * lebar * tinggi;
        try{
            JOptionPane.showMessageDialog(null,"Volume Balok adalah : "+hasil,"luas",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error:" +e,"Gagal", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_HitungActionPerformed

    private void HtgvolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HtgvolumeActionPerformed
        // TODO add your handling code here:
        int sisi;
        sisi=Integer.parseInt(Sisi.getText());
        int hasil = sisi*sisi*sisi;
         try{
            JOptionPane.showMessageDialog(null,"Luas Permukaan kubus  adalah : "+hasil,"luas",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error:" +e,"Gagal", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_HtgvolumeActionPerformed

    private void VolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolumeActionPerformed
        // TODO add your handling code here:
        float jari;
        jari = Integer.parseInt(Jarijari.getText());
        float hasil = (float) (4/3*3.14*jari*jari*jari);
         try{
            JOptionPane.showMessageDialog(null,"Luas Permukaan bola  adalah : "+hasil,"luas",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error:" +e,"Gagal", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_VolumeActionPerformed

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
            java.util.logging.Logger.getLogger(L3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(L3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(L3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(L3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new L3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hitung;
    private javax.swing.JButton Htgvolume;
    private javax.swing.JTextField Jarijari;
    private javax.swing.JTextField Lebar;
    private javax.swing.JTextField Panjang;
    private javax.swing.JTextField Sisi;
    private javax.swing.JTextField Tinggi;
    private javax.swing.JButton Volume;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
