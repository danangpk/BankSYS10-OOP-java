/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.modul.pkg10;

/**
 *
 * @author Ilham Izzul
 */
public class Bank10 extends javax.swing.JFrame {

    /**
     * Creates new form BankRuptHome
     */
    public Bank10() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        saldo = new javax.swing.JButton();
        penarikan = new javax.swing.JButton();
        transfer = new javax.swing.JButton();
        setor = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        inputPenarikan = new javax.swing.JTextField();
        inputTransfer = new javax.swing.JTextField();
        inputSetor = new javax.swing.JTextField();
        keterangan = new javax.swing.JLabel();
        nilai = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Ebrima", 0, 36)); // NOI18N
        jLabel2.setText("ATM SYS KUVUKILAND");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 20, 380, 60);

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel5.setText("MENU");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 80, 54, 22);

        saldo.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        saldo.setText("SALDO");
        saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoActionPerformed(evt);
            }
        });
        getContentPane().add(saldo);
        saldo.setBounds(40, 140, 103, 32);

        penarikan.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        penarikan.setText("PENARIKAN");
        penarikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penarikanActionPerformed(evt);
            }
        });
        getContentPane().add(penarikan);
        penarikan.setBounds(170, 140, 103, 32);

        transfer.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        transfer.setText("TRANSFER");
        transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });
        getContentPane().add(transfer);
        transfer.setBounds(300, 140, 103, 32);

        setor.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        setor.setText("SETOR");
        setor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setorActionPerformed(evt);
            }
        });
        getContentPane().add(setor);
        setor.setBounds(430, 140, 103, 32);

        logOut.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        logOut.setText("Selesai");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        getContentPane().add(logOut);
        logOut.setBounds(460, 440, 71, 23);
        getContentPane().add(inputPenarikan);
        inputPenarikan.setBounds(170, 190, 103, 30);
        getContentPane().add(inputTransfer);
        inputTransfer.setBounds(300, 190, 103, 30);
        getContentPane().add(inputSetor);
        inputSetor.setBounds(430, 190, 103, 30);

        keterangan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(keterangan);
        keterangan.setBounds(130, 290, 320, 30);

        nilai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(nilai);
        nilai.setBounds(130, 330, 230, 30);

        setBounds(0, 0, 592, 528);
    }// </editor-fold>//GEN-END:initComponents

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        new Bank10Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logOutActionPerformed

    private void saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoActionPerformed
        
        
        int saldo = 150000;
        keterangan.setText("SISA SALDO YANG ANDA MILIKI");
        nilai.setText(""+saldo);
    }//GEN-LAST:event_saldoActionPerformed

    private void penarikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penarikanActionPerformed
        String tarikan = inputPenarikan.getText();
            int saldo = 150000;
            int jmltarik = Integer.parseInt(tarikan);
            int total = saldo-jmltarik;
        nilai.setText(""+total);
    }//GEN-LAST:event_penarikanActionPerformed

    private void transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferActionPerformed
        String transfer = inputTransfer.getText();
        String saldolast = nilai.getText();
        nilai.setText(""+saldolast);
        int jmltransfer = Integer.parseInt(transfer);
        int lastsaldo = Integer.parseInt(saldolast);
        int total = lastsaldo-jmltransfer;
        nilai.setText(""+total);
    }//GEN-LAST:event_transferActionPerformed

    private void setorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setorActionPerformed
        String setor = inputSetor.getText();
        String saldolast = nilai.getText();
        nilai.setText(""+saldolast);
        int jmlsetor = Integer.parseInt(setor);
        int lastsaldo = Integer.parseInt(saldolast);
        int total = lastsaldo+jmlsetor;
        nilai.setText(""+total);
    }//GEN-LAST:event_setorActionPerformed

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
            java.util.logging.Logger.getLogger(Bank10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bank10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bank10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bank10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bank10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputPenarikan;
    private javax.swing.JTextField inputSetor;
    private javax.swing.JTextField inputTransfer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel keterangan;
    private javax.swing.JButton logOut;
    private javax.swing.JLabel nilai;
    private javax.swing.JButton penarikan;
    private javax.swing.JButton saldo;
    private javax.swing.JButton setor;
    private javax.swing.JButton transfer;
    // End of variables declaration//GEN-END:variables
}
