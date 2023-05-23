
package Main;

import Class.Gui;
import Class.Table;

class Main extends javax.swing.JFrame {
    
    Login frmLogin;
    Gui frmGui;
    Table frmTable;
    public Main() {
        initComponents();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mLogin = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mExit = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mProduct = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mbill = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(250, 246, 227));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(117, 95, 56));
        jLabel1.setText("POS BAR");

        jLabel2.setForeground(new java.awt.Color(114, 92, 55));
        jLabel2.setText("🥂");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(193, 193, 193))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(108, 108, 108))
        );

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(169, 148, 101));

        jMenu1.setForeground(new java.awt.Color(68, 55, 32));
        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mLogin.setBackground(new java.awt.Color(168, 146, 100));
        mLogin.setText("Login");
        mLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLoginActionPerformed(evt);
            }
        });
        jMenu1.add(mLogin);
        jMenu1.add(jSeparator1);

        mExit.setBackground(new java.awt.Color(168, 146, 100));
        mExit.setText("Exit");
        mExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mExitActionPerformed(evt);
            }
        });
        jMenu1.add(mExit);

        jMenuBar1.add(jMenu1);

        jMenu3.setBackground(new java.awt.Color(117, 95, 56));
        jMenu3.setForeground(new java.awt.Color(66, 53, 31));
        jMenu3.setText("Index");

        mProduct.setBackground(new java.awt.Color(168, 146, 100));
        mProduct.setText("Product");
        mProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mProductActionPerformed(evt);
            }
        });
        jMenu3.add(mProduct);
        jMenu3.add(jSeparator2);

        mbill.setBackground(new java.awt.Color(168, 146, 100));
        mbill.setText("Bill");
        mbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbillActionPerformed(evt);
            }
        });
        jMenu3.add(mbill);

        jMenuBar1.add(jMenu3);

        jMenu2.setForeground(new java.awt.Color(66, 53, 31));
        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mExitActionPerformed
        System.exit(1);
    }//GEN-LAST:event_mExitActionPerformed

    private void mLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLoginActionPerformed
        if (frmLogin == null || frmLogin.isClosed()) {
            frmLogin = new Login();
            jDesktopPane1.add(frmLogin);
            frmLogin.setVisible(true);
        }
        else{
            frmLogin.setLocation(this.getWidth()/2 - frmLogin.getWidth()/2, this.getHeight()/2 - frmLogin.getHeight()/2);
            frmLogin.setVisible(true);
            
        }

    }//GEN-LAST:event_mLoginActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void mProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mProductActionPerformed
        frmGui = new Gui();
        frmGui.setVisible(true);
    }//GEN-LAST:event_mProductActionPerformed

    private void mbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbillActionPerformed
        frmTable = new Table();
        frmTable.setVisible(true);
    }//GEN-LAST:event_mbillActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Main mainFrame = new Main();
        mainFrame.setVisible(true);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null); //open on center      
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem mExit;
    private javax.swing.JMenuItem mLogin;
    private javax.swing.JMenuItem mProduct;
    private javax.swing.JMenuItem mbill;
    // End of variables declaration//GEN-END:variables
}
