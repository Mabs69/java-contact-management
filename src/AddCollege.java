
import java.io.IOException;
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
public class AddCollege extends javax.swing.JFrame {

    /**
     * Creates new form AddCollege
     */
    
    public static String CurrentCourseID;
    
    
    public AddCollege() {
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
        labelLoginForm = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCollegeName = new javax.swing.JTextField();
        jTextFieldCollegeID = new javax.swing.JTextField();

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
        jPanel2.setLayout(null);

        labelLoginForm.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        labelLoginForm.setForeground(new java.awt.Color(245, 245, 245));
        labelLoginForm.setText("Add College");
        jPanel2.add(labelLoginForm);
        labelLoginForm.setBounds(180, 20, 140, 26);

        jButtonBack.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonBack.setText("BACK");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBack);
        jButtonBack.setBounds(110, 260, 100, 40);

        jButtonAdd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonAdd.setText("CREATE NEW");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAdd);
        jButtonAdd.setBounds(250, 260, 150, 40);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("College Name");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 160, 100, 18);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("College ID");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(70, 70, 80, 23);

        jTextFieldCollegeName.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldCollegeName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jTextFieldCollegeName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jTextFieldCollegeName);
        jTextFieldCollegeName.setBounds(70, 180, 350, 34);

        jTextFieldCollegeID.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldCollegeID.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jTextFieldCollegeID.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jTextFieldCollegeID);
        jTextFieldCollegeID.setBounds(70, 100, 350, 40);

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelExit)
                    .addComponent(labelMinimize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        CollegeMaster colm = new CollegeMaster();
        colm.setVisible(true);
        colm.pack();
        colm.setLocationRelativeTo(null);
        colm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        String college_id = jTextFieldCollegeID.getText().toUpperCase();
        String college_name = jTextFieldCollegeName.getText();
        
        
        
        if(        !jTextFieldCollegeID.getText().isEmpty()
                && !jTextFieldCollegeName.getText().isEmpty()) {
            
                try {
                    College col = new College(college_id, college_name);
                    CollegeQuery cq = new CollegeQuery();
                    cq.insertCollege(col);
                    
                    CollegeMaster colm = new CollegeMaster();
                    colm.setVisible(true);
                    colm.pack();
                    colm.setLocationRelativeTo(null);
                    colm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    this.dispose();

                 } 
                catch (Exception ex) {
                    Logger.getLogger(AddCollege.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        else {
             JOptionPane.showMessageDialog(null, "One or more fields are empty");
        }
        
    }//GEN-LAST:event_jButtonAddActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(AddCollege.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCollege.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCollege.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCollege.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCollege().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCollegeID;
    private javax.swing.JTextField jTextFieldCollegeName;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelLoginForm;
    private javax.swing.JLabel labelMinimize;
    // End of variables declaration//GEN-END:variables
}
