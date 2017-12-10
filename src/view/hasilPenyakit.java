package view;

import javax.swing.JButton;

public class hasilPenyakit extends javax.swing.JFrame {

    public hasilPenyakit() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public JButton home(){
        return btn_home;
    }
    
    public void setPenyakit(String penyakit){
        field_penyakit.setText(penyakit);
    }
    
    public void setDeskripsi(String deskripsi){
        text_deskripsi.setText(deskripsi);
    }
    
    public void setPenanganan(String penanganan){
        text_penanganan.setText(penanganan);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_home = new javax.swing.JButton();
        field_penyakit = new javax.swing.JTextField();
        pane_deskripsi = new javax.swing.JScrollPane();
        text_deskripsi = new javax.swing.JTextArea();
        pane_penanganan = new javax.swing.JScrollPane();
        text_penanganan = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 706));
        setMinimumSize(new java.awt.Dimension(1000, 706));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_home.setBorder(null);
        btn_home.setContentAreaFilled(false);
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 640, 70, 50));

        field_penyakit.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        field_penyakit.setBorder(null);
        field_penyakit.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        field_penyakit.setEnabled(false);
        field_penyakit.setSelectionColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(field_penyakit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 530, 50));

        pane_deskripsi.setBackground(new java.awt.Color(255, 255, 255));
        pane_deskripsi.setBorder(null);
        pane_deskripsi.setEnabled(false);

        text_deskripsi.setColumns(20);
        text_deskripsi.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        text_deskripsi.setLineWrap(true);
        text_deskripsi.setRows(5);
        text_deskripsi.setTabSize(5);
        pane_deskripsi.setViewportView(text_deskripsi);

        getContentPane().add(pane_deskripsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 470, 120));

        pane_penanganan.setBorder(null);
        pane_penanganan.setEnabled(false);

        text_penanganan.setColumns(20);
        text_penanganan.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        text_penanganan.setLineWrap(true);
        text_penanganan.setRows(1);
        pane_penanganan.setViewportView(text_penanganan);

        getContentPane().add(pane_penanganan, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 470, 130));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/5.png"))); // NOI18N
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
            java.util.logging.Logger.getLogger(hasilPenyakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hasilPenyakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hasilPenyakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hasilPenyakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hasilPenyakit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_home;
    private javax.swing.JTextField field_penyakit;
    private javax.swing.JScrollPane pane_deskripsi;
    private javax.swing.JScrollPane pane_penanganan;
    private javax.swing.JTextArea text_deskripsi;
    private javax.swing.JTextArea text_penanganan;
    // End of variables declaration//GEN-END:variables
}
