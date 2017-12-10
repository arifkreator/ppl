/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.analisa;
import view.analisajmlnew;
import view.analisaPemeliharaan;
import view.analisapenanganannew;
import view.petunjuk;
import view.awalnew;
import view.hasilKeuntungan;

public class c_awal {

    awalnew views;
    analisa model;
    hasilKeuntungan view;
    c_keuntungan control;

    public c_awal() {

        views = new awalnew();
        view = new hasilKeuntungan();
        model = new analisa();
        views.setVisible(true);
        views.getjml().addActionListener(new Klikjml());
        views.exit().addActionListener(new klikKeluar());
        views.getpenanganan().addActionListener(new Klikpenanganan());
        views.getpemeliharaan().addActionListener(new Klikpemeliharaan());
        views.getkeuntungan().addActionListener(new Klikkeuntungan());
        views.getpetunjuk().addActionListener(new Klikpetunjuk());
    }

    private class klikKeluar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new c_user();
            views.dispose();
        }
    }

    private class Klikkeuntungan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String hasil[] = model.hasil();
                int modal = Integer.parseInt(hasil[0]);
                int jumlah = Integer.parseInt(hasil[1]);
                String jenis = hasil[2];
                int harga;
                int jual;
                int keuntungan =0;
                int pakan=18000;
                int kematian = Integer.parseInt(hasil[3]);
                int mati = Integer.parseInt(hasil[4]);
                int totalMati;
                if (jenis == "Bebek Pedaging") {
                    harga = 7000;
                    jual=35000;
                } else {
                    harga = 8000;
                    jual=40000;
                }
                if(kematian <= 50){
                    totalMati = 0;
                }else{
                    totalMati = mati;
                }if (jenis=="Bebek Pedaging"){
                    keuntungan = ((jual*(jumlah-totalMati))-(jumlah*pakan)+(jumlah*harga))*6;
                }else{
                    int telur=(((jumlah-totalMati)*5/10)*30)*1000;
                    keuntungan = (telur*12)-((jumlah*pakan)+(jumlah*harga));
                }
                
                System.out.println(Arrays.toString(model.hasil()));
                System.out.println(modal);
                System.out.println(jumlah);
                System.out.println(jenis);
                System.out.println(harga);
                System.out.println(kematian);
                System.out.println(mati);
                System.out.println(keuntungan);
                control = new c_keuntungan();
                control.view.setModal(modal);
                control.view.setKeuntungan(keuntungan);
                views.dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(views, "Silahkan ulangi fitur dari awal", "error input", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(views, "tidak ada koneksi ke database", "error input", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class Klikjml implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new c_jumlah();
            views.dispose();
        }
    }

    private class Klikpenanganan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                new c_penanganan();
                views.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_awal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class Klikpemeliharaan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new c_pemeliharaan();
            views.dispose();
        }
    }

    private class Klikpetunjuk implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new petunjuk();
            views.dispose();
        }
    }
}
