/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanModul6;

/**
 *
 * @author user
 */
public class Kuis1 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan1
     */
    public Kuis1() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Absen = new javax.swing.JTextField();
        Matpel = new javax.swing.JTextField();
        Nilai = new javax.swing.JTextField();
        Proses = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hasil = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PENILAIAN SISWA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 10, 260, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nama");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 50, 50, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Absen");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 90, 60, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Matpel");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 130, 60, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nilai");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 170, 50, 17);

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        jPanel1.add(Nama);
        Nama.setBounds(130, 50, 140, 30);

        Absen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbsenActionPerformed(evt);
            }
        });
        jPanel1.add(Absen);
        Absen.setBounds(130, 90, 140, 30);

        Matpel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatpelActionPerformed(evt);
            }
        });
        jPanel1.add(Matpel);
        Matpel.setBounds(130, 130, 140, 30);

        Nilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NilaiActionPerformed(evt);
            }
        });
        jPanel1.add(Nilai);
        Nilai.setBounds(130, 170, 140, 30);

        Proses.setText("Proses");
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });
        jPanel1.add(Proses);
        Proses.setBounds(110, 210, 80, 30);

        Hasil.setEditable(false);
        Hasil.setColumns(20);
        Hasil.setRows(5);
        jScrollPane1.setViewportView(Hasil);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 250, 260, 120);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 310, 390);

        setBounds(0, 0, 328, 430);
    }// </editor-fold>//GEN-END:initComponents

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void MatpelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatpelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatpelActionPerformed

    private void AbsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbsenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbsenActionPerformed

    private void NilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NilaiActionPerformed

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed
        // TODO add your handling code here:
        String nama = Nama.getText();
        String absen = Absen.getText();
        String matpel = Matpel.getText();
        int nilai = Integer.parseInt(Nilai.getText().toString());
        String h ="";
        
        if(nilai > 100){
           h = "Amazing";
        }else if(nilai <= 100 && nilai >=90){
           h = "Sempurna";
        }else if(nilai  < 90 && nilai >= 75){
           h = "Lulus";
        } else {
           h = "Tidak Lulus";
        }
        
        Hasil.setText("Nama : "+nama+"\nAbsen : "+absen+"\nMata Pelajaran : "+matpel+"\nNilai : " + nilai+"\nKeterangan : "+h);
        
    }//GEN-LAST:event_ProsesActionPerformed

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
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kuis1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JTextArea Hasil;
    private javax.swing.JTextField Matpel;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nilai;
    private javax.swing.JButton Proses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
