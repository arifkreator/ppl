package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class penyakit {
    String pertanyaan="";
    String nama="";
    String pengobatan="";
    String deskripsi="";
    int kematian;
    int idPenyakit;
    public penyakit() throws SQLException {
        
    }

    public String getGejala(int id) {

        try {
            koneksi kon = new koneksi("ppl", "root", "");
            String query = "select pertanyaan from gejala where id_gejala="+id;
            ResultSet rs = kon.getResult(query);
            while (rs.next()) {
                String gejala=rs.getString("pertanyaan");
                pertanyaan=gejala;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return pertanyaan;
    }
    public String getNama(int id) {

        try {
            koneksi kon = new koneksi("ppl", "root", "");
            String query = "select nama_gejala from gejala where id_gejala="+id;
            ResultSet rs = kon.getResult(query);
            while (rs.next()) {
                String gejala=rs.getString("nama_gejala");
                nama=gejala;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return nama;
    }
    public String getPenyakit(String nama) {
        try{
            koneksi kon = new koneksi("ppl", "root", "");
            String query = "select penanganan from penyakit where nama_penyakit='" + nama + "'";
            ResultSet rs = kon.getResult(query);
            while (rs.next()) {
                String penanganan=rs.getString("penanganan");
                pengobatan=penanganan;
            }
        }catch(Exception e) {
            System.out.println(e);
        }
        return pengobatan;
    }
    
    public String getDeskripsi(String nama) {
        try{
            koneksi kon = new koneksi("ppl", "root", "");
            String query = "select deskripsi from penyakit where nama_penyakit='" + nama + "'";
            ResultSet rs = kon.getResult(query);
            while (rs.next()) {
                String deskrip=rs.getString("deskripsi");
                deskripsi=deskrip;
            }
        }catch(Exception e) {
            System.out.println(e);
        }
        return deskripsi;
    }
    
    public int getKematian(String nama) {
        try{
            koneksi kon = new koneksi("ppl", "root", "");
            String query = "select tingkatKematian from penyakit where nama_penyakit='" + nama + "'";
            ResultSet rs = kon.getResult(query);
            while (rs.next()) {
                int tingkatKematian=rs.getInt("tingkatKematian");
                kematian=tingkatKematian;
            }
        }catch(Exception e) {
            System.out.println(e);
        }
        return kematian;
    } 
    
    public int getId(String nama) {
        try{
            koneksi kon = new koneksi("ppl", "root", "");
            String query = "select id_penyakit from penyakit where nama_penyakit='" + nama + "'";
            ResultSet rs = kon.getResult(query);
            while (rs.next()) {
                int id=rs.getInt("id_penyakit");
                idPenyakit=id;
            }
            System.out.println(idPenyakit);
        }catch(Exception e) {
            System.out.println("awas");
        }
        return idPenyakit;
    } 
    
    public void setRecord(int bebe, int jumlah)throws SQLException{
        System.out.println(bebe);
        String use = user.getUser();
        try {
            koneksi kon = new koneksi("ppl", "root", "");
            String query = "INSERT INTO record (`idRecord`, `idUser`, `idPenyakit`,`idbebek`, `jumlah`)"
                    + "VALUES (NULL, '" + use + "','" + idPenyakit + "','" + bebe + "','" + jumlah + "');";
            kon.execute(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
