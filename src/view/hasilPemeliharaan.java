package view;

import javax.swing.JButton;
import javax.swing.JTextField;

public class hasilPemeliharaan extends javax.swing.JFrame {

    public hasilPemeliharaan() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public JButton getHome() {
        return btn_home;
    }
    
    public void setPakan(String pakan){
        text_pakan.setText(pakan);
    }
    
    public void setVitamin(String vitamin){
        text_vitamin.setText(vitamin);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pakan = new javax.swing.JScrollPane();
        text_pakan = new javax.swing.JTextArea();
        vitamin = new javax.swing.JScrollPane();
        text_vitamin = new javax.swing.JTextArea();
        btn_home = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 706));
        setMinimumSize(new java.awt.Dimension(1000, 706));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pakan.setBorder(null);
        pakan.setEnabled(false);
        pakan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        text_pakan.setColumns(20);
        text_pakan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        text_pakan.setRows(1);
        text_pakan.setBorder(null);
        text_pakan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        text_pakan.setEnabled(false);
        pakan.setViewportView(text_pakan);

        getContentPane().add(pakan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 316, 540, 80));
        pakan.getAccessibleContext().setAccessibleParent(pakan);

        vitamin.setBorder(null);
        vitamin.setAutoscrolls(true);
        vitamin.setEnabled(false);
        vitamin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        text_vitamin.setColumns(20);
        text_vitamin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        text_vitamin.setLineWrap(true);
        text_vitamin.setRows(1);
        text_vitamin.setBorder(null);
        text_vitamin.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        text_vitamin.setEnabled(false);
        vitamin.setViewportView(text_vitamin);

        getContentPane().add(vitamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 510, 90));
        vitamin.getAccessibleContext().setAccessibleParent(vitamin);

        btn_home.setBorder(null);
        btn_home.setContentAreaFilled(false);
        getContentPane().add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 640, 70, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/7.1.png"))); // NOI18N
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
            java.util.logging.Logger.getLogger(hasilPemeliharaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hasilPemeliharaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hasilPemeliharaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hasilPemeliharaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hasilPemeliharaan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_home;
    private javax.swing.JScrollPane pakan;
    private javax.swing.JTextArea text_pakan;
    private javax.swing.JTextArea text_vitamin;
    private javax.swing.JScrollPane vitamin;
    // End of variables declaration//GEN-END:variables
}
