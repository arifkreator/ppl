package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class analisa {
    String idrecord;
    String iduser;
    public analisa(){
        
    }
    
   public String getrecord() throws SQLException{
       String id = user.getUser();
       koneksi kon = new koneksi("ppl", "root", "");
        String query = "SELECT idRecord FROM record WHERE idUser='" + id + "' order by idRecord Desc limit 1";
        
        ResultSet rs = kon.getResult(query);
        while (rs.next()) {
                String idRecord=rs.getString("idRecord");
                idrecord=idRecord;
                
        }
        return idrecord;
   }
   
   public String getModal() throws SQLException{
       koneksi kon = new koneksi("ppl", "root", "");
        String query = "SELECT idUser FROM record WHERE idRecord='" + getrecord() + "' order by idRecord Desc limit 1";
        
        ResultSet rs = kon.getResult(query);
        while (rs.next()) {
                String idUser=rs.getString("idUser");
                iduser=idUser;
                
        }
        return iduser;
    }
   
   public String getJumlah() throws SQLException{
       koneksi kon = new koneksi("ppl", "root", "");
        String query = "SELECT idUser FROM record WHERE idRecord='" + getrecord() + "' order by idRecord Desc limit 1";
        
        ResultSet rs = kon.getResult(query);
        while (rs.next()) {
                String idUser=rs.getString("idUser");
                iduser=idUser;
                
        }
        return iduser;
    }
    
   public String [] hasil() throws SQLException{
       String id =  user.getUser();
       koneksi kon = new koneksi("ppl", "root", "");
        String query = "SELECT u.modal,u.jumlahBebek,b.jenis_bebek,p.tingkatKematian, r.jumlah FROM `record` as r join users as u "
                + "on u.id=r.idUser join penyakit as p on p.id_penyakit=r.idPenyakit JOIN bebek as b ON r.idBebek = b.id_bebek  "
                + "WHERE u.id='"+id+"' order by r.idRecord desc limit 1";
       ResultSet rs = kon.getResult(query);
       String kolom [] = new String [5];
       while (rs.next()){
           kolom[0]=rs.getString("u.modal");
           kolom[1]=rs.getString("u.jumlahBebek");
           kolom[2]=rs.getString("b.jenis_bebek");
           kolom[3]=rs.getString("p.tingkatKematian");
           kolom[4]=rs.getString("r.jumlah");
       }
        return kolom;
   }
   
//    public String getanalis[] {
//        SELECT u.modal,u.jumlahBebek,b.jenis_bebek,p.tingkatKematian FROM `record` as r join users as u on u.id=r.idUser join penyakit as p on p.id_penyakit=r.idPenyakit JOIN bebek as b ON r.idBebek = b.id_bebek  WHERE u.id=1 order by r.idRecord desc limit 1
//    }
}
