package view;

import javax.swing.JButton;
import javax.swing.JTextField;

public class hasilKeuntungan extends javax.swing.JFrame {

    public hasilKeuntungan() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void setModal(int modal){
        field_modal.setText(String.valueOf(modal));
    }
    
    public void setKeuntungan(int hasil){
        field_keuntungan.setText(String.valueOf(hasil));
    }
    
    public JButton getHome(){
        return button_home;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        field_modal = new javax.swing.JTextField();
        field_keuntungan = new javax.swing.JTextField();
        button_home = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        field_modal.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        field_modal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_modal.setBorder(null);
        field_modal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        field_modal.setEnabled(false);
        getContentPane().add(field_modal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 310, 60));

        field_keuntungan.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        field_keuntungan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_keuntungan.setBorder(null);
        field_keuntungan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        field_keuntungan.setEnabled(false);
        getContentPane().add(field_keuntungan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 320, 60));

        button_home.setBorder(null);
        button_home.setBorderPainted(false);
        button_home.setContentAreaFilled(false);
        button_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(button_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 640, 70, 50));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/9.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(hasilKeuntungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hasilKeuntungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hasilKeuntungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hasilKeuntungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hasilKeuntungan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton button_home;
    private javax.swing.JTextField field_keuntungan;
    private javax.swing.JTextField field_modal;
    // End of variables declaration//GEN-END:variables
}
