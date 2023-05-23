package Class;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.util.Date;
import javax.swing.Timer;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Gui extends javax.swing.JFrame {
    calculator cal = new calculator();
    clock cc = new clock();
    public Gui() {
        initComponents();
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
        getContentPane().setBackground(Color.getHSBColor(50, 70, 44));
        

        CocktailPanel.setVisible(false);
        BeerPanel.setVisible(false);
        MocktailPanel.setVisible(false);
        SnacksPanel.setVisible(false);
        JuicePanel.setVisible(false);
        
        cc.showdate(date);
        cc.showtime(time);
        cal.calculate(jTable1, total);
        
    }

    public void addtable(int id, String Name, int Qty, Double Price) {
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        DecimalFormat df = new DecimalFormat("00.00");
        double totPrice = Price * Double.valueOf(Qty);
        String TotalPrice = df.format(totPrice);

        for (int row = 0; row < jTable1.getRowCount(); row++) {
            if (Name == jTable1.getValueAt(row, 1)) {
                dt.removeRow(jTable1.convertRowIndexToModel(row));
            }
        }

        Vector v = new Vector();
        v.add(id);
        v.add(Name);
        v.add(Qty);
        v.add(Price);
        dt.addRow(v);
    }

    public void addtables(int id, String Name, int Qty, Double Price) {
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

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jSpinner1 = new javax.swing.JSpinner();
        CocktailBtn = new javax.swing.JButton();
        MocktailBtn = new javax.swing.JButton();
        JuiceBtn = new javax.swing.JButton();
        WhiskeyBtn = new javax.swing.JButton();
        BeerBtn = new javax.swing.JButton();
        SnackBtn = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        WhiskeyPanel = new javax.swing.JPanel();
        wk3 = new javax.swing.JButton();
        wk1 = new javax.swing.JButton();
        wk6 = new javax.swing.JButton();
        wk4 = new javax.swing.JButton();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        q6 = new javax.swing.JLabel();
        wk5 = new javax.swing.JButton();
        wk2 = new javax.swing.JButton();
        CocktailPanel = new javax.swing.JPanel();
        ct3 = new javax.swing.JButton();
        ct1 = new javax.swing.JButton();
        ct6 = new javax.swing.JButton();
        ct4 = new javax.swing.JButton();
        q7 = new javax.swing.JLabel();
        q8 = new javax.swing.JLabel();
        q9 = new javax.swing.JLabel();
        q10 = new javax.swing.JLabel();
        q11 = new javax.swing.JLabel();
        q12 = new javax.swing.JLabel();
        ct5 = new javax.swing.JButton();
        ct2 = new javax.swing.JButton();
        MocktailPanel = new javax.swing.JPanel();
        mk3 = new javax.swing.JButton();
        mk1 = new javax.swing.JButton();
        mk6 = new javax.swing.JButton();
        mk4 = new javax.swing.JButton();
        q13 = new javax.swing.JLabel();
        q14 = new javax.swing.JLabel();
        q15 = new javax.swing.JLabel();
        q16 = new javax.swing.JLabel();
        q17 = new javax.swing.JLabel();
        q18 = new javax.swing.JLabel();
        mk5 = new javax.swing.JButton();
        mk2 = new javax.swing.JButton();
        BeerPanel = new javax.swing.JPanel();
        wk19 = new javax.swing.JButton();
        wk20 = new javax.swing.JButton();
        wk21 = new javax.swing.JButton();
        wk22 = new javax.swing.JButton();
        q19 = new javax.swing.JLabel();
        q20 = new javax.swing.JLabel();
        q21 = new javax.swing.JLabel();
        q22 = new javax.swing.JLabel();
        q23 = new javax.swing.JLabel();
        q24 = new javax.swing.JLabel();
        wk23 = new javax.swing.JButton();
        wk24 = new javax.swing.JButton();
        SnacksPanel = new javax.swing.JPanel();
        sn3 = new javax.swing.JButton();
        sn1 = new javax.swing.JButton();
        sn6 = new javax.swing.JButton();
        sn4 = new javax.swing.JButton();
        q25 = new javax.swing.JLabel();
        q26 = new javax.swing.JLabel();
        q27 = new javax.swing.JLabel();
        q28 = new javax.swing.JLabel();
        q29 = new javax.swing.JLabel();
        q30 = new javax.swing.JLabel();
        sn5 = new javax.swing.JButton();
        sn2 = new javax.swing.JButton();
        JuicePanel = new javax.swing.JPanel();
        j3 = new javax.swing.JButton();
        j1 = new javax.swing.JButton();
        j6 = new javax.swing.JButton();
        j4 = new javax.swing.JButton();
        q31 = new javax.swing.JLabel();
        q32 = new javax.swing.JLabel();
        q33 = new javax.swing.JLabel();
        q34 = new javax.swing.JLabel();
        q35 = new javax.swing.JLabel();
        q36 = new javax.swing.JLabel();
        j5 = new javax.swing.JButton();
        j2 = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        time = new javax.swing.JLabel();
        totalL = new javax.swing.JLabel();
        cashL = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        bal = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        cash = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        payBT = new javax.swing.JButton();
        vat = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        CocktailBtn.setBackground(Color.WHITE);
        CocktailBtn.setBackground(new java.awt.Color(255, 51, 255));
        CocktailBtn.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        CocktailBtn.setText("Cocktail");
        CocktailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CocktailBtnActionPerformed(evt);
            }
        });

        MocktailBtn.setBackground(Color.WHITE);
        MocktailBtn.setBackground(new java.awt.Color(255, 255, 51));
        MocktailBtn.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        MocktailBtn.setText("Mocktail");
        MocktailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MocktailBtnActionPerformed(evt);
            }
        });

        JuiceBtn.setBackground(Color.WHITE);
        JuiceBtn.setBackground(new java.awt.Color(51, 51, 255));
        JuiceBtn.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        JuiceBtn.setText("Juice");
        JuiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JuiceBtnActionPerformed(evt);
            }
        });

        WhiskeyBtn.setBackground(Color.WHITE);
        WhiskeyBtn.setBackground(new java.awt.Color(153, 255, 51));
        WhiskeyBtn.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        WhiskeyBtn.setText("Whiskey");
        WhiskeyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhiskeyBtnActionPerformed(evt);
            }
        });

        BeerBtn.setBackground(Color.WHITE);
        BeerBtn.setBackground(new java.awt.Color(255, 51, 51));
        BeerBtn.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        BeerBtn.setText("Beer");
        BeerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeerBtnActionPerformed(evt);
            }
        });

        SnackBtn.setBackground(Color.WHITE);
        SnackBtn.setBackground(new java.awt.Color(255, 51, 204));
        SnackBtn.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        SnackBtn.setText("Snacks");
        SnackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnackBtnActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WhiskeyPanel.setBackground(new java.awt.Color(249, 245, 227));
        WhiskeyPanel.setLayout(null);

        wk3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Whiskey/3.jpg"))); // NOI18N
        wk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wk3ActionPerformed(evt);
            }
        });
        WhiskeyPanel.add(wk3);
        wk3.setBounds(544, 20, 167, 166);

        wk1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Whiskey/1.jpg"))); // NOI18N
        wk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wk1ActionPerformed(evt);
            }
        });
        WhiskeyPanel.add(wk1);
        wk1.setBounds(70, 20, 167, 166);

        wk6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Whiskey/6.jpg"))); // NOI18N
        wk6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wk6ActionPerformed(evt);
            }
        });
        WhiskeyPanel.add(wk6);
        wk6.setBounds(540, 290, 167, 166);

        wk4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Whiskey/4.jpg"))); // NOI18N
        wk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wk4ActionPerformed(evt);
            }
        });
        WhiskeyPanel.add(wk4);
        wk4.setBounds(70, 291, 167, 166);

        q1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        q1.setForeground(new java.awt.Color(114, 93, 55));
        q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1.setText("0");
        q1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WhiskeyPanel.add(q1);
        q1.setBounds(70, 192, 167, 40);

        q2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        q2.setForeground(new java.awt.Color(114, 93, 55));
        q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2.setText("0");
        q2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WhiskeyPanel.add(q2);
        q2.setBounds(307, 192, 167, 40);

        q3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        q3.setForeground(new java.awt.Color(114, 93, 55));
        q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3.setText("0");
        q3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WhiskeyPanel.add(q3);
        q3.setBounds(544, 192, 167, 40);

        q4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        q4.setForeground(new java.awt.Color(114, 93, 55));
        q4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q4.setText("0");
        q4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WhiskeyPanel.add(q4);
        q4.setBounds(70, 469, 167, 40);

        q5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        q5.setForeground(new java.awt.Color(114, 93, 55));
        q5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q5.setText("0");
        q5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WhiskeyPanel.add(q5);
        q5.setBounds(307, 469, 167, 40);

        q6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        q6.setForeground(new java.awt.Color(114, 93, 55));
        q6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q6.setText("0");
        q6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WhiskeyPanel.add(q6);
        q6.setBounds(544, 469, 167, 40);

        wk5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Whiskey/5.jpg"))); // NOI18N
        wk5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wk5ActionPerformed(evt);
            }
        });
        WhiskeyPanel.add(wk5);
        wk5.setBounds(307, 291, 167, 166);

        wk2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Whiskey/2.jpg"))); // NOI18N
        wk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wk2ActionPerformed(evt);
            }
        });
        WhiskeyPanel.add(wk2);
        wk2.setBounds(307, 20, 167, 166);

        jLayeredPane1.add(WhiskeyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 529));

        CocktailPanel.setBackground(new java.awt.Color(249, 245, 227));
        CocktailPanel.setLayout(null);

        ct3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Cocktail/3.jpg"))); // NOI18N
        ct3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct3ActionPerformed(evt);
            }
        });
        CocktailPanel.add(ct3);
        ct3.setBounds(544, 20, 167, 166);

        ct1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Cocktail/1.jpg"))); // NOI18N
        ct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct1ActionPerformed(evt);
            }
        });
        CocktailPanel.add(ct1);
        ct1.setBounds(70, 20, 167, 166);

        ct6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Cocktail/6.jpg"))); // NOI18N
        ct6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct6ActionPerformed(evt);
            }
        });
        CocktailPanel.add(ct6);
        ct6.setBounds(540, 290, 167, 166);

        ct4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Cocktail/4.jpg"))); // NOI18N
        ct4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct4ActionPerformed(evt);
            }
        });
        CocktailPanel.add(ct4);
        ct4.setBounds(70, 291, 167, 166);

        q7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q7.setText("0");
        q7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CocktailPanel.add(q7);
        q7.setBounds(70, 192, 167, 40);

        q8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q8.setText("0");
        q8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CocktailPanel.add(q8);
        q8.setBounds(307, 192, 167, 40);

        q9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q9.setText("0");
        q9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CocktailPanel.add(q9);
        q9.setBounds(544, 192, 167, 40);

        q10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q10.setText("0");
        q10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CocktailPanel.add(q10);
        q10.setBounds(70, 469, 167, 40);

        q11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q11.setText("0");
        q11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CocktailPanel.add(q11);
        q11.setBounds(307, 469, 167, 40);

        q12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q12.setText("0");
        q12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CocktailPanel.add(q12);
        q12.setBounds(544, 469, 167, 40);

        ct5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Cocktail/5.jpg"))); // NOI18N
        ct5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct5ActionPerformed(evt);
            }
        });
        CocktailPanel.add(ct5);
        ct5.setBounds(307, 291, 167, 166);

        ct2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Cocktail/2.jpg"))); // NOI18N
        ct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct2ActionPerformed(evt);
            }
        });
        CocktailPanel.add(ct2);
        ct2.setBounds(307, 20, 167, 166);

        jLayeredPane1.add(CocktailPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 529));

        MocktailPanel.setBackground(new java.awt.Color(249, 245, 227));
        MocktailPanel.setLayout(null);

        mk3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Mocktail/3.jpg"))); // NOI18N
        mk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mk3ActionPerformed(evt);
            }
        });
        MocktailPanel.add(mk3);
        mk3.setBounds(544, 20, 167, 166);

        mk1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Mocktail/1.jpg"))); // NOI18N
        mk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mk1ActionPerformed(evt);
            }
        });
        MocktailPanel.add(mk1);
        mk1.setBounds(70, 20, 167, 166);

        mk6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Mocktail/6.jpg"))); // NOI18N
        mk6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mk6ActionPerformed(evt);
            }
        });
        MocktailPanel.add(mk6);
        mk6.setBounds(540, 290, 167, 166);

        mk4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Mocktail/4.jpg"))); // NOI18N
        mk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mk4ActionPerformed(evt);
            }
        });
        MocktailPanel.add(mk4);
        mk4.setBounds(70, 291, 167, 166);

        q13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q13.setText("0");
        q13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MocktailPanel.add(q13);
        q13.setBounds(70, 192, 167, 40);

        q14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q14.setText("0");
        q14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MocktailPanel.add(q14);
        q14.setBounds(307, 192, 167, 40);

        q15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q15.setText("0");
        q15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MocktailPanel.add(q15);
        q15.setBounds(544, 192, 167, 40);

        q16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q16.setText("0");
        q16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MocktailPanel.add(q16);
        q16.setBounds(70, 469, 167, 40);

        q17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q17.setText("0");
        q17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MocktailPanel.add(q17);
        q17.setBounds(307, 469, 167, 40);

        q18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q18.setText("0");
        q18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MocktailPanel.add(q18);
        q18.setBounds(544, 469, 167, 40);

        mk5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Mocktail/5.jpg"))); // NOI18N
        mk5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mk5ActionPerformed(evt);
            }
        });
        MocktailPanel.add(mk5);
        mk5.setBounds(307, 291, 167, 166);

        mk2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Mocktail/2.jpg"))); // NOI18N
        mk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mk2ActionPerformed(evt);
            }
        });
        MocktailPanel.add(mk2);
        mk2.setBounds(307, 20, 167, 166);

        jLayeredPane1.add(MocktailPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 529));

        BeerPanel.setBackground(new java.awt.Color(249, 245, 227));
        BeerPanel.setLayout(null);

        wk19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Beer/3.jpg"))); // NOI18N
        wk19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wk19ActionPerformed(evt);
            }
        });
        BeerPanel.add(wk19);
        wk19.setBounds(544, 20, 167, 166);

        wk20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Beer/1.jpg"))); // NOI18N
        wk20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wk20ActionPerformed(evt);
            }
        });
        BeerPanel.add(wk20);
        wk20.setBounds(70, 20, 167, 166);

        wk21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Beer/6.jpg"))); // NOI18N
        wk21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wk21ActionPerformed(evt);
            }
        });
        BeerPanel.add(wk21);
        wk21.setBounds(540, 290, 167, 166);

        wk22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Beer/4.jpg"))); // NOI18N
        wk22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wk22ActionPerformed(evt);
            }
        });
        BeerPanel.add(wk22);
        wk22.setBounds(70, 291, 167, 166);

        q19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q19.setText("0");
        q19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BeerPanel.add(q19);
        q19.setBounds(70, 192, 167, 40);

        q20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q20.setText("0");
        q20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BeerPanel.add(q20);
        q20.setBounds(307, 192, 167, 40);

        q21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q21.setText("0");
        q21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BeerPanel.add(q21);
        q21.setBounds(544, 192, 167, 40);

        q22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q22.setText("0");
        q22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BeerPanel.add(q22);
        q22.setBounds(70, 469, 167, 40);

        q23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q23.setText("0");
        q23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BeerPanel.add(q23);
        q23.setBounds(307, 469, 167, 40);

        q24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q24.setText("0");
        q24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BeerPanel.add(q24);
        q24.setBounds(544, 469, 167, 40);

        wk23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Beer/5.jpg"))); // NOI18N
        wk23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wk23ActionPerformed(evt);
            }
        });
        BeerPanel.add(wk23);
        wk23.setBounds(307, 291, 167, 166);

        wk24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Beer/2.jpg"))); // NOI18N
        wk24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wk24ActionPerformed(evt);
            }
        });
        BeerPanel.add(wk24);
        wk24.setBounds(307, 20, 167, 166);

        jLayeredPane1.add(BeerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 529));

        SnacksPanel.setBackground(new java.awt.Color(249, 245, 227));
        SnacksPanel.setLayout(null);

        sn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Snack/3.jpg"))); // NOI18N
        sn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sn3ActionPerformed(evt);
            }
        });
        SnacksPanel.add(sn3);
        sn3.setBounds(544, 20, 167, 166);

        sn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Snack/1.jpg"))); // NOI18N
        sn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sn1ActionPerformed(evt);
            }
        });
        SnacksPanel.add(sn1);
        sn1.setBounds(70, 20, 167, 166);

        sn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Snack/6.jpg"))); // NOI18N
        sn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sn6ActionPerformed(evt);
            }
        });
        SnacksPanel.add(sn6);
        sn6.setBounds(540, 290, 167, 166);

        sn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Snack/4.jpg"))); // NOI18N
        sn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sn4ActionPerformed(evt);
            }
        });
        SnacksPanel.add(sn4);
        sn4.setBounds(70, 291, 167, 166);

        q25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q25.setText("0");
        q25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q25.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SnacksPanel.add(q25);
        q25.setBounds(70, 192, 167, 40);

        q26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q26.setText("0");
        q26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q26.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SnacksPanel.add(q26);
        q26.setBounds(307, 192, 167, 40);

        q27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q27.setText("0");
        q27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SnacksPanel.add(q27);
        q27.setBounds(544, 192, 167, 40);

        q28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q28.setText("0");
        q28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q28.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SnacksPanel.add(q28);
        q28.setBounds(70, 469, 167, 40);

        q29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q29.setText("0");
        q29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q29.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SnacksPanel.add(q29);
        q29.setBounds(307, 469, 167, 40);

        q30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q30.setText("0");
        q30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q30.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SnacksPanel.add(q30);
        q30.setBounds(544, 469, 167, 40);

        sn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Snack/5.jpg"))); // NOI18N
        sn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sn5ActionPerformed(evt);
            }
        });
        SnacksPanel.add(sn5);
        sn5.setBounds(307, 291, 167, 166);

        sn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Snack/2.jpg"))); // NOI18N
        sn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sn2ActionPerformed(evt);
            }
        });
        SnacksPanel.add(sn2);
        sn2.setBounds(307, 20, 167, 166);

        jLayeredPane1.add(SnacksPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 529));

        JuicePanel.setBackground(new java.awt.Color(249, 245, 227));
        JuicePanel.setLayout(null);

        j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Juice/3.jpg"))); // NOI18N
        j3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3ActionPerformed(evt);
            }
        });
        JuicePanel.add(j3);
        j3.setBounds(544, 20, 167, 166);

        j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Juice/1.jpg"))); // NOI18N
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });
        JuicePanel.add(j1);
        j1.setBounds(70, 20, 167, 166);

        j6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Juice/6.jpg"))); // NOI18N
        j6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6ActionPerformed(evt);
            }
        });
        JuicePanel.add(j6);
        j6.setBounds(540, 290, 167, 166);

        j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Juice/4.jpg"))); // NOI18N
        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });
        JuicePanel.add(j4);
        j4.setBounds(70, 291, 167, 166);

        q31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q31.setText("0");
        q31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q31.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JuicePanel.add(q31);
        q31.setBounds(70, 192, 167, 40);

        q32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q32.setText("0");
        q32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q32.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JuicePanel.add(q32);
        q32.setBounds(307, 192, 167, 40);

        q33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q33.setText("0");
        q33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q33.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JuicePanel.add(q33);
        q33.setBounds(544, 192, 167, 40);

        q34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q34.setText("0");
        q34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q34.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JuicePanel.add(q34);
        q34.setBounds(70, 469, 167, 40);

        q35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q35.setText("0");
        q35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q35.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JuicePanel.add(q35);
        q35.setBounds(307, 469, 167, 40);

        q36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q36.setText("0");
        q36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        q36.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JuicePanel.add(q36);
        q36.setBounds(544, 469, 167, 40);

        j5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Juice/5.jpg"))); // NOI18N
        j5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5ActionPerformed(evt);
            }
        });
        JuicePanel.add(j5);
        j5.setBounds(307, 291, 167, 166);

        j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PIC/Juice/2.jpg"))); // NOI18N
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });
        JuicePanel.add(j2);
        j2.setBounds(307, 20, 167, 166);

        jLayeredPane1.add(JuicePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 529));

        jTable1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(114, 89, 55));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ITEMS", "QTY", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        time.setBackground(new java.awt.Color(204, 255, 255));
        time.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        totalL.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        totalL.setForeground(new java.awt.Color(114, 90, 55));
        totalL.setText("TOTAL :");

        cashL.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        cashL.setForeground(new java.awt.Color(114, 93, 55));
        cashL.setText("CASH :");

        total.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        total.setForeground(new java.awt.Color(114, 93, 55));
        total.setText("00");

        bal.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        bal.setForeground(new java.awt.Color(114, 93, 55));
        bal.setText("00");

        balance.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        balance.setForeground(new java.awt.Color(114, 93, 55));
        balance.setText("BALANCE :");

        cash.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        cash.setForeground(new java.awt.Color(114, 93, 55));

        delete.setBackground(new java.awt.Color(224, 36, 26));
        delete.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        date.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        payBT.setBackground(new java.awt.Color(82, 196, 82));
        payBT.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        payBT.setForeground(new java.awt.Color(255, 255, 255));
        payBT.setText("PAY");
        payBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payBTMouseClicked(evt);
            }
        });
        payBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBTActionPerformed(evt);
            }
        });

        vat.setForeground(new java.awt.Color(114, 93, 55));

        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(time, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(totalL, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cashL, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(total, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(bal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(balance, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cash, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(delete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(date, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(payBT, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(vat, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalL)
                            .addComponent(balance)
                            .addComponent(cashL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cash, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(bal, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vat, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payBT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalL, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cash, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cashL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payBT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(WhiskeyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(CocktailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(MocktailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(BeerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(JuiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SnackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BeerBtn, CocktailBtn, JuiceBtn, MocktailBtn, SnackBtn, WhiskeyBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(WhiskeyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MocktailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BeerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CocktailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JuiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SnackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane2)
                            .addComponent(jLayeredPane1))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wk3ActionPerformed
        int i = Integer.valueOf(q3.getText());
        ++i;
        q3.setText(String.valueOf(i));
        addtable(3, "SUNTORY HAKUSHU 18 YEARS OLD WHISKY", i, 5500.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_wk3ActionPerformed

    private void wk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wk1ActionPerformed
        int i = Integer.valueOf(q1.getText());
        ++i;
        q1.setText(String.valueOf(i));
        addtable(1, "JOHNNIE WALKER BLUE LABEL ICON ", i, 5950.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_wk1ActionPerformed

    private void wk6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wk6ActionPerformed
        int i = Integer.valueOf(q6.getText());
        ++i;
        q6.setText(String.valueOf(i));
        addtable(6, "BALLANTINE'S 30 YEARS", i, 6990.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_wk6ActionPerformed

    private void wk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wk4ActionPerformed
        int i = Integer.valueOf(q4.getText());
        ++i;
        q4.setText(String.valueOf(i));
        addtable(4, "GLENMORANGIE THE NECTAR D'OR", i, 3300.00 * i);
        cal.calculate(jTable1, total);    // TODO add your handling code here:
    }//GEN-LAST:event_wk4ActionPerformed

    private void WhiskeyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhiskeyBtnActionPerformed

        WhiskeyPanel.setVisible(true);
        CocktailPanel.setVisible(false);
        BeerPanel.setVisible(false);
        MocktailPanel.setVisible(false);
        SnacksPanel.setVisible(false);
        JuicePanel.setVisible(false);
    }//GEN-LAST:event_WhiskeyBtnActionPerformed

    private void CocktailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CocktailBtnActionPerformed
        CocktailPanel.setVisible(true);
        WhiskeyPanel.setVisible(false);
        BeerPanel.setVisible(false);
        MocktailPanel.setVisible(false);
        SnacksPanel.setVisible(false);
        JuicePanel.setVisible(false);
    }//GEN-LAST:event_CocktailBtnActionPerformed

    private void MocktailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MocktailBtnActionPerformed
        CocktailPanel.setVisible(false);
        WhiskeyPanel.setVisible(false);
        BeerPanel.setVisible(false);
        MocktailPanel.setVisible(true);
        SnacksPanel.setVisible(false);
        JuicePanel.setVisible(false);
    }//GEN-LAST:event_MocktailBtnActionPerformed

    private void BeerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeerBtnActionPerformed
        CocktailPanel.setVisible(false);
        WhiskeyPanel.setVisible(false);
        BeerPanel.setVisible(true);
        MocktailPanel.setVisible(false);
        SnacksPanel.setVisible(false);
        JuicePanel.setVisible(false);
    }//GEN-LAST:event_BeerBtnActionPerformed

    private void JuiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JuiceBtnActionPerformed
        CocktailPanel.setVisible(false);
        WhiskeyPanel.setVisible(false);
        BeerPanel.setVisible(false);
        MocktailPanel.setVisible(false);
        SnacksPanel.setVisible(false);
        JuicePanel.setVisible(true);
    }//GEN-LAST:event_JuiceBtnActionPerformed

    private void SnackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnackBtnActionPerformed
        CocktailPanel.setVisible(false);
        WhiskeyPanel.setVisible(false);
        BeerPanel.setVisible(false);
        MocktailPanel.setVisible(false);
        SnacksPanel.setVisible(true);
        JuicePanel.setVisible(false);    }//GEN-LAST:event_SnackBtnActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // delete some iteam
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        String r = dt.getValueAt(jTable1.getSelectedRow(), 0).toString();
        //remove product
        int rw = jTable1.getSelectedRow();
        dt.removeRow(rw);
        //remove Qty Lable
        System.out.println(r);
        switch (r) {

            case "1":
                q1.setText("0");
                break;

            case "2":
                q2.setText("0");
                break;

            case "3":
                q3.setText("0");
                break;

            case "4":
                q4.setText("0");
                break;

            case "5":
                q5.setText("0");
                break;

            case "6":
                q6.setText("0");

            case "7":
                q7.setText("0");
                break;
            case "8":
                q8.setText("0");
                break;

            case "9":
                q9.setText("0");
                break;

            case "10":
                q10.setText("0");
                break;
            case "11":
                q11.setText("0");
                break;
            case "12":
                q12.setText("0");
                break;
            case "13":
                q13.setText("0");
                break;
            case "14":
                q14.setText("0");
                break;
            case "15":
                q15.setText("0");
                break;
            case "16":
                q16.setText("0");
                break;
            case "17":
                q17.setText("0");
                break;
            case "18":
                q18.setText("0");
                break;
            case "19":
                q19.setText("0");
                break;
            case "20":
                q20.setText("0");
                break;

            case "21":
                q21.setText("0");
                break;
            case "22":
                q22.setText("0");
                break;
            case "23":
                q23.setText("0");
                break;
            case "24":
                q24.setText("0");
                break;
            case "25":
                q25.setText("0");
                break;
            case "26":
                q26.setText("0");
                break;
            case "27":
                q27.setText("0");
                break;
            case "28":
                q28.setText("0");
                break;
            case "29":
                q29.setText("0");
                break;
            case "30":
                q30.setText("0");
                break;
            case "31":
                q31.setText("0");
                break;
            case "32":
                q32.setText("0");
                break;
            case "33":
                q33.setText("0");
                break;
            case "34":
                q34.setText("0");
                break;
            case "35":
                q35.setText("0");
                break;
            case "36":
                q36.setText("0");
                break;

            default:
                System.out.println("over");
        }

        cal.calculate(jTable1, total); // after iteam delete calculate total
    }//GEN-LAST:event_deleteActionPerformed

    private void wk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wk2ActionPerformed
        int i = Integer.valueOf(q2.getText());
        ++i;
        q2.setText(String.valueOf(i));
        addtable(2, "GLEN GRANT SINGLE MALT WHISKY 10 YEAR OLD", i, 3199.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_wk2ActionPerformed

    private void ct3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct3ActionPerformed
        int i = Integer.valueOf(q9.getText());
        ++i;
        q9.setText(String.valueOf(i));
        addtable(9, "SINGAPORE SLING", i, 440.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_ct3ActionPerformed

    private void ct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct1ActionPerformed
        int i = Integer.valueOf(q7.getText());
        ++i;
        q7.setText(String.valueOf(i));
        addtable(7, "BLUE MARGARITA", i, 360.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_ct1ActionPerformed

    private void ct6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct6ActionPerformed
        int i = Integer.valueOf(q12.getText());
        ++i;
        q12.setText(String.valueOf(i));
        addtable(12, "DRY MARTINI", i, 470.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_ct6ActionPerformed

    private void ct4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct4ActionPerformed
        int i = Integer.valueOf(q10.getText());
        ++i;
        q10.setText(String.valueOf(i));
        addtable(10, "ESPRESSO MARTINI", i, 430.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_ct4ActionPerformed

    private void ct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct2ActionPerformed
        int i = Integer.valueOf(q8.getText());
        ++i;
        q8.setText(String.valueOf(i));
        addtable(8, "MOJITO ", i, 480.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_ct2ActionPerformed

    private void mk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mk3ActionPerformed
        int i = Integer.valueOf(q15.getText());
        ++i;
        q15.setText(String.valueOf(i));
        addtable(15, "Arnold Palmer", i, 80.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_mk3ActionPerformed

    private void mk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mk1ActionPerformed
        int i = Integer.valueOf(q13.getText());
        ++i;
        q13.setText(String.valueOf(i));
        addtable(13, "Mint Lemonade ", i, 80.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_mk1ActionPerformed

    private void mk6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mk6ActionPerformed
        int i = Integer.valueOf(q18.getText());
        ++i;
        q18.setText(String.valueOf(i));
        addtable(18, "Mulled Wine", i, 120.00 * i);
        cal.calculate(jTable1, total);

    }//GEN-LAST:event_mk6ActionPerformed

    private void mk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mk4ActionPerformed
        int i = Integer.valueOf(q16.getText());
        ++i;
        q16.setText(String.valueOf(i));
        addtable(16, "Grapefruit Rosemary", i, 100.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_mk4ActionPerformed

    private void mk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mk2ActionPerformed
        int i = Integer.valueOf(q14.getText());
        ++i;
        q14.setText(String.valueOf(i));
        addtable(14, "Blue Lagoon", i, 80.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_mk2ActionPerformed

    private void wk19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wk19ActionPerformed
        int i = Integer.valueOf(q21.getText());
        ++i;
        q21.setText(String.valueOf(i));
        addtable(21, "DAMM A.K. DAMM", i, 200.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_wk19ActionPerformed

    private void wk20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wk20ActionPerformed
        int i = Integer.valueOf(q19.getText());
        ++i;
        q19.setText(String.valueOf(i));
        addtable(19, "ERDINGER WEISSBIER", i, 180.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_wk20ActionPerformed

    private void wk21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wk21ActionPerformed
        int i = Integer.valueOf(q24.getText());
        ++i;
        q24.setText(String.valueOf(i));
        addtable(24, "TRIPORTEUR HEAVEN", i, 200.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_wk21ActionPerformed

    private void wk22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wk22ActionPerformed
        int i = Integer.valueOf(q22.getText());
        ++i;
        q22.setText(String.valueOf(i));
        addtable(22, "PAULANER HEFE WEISSBIER ALCOHOLFREI", i, 160.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_wk22ActionPerformed

    private void wk24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wk24ActionPerformed
        int i = Integer.valueOf(q20.getText());
        ++i;
        q20.setText(String.valueOf(i));
        addtable(20, "PERONI NASTRO AZZURRO", i, 120.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_wk24ActionPerformed

    private void sn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sn3ActionPerformed
        int i = Integer.valueOf(q27.getText());
        ++i;
        q27.setText(String.valueOf(i));
        addtable(27, "Lay’s Truffle27g", i, 57.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_sn3ActionPerformed

    private void sn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sn1ActionPerformed
        int i = Integer.valueOf(q25.getText());
        ++i;
        q25.setText(String.valueOf(i));
        addtable(25, "Lay’s Miangkum Crispy 13g", i, 55.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_sn1ActionPerformed

    private void sn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sn6ActionPerformed
        int i = Integer.valueOf(q30.getText());
        ++i;
        q30.setText(String.valueOf(i));
        addtable(30, "Lay’s Sour Cream 105g", i, 88.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_sn6ActionPerformed

    private void sn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sn4ActionPerformed
        int i = Integer.valueOf(q28.getText());
        ++i;
        q28.setText(String.valueOf(i));
        addtable(28, "Lay’s Rock Smoky 27g", i, 57.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_sn4ActionPerformed

    private void sn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sn2ActionPerformed
        int i = Integer.valueOf(q26.getText());
        ++i;
        q26.setText(String.valueOf(i));
        addtable(26, "Lay’s Classic 13g", i, 55.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_sn2ActionPerformed

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3ActionPerformed
        int i = Integer.valueOf(q33.getText());
        ++i;
        q33.setText(String.valueOf(i));
        addtable(33, "apple juice", i, 120.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_j3ActionPerformed

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
        int i = Integer.valueOf(q31.getText());
        ++i;
        q31.setText(String.valueOf(i));
        addtable(31, "orange juice", i, 120.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_j1ActionPerformed

    private void j6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6ActionPerformed
        int i = Integer.valueOf(q36.getText());
        ++i;
        q36.setText(String.valueOf(i));
        addtable(36, "vegetable juice", i, 120.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_j6ActionPerformed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
        int i = Integer.valueOf(q34.getText());
        ++i;
        q34.setText(String.valueOf(i));
        addtable(34, "pineapple juice", i, 120.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_j4ActionPerformed

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed
        int i = Integer.valueOf(q32.getText());
        ++i;
        q32.setText(String.valueOf(i));
        addtable(32, "grape juice", i, 120.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_j2ActionPerformed

    private void wk5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wk5ActionPerformed
        int i = Integer.valueOf(q5.getText());
        ++i;
        q5.setText(String.valueOf(i));
        addtable(5, "GLENMORANGIE THE LASANTA (SHERRY WOOD)-12 YEARS", i, 2819.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_wk5ActionPerformed

    private void ct5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct5ActionPerformed
        int i = Integer.valueOf(q11.getText());
        ++i;
        q11.setText(String.valueOf(i));
        addtable(11, "OLD FASHIONED", i, 480.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_ct5ActionPerformed

    private void wk23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wk23ActionPerformed
        int i = Integer.valueOf(q23.getText());
        ++i;
        q23.setText(String.valueOf(i));
        addtable(23, "WATERLOO TRIPLE", i, 180.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_wk23ActionPerformed

    private void sn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sn5ActionPerformed
        int i = Integer.valueOf(q29.getText());
        ++i;
        q29.setText(String.valueOf(i));
        addtable(29, "Lay’s Shrimp Tom Yum 105g", i, 88.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_sn5ActionPerformed

    private void j5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5ActionPerformed
        int i = Integer.valueOf(q35.getText());
        ++i;
        q35.setText(String.valueOf(i));
        addtable(35, "strawberry juice", i, 120.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_j5ActionPerformed

    private void mk5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mk5ActionPerformed
        int i = Integer.valueOf(q17.getText());
        ++i;
        q17.setText(String.valueOf(i));
        addtable(17, "Strawberry Mojito", i, 100.00 * i);
        cal.calculate(jTable1, total);
    }//GEN-LAST:event_mk5ActionPerformed

    private void payBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBTActionPerformed

        double paid = Double.valueOf(cash.getText());
        double balance = paid - cal.tot ;                
        DecimalFormat df = new DecimalFormat("00.00") ;   
        bal.setText(String.valueOf(df.format(balance)));
        
        
    }//GEN-LAST:event_payBTActionPerformed

    private void payBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payBTMouseClicked
        Table bill = new Table();
        bill.setTitle("Bill");
        bill.setVisible(true);
        bill.itemsbill(jTable1, cash, date, time);
    }//GEN-LAST:event_payBTMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Gui guiFrame = new Gui();
        guiFrame.setVisible(true);
        guiFrame.pack();
        guiFrame.setLocationRelativeTo(null); //open on center
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BeerBtn;
    private javax.swing.JPanel BeerPanel;
    private javax.swing.JButton CocktailBtn;
    private javax.swing.JPanel CocktailPanel;
    private javax.swing.JButton JuiceBtn;
    private javax.swing.JPanel JuicePanel;
    private javax.swing.JButton MocktailBtn;
    private javax.swing.JPanel MocktailPanel;
    private javax.swing.JButton SnackBtn;
    private javax.swing.JPanel SnacksPanel;
    private javax.swing.JButton WhiskeyBtn;
    private javax.swing.JPanel WhiskeyPanel;
    private javax.swing.JLabel bal;
    private javax.swing.JLabel balance;
    private javax.swing.JTextField cash;
    private javax.swing.JLabel cashL;
    private javax.swing.JButton ct1;
    private javax.swing.JButton ct2;
    private javax.swing.JButton ct3;
    private javax.swing.JButton ct4;
    private javax.swing.JButton ct5;
    private javax.swing.JButton ct6;
    private javax.swing.JLabel date;
    private javax.swing.JButton delete;
    private javax.swing.JButton j1;
    private javax.swing.JButton j2;
    private javax.swing.JButton j3;
    private javax.swing.JButton j4;
    private javax.swing.JButton j5;
    private javax.swing.JButton j6;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton mk1;
    private javax.swing.JButton mk2;
    private javax.swing.JButton mk3;
    private javax.swing.JButton mk4;
    private javax.swing.JButton mk5;
    private javax.swing.JButton mk6;
    private javax.swing.JButton payBT;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q10;
    private javax.swing.JLabel q11;
    private javax.swing.JLabel q12;
    private javax.swing.JLabel q13;
    private javax.swing.JLabel q14;
    private javax.swing.JLabel q15;
    private javax.swing.JLabel q16;
    private javax.swing.JLabel q17;
    private javax.swing.JLabel q18;
    private javax.swing.JLabel q19;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q20;
    private javax.swing.JLabel q21;
    private javax.swing.JLabel q22;
    private javax.swing.JLabel q23;
    private javax.swing.JLabel q24;
    private javax.swing.JLabel q25;
    private javax.swing.JLabel q26;
    private javax.swing.JLabel q27;
    private javax.swing.JLabel q28;
    private javax.swing.JLabel q29;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q30;
    private javax.swing.JLabel q31;
    private javax.swing.JLabel q32;
    private javax.swing.JLabel q33;
    private javax.swing.JLabel q34;
    private javax.swing.JLabel q35;
    private javax.swing.JLabel q36;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q9;
    private javax.swing.JButton sn1;
    private javax.swing.JButton sn2;
    private javax.swing.JButton sn3;
    private javax.swing.JButton sn4;
    private javax.swing.JButton sn5;
    private javax.swing.JButton sn6;
    private javax.swing.JLabel time;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalL;
    private javax.swing.JLabel vat;
    private javax.swing.JButton wk1;
    private javax.swing.JButton wk19;
    private javax.swing.JButton wk2;
    private javax.swing.JButton wk20;
    private javax.swing.JButton wk21;
    private javax.swing.JButton wk22;
    private javax.swing.JButton wk23;
    private javax.swing.JButton wk24;
    private javax.swing.JButton wk3;
    private javax.swing.JButton wk4;
    private javax.swing.JButton wk5;
    private javax.swing.JButton wk6;
    // End of variables declaration//GEN-END:variables

    boolean isClosed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
