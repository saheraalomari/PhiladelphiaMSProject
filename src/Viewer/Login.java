package Viewer;

import java.awt.Cursor;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Control.connect;
import Model.Lecturer;
import Model.Schedule;
import Model.Student;
import java.awt.event.KeyEvent;

/**
 *
 * @author alomari sahera
 */
public class Login extends javax.swing.JFrame {

    static String role = "";
    static String dataBaseName = "";
    static final String STUDENT_ROLE = "student";
    static final String ADMIN_ROLE = "admin";
    static final String LECTURER_ROLE = "lecturer";

    // to configure dataBase
    Connection con = null;
    PreparedStatement prs = null;
    ResultSet rs = null;

    public Login(String role) {
        initComponents();
        setLocationRelativeTo(null);
        con = connect.ConnectDB();
        this.role = role;

        //to verify the user's role
        switch (role) {
            case STUDENT_ROLE:
                dataBaseName = STUDENT_ROLE;
                break;
            case ADMIN_ROLE:
                dataBaseName = ADMIN_ROLE;

                break;
            case LECTURER_ROLE:
                dataBaseName = LECTURER_ROLE;

                break;
        }

        try {
            File f = new File("logo.png");
            Image img = ImageIO.read(f);
            Image newImg = img.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_AREA_AVERAGING);
            jLabel5.setIcon(new ImageIcon(newImg));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        try {
            File f = new File("back.png");
            Image img = ImageIO.read(f);
            Image newImg = img.getScaledInstance(btn_back.getWidth(), btn_back.getHeight(), Image.SCALE_AREA_AVERAGING);
            btn_back.setIcon(new ImageIcon(newImg));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        try {
            File f = new File("minus.png");
            Image img = ImageIO.read(f);
            Image newImg = img.getScaledInstance(btn_minus.getWidth(), btn_minus.getHeight(), Image.SCALE_AREA_AVERAGING);
            btn_minus.setIcon(new ImageIcon(newImg));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        try {
            File f = new File("close.png");
            Image img = ImageIO.read(f);
            Image newImg = img.getScaledInstance(btn_close.getWidth(), btn_close.getHeight(), Image.SCALE_AREA_AVERAGING);
            btn_close.setIcon(new ImageIcon(newImg));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btn_close = new javax.swing.JLabel();
        btn_minus = new javax.swing.JLabel();
        txtComment = new javax.swing.JTextField();
        box_showPass = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setText("jLabel2");
        btn_back.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_backMouseMoved(evt);
            }
        });
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 70, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("User ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 300, 40));

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 51, 102));
        lblPassword.setText("Password:");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 100, -1));

        btnLogin.setBackground(new java.awt.Color(94, 116, 237));
        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnLoginMouseMoved(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 90, 40));

        btn_close.setText("jLabel3");
        btn_close.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_closeMouseMoved(evt);
            }
        });
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 40, 40));

        btn_minus.setText("jLabel3");
        btn_minus.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_minusMouseMoved(evt);
            }
        });
        btn_minus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minusMouseClicked(evt);
            }
        });
        getContentPane().add(btn_minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 25, 30, 20));

        txtComment.setBackground(new java.awt.Color(240, 240, 240));
        txtComment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtComment.setForeground(new java.awt.Color(204, 0, 0));
        txtComment.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtComment.setDisabledTextColor(new java.awt.Color(204, 0, 0));
        txtComment.setEnabled(false);
        txtComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommentActionPerformed(evt);
            }
        });
        getContentPane().add(txtComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 350, 30));

        box_showPass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        box_showPass.setForeground(new java.awt.Color(0, 51, 102));
        box_showPass.setText("Show Password");
        box_showPass.setOpaque(false);
        box_showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_showPassActionPerformed(evt);
            }
        });
        getContentPane().add(box_showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo.png"))); // NOI18N
        jLabel5.setText("jLabel2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 58, 120, 90));

        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 300, 40));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bg0.png"))); // NOI18N
        lblBackground.setText("jLabel1");
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed

    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

    private void btn_closeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseMoved
        btn_close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_btn_closeMouseMoved

    private void btn_minusMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minusMouseMoved
        btn_minus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_minusMouseMoved

    private void btn_minusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minusMouseClicked

        this.setState(WIDTH);
    }//GEN-LAST:event_btn_minusMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (!(txtId.getText().equalsIgnoreCase("") || txtPassword.getText().equals(""))) {

            try {
                switch (role) {
                    case STUDENT_ROLE:
                        String studentSql = "select * from student where id = ? and password = ?";
                        prs = con.prepareStatement(studentSql);
                        prs.setString(1, txtId.getText());
                        prs.setString(2, txtPassword.getText());

                        rs = prs.executeQuery();

                        if (rs.next()) {
                            Student.std_email = rs.getString("email");
                            Student.std_password = rs.getString("password");
                            Student.std_name = rs.getString("name");
                            Student.std_phone = rs.getString("phone");
                            Student.std_id = String.valueOf(rs.getInt("id"));
                            Student.std_address = rs.getString("address");
                            Student.std_specialization = rs.getString("specialization");

                            this.setVisible(false);
                            new StudentMainMenu().setVisible(true);
                        } else {
                            txtComment.setVisible(true);
                            txtComment.setText("Your ID or password is not correct");
                        }

                        break;
                    case ADMIN_ROLE:
                        String adminSql = "select * from admin where id = ? and password = ?";
                        prs = con.prepareStatement(adminSql);
                        prs.setString(1, txtId.getText());
                        prs.setString(2, txtPassword.getText());

                        rs = prs.executeQuery();

                        if (rs.next()) {
                            this.setVisible(false);
                            new AdminMainMenu().setVisible(true);
                        } else {
                            txtComment.setVisible(true);
                            txtComment.setText("Your ID or password is not correct");
                        }

                        break;
                    case LECTURER_ROLE:
                        String lecturerSql = "select * from lecturer where id = ? and password = ?";
                        prs = con.prepareStatement(lecturerSql);
                        prs.setString(1, txtId.getText());
                        prs.setString(2, txtPassword.getText());

                        rs = prs.executeQuery();

                        if (rs.next()) {
                            Lecturer.lec_email = rs.getString("email");
                            Lecturer.lec_password = rs.getString("password");
                            Lecturer.lec_name = rs.getString("name");
                            Lecturer.lec_phone = rs.getString("phone");
                            Lecturer.lec_id = String.valueOf(rs.getInt("id"));
                            Lecturer.lec_address = rs.getString("address");

                            String sql = "select * from schedule where lecturer_id=?";
                            prs = con.prepareStatement(sql);
                            prs.setString(1, txtId.getText());
                            rs = prs.executeQuery();
                            while (rs.next()) {
                                Schedule s = new Schedule(rs.getString("schedule_id"),
                                        rs.getString("course_code"), rs.getString("lecture_name"), rs.getString("days"),
                                        rs.getString("start_time"), rs.getString("end_time"), rs.getString("lecturer_id"),
                                        rs.getString("class_room"), rs.getString("section_number"));
                                Lecturer.lecturer_schedule.add(s);
                            }
                            this.setVisible(false);
                            new LecturerMainMenu().setVisible(true);

                        } else {
                            txtComment.setVisible(true);
                            txtComment.setText("Your ID or password is not correct");
                        }

                        break;
                }

                rs.close();
                prs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        } else {
            txtComment.setText("Please ! insert your email and password!!");
            txtComment.setVisible(true);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtComment.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void box_showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_showPassActionPerformed
        if (box_showPass.isSelected()) {
            txtPassword.setEchoChar((char) 0);
        } else {
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_box_showPassActionPerformed

    private void btnLoginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseMoved
        btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnLoginMouseMoved

    private void txtCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommentActionPerformed

    private void btn_backMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseMoved
        btn_back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_backMouseMoved

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        this.setVisible(false);
        new Splash().setVisible(true);
    }//GEN-LAST:event_btn_backMouseClicked

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped
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
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login(role).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox box_showPass;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel btn_back;
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel btn_minus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblPassword;
    public javax.swing.JTextField txtComment;
    public javax.swing.JTextField txtId;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
