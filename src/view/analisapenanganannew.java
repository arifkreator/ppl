package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class analisapenanganannew extends javax.swing.JFrame {

    public analisapenanganannew() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public JButton analisaPenyakit() {
        return btn_analisa;
    }
    
    public JButton home(){
        return btn_home;
    }
    
    public JTextField getUmur(){
        return umur_field;
    }
    
    public JTextField getJumlah(){
        return field_jumlah;
    }
    
    public JComboBox getJenis(){
        return jenis_combo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        umur_field = new javax.swing.JTextField();
        jenis_combo = new javax.swing.JComboBox();
        btn_analisa = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        field_jumlah = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 706));
        setMinimumSize(new java.awt.Dimension(1000, 706));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        umur_field.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        umur_field.setBorder(null);
        getContentPane().add(umur_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 190, 50));

        jenis_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BEBEK PETELUR", "BEBEK PEDAGING" }));
        jenis_combo.setBorder(null);
        getContentPane().add(jenis_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 180, 50));

        btn_analisa.setBorder(null);
        btn_analisa.setContentAreaFilled(false);
        btn_analisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_analisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 200, 50));

        btn_home.setText("\n");
        btn_home.setBorder(null);
        btn_home.setContentAreaFilled(false);
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(913, 630, 60, 50));

        field_jumlah.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        field_jumlah.setBorder(null);
        getContentPane().add(field_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 190, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/4.1.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

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
            java.util.logging.Logger.getLogger(analisapenanganannew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(analisapenanganannew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(analisapenanganannew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(analisapenanganannew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new analisapenanganannew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_analisa;
    private javax.swing.JButton btn_home;
    private javax.swing.JTextField field_jumlah;
    private javax.swing.JComboBox jenis_combo;
    private javax.swing.JTextField umur_field;
    // End of variables declaration//GEN-END:variables
}
