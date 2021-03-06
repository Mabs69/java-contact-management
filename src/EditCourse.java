
import java.util.ArrayList;
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
public class EditCourse extends javax.swing.JFrame {

    /**
     * Creates new form EditCourse
     */
    
    int index;
    public static String CurrentCourseID;
    
    CollegeQuery colQ = new CollegeQuery();
    ArrayList<College> colList = colQ.collegeList();
    
    public EditCourse() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        CourseQuery co = new CourseQuery();  //      PE2   
        ArrayList<Course> cList = co.courseDisplay(CurrentCourseID);
        
        this.jTextFieldCourseID.setText(cList.get(0).getCourse_id()); 
        
        this.jTextFieldCourseName.setText(cList.get(0).getCourse_name());
        
        fillCombo();
        
        int a=0;
          //        1 <    4      
        for(int i=0;i < colList.size(); i++)
        {       //                        1      COE
            System.out.println(colList.get(i).getCollege_id());
            
            //             1    COE                           COE               
            if(colList.get(i).getCollege_id().equals(cList.get(0).getCollege_id()) )
            {
                //System.out.println(i);
                a = i; // a = 1
                break;
            }
        } // end for
        a++; // a = 2
        jComboBox1.setSelectedIndex(a);
        
        
        
    }
    
    
    private void fillCombo()
    {        
        jComboBox1.addItem("Please choose...");
        //           2  <   3
        for(int i=0;i < colList.size(); i++)
        {
            //cmbCollegeName.addItem(colList.get(i).getCollegeName());
            jComboBox1.addItem(colList.get(i).getCollege_name());
        }
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
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonBack = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCourseName = new javax.swing.JTextField();
        jTextFieldCourseID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

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
        labelLoginForm.setText("Edit Course");
        jPanel2.add(labelLoginForm);
        labelLoginForm.setBounds(150, 20, 130, 26);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("College:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(80, 220, 60, 18);

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(80, 240, 280, 27);

        jButtonBack.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonBack.setText("BACK");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBack);
        jButtonBack.setBounds(80, 300, 80, 40);

        jButtonEdit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonEdit.setText("SAVE EDIT");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonEdit);
        jButtonEdit.setBounds(230, 300, 130, 40);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Course Name");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(80, 150, 100, 18);

        jTextFieldCourseName.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldCourseName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jTextFieldCourseName);
        jTextFieldCourseName.setBounds(80, 170, 280, 28);

        jTextFieldCourseID.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldCourseID.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jTextFieldCourseID);
        jTextFieldCourseID.setBounds(80, 90, 280, 28);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Course ID");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(80, 70, 80, 18);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(373, Short.MAX_VALUE)
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        index = jComboBox1.getSelectedIndex();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        CourseMaster cm = new CourseMaster();
        cm.setVisible(true);
        cm.pack();
        cm.setLocationRelativeTo(null);
        cm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        if(!jTextFieldCourseID.getText().isEmpty() && !jTextFieldCourseName.getText().isEmpty()) {

            String courseID = jTextFieldCourseID.getText().toUpperCase();
            String courseName = jTextFieldCourseName.getText();
            String collegeID = null;

            if(index==0){
                JOptionPane.showMessageDialog(null, "Please Choose a College");
            }
            else
            {
                index--;
                collegeID = colList.get(index).getCollege_id();
                System.out.println(collegeID);
                try{
                    Course c = new Course(courseID, courseName, collegeID, null);
                    CourseQuery cq = new CourseQuery();

                    cq.editCourse(c, CurrentCourseID);

                    CourseMaster cm = new CourseMaster();
                    cm.setVisible(true);
                    cm.pack();
                    cm.setLocationRelativeTo(null);
                    cm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.dispose();
                    
                }catch(Exception ex){
                    Logger.getLogger(AddCourse.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "One or more fields are empty");
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

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
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCourseID;
    private javax.swing.JTextField jTextFieldCourseName;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelLoginForm;
    private javax.swing.JLabel labelMinimize;
    // End of variables declaration//GEN-END:variables
}
