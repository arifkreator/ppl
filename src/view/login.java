package view;

import javax.swing.JButton;
import javax.swing.JTextField;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public JButton daftar() {
        return button_daftar;
    }
    public JButton masuk() {
        return button_masuk;
    }
    
    public String getUsername(){
        return field_username.getText();
    }
    
    public String getPassword(){
        return field_password.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        field_username = new javax.swing.JTextField();
        field_password = new javax.swing.JPasswordField();
        button_masuk = new javax.swing.JButton();
        button_daftar = new javax.swing.JButton();
        BACKGROUND = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        field_username.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        field_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_username.setBorder(null);
        getContentPane().add(field_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 310, 50));

        field_password.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        field_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_password.setBorder(null);
        getContentPane().add(field_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 310, 60));

        button_masuk.setBorder(null);
        button_masuk.setBorderPainted(false);
        button_masuk.setContentAreaFilled(false);
        button_masuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(button_masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 120, 50));

        button_daftar.setBorder(null);
        button_daftar.setBorderPainted(false);
        button_daftar.setContentAreaFilled(false);
        button_daftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(button_daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, 120, 60));

        BACKGROUND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.jpg"))); // NOI18N
        getContentPane().add(BACKGROUND, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACKGROUND;
    private javax.swing.JButton button_daftar;
    private javax.swing.JButton button_masuk;
    private javax.swing.JPasswordField field_password;
    private javax.swing.JTextField field_username;
    // End of variables declaration//GEN-END:variables
}
