package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import model.bebek;
import model.user;
import view.analisajmlnew;
import view.analisaPemeliharaan;
import view.analisapenanganannew;
import view.petunjuk;
import view.awalnew;

public class c_jumlah {

    user model;
    bebek models;
    boolean tampil;
    analisajmlnew views;
    int biayaPakan = 18000;
    int banyak;
    String Hasil = "";
    String bibit1 = "Untuk pembelian bibit bebek ";
    String pakan1 = "Untuk pembelian Pakan hingga panen (+- 2 Bulan ) ";
    String lahan = "Untuk Pembuatan kandang ";
    String analisa = "Dari luas lahan dan modal yang anda miliki maka \njumlah BEBEK yang ideal untuk beternak adalah : \n";
    String rincian = "Dengan Rincian penggunaan modal : \n";

    public c_jumlah() {
        views = new analisajmlnew();
        model = new user("", "");
        views.setVisible(true);
        views.getHome().addActionListener(new klikHome());
        views.getAnalisa().addActionListener(new klikAnalisa());
    }

    public String hasil(String h) {
        return Hasil = h;

    }

    public class klikAnalisa implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            boolean milik = views.getCek().isSelected();
            int mdl=0;
            int kandang=0;
            int kndng;
            int jumlah = banyak;
            int vitamin=250000;
            String bebek = (String) views.getJenis().getSelectedItem();
            try {
                if (milik == false) {
                    if (!views.getModal().getText().matches("\\d+")) { //regex (untuk input angka saja)
                        JOptionPane.showMessageDialog(views, "modal tidak boleh kosong / bukan angka", "error input", JOptionPane.ERROR_MESSAGE);
                    } else if (!views.getLahan().getText().matches("\\d+")) {
                        JOptionPane.showMessageDialog(views, "Lahan tidak boleh kosong / bukan angka", "error input", JOptionPane.ERROR_MESSAGE);
                    } else {
                        mdl = Integer.parseInt(views.getModal().getText());
                        kandang = Integer.parseInt(views.getLahan().getText());
                        
                        if (mdl > 2500000 && kandang > 70) {
                            if (bebek.equalsIgnoreCase("BEBEK PETELUR")) {
                                int ideal = kandang * 4;
                                int modal = mdl - 1500000 - vitamin;
                                int hasil = modal / 26000;
                                kndng = 1500000;
                                if (ideal < hasil) {                                    
                                    int pakan = ideal * 18000;
                                    int bibit = ideal * 8000;
                                    Hasil = analisa + ideal + bebek + "\n" + rincian + bibit1 + " = " + bibit + " \n "
                                            + lahan +" = "+kndng+ "\n"+pakan1 + " =" + pakan + "\n"
                                            + "Sisa Uang = Rp" + (modal - (bibit + pakan));
                                    tampil = true;
                                    banyak = ideal;
                                } else {
                                    
                                    int pakan = hasil * biayaPakan;
                                    int bibit = hasil * 8000;
                                    Hasil = analisa + hasil + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                            + lahan +" = "+kndng+ "\n"+pakan1 + " =" + pakan + "\n"
                                            + "Sisa Uang = Rp" + (modal - (bibit + pakan));
                                    tampil = true;
                                    banyak = hasil;
                                }

                            } else if (bebek.equalsIgnoreCase("BEBEK PEDAGING")) {
                                int ideal = kandang * 4;
                                int modal = mdl - 1500000-vitamin;
                                int hasil = modal / 25000;
                                kndng = 1500000;
                                if (ideal < hasil) {
                                    int pakan = ideal * 18000;
                                    int bibit = ideal * 7000;
                                    Hasil = analisa + ideal + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                            + lahan +" = "+kndng+ "\n"+pakan1 + " =" + pakan + "\n"
                                            + "Sisa Uang = Rp" + (modal - (bibit + pakan));
                                    tampil = true;
                                    banyak = ideal;
                                } else {
                                    int pakan = hasil * 18000;
                                    int bibit = hasil * 7000;
                                    Hasil = analisa + hasil + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                            + lahan +" = "+kndng+ "\n"+pakan1 + " =" + pakan + "\n"
                                            + "Sisa Uang = Rp" + (modal - (bibit + pakan));
                                    tampil = true;
                                    banyak = hasil;
                                }

                            }
                        } else if (mdl >= 1500000) {
                            if (kandang <= 0) {
                                JOptionPane.showMessageDialog(views, "luas lahan tidak boleh kurang dari sama dengan nol", "error Kandang", JOptionPane.ERROR_MESSAGE);
                            } else if (kandang <= 30) {
                                if (bebek.equalsIgnoreCase("BEBEK PETELUR")) {
                                    int ideal = kandang * 4;
                                    int modal = mdl - 800000-vitamin;
                                    int hasil = modal / 26000;
                                    kndng = 800000;
                                    if (ideal < hasil) {
                                        int pakan = ideal * 18000;
                                        int bibit = ideal * 8000;
                                        Hasil = analisa + ideal + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                                + lahan +" = "+kndng+ "\n"+pakan1 + " =" + pakan + "\n"
                                                + "Sisa Uang = Rp" + (modal - (bibit + pakan));
                                        tampil = true;
                                        banyak = ideal;
                                    } else {
                                        int pakan = hasil * biayaPakan;
                                        int bibit = hasil * 8000;
                                        Hasil = analisa + hasil + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                                + lahan +" = "+kndng+ "\n"+pakan1 + " =" + pakan + "\n"
                                                + "Sisa Uang = Rp" + (modal - (bibit + pakan));
                                        tampil = true;
                                        banyak = hasil;
                                    }
                                } else if (bebek.equalsIgnoreCase("BEBEK PEDAGING")) {
                                    int ideal = kandang * 4;
                                    kndng = 800000;
                                    int modal = mdl - 800000-vitamin;
                                    int hasil = modal / 25000;
                                    if (ideal < hasil) {
                                        int pakan = ideal * 18000;
                                        int bibit = ideal * 7000;
                                        Hasil = analisa + ideal + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                                + lahan +" = "+kndng+ "\n"+pakan1 + " =" + pakan + "\n"
                                                + "Sisa Uang = Rp" + (modal - (bibit + pakan));
                                        tampil = true;
                                        banyak = ideal;
                                    } else {
                                        int pakan = hasil * 18000;
                                        int bibit = hasil * 7000;
                                        Hasil = analisa + hasil + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                                + lahan +" = "+kndng+ "\n"+pakan1 + " =" + pakan + "\n"
                                                + "Sisa Uang = Rp" + (modal - (bibit + pakan));
                                        tampil = true;
                                        banyak = hasil;
                                    }
                                }

                            } else if (kandang <= 70 && kandang >= 30) {
                                if (bebek.equalsIgnoreCase("BEBEK PETELUR")) {
                                    int ideal = kandang * 4;
                                    kndng = 1000000;
                                    int modal = mdl - 1000000-vitamin;
                                    int hasil = modal / 26000;
                                    if (ideal < hasil) {
                                        int pakan = ideal * 18000;
                                        int bibit = ideal * 8000;
                                        Hasil = analisa + ideal + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                                + lahan +" = "+kndng+ "\n"+pakan1 + " =" + pakan + "\n"
                                                + "Sisa Uang = Rp" + (modal - (bibit + pakan));
                                        tampil = true;
                                        banyak = ideal;
                                    } else {
                                        int pakan = hasil * biayaPakan;
                                        int bibit = hasil * 8000;
                                        Hasil = analisa + hasil + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                                + lahan +" = "+kndng+ "\n"+pakan1 + " =" + pakan + "\n"
                                                + "Sisa Uang = Rp" + (modal - (bibit + pakan));
                                        tampil = true;
                                        banyak = hasil;
                                    }
                                } else if (bebek.equalsIgnoreCase("BEBEK PEDAGING")) {
                                    int ideal = kandang * 4;
                                    kndng = 1000000;
                                    int modal = mdl - 1000000-vitamin;
                                    int hasil = modal / 25000;
                                    if (ideal < hasil) {
                                        int pakan = ideal * 18000;
                                        int bibit = ideal * 7000;
                                        Hasil = analisa + ideal + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                                + lahan +" = "+kndng+ "\n"+pakan1 + " =" + pakan + "\n"
                                                + "Sisa Uang = Rp" + (modal - (bibit + pakan));
                                        tampil = true;
                                        banyak = ideal;
                                    } else {
                                        int pakan = hasil * 18000;
                                        int bibit = hasil * 7000;
                                        Hasil = analisa + hasil + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                                + lahan +" = "+kndng+ "\n"+pakan1 + " =" + pakan + "\n"
                                                + "Sisa Uang = Rp" + (modal - (bibit + pakan));
                                        tampil = true;
                                        banyak = hasil;
                                    }
                                }

                            }
                        } else {
                            JOptionPane.showMessageDialog(views, "Modal anda minimal Rp 1.500.000", "error modal", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
//                    views.getLahan().setVisible(false);
                    if (!views.getModal().getText().matches("\\d+")) {
                        JOptionPane.showMessageDialog(views, "modal tidak boleh kosong / bukan angka", "error input", JOptionPane.ERROR_MESSAGE);
                    } else if (!views.getLahan().getText().matches("\\d+")) {
                        JOptionPane.showMessageDialog(views, "Lahan tidak boleh kosong / bukan angka", "error input", JOptionPane.ERROR_MESSAGE);
                    } else {
                        mdl = Integer.parseInt(views.getModal().getText());
                        kandang = Integer.parseInt(views.getLahan().getText());
                        if (mdl > 2500000 && kandang > 70) {
                            if (bebek.equalsIgnoreCase("BEBEK PETELUR")) {
                                int ideal = kandang * 4;
                                kndng = 0;
                                int hasil = (mdl-vitamin) / 26000;
                                if (ideal < hasil) {
                                    int pakan = ideal * 18000;
                                    int bibit = ideal * 8000;
                                    Hasil = analisa + ideal + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                            +pakan1 + " =" + pakan + "\n"
                                            + "Sisa Uang = Rp" + (mdl - (bibit + pakan));
                                    tampil = true;
                                    banyak = ideal;
                                } else {
                                    int pakan = hasil * biayaPakan;
                                    int bibit = hasil * 8000;
                                    Hasil = analisa + hasil + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                            +pakan1 + " =" + pakan + "\n"
                                            + "Sisa Uang = Rp" + (mdl - (bibit + pakan));
                                    tampil = true;
                                    banyak = hasil;
                                }
                            } else if (bebek.equalsIgnoreCase("BEBEK PEDAGING")) {
                                int ideal = kandang * 4;
                                kndng = 0;
                                int hasil = (mdl-vitamin) / 25000;
                                if (ideal < hasil) {
                                    int pakan = ideal * 18000;
                                    int bibit = ideal * 7000;
                                    Hasil = analisa + ideal + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                            +pakan1 + " =" + pakan + "\n"
                                            + "Sisa Uang = Rp" + (mdl - (bibit + pakan));
                                    tampil = true;
                                    banyak = ideal;
                                } else {
                                    int pakan = hasil * 18000;
                                    int bibit = hasil * 7000;
                                    Hasil = analisa + hasil + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                            + pakan1 + " =" + pakan + "\n"
                                            + "Sisa Uang = Rp" + (mdl - (bibit + pakan));
                                    tampil = true;
                                    banyak = hasil;
                                }
                            }
                        } else if (mdl >= 1500000) {
                            if (kandang <= 0) {
                                JOptionPane.showMessageDialog(views, "luas lahan tidak boleh kurang dari nol", "error Kandang", JOptionPane.ERROR_MESSAGE);
                            } else if (kandang <= 30) {
                                if (bebek.equalsIgnoreCase("BEBEK PETELUR")) {
                                    int ideal = kandang * 4;
                                    int hasil = (mdl-vitamin) / 26000;
                                    if (ideal < hasil) {
                                        int pakan = ideal * 18000;
                                        int bibit = ideal * 8000;
                                        Hasil = analisa + ideal + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                                + pakan1 + " =" + pakan + "\n"
                                                + "Sisa Uang = Rp" + (mdl - (bibit + pakan));
                                        tampil = true;
                                        banyak = ideal;
                                    } else {
                                        int pakan = hasil * biayaPakan;
                                        int bibit = hasil * 8000;
                                        Hasil = analisa + hasil + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                                + pakan1 + " =" + pakan + "\n"
                                                + "Sisa Uang = Rp" + (mdl - (bibit + pakan));
                                        tampil = true;
                                        banyak = hasil;
                                    }
                                } else if (bebek.equalsIgnoreCase("BEBEK PEDAGING")) {
                                    int ideal = kandang * 4;
                                    int hasil = (mdl-vitamin) / 25000;
                                    if (ideal < hasil) {
                                        int pakan = ideal * 18000;
                                        int bibit = ideal * 7000;
                                        Hasil = analisa + ideal + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                                + pakan1 + " =" + pakan + "\n"
                                                + "Sisa Uang = Rp" + (mdl - (bibit + pakan));
                                        tampil = true;
                                        banyak = ideal;
                                    } else {
                                        int pakan = hasil * 18000;
                                        int bibit = hasil * 7000;
                                        Hasil = analisa + hasil + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                                + pakan1 + " =" + pakan + "\n"
                                                + "Sisa Uang = Rp" + (mdl - (bibit + pakan));
                                        tampil = true;
                                        banyak = hasil;
                                    }
                                }

                            } else if (kandang <= 70 && kandang >= 30) {
                                if (bebek.equalsIgnoreCase("BEBEK PETELUR")) {
                                    int ideal = kandang * 4;
                                    int hasil = (mdl-vitamin) / 26000;
                                    if (ideal < hasil) {
                                        int pakan = ideal * 18000;
                                        int bibit = ideal * 8000;
                                        Hasil = analisa + ideal + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                                + pakan1 + " =" + pakan + "\n"
                                                + "Sisa Uang = Rp" + (mdl - (bibit + pakan));
                                        tampil = true;
                                        banyak = ideal;
                                    } else {
                                        int pakan = hasil * biayaPakan;
                                        int bibit = hasil * 8000;
                                        Hasil = analisa + hasil + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                                + pakan1 + " =" + pakan + "\n"
                                                + "Sisa Uang = Rp" + (mdl - (bibit + pakan));
                                        tampil = true;
                                        banyak = hasil;
                                    }
                                } else if (bebek.equalsIgnoreCase("BEBEK PEDAGING")) {
                                    int ideal = kandang * 4;
                                    int hasil = (mdl-vitamin) / 25000;
                                    if (ideal < hasil) {
                                        int pakan = ideal * 18000;
                                        int bibit = ideal * 7000;
                                        Hasil = analisa + ideal + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                                + pakan1 + " =" + pakan + "\n"
                                                + "Sisa Uang = Rp" + (mdl - (bibit + pakan));
                                        tampil = true;
                                        banyak = ideal;
                                    } else {
                                        int pakan = hasil * 18000;
                                        int bibit = hasil * 7000;
                                        Hasil = analisa + hasil + bebek + "\n" + rincian + bibit1 + "=" + bibit + " \n "
                                                + pakan1 + " =" + pakan + "\n"
                                                + "Sisa Uang = Rp" + (mdl - (bibit + pakan));
                                        tampil = true;
                                        banyak = hasil;
                                    }
                                }

                            }
                        } else {
                            JOptionPane.showMessageDialog(views, "Modal anda minimal Rp 1.500.000", "error modal", JOptionPane.ERROR_MESSAGE);
                        }
                    }

                }

                if (tampil == true) {
                    System.out.println(mdl);
                    System.out.println(kandang);
                    System.out.println(banyak);
//                        models.getId(bebek);
                    model.tambahData(mdl, kandang, banyak);
                    new c_hasilJumlah().view.setHasil(Hasil);
                    views.dispose();
                } else {
//                    JOptionPane.showMessageDialog(views, "Modal anda minimal 1500000", "error modal", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(views, "Field harus diisi sesuai format", "error input", JOptionPane.ERROR_MESSAGE);
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
