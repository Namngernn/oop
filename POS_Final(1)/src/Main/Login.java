
package Main;
import Class.Gui;


public class Login extends javax.swing.JInternalFrame {
    Gui frmGui;
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lexit = new javax.swing.JButton();
        llogin = new javax.swing.JButton();
        PEmail = new javax.swing.JLabel();
        PPassword = new javax.swing.JLabel();
        TEmail = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(249, 245, 227));

        lexit.setBackground(new java.awt.Color(225, 21, 21));
        lexit.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lexit.setText("Exit");
        lexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lexitActionPerformed(evt);
            }
        });

        llogin.setBackground(new java.awt.Color(58, 221, 35));
        llogin.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        llogin.setText("Login");
        llogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lloginActionPerformed(evt);
            }
        });

        PEmail.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        PEmail.setForeground(new java.awt.Color(114, 92, 55));
        PEmail.setText("Username");

        PPassword.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        PPassword.setForeground(new java.awt.Color(114, 89, 55));
        PPassword.setText("Password ");

        TEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEmailActionPerformed(evt);
            }
        });

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(jPasswordField1))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lexit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(llogin)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PEmail)
                    .addComponent(TEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PPassword)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lexit)
                    .addComponent(llogin))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lexitActionPerformed
        System.exit(1);
    }//GEN-LAST:event_lexitActionPerformed

    private void lloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lloginActionPerformed
        frmGui = new Gui();
        frmGui.setVisible(true);
    }//GEN-LAST:event_lloginActionPerformed

    private void TEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEmailActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PEmail;
    private javax.swing.JLabel PPassword;
    private javax.swing.JTextField TEmail;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton lexit;
    private javax.swing.JButton llogin;
    // End of variables declaration//GEN-END:variables
}
