package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class user {

    private static String idAkun;
    String username;
    String password;

    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int cocokan(String username, String password) throws SQLException {
        koneksi kon = new koneksi("ppl", "root", "");
        String query = "SELECT * FROM users WHERE username='"
                + username + "' AND password='" + password + "'";
        ResultSet rs = kon.getResult(query);

        rs.last();
        if (rs.getRow() == 1) {
            if (username.equals(rs.getString("username")) && password.equals(rs.getString("password"))) {
                String query2 = "SELECT * FROM users WHERE id="
                        + rs.getString("id");
                ResultSet rs2 = kon.getResult(query2);
                rs2.next();
                String tipe = rs2.getString("level");
                idAkun = rs2.getString("id");
                System.out.println(idAkun);
                if (tipe.equals("1")) {
                    return 1;
                } else {
                    return 0;
                }

            }else{
                return 0;
            }
        } else {
            return 0;
        }
    }

    protected static String getUser() {
        return idAkun;
    }

    public void tambahUser(String username, String password) throws SQLException {
        try {
            koneksi kon = new koneksi("ppl", "root", "");
            String query = "INSERT INTO users (`id`, `username`, `password`,`modal`,`lahan` , `jumlahBebek`)"
                    + "VALUES (NULL, '" + username + "','" + password + "','0','0','0');";
            kon.execute(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void tambahData(int modal, int lahan, int jumlah) {

        try {
            koneksi kon = new koneksi("ppl", "root", "");
            String query = "UPDATE users set `modal`='" + modal + "',`lahan`='" + lahan + "',`jumlahBebek`='" + jumlah + "' where id='" + idAkun + "'";
            kon.execute(query);
            System.out.println(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
