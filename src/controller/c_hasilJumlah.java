package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.hasilanalisajumlah;

public class c_hasilJumlah {
    hasilanalisajumlah view;
    public c_hasilJumlah(){
        view = new hasilanalisajumlah();
        view.setVisible(true);
        view.getHome().addActionListener(new klikHome());
    }

    private class klikHome implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            new c_awal();
            view.dispose();
        }
    }
    
}
