package Viewer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Control.*;
import Model.Student;

public class StudentSchedule extends javax.swing.JFrame {

    //Hello
    Connection con = null;
    ResultSet rs = null;
    ResultSet rs1 = null;

    PreparedStatement pst = null;
    PreparedStatement pst1 = null;

    public StudentSchedule() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(MyColor.GRAY_Login);
        DefaultTableModel modele = (DefaultTableModel) jTable1.getModel();

        try {
            con = connect.ConnectDB();
            String sql = "select * from registered_material where student_id=?";
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, Student.std_id);
                rs = pst.executeQuery();
                while (rs.next()) {
                    String schedule_id=String.valueOf(rs.getInt("schedule_id"));
                    System.out.println(schedule_id+"   "+Student.std_id);
                    String sql_getMatiralDetails = "select * from schedule where schedule_id=?";
                    pst1 = con.prepareStatement(sql_getMatiralDetails);
                    pst1.setString(1, schedule_id);
                    rs1 = pst1.executeQuery();
                    
                    while (rs1.next()) {
                    modele.addRow(new Object[]{rs1.getString("course_code"),rs1.getString("lecture_name"),rs.getString("section_number"),rs1.getString("days"),rs1.getString("start_time"),rs1.getString("end_time"),rs1.getString("class_room")});
                    }
                }

                rs.close();
                pst.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblBackground1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_MyProfile = new javax.swing.JMenuItem();
        jMenuItem_Exit = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu_MainMenu = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu_CoursesSchedule = new javax.swing.JMenuItem();
        jMenuItem_Absence = new javax.swing.JMenuItem();
        jMenuItem_Marks = new javax.swing.JMenuItem();
        jMenuItem_Bouns = new javax.swing.JMenuItem();
        jMenuItem_ExamsSchedule = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_AboutUs = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1054, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeader.setBackground(new java.awt.Color(93, 116, 237));
        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(240, 238, 238));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Courses Schedule");
        lblHeader.setOpaque(true);
        getContentPane().add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 87));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 108));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lecture Code", "Lecture Name", "Section Number", "Days", "Start Time", "end Time", "Class Room"
            }
        ));
        jTable1.setEnabled(false);
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setRowHeight(30);
        jTable1.setRowMargin(5);
        jTable1.setSelectionForeground(new java.awt.Color(0, 120, 215));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 900, 420));

        lblBackground1.setBackground(new java.awt.Color(240, 238, 238));
        lblBackground1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBackground1.setOpaque(true);
        getContentPane().add(lblBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1020, 540));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(105, 30));

        jMenu1.setText("File");

        jMenuItem_MyProfile.setText("My Account");
        jMenuItem_MyProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_MyProfileActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_MyProfile);

        jMenuItem_Exit.setText("Exit");
        jMenuItem_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Exit);

        jMenuItem3.setText("Logout");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu_MainMenu.setText("Home");

        jMenuItem13.setText("Main Menu");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu_MainMenu.add(jMenuItem13);

        jMenu_CoursesSchedule.setText("Courses Schedule");
        jMenu_CoursesSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_CoursesScheduleActionPerformed(evt);
            }
        });
        jMenu_MainMenu.add(jMenu_CoursesSchedule);

        jMenuItem_Absence.setText("Absence");
        jMenuItem_Absence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AbsenceActionPerformed(evt);
            }
        });
        jMenu_MainMenu.add(jMenuItem_Absence);

        jMenuItem_Marks.setText("Marks");
        jMenu_MainMenu.add(jMenuItem_Marks);

        jMenuItem_Bouns.setText("Bonus");
        jMenu_MainMenu.add(jMenuItem_Bouns);

        jMenuItem_ExamsSchedule.setText("Exams Schedule");
        jMenu_MainMenu.add(jMenuItem_ExamsSchedule);

        jMenuBar1.add(jMenu_MainMenu);

        jMenu5.setText("About");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem_AboutUs.setText("About Us");
        jMenuItem_AboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AboutUsActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_AboutUs);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuItem_MyProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_MyProfileActionPerformed
        MyProfileStudent profileStudent=new MyProfileStudent();
        profileStudent.setVisible(true);
        this.setVisible(false);
        profileStudent.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem_MyProfileActionPerformed

    private void jMenuItem_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_ExitActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.setVisible(false);
        Splash splash=new Splash();
        splash.setVisible(true);
        splash.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        StudentMainMenu mainMenu= new StudentMainMenu();
        mainMenu.setVisible(true);
        this.setVisible(false);
        mainMenu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenu_CoursesScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_CoursesScheduleActionPerformed
        //        Search search=new Search();
        //        search.setVisible(true);
        //        this.setVisible(false);
        //        search.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenu_CoursesScheduleActionPerformed

    private void jMenuItem_AbsenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AbsenceActionPerformed
        //        Search search=new Search();
        //        search.setVisible(true);
        //        this.setVisible(false);
        //        search.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem_AbsenceActionPerformed

    private void jMenuItem_AboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AboutUsActionPerformed

        //        About about= new About();
        //        about.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //        about.setVisible(true);
        //        this.setVisible(true);
    }//GEN-LAST:event_jMenuItem_AboutUsActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed

    }//GEN-LAST:event_jMenu5ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentSchedule().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem_AboutUs;
    private javax.swing.JMenuItem jMenuItem_Absence;
    private javax.swing.JMenuItem jMenuItem_Bouns;
    private javax.swing.JMenuItem jMenuItem_ExamsSchedule;
    private javax.swing.JMenuItem jMenuItem_Exit;
    private javax.swing.JMenuItem jMenuItem_Marks;
    private javax.swing.JMenuItem jMenuItem_MyProfile;
    private javax.swing.JMenuItem jMenu_CoursesSchedule;
    private javax.swing.JMenu jMenu_MainMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBackground1;
    private javax.swing.JLabel lblHeader;
    // End of variables declaration//GEN-END:variables

}
