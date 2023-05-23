package Class;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.Timer;

public class clock{

    public void showdate(JLabel date){       
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        Date d = new Date();
        date.setText(s.format(d));
   }
    
    public void showtime(JLabel time){
            new Timer(0, new ActionListener() {
 
                @Override
                public void actionPerformed(ActionEvent e) {
                    SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
                    Date d = new Date();
                    time.setText(s.format(d));
                }
            }).start();
    }    
}