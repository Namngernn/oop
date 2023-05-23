package Class;

import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JTable;


public class calculator {
    public double tot = 0.0;
    public void calculate(JTable jTable1,JLabel total) {
        //cal total with VAT 
        int numOfRow = jTable1.getRowCount();
        double tot = 0.0, vat = 0.0, itemPrice = 0.0;
        for (int i = 0; i < numOfRow; i++) {
            double value = Double.valueOf(jTable1.getValueAt(i, 3).toString());
            itemPrice += value;            
        }
        
        DecimalFormat df = new DecimalFormat("00.00");
        vat = itemPrice*0.07;
        tot = itemPrice + vat;      
        this.tot = tot;
        total.setText(df.format(tot)+" ("+df.format(itemPrice)+" + "+df.format(vat)+" (VAT 7%) )");        
        //can made it be custom class
    }
    
}