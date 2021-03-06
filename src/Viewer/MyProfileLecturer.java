package Viewer;

import Control.connect;
import Model.Lecturer;
import Model.Student;
import java.awt.Cursor;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author alomari
 */
public class MyProfileLecturer extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement prs = null;
    boolean flage=false;

    public MyProfileLecturer() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("MY PROFILE");
        conn = connect.ConnectDB();
        
        try {
            File f = new File("userlogin.png");
            Image img = ImageIO.read(f);
            Image newImg = img.getScaledInstance(lbl_ProfileImage.getWidth(), lbl_ProfileImage.getHeight(), Image.SCALE_AREA_AVERAGING);
            lbl_ProfileImage.setIcon(new ImageIcon(newImg));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    //retrive user information in text feild
    private void Retrive_My_Info(){
        lbl_userName.setText(Lecturer.lec_name);
        txt_email.setText(Lecturer.lec_email);
        txt_password.setText(Lecturer.lec_password);
        txt_phone.setText(Lecturer.lec_phone);
        txt_address.setText(Lecturer.lec_address);
        lbl_Id.setText(Lecturer.lec_id);
    }
    
    public void setTextDisable(boolean flag){
        txt_email.setEnabled(flag);
        txt_address.setEnabled(flag);
        txt_phone.setEnabled(flag);
        txt_password.setEnabled(flag);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_ProfileImage = new javax.swing.JLabel();
        btn_Save = new javax.swing.JButton();
        txt_email = new javax.swing.JTextField();
        lbl_password = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        lbl_phone = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        lbl_myProfile = new javax.swing.JLabel();
        btn_Update = new javax.swing.JButton();
        txt_address = new javax.swing.JTextField();
        lbl_email = new javax.swing.JLabel();
        lbl_userName = new javax.swing.JLabel();
        lbl_Id = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_ProfileImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bbb.png"))); // NOI18N
        getContentPane().add(lbl_ProfileImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 190, 180));

        btn_Save.setBackground(new java.awt.Color(0, 51, 102));
        btn_Save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Save.setForeground(new java.awt.Color(204, 204, 204));
        btn_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconfinder_floppy_disk_save_103863 (1).png"))); // NOI18N
        btn_Save.setText("Save");
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, 120, 40));

        txt_email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_email.setForeground(new java.awt.Color(0, 51, 102));
        txt_email.setDisabledTextColor(new java.awt.Color(0, 51, 102));
        txt_email.setEnabled(false);
        txt_email.setPreferredSize(new java.awt.Dimension(250, 35));
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        txt_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_emailKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_emailKeyTyped(evt);
            }
        });
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 300, 40));

        lbl_password.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(255, 255, 255));
        lbl_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_password.setText("Password");
        lbl_password.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_password.setPreferredSize(new java.awt.Dimension(120, 35));
        getContentPane().add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 150, 40));

        txt_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_password.setForeground(new java.awt.Color(0, 51, 102));
        txt_password.setDisabledTextColor(new java.awt.Color(0, 51, 102));
        txt_password.setEnabled(false);
        txt_password.setPreferredSize(new java.awt.Dimension(250, 35));
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_passwordKeyTyped(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 300, 40));

        lbl_phone.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_phone.setForeground(new java.awt.Color(255, 255, 255));
        lbl_phone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_phone.setText("Phone");
        lbl_phone.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_phone.setPreferredSize(new java.awt.Dimension(120, 35));
        getContentPane().add(lbl_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 150, 40));

        lbl_address.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_address.setForeground(new java.awt.Color(255, 255, 255));
        lbl_address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_address.setText("Address");
        lbl_address.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_address.setPreferredSize(new java.awt.Dimension(120, 35));
        getContentPane().add(lbl_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 150, 40));

        txt_phone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_phone.setForeground(new java.awt.Color(0, 51, 102));
        txt_phone.setDisabledTextColor(new java.awt.Color(0, 51, 102));
        txt_phone.setEnabled(false);
        txt_phone.setPreferredSize(new java.awt.Dimension(250, 35));
        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });
        txt_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_phoneKeyTyped(evt);
            }
        });
        getContentPane().add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 300, 40));

        lbl_myProfile.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lbl_myProfile.setForeground(new java.awt.Color(0, 51, 102));
        lbl_myProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_myProfile.setText("My Account");
        lbl_myProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_myProfile.setPreferredSize(new java.awt.Dimension(120, 35));
        getContentPane().add(lbl_myProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 200, 40));

        btn_Update.setBackground(new java.awt.Color(0, 51, 102));
        btn_Update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Update.setForeground(new java.awt.Color(204, 204, 204));
        btn_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconfinder_Update_984748.png"))); // NOI18N
        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 120, 40));

        txt_address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_address.setForeground(new java.awt.Color(0, 51, 102));
        txt_address.setDisabledTextColor(new java.awt.Color(0, 51, 102));
        txt_address.setEnabled(false);
        txt_address.setPreferredSize(new java.awt.Dimension(250, 35));
        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });
        txt_address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_addressKeyTyped(evt);
            }
        });
        getContentPane().add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 300, 40));

        lbl_email.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(255, 255, 255));
        lbl_email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_email.setText("Email");
        lbl_email.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_email.setPreferredSize(new java.awt.Dimension(120, 35));
        getContentPane().add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 150, 40));

        lbl_userName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_userName.setForeground(new java.awt.Color(0, 51, 102));
        lbl_userName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_userName.setText("Sahera Nawwaf Al- Omari");
        lbl_userName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_userName.setPreferredSize(new java.awt.Dimension(120, 35));
        getContentPane().add(lbl_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 460, 40));

        lbl_Id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Id.setForeground(new java.awt.Color(0, 51, 102));
        lbl_Id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Id.setText("2014980009");
        lbl_Id.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_Id.setPreferredSize(new java.awt.Dimension(120, 35));
        getContentPane().add(lbl_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 260, 40));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

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

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed

        if(flage){
            int P = JOptionPane.showConfirmDialog(null, " Are you sure to update your informatioms?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (P == 0) {

            try {
                String sql = "UPDATE lecturer SET email=?,password=?,phone=?,address=? WHERE id=?";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, txt_email.getText());
                statement.setString(2, txt_password.getText());
                statement.setString(3, txt_phone.getText());
                statement.setString(4, txt_address.getText());
                statement.setString(5, lbl_Id.getText());
                statement.executeUpdate();
                JOptionPane.showMessageDialog(this, "Successfully Updated", "Update", JOptionPane.PLAIN_MESSAGE);
                statement.close();
                setTextDisable(false);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        }

    }//GEN-LAST:event_btn_SaveActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Retrive_My_Info();
    }//GEN-LAST:event_formWindowOpened

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyPressed

    }//GEN-LAST:event_txt_emailKeyPressed

    private void txt_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyTyped

    }//GEN-LAST:event_txt_emailKeyTyped

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyTyped

    }//GEN-LAST:event_txt_passwordKeyTyped

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneActionPerformed

    private void txt_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneKeyTyped

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        flage=true;
        setTextDisable(flage);     
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void txt_addressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_addressKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressKeyTyped

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
            java.util.logging.Logger.getLogger(MyProfileLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyProfileLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyProfileLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyProfileLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MyProfileLecturer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Save;
    private javax.swing.JButton btn_Update;
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
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lbl_Id;
    private javax.swing.JLabel lbl_ProfileImage;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_myProfile;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JLabel lbl_userName;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables

}
