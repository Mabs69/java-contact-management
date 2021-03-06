
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EJ
 */
public class CollegeMaster extends javax.swing.JFrame {

    /**
     * Creates new form CollegeMaster
     */
    
    String value = null;
    public CollegeMaster() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        populateJtable();
        
        jTable1.setShowGrid(true);
        jTable1.setGridColor(new Color(51,51,51));
        jTable1.setSelectionBackground(new Color(0,173,181));
        
        JTableHeader th = jTable1.getTableHeader();
        th.setForeground(new Color(57,62,70));
        th.setFont(new Font("Verdana", Font.BOLD, 13));
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
        jButtonDelete = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonBackMainMenu = new javax.swing.JButton();

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
        labelLoginForm.setText("College Master List Form");
        jPanel2.add(labelLoginForm);
        labelLoginForm.setBounds(180, 20, 280, 26);

        jButtonDelete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDelete);
        jButtonDelete.setBounds(430, 350, 130, 40);

        jButtonEdit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonEdit.setText("EDIT");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonEdit);
        jButtonEdit.setBounds(250, 350, 130, 40);

        jButtonAdd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonAdd.setText("ADD");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAdd);
        jButtonAdd.setBounds(70, 350, 130, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(16, 86, 590, 240);

        jButtonBackMainMenu.setText("Back");
        jButtonBackMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackMainMenuActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBackMainMenu);
        jButtonBackMainMenu.setBounds(10, 10, 55, 28);

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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
      if(value != null) {          
            CollegeQuery cq = new CollegeQuery();
            cq.deleteCollege(value);
            refreshJtable();            
        }
        else {
            JOptionPane.showMessageDialog(null, "Highlight a college to be deleted");
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        EditCollege.CurrentCollegeID = value;
        
        if(value!=null) {
            EditCollege ec = new EditCollege();
            ec.setVisible(true);
            ec.pack();
            ec.setLocationRelativeTo(null);
            ec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        } 
        else {
            JOptionPane.showMessageDialog(null, "Highlight a college to be edited");
        }  
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        AddCollege coladd = new AddCollege();
        coladd.setVisible(true);
        coladd.pack();
        coladd.setLocationRelativeTo(null);
        coladd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.dispose();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int rowIndex = jTable1.getSelectedRow();
        value = jTable1.getValueAt(rowIndex, 0).toString();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonBackMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackMainMenuActionPerformed
        mainMenu mm = new mainMenu();
                mm.setVisible(true);
                mm.pack();
                mm.setLocationRelativeTo(null);
                mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                this.dispose();
    }//GEN-LAST:event_jButtonBackMainMenuActionPerformed

    public void populateJtable() {
        
        CollegeQuery cq = new CollegeQuery();
        ArrayList<College> colList = cq.collegeList();
        String[] colNames = {"College ID", "College Name"};
        Object[][] rows = new Object[colList.size()][2];
        
        for(int i = 0; i < colList.size(); i++) {
            rows[i][0] = colList.get(i).getCollege_id();
            rows[i][1] = colList.get(i).getCollege_name();     
        }
        
        MyModel mmd = new MyModel(rows, colNames);
        jTable1.setModel(mmd);
        jTable1.setRowHeight(50);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
    }
    
    public void refreshJtable() {
        jTable1.setModel(new DefaultTableModel());
        populateJtable();       
    }

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
            java.util.logging.Logger.getLogger(CollegeMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CollegeMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CollegeMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CollegeMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CollegeMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBackMainMenu;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelLoginForm;
    private javax.swing.JLabel labelMinimize;
    // End of variables declaration//GEN-END:variables
}
