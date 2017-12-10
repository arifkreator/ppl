package view;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class hasilanalisajumlah extends javax.swing.JFrame {

    public hasilanalisajumlah() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void setHasil(String hasil){
        text_hasil.setText(hasil);
    }
    
        public JButton getHome() {
        return btn_home;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_home = new javax.swing.JButton();
        hasil = new javax.swing.JScrollPane();
        text_hasil = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 706));
        setMinimumSize(new java.awt.Dimension(1000, 706));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_home.setBorder(null);
        btn_home.setBorderPainted(false);
        btn_home.setContentAreaFilled(false);
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 640, 70, 60));

        hasil.setBackground(new java.awt.Color(0, 0, 0));
        hasil.setBorder(null);
        hasil.setWheelScrollingEnabled(false);

        text_hasil.setColumns(20);
        text_hasil.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        text_hasil.setLineWrap(true);
        text_hasil.setRows(1);
        text_hasil.setToolTipText("");
        text_hasil.setBorder(null);
        text_hasil.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        text_hasil.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        text_hasil.setEnabled(false);
        hasil.setViewportView(text_hasil);
        text_hasil.getAccessibleContext().setAccessibleParent(text_hasil);

        getContentPane().add(hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 570, 240));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            java.util.logging.Logger.getLogger(hasilanalisajumlah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hasilanalisajumlah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hasilanalisajumlah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hasilanalisajumlah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hasilanalisajumlah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_home;
    private javax.swing.JScrollPane hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextArea text_hasil;
    // End of variables declaration//GEN-END:variables
}
