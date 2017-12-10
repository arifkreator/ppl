package view;

import javax.swing.JButton;

public class awalnew extends javax.swing.JFrame {

    public awalnew() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public JButton getjml() {
        return analisajml;
    }

    public JButton getpenanganan() {
        return analisapenanganan;
    }

    public JButton getpemeliharaan() {
        return analisapemeliharaan;
    }

    public JButton getkeuntungan() {
        return keuntungan;
    }

    public JButton getpetunjuk() {
        return petunjuk;
    }
    
    public JButton exit() {
        return keluar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        analisajml = new javax.swing.JButton();
        analisapenanganan = new javax.swing.JButton();
        analisapemeliharaan = new javax.swing.JButton();
        keuntungan = new javax.swing.JButton();
        petunjuk = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        analisajml.setBorder(null);
        analisajml.setContentAreaFilled(false);
        analisajml.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(analisajml, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 300, 50));

        analisapenanganan.setBorder(null);
        analisapenanganan.setContentAreaFilled(false);
        analisapenanganan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        analisapenanganan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisapenangananActionPerformed(evt);
            }
        });
        getContentPane().add(analisapenanganan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 300, 60));

        analisapemeliharaan.setBorder(null);
        analisapemeliharaan.setContentAreaFilled(false);
        analisapemeliharaan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(analisapemeliharaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 310, 40));

        keuntungan.setBorder(null);
        keuntungan.setContentAreaFilled(false);
        keuntungan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(keuntungan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 290, 60));

        petunjuk.setBorder(null);
        petunjuk.setContentAreaFilled(false);
        petunjuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(petunjuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 290, 40));

        keluar.setBorder(null);
        keluar.setBorderPainted(false);
        keluar.setContentAreaFilled(false);
        keluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 600, 290, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/awal_2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analisapenangananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analisapenangananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_analisapenangananActionPerformed

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
            java.util.logging.Logger.getLogger(awalnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(awalnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(awalnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(awalnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new awalnew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analisajml;
    private javax.swing.JButton analisapemeliharaan;
    private javax.swing.JButton analisapenanganan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton keluar;
    private javax.swing.JButton keuntungan;
    private javax.swing.JButton petunjuk;
    // End of variables declaration//GEN-END:variables
}
