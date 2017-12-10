package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.hasilKeuntungan;

public class c_keuntungan {
    hasilKeuntungan view;
    public c_keuntungan(){
       view = new hasilKeuntungan();
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
