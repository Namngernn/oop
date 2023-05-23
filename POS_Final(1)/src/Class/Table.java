package Class;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.lang.*;

public class Table extends javax.swing.JFrame implements Bill{
    public Table() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 245, 227));

        jButton1.setBackground(new java.awt.Color(114, 89, 55));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bill.setEditable(false);
        bill.setBackground(new java.awt.Color(255, 255, 255));
        bill.setColumns(20);
        bill.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        bill.setForeground(new java.awt.Color(114, 89, 55));
        bill.setRows(5);
        bill.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                billAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(bill);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            try{
                bill.print();
            }catch(Exception e){
                System.out.print(e);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void itemsbill(JTable jtable1, JTextField cash, JLabel date, JLabel time){
        
        jtable1.getModel();
        
        clock cc = new clock();
        cc.showdate(date);
        cc.showtime(time);
        
        bill.setText(bill.getText() + "                                     POS BAR \n");
        bill.setText(bill.getText() + "     TIME : " + "   " + time.getText() + " \n");
        bill.setText(bill.getText() + "     DATE :" + "   " + date.getText() +"\n");
        bill.setText(bill.getText()+"     QTY\tITEMS\t\tPRICE"+"\n");
        bill.setText(bill.getText() + "   ---------------------------------------------------------------\n");
       

        double itemPrice = 0.0, value, tot = 0.0, vat = 0.0, paid, change;
        for (int i = 0; i < jtable1.getRowCount(); i++) {
            StringBuilder sbd = new StringBuilder();
            String Name = jtable1.getValueAt(i, 1).toString();
            char[] arr = new char[28];
            String Qty = jtable1.getValueAt(i, 2).toString();
            String TotalPrice = jtable1.getValueAt(i, 3).toString();
     
            while(Name.length()<50){
                Name += " ";
            }
            
            for (int j = 0; j < 28; j++) {
                arr[j] = Name.charAt(j);
            }
            bill.setText(bill.getText() + "     " + Qty + "     " + sbd.append(arr) + "\t" + TotalPrice + "\n");
            value = Double.valueOf(TotalPrice);
            itemPrice += value;
        }
        
        DecimalFormat df = new DecimalFormat("00.00");
        vat = itemPrice*0.07;
        tot = itemPrice + vat;
        paid = Double.valueOf(cash.getText());
        change = paid - tot;
        
        bill.setText(bill.getText() + "   ---------------------------------------------------------------\n");        
        bill.setText(bill.getText() + "     DISCOUNT\t\t\t0.00 " + " \n");
        bill.setText(bill.getText() + "     Total"  + "\t\t\t" +df.format(itemPrice)+"\n"); //total on vat
        bill.setText(bill.getText() + "     VAT 7%"  + "\t\t\t" +df.format(vat)+"\n"); //only vat            
        bill.setText(bill.getText() + " \n");            
        bill.setText(bill.getText() + "     Sub Total"  + "\t\t\t" +df.format(tot)+"\n");  //total+vat
        bill.setText(bill.getText() + "     Cash" + "\t\t\t" +df.format(paid)+"\n");  //cash
        bill.setText(bill.getText() + "     Change" + "\t\t\t" +df.format(change)+"\n");  //balance
        bill.setText(bill.getText() + "   ---------------------------------------------------------------\n");
        bill.setText(bill.getText() + "                                  THANK YOU"+"\n");
        bill.setText(bill.getText() + "   ---------------------------------------------------------------\n");
        
        
        
    }
    private void billAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_billAncestorAdded
        Table t1 = new Table();
        JTable jtable1 = new JTable();
        JTextField cash = new JTextField();
        JLabel date = new JLabel();
        JLabel time = new JLabel();
        t1.itemsbill(jtable1, cash, date, time);
    }//GEN-LAST:event_billAncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Table tableFrame = new Table();
        tableFrame.setVisible(true);
        tableFrame.pack();
        tableFrame.setLocationRelativeTo(null); //open on center      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bill;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
