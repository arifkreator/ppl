package view;

import controller.c_awal;

public class petunjuk extends javax.swing.JFrame {

    public petunjuk() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        petunjuk1();
    }
    
    private void petunjuk1(){
        petunjuk1.setVisible(true);
        petunjuk2.setVisible(false);
        buttonHome.setVisible(false);
        buttonBack.setVisible(false);
        buttonNext.setVisible(true);
    }
    private void petunjuk2(){
        petunjuk1.setVisible(false);
        petunjuk2.setVisible(true);
        buttonNext.setVisible(false);
        buttonHome.setVisible(true);
        buttonBack.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonNext = new javax.swing.JButton();
        petunjuk1 = new javax.swing.JLabel();
        petunjuk2 = new javax.swing.JLabel();
        buttonBack = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonNext.setBorder(null);
        buttonNext.setBorderPainted(false);
        buttonNext.setContentAreaFilled(false);
        buttonNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNextActionPerformed(evt);
            }
        });
        getContentPane().add(buttonNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 640, 70, 60));

        petunjuk1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/petunjuk 1.jpg"))); // NOI18N
        getContentPane().add(petunjuk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        petunjuk2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/petunjuk 2.jpg"))); // NOI18N
        getContentPane().add(petunjuk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        buttonBack.setBorder(null);
        buttonBack.setBorderPainted(false);
        buttonBack.setContentAreaFilled(false);
        buttonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });
        getContentPane().add(buttonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 70, 50));

        buttonHome.setBorder(null);
        buttonHome.setBorderPainted(false);
        buttonHome.setContentAreaFilled(false);
        buttonHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 640, 60, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        petunjuk1();
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        new c_awal();
        this.dispose();
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNextActionPerformed
        petunjuk2();
    }//GEN-LAST:event_buttonNextActionPerformed

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
            java.util.logging.Logger.getLogger(petunjuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(petunjuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(petunjuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(petunjuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new petunjuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonNext;
    private javax.swing.JLabel petunjuk1;
    private javax.swing.JLabel petunjuk2;
    // End of variables declaration//GEN-END:variables
}
