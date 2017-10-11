package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class analisajmlnew extends javax.swing.JFrame {

    public analisajmlnew() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public JButton getHome() {
        return btn_home;
    }
    
    public JButton getAnalisa() {
        return btn_analisa;
    }
    
    public JTextField getModal(){
        return field_modal;
    }
    
    public JTextField getLahan(){
        return field_lahan;
    }
    
    public JComboBox getJenis(){
        return jenis;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        field_lahan = new javax.swing.JTextField();
        field_modal = new javax.swing.JTextField();
        jenis = new javax.swing.JComboBox();
        btn_analisa = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        field_lahan.setBorder(null);
        getContentPane().add(field_lahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 190, 40));

        field_modal.setBorder(null);
        getContentPane().add(field_modal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 180, 40));

        jenis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BEBEK PETELUR", "BEBEK PEDAGING" }));
        jenis.setBorder(null);
        getContentPane().add(jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 180, 50));

        btn_analisa.setBorder(null);
        btn_analisa.setContentAreaFilled(false);
        btn_analisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_analisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 200, 50));

        btn_home.setBorder(null);
        btn_home.setContentAreaFilled(false);
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 630, 60, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            java.util.logging.Logger.getLogger(analisajmlnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(analisajmlnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(analisajmlnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(analisajmlnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new analisajmlnew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_analisa;
    private javax.swing.JButton btn_home;
    private javax.swing.JTextField field_lahan;
    private javax.swing.JTextField field_modal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox jenis;
    // End of variables declaration//GEN-END:variables
}
