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
public class Kuis2 extends javax.swing.JFrame {

    /**
     * Creates new form Kuis2
     */
    public Kuis2() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Proses = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hasil = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        Harga1 = new javax.swing.JTextField();
        Harga2 = new javax.swing.JTextField();
        Harga3 = new javax.swing.JTextField();
        Harga4 = new javax.swing.JTextField();
        Discount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PEMBAYARAN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 20, 200, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Harga Barang 1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 70, 110, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Harga Barang 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 110, 110, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Harga Barang 3");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 150, 110, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Harga Barang 4");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 190, 110, 20);

        Proses.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Proses.setText("PROSES");
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });
        getContentPane().add(Proses);
        Proses.setBounds(50, 280, 77, 23);

        Delete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Delete.setText("HAPUS");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete);
        Delete.setBounds(150, 280, 71, 23);

        Exit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Exit.setText("KELUAR");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(240, 280, 75, 23);

        Hasil.setEditable(false);
        Hasil.setColumns(20);
        Hasil.setRows(5);
        jScrollPane1.setViewportView(Hasil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 330, 280, 140);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Discount");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 230, 100, 20);

        Harga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Harga1ActionPerformed(evt);
            }
        });
        getContentPane().add(Harga1);
        Harga1.setBounds(180, 70, 140, 30);

        Harga2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Harga2ActionPerformed(evt);
            }
        });
        getContentPane().add(Harga2);
        Harga2.setBounds(180, 110, 140, 30);

        Harga3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Harga3ActionPerformed(evt);
            }
        });
        getContentPane().add(Harga3);
        Harga3.setBounds(180, 150, 140, 30);

        Harga4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Harga4ActionPerformed(evt);
            }
        });
        getContentPane().add(Harga4);
        Harga4.setBounds(180, 190, 140, 30);

        Discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscountActionPerformed(evt);
            }
        });
        getContentPane().add(Discount);
        Discount.setBounds(180, 230, 140, 30);

        setBounds(0, 0, 384, 538);
    }// </editor-fold>//GEN-END:initComponents

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed
        // TODO add your handling code here:
        int nama1 = Integer.parseInt(Harga1.getText());
        int nama2 = Integer.parseInt(Harga2.getText());
        int nama3 = Integer.parseInt(Harga3.getText());
        int nama4 = Integer.parseInt(Harga4.getText());
        int diskon = Integer.parseInt(Discount.getText());
        
        int hasil = nama1+nama2+nama3+nama4;
        int akhir = hasil*(100-diskon)/100;
        
        Hasil.setText("Barang 1 : "+nama1+"\nBarang 2 : "+nama2+"\nBarang 3 : "+nama3+"\nBarang 4 : "+nama4+"\nDiskon : "+diskon+"\nTotal Harga Rp."+akhir);
    }//GEN-LAST:event_ProsesActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        Harga1.setText("");
        Harga2.setText("");
        Harga3.setText("");
        Harga4.setText("");
        Discount.setText("");
        Hasil.setText("");
    }//GEN-LAST:event_DeleteActionPerformed

    private void DiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiscountActionPerformed

    private void Harga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Harga1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Harga1ActionPerformed

    private void Harga2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Harga2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Harga2ActionPerformed

    private void Harga3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Harga3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Harga3ActionPerformed

    private void Harga4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Harga4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Harga4ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kuis2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Discount;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField Harga1;
    private javax.swing.JTextField Harga2;
    private javax.swing.JTextField Harga3;
    private javax.swing.JTextField Harga4;
    private javax.swing.JTextArea Hasil;
    private javax.swing.JButton Proses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
