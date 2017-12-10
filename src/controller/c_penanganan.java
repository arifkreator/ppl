package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.penyakit;
import view.analisapenanganannew;

public class c_penanganan {

    c_hasilPenyakit control;
    analisapenanganannew views;
    penyakit models;
    String penyakit = "";
    String pengobatan = "";
    String deskripsi = "";
    Timestamp date1;
    int kematian;
    int idPenyakit;
    boolean pindah = true;

    public c_penanganan() throws SQLException {
        views = new analisapenanganannew();
        models = new penyakit();
        views.setVisible(true);
        views.home().addActionListener(new klikHome());
        views.analisaPenyakit().addActionListener(new klikAnalisa());
    }

    private Timestamp date() {
//        Date date = new Date();
//        long time = date.getTime();
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        System.out.println(ts);
        ts = date1;
        return date1;
    }

    private String tanggal() {
        Date date = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");
        return tanggal.format(date);
    }

    private class klikAnalisa implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int umur = 0;
            int banyak = 0;
            int bebek = 0;
            if (views.getUmur().getText().equals("") || views.getJumlah().getText().equals("")) {
                JOptionPane.showMessageDialog(views, "Field masih kosong, mohon diisi", "error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!views.getUmur().getText().matches("\\d+") || !views.getJumlah().getText().matches("\\d+")) {
                    JOptionPane.showMessageDialog(views, "Field harus diisi sesuai format", "error", JOptionPane.ERROR_MESSAGE);
                } else {
                    int usia = Integer.parseInt(views.getUmur().getText());
                    if (usia <= 0) {
                        JOptionPane.showMessageDialog(views, "umur minimal 1 hari", "error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        bebek = views.getJenis().getSelectedIndex();
                        umur = Integer.parseInt(views.getUmur().getText());
                        banyak = Integer.parseInt(views.getJumlah().getText());
                        int id = 102; //lemah
                        String pertanyaan = "";
                        pertanyaan = models.getGejala(id);
                        String nama = "";
                        nama = models.getNama(id);
                        int answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                        if (answer == 0) {
                            id = 114; //nafsu makan
                            pertanyaan = models.getGejala(id);
                            nama = models.getNama(id);
                            answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                            if (answer == 0) {
                                id = 104; //tubuh mengurus
                                pertanyaan = models.getGejala(id);
                                nama = models.getNama(id);
                                answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                                if (answer == 0) {
                                    id = 111; //jalan sempoyongan
                                    pertanyaan = models.getGejala(id);
                                    nama = models.getNama(id);
                                    answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                                    if (answer == 0) {
                                        id = 113; //mencret
                                        pertanyaan = models.getGejala(id);
                                        nama = models.getNama(id);
                                        answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                                        if (answer == 0) {
                                            id = 107; //gelisah
                                            pertanyaan = models.getGejala(id);
                                            nama = models.getNama(id);
                                            answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                                            if (answer == 0) {
                                                id = 106; //bulu rontok
                                                pertanyaan = models.getGejala(id);
                                                nama = models.getNama(id);
                                                answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                                                if (answer == 0) {
                                                    penyakit = "Botulism";
                                                    pengobatan = models.getPenyakit(penyakit);
                                                    kematian = models.getKematian(penyakit);
                                                    idPenyakit = models.getId(penyakit);
                                                    deskripsi = models.getDeskripsi(penyakit);
                                                } else {
                                                    id = 118; //kotoran bercampur darah
                                                    pertanyaan = models.getGejala(id);
                                                    nama = models.getNama(id);
                                                    answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                                                    if (answer == 0) {
                                                        penyakit = "Salmonellosis";
                                                        pengobatan = models.getPenyakit(penyakit);
                                                        kematian = models.getKematian(penyakit);
                                                        idPenyakit = models.getId(penyakit);
                                                        deskripsi = models.getDeskripsi(penyakit);
                                                    } else {
                                                        penyakit = "Coccidiosis bebek";
                                                        pengobatan = models.getPenyakit(penyakit);
                                                        kematian = models.getKematian(penyakit);
                                                        idPenyakit = models.getId(penyakit);
                                                        deskripsi = models.getDeskripsi(penyakit);
                                                    }
                                                }
                                            } else {
                                                pindah = false;
                                                JOptionPane.showMessageDialog(views, "mohon maaf penyakit mungkin belum terdeteksi", "error", JOptionPane.ERROR_MESSAGE);
                                            }
                                        } else {
                                            id = 109; //sesak nafas
                                            pertanyaan = models.getGejala(id);
                                            nama = models.getNama(id);
                                            answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                                            if (answer == 0) {
                                                id = 112; //suara nyaring
                                                pertanyaan = models.getGejala(id);
                                                nama = models.getNama(id);
                                                answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                                                if (answer == 0) {
                                                    id = 110; //piul bengkak dan panas
                                                    pertanyaan = models.getGejala(id);
                                                    nama = models.getNama(id);
                                                    answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                                                    if (answer == 0) {
                                                        penyakit = "Colera";
                                                        pengobatan = models.getPenyakit(penyakit);
                                                        kematian = models.getKematian(penyakit);
                                                        idPenyakit = models.getId(penyakit);
                                                        deskripsi = models.getDeskripsi(penyakit);
                                                    } else {
                                                        JOptionPane.showMessageDialog(views, "mohon maaf penyakit mungkin belum terdeteksi", "error", JOptionPane.ERROR_MESSAGE);
                                                        pindah = false;
                                                    }
                                                } else {
                                                    JOptionPane.showMessageDialog(views, "mohon maaf penyakit mungkin belum terdeteksi", "error", JOptionPane.ERROR_MESSAGE);
                                                    pindah = false;
                                                }
                                            } else {
                                                id = 101; //mata berlendir
                                                pertanyaan = models.getGejala(id);
                                                nama = models.getNama(id);
                                                answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                                                if (answer == 0) {
                                                    penyakit = "Coryza Bebek";
                                                    pengobatan = models.getPenyakit(penyakit);
                                                    kematian = models.getKematian(penyakit);
                                                    idPenyakit = models.getId(penyakit);
                                                    deskripsi = models.getDeskripsi(penyakit);
                                                } else {
                                                    JOptionPane.showMessageDialog(views, "mohon maaf penyakit mungkin belum terdeteksi", "error", JOptionPane.ERROR_MESSAGE);
                                                    pindah = false;
                                                }
                                            }
                                        }
                                    } else {
                                        id = 101; //mata berlendir
                                        pertanyaan = models.getGejala(id);
                                        nama = models.getNama(id);
                                        answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                                        if (answer == 0) {
                                            penyakit = "Penyakit Bebek Aflatokskosis";
                                            pengobatan = models.getPenyakit(penyakit);
                                            kematian = models.getKematian(penyakit);
                                            idPenyakit = models.getId(penyakit);
                                            deskripsi = models.getDeskripsi(penyakit);
                                        } else {
                                            JOptionPane.showMessageDialog(views, "mohon maaf penyakit mungkin belum terdeteksi", "error", JOptionPane.ERROR_MESSAGE);
                                            pindah = false;
                                        }
                                    }
                                } else {
                                    id = 101; //mata berlendir
                                    pertanyaan = models.getGejala(id);
                                    nama = models.getNama(id);
                                    answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                                    if (answer == 0) {
                                        id = 109; //sesak nafas
                                        pertanyaan = models.getGejala(id);
                                        nama = models.getNama(id);
                                        answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                                        if (answer == 0) {
                                            penyakit = "White eye";
                                            pengobatan = models.getPenyakit(penyakit);
                                            kematian = models.getKematian(penyakit);
                                            idPenyakit = models.getId(penyakit);
                                            deskripsi = models.getDeskripsi(penyakit);
                                        } else {
                                            penyakit = "Kekurangan Vitamin A";
                                            pengobatan = models.getPenyakit(penyakit);
                                            kematian = models.getKematian(penyakit);
                                            idPenyakit = models.getId(penyakit);
                                            deskripsi = models.getDeskripsi(penyakit);
                                        }
                                    } else {
                                        penyakit = "Rickets Duck";
                                        pengobatan = models.getPenyakit(penyakit);
                                        kematian = models.getKematian(penyakit);
                                        idPenyakit = models.getId(penyakit);
                                        deskripsi = models.getDeskripsi(penyakit);
                                    }
                                }
                            } else {
                                id = 107; //gelisah
                                pertanyaan = models.getGejala(id);
                                nama = models.getNama(id);
                                answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                                if (answer == 0) {
                                    id = 105; //kulit kering
                                    pertanyaan = models.getGejala(id);
                                    nama = models.getNama(id);
                                    answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                                    if (answer == 0) {
                                        id = 106; //bulu rontok
                                        pertanyaan = models.getGejala(id);
                                        nama = models.getNama(id);
                                        answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                                        if (answer == 0) {
                                            penyakit = "Antibiotika Dermatitis";
                                            pengobatan = models.getPenyakit(penyakit);
                                            kematian = models.getKematian(penyakit);
                                            idPenyakit = models.getId(penyakit);
                                            deskripsi = models.getDeskripsi(penyakit);
                                        } else {
                                            JOptionPane.showMessageDialog(views, "mohon maaf penyakit mungkin belum terdeteksi", "error", JOptionPane.ERROR_MESSAGE);
                                            pindah = false;
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(views, "mohon maaf penyakit mungkin belum terdeteksi", "error", JOptionPane.ERROR_MESSAGE);
                                        pindah = false;
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(views, "mohon maaf penyakit mungkin belum terdeteksi", "error", JOptionPane.ERROR_MESSAGE);
                                    pindah = false;
                                }
                            }
                        } else {
                            id = 101; //mata Berlendir
                            pertanyaan = models.getGejala(id);
                            nama = models.getNama(id);
                            answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                            if (answer == 0) {
                                id = 117; //pembekakan sinus
                                pertanyaan = models.getGejala(id);
                                nama = models.getNama(id);
                                answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                                if (answer == 0) {
                                    penyakit = "Sinusitis";
                                    pengobatan = models.getPenyakit(penyakit);
                                    kematian = models.getKematian(penyakit);
                                    idPenyakit = models.getId(penyakit);
                                    deskripsi = models.getDeskripsi(penyakit);
                                } else {
                                    JOptionPane.showMessageDialog(views, "mohon maaf penyakit mungkin belum terdeteksi", "error", JOptionPane.ERROR_MESSAGE);
                                    pindah = false;
                                }
                            } else {
                                id = 103; //Telur berkurang
                                pertanyaan = models.getGejala(id);
                                nama = models.getNama(id);
                                answer = JOptionPane.showConfirmDialog(views, pertanyaan, nama, JOptionPane.YES_NO_OPTION);
                                if (answer == 0) {
                                    penyakit = "Stress";
                                    pengobatan = models.getPenyakit(penyakit);
                                    kematian = models.getKematian(penyakit);
                                    idPenyakit = models.getId(penyakit);
                                    deskripsi = models.getDeskripsi(penyakit);
                                } else {
                                    JOptionPane.showMessageDialog(views, "mohon maaf penyakit mungkin belum terdeteksi", "error", JOptionPane.ERROR_MESSAGE);
                                    pindah = false;
                                }
                            }
                        }
                        if (pindah == true) {
                            try {
                                models.setRecord(bebek + 1, banyak);
                            } catch (SQLException ex) {
                                Logger.getLogger(c_penanganan.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            control = new c_hasilPenyakit();
                            control.views.setPenyakit(penyakit);
                            control.views.setPenanganan(pengobatan);
                            control.views.setDeskripsi(deskripsi);
                            views.dispose();
                        }
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
