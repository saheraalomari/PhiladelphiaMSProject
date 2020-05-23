package Viewer;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Sahera Al Omri
 */
public class LecturerMainMenu extends javax.swing.JFrame {

    /**
     * Creates new form TratmentCard
     */
    public LecturerMainMenu() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Main Menu");

        try {
            File f = new File("login2.jpg");
            Image img = ImageIO.read(f);
            Image newImg = img.getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_AREA_AVERAGING);
            lbl_image.setIcon(new ImageIcon(newImg));
        } catch (IOException ex) {

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPationtRole = new javax.swing.JButton();
        btn_TratmentCard = new javax.swing.JButton();
        btn_Attendence = new javax.swing.JButton();
        btn_ExamsSchedule = new javax.swing.JButton();
        btn_Marks = new javax.swing.JButton();
        btn_Bonus = new javax.swing.JButton();
        lbl_image = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_MyProfile = new javax.swing.JMenuItem();
        jMenuItem_Exit = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu_MainMenu = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu_CoursesSchedule = new javax.swing.JMenuItem();
        jMenuItem_Attendance = new javax.swing.JMenuItem();
        jMenuItem_Marks = new javax.swing.JMenuItem();
        jMenuItem_Bouns = new javax.swing.JMenuItem();
        jMenuItem_ExamsSchedule = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_AboutUs = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1054, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPationtRole.setBackground(new java.awt.Color(21, 105, 178));
        btnPationtRole.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPationtRole.setForeground(new java.awt.Color(255, 255, 255));
        btnPationtRole.setText("Courses Schedule");
        btnPationtRole.setBorder(null);
        btnPationtRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPationtRoleActionPerformed(evt);
            }
        });
        getContentPane().add(btnPationtRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 210, 140));

        btn_TratmentCard.setBackground(new java.awt.Color(21, 105, 178));
        btn_TratmentCard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_TratmentCard.setForeground(new java.awt.Color(255, 255, 255));
        btn_TratmentCard.setText("My Profile");
        btn_TratmentCard.setBorder(null);
        btn_TratmentCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TratmentCardActionPerformed(evt);
            }
        });
        getContentPane().add(btn_TratmentCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 210, 140));

        btn_Attendence.setBackground(new java.awt.Color(21, 105, 178));
        btn_Attendence.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Attendence.setForeground(new java.awt.Color(255, 255, 255));
        btn_Attendence.setText("Attendence");
        btn_Attendence.setBorder(null);
        btn_Attendence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AttendenceActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Attendence, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 200, 140));

        btn_ExamsSchedule.setBackground(new java.awt.Color(21, 105, 178));
        btn_ExamsSchedule.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_ExamsSchedule.setForeground(new java.awt.Color(255, 255, 255));
        btn_ExamsSchedule.setText("Exams Schedule");
        btn_ExamsSchedule.setBorder(null);
        btn_ExamsSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExamsScheduleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ExamsSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 200, 140));

        btn_Marks.setBackground(new java.awt.Color(21, 105, 178));
        btn_Marks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Marks.setForeground(new java.awt.Color(255, 255, 255));
        btn_Marks.setText("Marks");
        btn_Marks.setBorder(null);
        btn_Marks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MarksActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Marks, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 210, 140));

        btn_Bonus.setBackground(new java.awt.Color(21, 105, 178));
        btn_Bonus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Bonus.setForeground(new java.awt.Color(255, 255, 255));
        btn_Bonus.setText("Bonus");
        btn_Bonus.setBorder(null);
        btn_Bonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BonusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Bonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 210, 140));

        lbl_image.setPreferredSize(new java.awt.Dimension(1054, 650));
        getContentPane().add(lbl_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 690));

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

        jMenuItem_Attendance.setText("Attendance");
        jMenuItem_Attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AttendanceActionPerformed(evt);
            }
        });
        jMenu_MainMenu.add(jMenuItem_Attendance);

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

    private void btn_AttendenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AttendenceActionPerformed
        this.setVisible(false);
        AddNewExamToSchedule schedule = new AddNewExamToSchedule();
        schedule.setVisible(true);
        schedule.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_AttendenceActionPerformed

    private void btnPationtRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPationtRoleActionPerformed

        this.setVisible(false);
        LecturerSchedule schedule = new LecturerSchedule();
        schedule.setVisible(true);
        schedule.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnPationtRoleActionPerformed

    private void btn_TratmentCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TratmentCardActionPerformed
        this.setVisible(false);
        MyProfileLecturer lecturerRegisteration = new MyProfileLecturer();
        lecturerRegisteration.setVisible(true);
        lecturerRegisteration.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_TratmentCardActionPerformed

    private void btn_ExamsScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExamsScheduleActionPerformed

//        Role_of_Test role_of_Test =new Role_of_Test();
//        role_of_Test.setVisible(true);
//        role_of_Test.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_ExamsScheduleActionPerformed

    private void btn_MarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MarksActionPerformed
//        userRegistration registration = new userRegistration();
//        registration.setVisible(true);
//        registration.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_MarksActionPerformed

    private void btn_BonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BonusActionPerformed
//        tableOfResultTest resultTest = new tableOfResultTest();
//        resultTest.setVisible(true);
//        this.setVisible(false);
//        resultTest.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_BonusActionPerformed

    private void jMenuItem_MyProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_MyProfileActionPerformed
        MyProfileLecturer profile=new MyProfileLecturer();
        profile.setVisible(true);
        this.setVisible(false);
        profile.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        LecturerMainMenu mainMenu= new LecturerMainMenu();
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

    private void jMenuItem_AttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AttendanceActionPerformed
        //        Search search=new Search();
        //        search.setVisible(true);
        //        this.setVisible(false);
        //        search.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem_AttendanceActionPerformed

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
            java.util.logging.Logger.getLogger(LecturerMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new LecturerMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPationtRole;
    private javax.swing.JButton btn_Attendence;
    private javax.swing.JButton btn_Bonus;
    private javax.swing.JButton btn_ExamsSchedule;
    private javax.swing.JButton btn_Marks;
    private javax.swing.JButton btn_TratmentCard;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem_AboutUs;
    private javax.swing.JMenuItem jMenuItem_Attendance;
    private javax.swing.JMenuItem jMenuItem_Bouns;
    private javax.swing.JMenuItem jMenuItem_ExamsSchedule;
    private javax.swing.JMenuItem jMenuItem_Exit;
    private javax.swing.JMenuItem jMenuItem_Marks;
    private javax.swing.JMenuItem jMenuItem_MyProfile;
    private javax.swing.JMenuItem jMenu_CoursesSchedule;
    private javax.swing.JMenu jMenu_MainMenu;
    private javax.swing.JLabel lbl_image;
    // End of variables declaration//GEN-END:variables
}
