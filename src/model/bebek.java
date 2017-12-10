package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class bebek {
    private static int idbebek;
    
    public bebek(){
        
    }
    
    public int getId(String nama) throws SQLException{
        koneksi kon = new koneksi("ppl", "root", "");
        String query = "SELECT id_bebek FROM bebek WHERE jenis_bebek='" + nama + "'";
        ResultSet rs = kon.getResult(query);
        while (rs.next()) {
                int id=rs.getInt("id");
                idbebek=id;
            }
        return idbebek;
    }
    
    protected static int getBebek() {
        return idbebek;
    }
}

