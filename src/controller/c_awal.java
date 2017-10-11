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

/**
 *
 * @author user
 */
public class c_awal {

    awalnew views;

    public c_awal() {

        views = new awalnew();
        views.setVisible(true);
        views.getjml().addActionListener(new Klikjml());
        views.getpenanganan().addActionListener(new Klikpenanganan());
        views.getpemeliharaan().addActionListener(new Klikpemeliharaan());
        views.getkeuntungan().addActionListener(new Klikkeuntungan());
        views.getpetunjuk().addActionListener(new Klikpetunjuk());
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
            new c_penanganan();
            views.dispose();
        }
    }

    private class Klikpemeliharaan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
//            new c_pemeliharaan();
            views.dispose();
        }
    }

    private class Klikkeuntungan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
//            new c_keuntungan();
            views.dispose();
        }
    }

    private class Klikpetunjuk implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new c_petunjuk();
            views.dispose();
        }
    }
}
