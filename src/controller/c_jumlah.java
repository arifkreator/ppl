/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.analisajmlnew;
import view.analisapemeliharaannew;
import view.analisapenanganannew;
import view.petunjuk;
import view.awalnew;

public class c_jumlah {

    analisajmlnew views;
    String Hasil="";
    public c_jumlah() {
        views = new analisajmlnew();
        views.setVisible(true);
        views.getHome().addActionListener(new klikHome());
        views.getAnalisa().addActionListener(new klikAnalisa());

//        views.getpena().addActionListener(new Klikpena());
//        views.getpem().addActionListener(new Klikpem());
//        views.getkeuntungan().addActionListener(new Klikkeuntungan());
//        views.getpetunjuk().addActionListener(new Klikpetunjuk());
    }
    
    public String hasil(String h){
        return Hasil=h;
        
    }

    public class klikAnalisa implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int mdl = Integer.parseInt(views.getModal().getText());
            int kandang = Integer.parseInt(views.getLahan().getText());
            String bebek = (String) views.getJenis().getSelectedItem();
            if (kandang <= 0) {
                Hasil="gak boleh nol";
            } else if (kandang > 1 && kandang <= 20) {
                if (bebek.equalsIgnoreCase("BEBEK PETELUR")) {
                    if (mdl >= 200000) {
                        System.out.println("bebek 25");
                    } else if (mdl < 200000 && mdl > 100000) {
                        System.out.println("bebek 12");
                    } else {
                        System.out.println("bebek kurang");
                    }
                } else if (bebek.equalsIgnoreCase("BEBEK PEDAGING")) {
                    if (mdl >= 175000) {
                        System.out.println("bebek 25");
                    } else if (mdl <= 175000 && mdl >= 100000) {
                        System.out.println("bebek 14");
                    } else {
                        System.out.println("bebek kurang");
                    }
                }
            } else if (kandang > 20 && kandang <= 30) {
                if (bebek.equalsIgnoreCase("BEBEK PETELUR")) {
                    if (mdl >= 400000) {
                        System.out.println("bebek 50");
                    } else if (mdl < 400000 && mdl >= 300000) {
                        System.out.println("bebek 37");
                    } else if (mdl < 300000 && mdl >= 200000) {
                        System.out.println("bebek 25");
                    } else if (mdl < 200000 && mdl >= 100000) {
                        System.out.println("bebek 12");
                    }
                } else if (bebek.equalsIgnoreCase("BEBEK PEDAGING")) {
                    if (mdl >= 350000) {
                        System.out.println("bebek 50");
                    } else if (mdl < 350000 && mdl >= 250000) {
                        System.out.println("bebek 35");
                    } else if (mdl < 250000 && mdl >= 150000) {
                        System.out.println("bebek 25");
                    } else if (mdl < 150000 && mdl >= 100000) {
                        System.out.println("bebek 12");
                    }
                }
            } else if (kandang > 30 && kandang <= 40) {
                if (bebek.equalsIgnoreCase("BEBEK PETELUR")) {
                    if (mdl >= 600000) {
                        System.out.println("bebek 75");
                    } else if (mdl < 600000 && mdl >= 500000) {
                        System.out.println("bebek 62");
                    } else if (mdl < 500000 && mdl >= 400000) {
                        System.out.println("bebek 50");
                    } else if (mdl < 400000 && mdl >= 300000) {
                        System.out.println("bebek 37");
                    } else if (mdl < 300000 && mdl >= 200000) {
                        System.out.println("bebek 25");
                    } else if (mdl < 200000 && mdl >= 100000) {
                        System.out.println("bebek 12");
                    } else {
                        System.out.println("bondo lah");
                    }
                } else if (bebek.equalsIgnoreCase("BEBEK PEDAGING")) {
                    if (mdl >= 5250000) {
                        System.out.println("bebek 75");
                    } else if (mdl < 525000 && mdl > 425000) {
                        System.out.println("bebek 60");
                    } else if (mdl < 425000 && mdl > 325000) {
                        System.out.println("bebek 46");
                    } else if (mdl < 325000 && mdl > 225000) {
                        System.out.println("bebek 32");
                    } else if (mdl < 225000 && mdl > 125000) {
                        System.out.println("bebek 17");
                    } else {
                        System.out.println("bondo lah");
                    }
                }
            } else if (kandang > 40 && kandang <= 50) {
                if (bebek.equalsIgnoreCase("BEBEK PETELUR")) {
                    if (mdl >= 800000) {
                        System.out.println("bebek 100");
                    } else if (mdl < 800000 && mdl >= 700000) {
                        System.out.println("bebek 87");
                    } else if (mdl < 700000 && mdl >= 600000) {
                        System.out.println("bebek 75");
                    } else if (mdl < 600000 && mdl >= 500000) {
                        System.out.println("bebek 62");
                    } else if (mdl < 500000 && mdl >= 400000) {
                        System.out.println("bebek 50");
                    } else if (mdl < 400000 && mdl >= 300000) {
                        System.out.println("bebek 37");
                    } else if (mdl < 300000 && mdl >= 200000) {
                        System.out.println("bebek 25");
                    } else if (mdl < 200000 && mdl >= 100000) {
                        System.out.println("bebek 12");
                    } else {
                        System.out.println("bondo lah");
                    }
                } else if (bebek.equalsIgnoreCase("BEBEK PEDAGING")) {
                    if (mdl >= 700000) {
                        System.out.println("bebek 100");
                    } else if (mdl < 700000 && mdl > 600000) {
                        System.out.println("bebek 85");
                    } else if (mdl < 600000 && mdl > 500000) {
                        System.out.println("bebek 71");
                    } else if (mdl < 500000 && mdl > 400000) {
                        System.out.println("bebek 57");
                    } else if (mdl < 400000 && mdl > 300000) {
                        System.out.println("bebek 42");
                    } else if (mdl < 300000 && mdl > 200000) {
                        System.out.println("bebek 28");
                    } else if (mdl < 200000 && mdl > 100000) {
                        System.out.println("bebek 14");
                    } else {
                        System.out.println("bondo lah");
                    }
                }
            }
            new c_hasilJumlah();
            views.dispose();
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
