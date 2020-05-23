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
public class StudentMainMenu extends javax.swing.JFrame {

    /**
     * Creates new form TratmentCard
     */
    public StudentMainMenu() {
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

        btn_CoursesSchedule = new javax.swing.JButton();
        btn_MyProfile = new javax.swing.JButton();
        btn_Absence = new javax.swing.JButton();
        btn_ExamsSchedule = new javax.swing.JButton();
        btn_Marks = new javax.swing.JButton();
        btn_Bouns = new javax.swing.JButton();
        lbl_image = new javax.swing.JLabel();
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
        setSize(new java.awt.Dimension(1054, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_CoursesSchedule.setBackground(new java.awt.Color(21, 105, 178));
        btn_CoursesSchedule.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_CoursesSchedule.setForeground(new java.awt.Color(255, 255, 255));
        btn_CoursesSchedule.setText("Courses Schedule");
        btn_CoursesSchedule.setBorder(null);
        btn_CoursesSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CoursesScheduleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_CoursesSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 210, 140));

        btn_MyProfile.setBackground(new java.awt.Color(21, 105, 178));
        btn_MyProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_MyProfile.setForeground(new java.awt.Color(255, 255, 255));
        btn_MyProfile.setText("My Account");
        btn_MyProfile.setBorder(null);
        btn_MyProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MyProfileActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MyProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 210, 140));

        btn_Absence.setBackground(new java.awt.Color(21, 105, 178));
        btn_Absence.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Absence.setForeground(new java.awt.Color(255, 255, 255));
        btn_Absence.setText("Absence");
        btn_Absence.setBorder(null);
        btn_Absence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AbsenceActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Absence, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 200, 140));

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

        btn_Bouns.setBackground(new java.awt.Color(21, 105, 178));
        btn_Bouns.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Bouns.setForeground(new java.awt.Color(255, 255, 255));
        btn_Bouns.setText("Bonus");
        btn_Bouns.setBorder(null);
        btn_Bouns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BounsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Bouns, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 210, 140));

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

    private void btn_AbsenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AbsenceActionPerformed
        StudentSchedule schedule = new StudentSchedule();
        schedule.setVisible(true);
        schedule.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_AbsenceActionPerformed

    private void btn_CoursesScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CoursesScheduleActionPerformed
        this.setVisible(false);
        StudentSchedule schedule = new StudentSchedule();
        schedule.setVisible(true);
        schedule.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_CoursesScheduleActionPerformed

    private void btn_MyProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MyProfileActionPerformed
        MyProfileStudent profileStudent=new MyProfileStudent();
        profileStudent.setVisible(true);
        profileStudent.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_MyProfileActionPerformed

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

    private void btn_BounsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BounsActionPerformed
//        tableOfResultTest resultTest = new tableOfResultTest();
//        resultTest.setVisible(true);
//        this.setVisible(false);
//        resultTest.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_BounsActionPerformed

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
            java.util.logging.Logger.getLogger(StudentMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new StudentMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Absence;
    private javax.swing.JButton btn_Bouns;
    private javax.swing.JButton btn_CoursesSchedule;
    private javax.swing.JButton btn_ExamsSchedule;
    private javax.swing.JButton btn_Marks;
    private javax.swing.JButton btn_MyProfile;
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
    private javax.swing.JLabel lbl_image;
    // End of variables declaration//GEN-END:variables
}
