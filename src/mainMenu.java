
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EJ
 */
public class mainMenu extends javax.swing.JFrame {

    /**
     * Creates new form mainMenu
     */
    public mainMenu() {
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
        jButtonLoadingSubjects = new javax.swing.JButton();
        labelLoginForm = new javax.swing.JLabel();
        jButtonCourseMList = new javax.swing.JButton();
        jButtonCollegeMList = new javax.swing.JButton();
        jButtonInstructorMList = new javax.swing.JButton();
        jButtonLogout = new javax.swing.JButton();

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

        jButtonLoadingSubjects.setBackground(new java.awt.Color(102, 102, 102));
        jButtonLoadingSubjects.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButtonLoadingSubjects.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLoadingSubjects.setText("Loading of Subjects");
        jButtonLoadingSubjects.setToolTipText("");
        jButtonLoadingSubjects.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLoadingSubjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadingSubjectsActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonLoadingSubjects);
        jButtonLoadingSubjects.setBounds(220, 190, 160, 50);

        labelLoginForm.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        labelLoginForm.setForeground(new java.awt.Color(245, 245, 245));
        labelLoginForm.setText("University Information System");
        jPanel2.add(labelLoginForm);
        labelLoginForm.setBounds(30, 20, 350, 26);

        jButtonCourseMList.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCourseMList.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButtonCourseMList.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCourseMList.setText("Course Master List");
        jButtonCourseMList.setToolTipText("");
        jButtonCourseMList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCourseMList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCourseMListActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCourseMList);
        jButtonCourseMList.setBounds(30, 190, 160, 50);

        jButtonCollegeMList.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCollegeMList.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButtonCollegeMList.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCollegeMList.setText("College Master List");
        jButtonCollegeMList.setToolTipText("");
        jButtonCollegeMList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCollegeMList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCollegeMListActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCollegeMList);
        jButtonCollegeMList.setBounds(30, 90, 160, 50);

        jButtonInstructorMList.setBackground(new java.awt.Color(102, 102, 102));
        jButtonInstructorMList.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButtonInstructorMList.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInstructorMList.setText("Instructor Master List");
        jButtonInstructorMList.setToolTipText("");
        jButtonInstructorMList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonInstructorMList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInstructorMListActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonInstructorMList);
        jButtonInstructorMList.setBounds(220, 90, 160, 50);

        jButtonLogout.setText("Logout");
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonLogout);
        jButtonLogout.setBounds(160, 270, 73, 28);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(358, Short.MAX_VALUE)
                .addComponent(labelMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelExit)
                .addGap(18, 18, 18))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelExit)
                    .addComponent(labelMinimize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
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

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelExitMouseClicked

    private void labelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_labelMinimizeMouseClicked

    private void jButtonLoadingSubjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadingSubjectsActionPerformed
        SubjectLoading sl = new SubjectLoading();
        sl.setVisible(true);
        sl.pack();
        sl.setLocationRelativeTo(null);
        sl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.dispose();
    }//GEN-LAST:event_jButtonLoadingSubjectsActionPerformed

    private void jButtonCourseMListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCourseMListActionPerformed
        CourseMaster cm = new CourseMaster();
        cm.setVisible(true);
        cm.pack();
        cm.setLocationRelativeTo(null);
        cm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.dispose();
    }//GEN-LAST:event_jButtonCourseMListActionPerformed

    private void jButtonCollegeMListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCollegeMListActionPerformed
        CollegeMaster colm = new CollegeMaster();
        colm.setVisible(true);
        colm.pack();
        colm.setLocationRelativeTo(null);
        colm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.dispose();
    }//GEN-LAST:event_jButtonCollegeMListActionPerformed

    private void jButtonInstructorMListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInstructorMListActionPerformed
        InstructorMaster im = new InstructorMaster();
        im.setVisible(true);
        im.pack();
        im.setLocationRelativeTo(null);
        im.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.dispose();
        
    }//GEN-LAST:event_jButtonInstructorMListActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        loginForm lf = new loginForm();
        lf.setVisible(true);
        lf.pack();
        lf.setLocationRelativeTo(null);
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        this.dispose();
    }//GEN-LAST:event_jButtonLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCollegeMList;
    private javax.swing.JButton jButtonCourseMList;
    private javax.swing.JButton jButtonInstructorMList;
    private javax.swing.JButton jButtonLoadingSubjects;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelLoginForm;
    private javax.swing.JLabel labelMinimize;
    // End of variables declaration//GEN-END:variables
}
