package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.hasilPemeliharaan;

public class c_hasilPemeliharaan {
    hasilPemeliharaan views;
    public c_hasilPemeliharaan(){
        views=new hasilPemeliharaan();
        views.setVisible(true);
        views.getHome().addActionListener(new klikHome());
    }

    private class klikHome implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new c_awal();
            views.dispose();
        }
    }
}
