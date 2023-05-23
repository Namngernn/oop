package Class;

import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public abstract class AddMenu {
    
    abstract void addtable(int id, String Name, int Qty, Double Price);
    
    public void addtables(int id, String Name, int Qty, Double Price) {
        JTable jTable1 = new JTable();
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        DecimalFormat df = new DecimalFormat("00.00");
        double totPrice = Price * Double.valueOf(Qty);
        String TotalPrice = df.format(totPrice);
        // product allready add chk        
        for (int row = 0; row < jTable1.getRowCount(); row++) {
            if (Name == jTable1.getValueAt(row, 1)) {
                dt.removeRow(jTable1.convertRowIndexToModel(row));
            }
        }
        Vector v = new Vector();
        v.add(id);
        v.add(Name);
        v.add(Qty);
        v.add(TotalPrice); // total price        
        dt.addRow(v);
    }

}
