
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EJ
 */
public class signupForm extends javax.swing.JFrame {

    /**
     * Creates new form signupForm
     */
    public signupForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        labelMinimize = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jButtonCreate = new javax.swing.JButton();
        labelLoginForm = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabelReEnterPassword = new javax.swing.JLabel();
        jPasswordFieldReEnterPassword = new javax.swing.JPasswordField();
        jLabelSignup1 = new javax.swing.JLabel();
        jLabelSignup = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldUserName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 173, 181));

        labelExit.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelExit.setText("x");
        labelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExitMouseClicked(evt);
            }
        });

        labelMinimize.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelMinimize.setText("-");
        labelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMinimizeMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(57, 62, 70));

        jLabelFirstName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelFirstName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFirstName.setText("First Name");

        jLabelLastName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelLastName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLastName.setText("Last Name");

        jTextFieldFirstName.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldFirstName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jTextFieldFirstName.setForeground(new java.awt.Color(245, 245, 245));

        jButtonCreate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonCreate.setText("CREATE");
        jButtonCreate.setToolTipText("");
        jButtonCreate.setBorder(null);
        jButtonCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        labelLoginForm.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        labelLoginForm.setForeground(new java.awt.Color(245, 245, 245));
        labelLoginForm.setText("Create Account");

        jLabelUserName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelUserName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUserName.setText("Username");

        jLabelPassword.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Password");

        jPasswordFieldPassword.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordFieldPassword.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jPasswordFieldPassword.setForeground(new java.awt.Color(245, 245, 245));
        jPasswordFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPasswordActionPerformed(evt);
            }
        });

        jLabelReEnterPassword.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelReEnterPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReEnterPassword.setText("Re-enter Password");

        jPasswordFieldReEnterPassword.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordFieldReEnterPassword.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jPasswordFieldReEnterPassword.setForeground(new java.awt.Color(245, 245, 245));
        jPasswordFieldReEnterPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldReEnterPasswordActionPerformed(evt);
            }
        });

        jLabelSignup1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabelSignup1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSignup1.setText("LOGIN");
        jLabelSignup1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSignup1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSignup1MouseClicked(evt);
            }
        });

        jLabelSignup.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabelSignup.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSignup.setText("Already have an account?");

        jTextFieldLastName.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldLastName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jTextFieldLastName.setForeground(new java.awt.Color(245, 245, 245));

        jTextFieldUserName.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldUserName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jTextFieldUserName.setForeground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelPassword)
                                .addComponent(jLabelReEnterPassword)
                                .addComponent(jLabelUserName)
                                .addComponent(jLabelFirstName)
                                .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                .addComponent(jLabelLastName)
                                .addComponent(jPasswordFieldPassword)
                                .addComponent(jPasswordFieldReEnterPassword)
                                .addComponent(jTextFieldLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                .addComponent(jTextFieldUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabelSignup))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabelSignup1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(labelLoginForm)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelLoginForm)
                .addGap(18, 18, 18)
                .addComponent(jLabelFirstName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelReEnterPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldReEnterPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSignup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSignup1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelExit)
                .addGap(18, 18, 18))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMinimize)
                    .addComponent(labelExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelExitMouseClicked

    private void labelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_labelMinimizeMouseClicked

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        if(verifData()) {

            Connection con = myConnection.getConnection();
            PreparedStatement ps;

            try {
                ps = con.prepareStatement("INSERT INTO user (`firstname`, `lastname`, `username`, `password`) VALUES (?,?,?,?)");
                ps.setString(1, jTextFieldFirstName.getText());
                ps.setString(2, jTextFieldLastName.getText());
                ps.setString(3, jTextFieldUserName.getText());
                ps.setString(4, String.valueOf(jPasswordFieldPassword.getPassword()));

                if(isUsernameExist(jTextFieldUserName.getText())) {
                    JOptionPane.showMessageDialog(null, "Username already exists!");
                }
                else {

                    if(ps.executeUpdate() != 0) {
                        JOptionPane.showMessageDialog(null, "Account Created");
                        loginForm lf = new loginForm();
                        lf.setVisible(true);
                        lf.pack();
                        lf.setLocationRelativeTo(null);
                        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                        this.dispose();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Something Went Wrong");
                    }
                }

            } catch (Exception ex) {
                Logger.getLogger(signupForm.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jPasswordFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPasswordActionPerformed

    private void jPasswordFieldReEnterPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldReEnterPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldReEnterPasswordActionPerformed

    private void jLabelSignup1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignup1MouseClicked
        loginForm loginform = new loginForm();

        loginform.setVisible(true);
        loginform.pack();
        loginform.setLocationRelativeTo(null);
        loginform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelSignup1MouseClicked

    public boolean verifData() {
        //[Username - First Name - Last Name - Password] are empty
        if(jTextFieldFirstName.getText().equals("") && jTextFieldLastName.getText().equals("") || jTextFieldUserName.getText().equals("") || String.valueOf(jPasswordFieldPassword.getPassword()).equals("")) {
            JOptionPane.showMessageDialog(null, "One or more fields are empty");
            return false;
        }
        //if jPassword are different
        else if(!String.valueOf(jPasswordFieldPassword.getPassword()).equals(String.valueOf(jPasswordFieldReEnterPassword.getPassword()))) {
            JOptionPane.showMessageDialog(null, "Passwords are not the same");
            return false;
        }
        //Else ok
        else {
            return true;
        }
    }
    
    public boolean isUsernameExist(String un) {
        
        boolean uExist = false;
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = con.prepareStatement("SELECT * FROM `user` WHERE `username` = ?");
            ps.setString(1, jTextFieldUserName.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()) {
                uExist = true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uExist;
    
    }
    
    
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelReEnterPassword;
    private javax.swing.JLabel jLabelSignup;
    private javax.swing.JLabel jLabelSignup1;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JPasswordField jPasswordFieldReEnterPassword;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldUserName;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelLoginForm;
    private javax.swing.JLabel labelMinimize;
    // End of variables declaration//GEN-END:variables
}
