
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.analisajmlnew;
import view.analisapemeliharaannew;
import view.analisapenanganannew;
import view.petunjuk;
import view.awalnew;


/**
 *
 * @author user
 */
public class c_petunjuk {
    petunjuk views;
   
    
    
    public c_petunjuk () {
        
         
        views = new petunjuk();
        views.setVisible(true);
//        views.getpena().addActionListener(new Klikpena());
//        views.getpem().addActionListener(new Klikpem());
//        views.getkeuntungan().addActionListener(new Klikkeuntungan());
//        views.getpetunjuk().addActionListener(new Klikpetunjuk());
    }
}
