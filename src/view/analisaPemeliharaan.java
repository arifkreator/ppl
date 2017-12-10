package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class analisaPemeliharaan extends javax.swing.JFrame {

    public analisaPemeliharaan() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public JButton getHome() {
        return btn_home;
    }
    public JButton getAnalisa() {
        return btn_analisa;
    }
    
    public JTextField getUmur(){
        return field_umur;
    }
    public JComboBox getJenis(){
        return combo_jenis;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        field_umur = new javax.swing.JTextField();
        combo_jenis = new javax.swing.JComboBox();
        btn_analisa = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 706));
        setMinimumSize(new java.awt.Dimension(1000, 706));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        field_umur.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        field_umur.setBorder(null);
        getContentPane().add(field_umur, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 180, 40));

        combo_jenis.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        combo_jenis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BEBEK PETELUR", "BEBEK PEDAGING" }));
        combo_jenis.setBorder(null);
        getContentPane().add(combo_jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 180, 40));

        btn_analisa.setBorder(null);
        btn_analisa.setContentAreaFilled(false);
        btn_analisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_analisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 200, 50));

        btn_home.setBorder(null);
        btn_home.setContentAreaFilled(false);
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(913, 630, 60, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/6.png"))); // NOI18N
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
            java.util.logging.Logger.getLogger(analisaPemeliharaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(analisaPemeliharaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(analisaPemeliharaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(analisaPemeliharaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new analisaPemeliharaan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_analisa;
    private javax.swing.JButton btn_home;
    private javax.swing.JComboBox combo_jenis;
    private javax.swing.JTextField field_umur;
    // End of variables declaration//GEN-END:variables
}
