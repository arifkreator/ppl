package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.hasilPenyakit;

public class c_hasilPenyakit {
    hasilPenyakit views;
    public c_hasilPenyakit(){
        views=new hasilPenyakit();
        views.setVisible(true);
        views.home().addActionListener(new klikHome());
    }

    private class klikHome implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new c_awal();
            views.dispose();
        }
    }
}
