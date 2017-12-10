package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.analisaPemeliharaan;
import javax.swing.JOptionPane;

public class c_pemeliharaan {

    c_hasilPemeliharaan control;
    analisaPemeliharaan views;
    String pakan = "";
    String vitamin = "";

    public c_pemeliharaan() {
        views = new analisaPemeliharaan();
        views.setVisible(true);
        views.getHome().addActionListener(new klikHome());
        views.getAnalisa().addActionListener(new klikAnalisa());
    }

    public String pakan() {

        return pakan;
    }

    public String vitamin() {
        return vitamin;
    }

    private class klikAnalisa implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String bebek = (String) views.getJenis().getSelectedItem();
                if (views.getUmur().getText().equals("")) {
                    JOptionPane.showMessageDialog(views, "Field masih kosong, mohon diisi", "error", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (!views.getUmur().getText().matches("\\d++")) {
                        JOptionPane.showMessageDialog(views, "Field harus diisi sesuai format", "error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        int umur = Integer.parseInt(views.getUmur().getText());
                        if (umur <= 0) {
                            JOptionPane.showMessageDialog(views, "umur minimal 1 hari", "error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            if (bebek == "BEBEK PEDAGING") {
                                if (umur >= 1 && umur <= 12) {
                                    pakan = "Full Konsentrad 141";
                                    vitamin = "Vaksin tetes mata merk ND, bisa menggunakan ND IB atau ND AI";
                                } else if (umur >= 13 && umur <= 16) {
                                    pakan = "Campuran Katul dan Konsentrad dengan perbandingan (1:1)";
                                    vitamin = "VITERNA dicampur dengan air secara terus menerus";
                                } else if (umur >= 17 && umur <= 22) {
                                    pakan = "Campuran konsentrad, KBR2 dan katul";
                                    vitamin = "VITERNA dicampur dengan air secara terus menerus";
                                } else if (umur >= 23) {
                                    pakan = "Campuran Konsentrad,KBR2,karak,dedek halus";
                                    vitamin = "VITERNA dicampur dengan air dengan tempat air persegi panjang";
                                }

                            } else if (bebek == "BEBEK PETELUR") {
                                if (umur >= 1 && umur <= 12) {
                                    pakan = "Full Konsentrad 141";
                                    vitamin = "Vaksin tetes mata merk ND, bisa menggunakan ND IB atau ND AI";
                                } else if (umur >= 13 && umur <= 16) {
                                    pakan = "Campuran Katul dan Konsentrad dengan perbandingan (1:1)";
                                    vitamin = "VITERNA dicampur air dengan pemberian setiap pagi ";
                                } else if (umur >= 17 && umur <= 30) {
                                    pakan = "Campuran konsentrad, KBR2 dan katul";
                                    vitamin = "VITERNA dicampur air dengan pemberian setiap pagi ";
                                } else if (umur >= 31 && umur <= 60) {
                                    pakan = "Campuran Konsentrad,KBR2,karak,dedek halus";
                                    vitamin = "VITERNA dicampur air dengan pemberian setiap pagi";
                                } else if (umur >= 61) {
                                    pakan = "Campuran Konsentrad,KBR2,karak,dedek halus";
                                    vitamin = "VITERNA dicampur air dengan pemberian secara terus menerus";
                                }
                            }
                            control = new c_hasilPemeliharaan();
                            control.views.setVitamin(vitamin);
                            control.views.setPakan(pakan);

                            views.dispose();
                        }
                    }
                }

        }
    }

    private class klikHome implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new c_awal();
            views.dispose();
        }
    }
}
