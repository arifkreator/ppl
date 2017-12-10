package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.user;
import view.login;
import view.register;

public class c_user {

    user model;
    login view;
    register views;

    public c_user() {
        view = new login();
        model = new user("","");
        view.setVisible(true);
        view.daftar().addActionListener(new klikDaftar());
        view.masuk().addActionListener(new klikMasuk());
    }

    public c_user(String nama) {
        views = new register();
        model = new user("","");
        views.setVisible(true);
        views.daftar().addActionListener(new klikRegister());
        views.back().addActionListener(new klikKembali());
    }

    private class klikKembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new c_user();
            views.dispose();
        }
    }

    private class klikRegister implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if(views.getUsername().equals("") || views.getPassword().equals("")){
                    JOptionPane.showMessageDialog(view, "username atau password kosong");
                }else{
                model.tambahUser(views.getUsername(), views.getPassword());
                JOptionPane.showMessageDialog(view, "anda telah terdaftar");
                new c_user();
                views.dispose();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(view, "Username / Password Salah");
            }
            
        }
    }

    private class klikMasuk implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int userlevel = model.cocokan(view.getUsername(), view.getPassword());
                if (userlevel == 1) {
                    JOptionPane.showMessageDialog(view, "Masuk Berhasil");
                    new c_awal();
                    view.dispose();
                } else {
                    JOptionPane.showMessageDialog(view, "Username / Password Salah");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(view, "Username / Password Salah");
            }
        }
    }

    private class klikDaftar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new c_user("");
            view.dispose();
        }
    }
}
