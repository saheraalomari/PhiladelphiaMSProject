package Viewer;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Control.connect;

public class StudentRegisteration extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement prs = null;
    ResultSet rs = null;

    /**
     * Creates new form
     */
    public StudentRegisteration() {
        initComponents();
        setLocationRelativeTo(null);
        con = connect.ConnectDB();

        try {
            File f = new File("bbg.png");
            Image img = ImageIO.read(f);
            Image newImg = img.getScaledInstance(lblBackground.getWidth(), lblBackground.getHeight(), Image.SCALE_AREA_AVERAGING);
            lblBackground.setIcon(new ImageIcon(newImg));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

        try {
            File f = new File("minus.png");
            Image img = ImageIO.read(f);
            Image newImg = img.getScaledInstance(lblMinus.getWidth(), lblMinus.getHeight(), Image.SCALE_AREA_AVERAGING);
            lblMinus.setIcon(new ImageIcon(newImg));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

        try {
            File f = new File("close.png");
            Image img = ImageIO.read(f);
            Image newImg = img.getScaledInstance(lblClose.getWidth(), lblClose.getHeight(), Image.SCALE_AREA_AVERAGING);
            lblClose.setIcon(new ImageIcon(newImg));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        try {
            File f = new File("userlogin.png");
            Image img = ImageIO.read(f);
            Image newImg = img.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_AREA_AVERAGING);
            jLabel2.setIcon(new ImageIcon(newImg));
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClose = new javax.swing.JLabel();
        lblMinus = new javax.swing.JLabel();
        lbl_NationalNumber = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        lbl_TreatmentCardNumber = new javax.swing.JLabel();
        txt_userName = new javax.swing.JTextField();
        lbl_fileNumber = new javax.swing.JLabel();
        lbl_birthday = new javax.swing.JLabel();
        lbl_userId = new javax.swing.JLabel();
        lbl_gender = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_fileNumber1 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbSpecialization = new javax.swing.JComboBox();
        btn_save = new javax.swing.JButton();
        txt_address = new javax.swing.JTextField();
        txt_Id = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        box_showPass = new javax.swing.JCheckBox();
        btn_back = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose.setText("jLabel3");
        lblClose.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblCloseMouseMoved(evt);
            }
        });
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        getContentPane().add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 40, 40));

        lblMinus.setText("jLabel3");
        lblMinus.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblMinusMouseMoved(evt);
            }
        });
        lblMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinusMouseClicked(evt);
            }
        });
        getContentPane().add(lblMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 30, 20));

        lbl_NationalNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_NationalNumber.setForeground(new java.awt.Color(94, 116, 237));
        lbl_NationalNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NationalNumber.setText("Email");
        lbl_NationalNumber.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_NationalNumber.setPreferredSize(new java.awt.Dimension(120, 35));
        getContentPane().add(lbl_NationalNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        txt_email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_email.setForeground(new java.awt.Color(0, 51, 102));
        txt_email.setDisabledTextColor(new java.awt.Color(0, 51, 102));
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
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 250, 35));

        lbl_TreatmentCardNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_TreatmentCardNumber.setForeground(new java.awt.Color(94, 116, 237));
        lbl_TreatmentCardNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TreatmentCardNumber.setText("User Name");
        lbl_TreatmentCardNumber.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_TreatmentCardNumber.setPreferredSize(new java.awt.Dimension(120, 35));
        getContentPane().add(lbl_TreatmentCardNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        txt_userName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_userName.setForeground(new java.awt.Color(0, 51, 102));
        txt_userName.setDisabledTextColor(new java.awt.Color(0, 51, 102));
        txt_userName.setPreferredSize(new java.awt.Dimension(250, 35));
        txt_userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userNameActionPerformed(evt);
            }
        });
        txt_userName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_userNameKeyTyped(evt);
            }
        });
        getContentPane().add(txt_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        lbl_fileNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_fileNumber.setForeground(new java.awt.Color(94, 116, 237));
        lbl_fileNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_fileNumber.setText("Password");
        lbl_fileNumber.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_fileNumber.setPreferredSize(new java.awt.Dimension(120, 35));
        getContentPane().add(lbl_fileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        lbl_birthday.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_birthday.setForeground(new java.awt.Color(94, 116, 237));
        lbl_birthday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_birthday.setText("Address");
        lbl_birthday.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_birthday.setPreferredSize(new java.awt.Dimension(120, 35));
        getContentPane().add(lbl_birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 515, -1, -1));

        lbl_userId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_userId.setForeground(new java.awt.Color(94, 116, 237));
        lbl_userId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_userId.setText("User ID");
        lbl_userId.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_userId.setPreferredSize(new java.awt.Dimension(120, 35));
        getContentPane().add(lbl_userId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        lbl_gender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_gender.setForeground(new java.awt.Color(94, 116, 237));
        lbl_gender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_gender.setText("Specialization");
        lbl_gender.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_gender.setPreferredSize(new java.awt.Dimension(120, 35));
        getContentPane().add(lbl_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 90, 90));

        lbl_fileNumber1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_fileNumber1.setForeground(new java.awt.Color(94, 116, 237));
        lbl_fileNumber1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_fileNumber1.setText("Phone");
        lbl_fileNumber1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_fileNumber1.setPreferredSize(new java.awt.Dimension(120, 35));
        getContentPane().add(lbl_fileNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        txt_phone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_phone.setForeground(new java.awt.Color(0, 51, 102));
        txt_phone.setDisabledTextColor(new java.awt.Color(0, 51, 102));
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
        getContentPane().add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 8, 136));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Add Student");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 270, 50));

        cmbSpecialization.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbSpecialization.setForeground(new java.awt.Color(0, 51, 102));
        cmbSpecialization.setMaximumRowCount(20);
        cmbSpecialization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Computer Engineer", "CS", "CIS" }));
        cmbSpecialization.setSelectedIndex(-1);
        cmbSpecialization.setPreferredSize(new java.awt.Dimension(250, 35));
        getContentPane().add(cmbSpecialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, -1, -1));

        btn_save.setBackground(new java.awt.Color(94, 116, 237));
        btn_save.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconfinder_floppy_disk_save_103863 (1).png"))); // NOI18N
        btn_save.setText("Save");
        btn_save.setBorder(null);
        btn_save.setIconTextGap(12);
        btn_save.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_saveMouseMoved(evt);
            }
        });
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, 110, 50));

        txt_address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_address.setForeground(new java.awt.Color(0, 51, 102));
        txt_address.setDisabledTextColor(new java.awt.Color(0, 51, 102));
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
        getContentPane().add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 515, -1, -1));

        txt_Id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_Id.setForeground(new java.awt.Color(0, 51, 102));
        txt_Id.setDisabledTextColor(new java.awt.Color(0, 51, 102));
        txt_Id.setPreferredSize(new java.awt.Dimension(250, 35));
        txt_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdActionPerformed(evt);
            }
        });
        txt_Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_IdKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassword.setPreferredSize(new java.awt.Dimension(250, 35));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        box_showPass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        box_showPass.setForeground(new java.awt.Color(0, 51, 102));
        box_showPass.setText("Show/Hide");
        box_showPass.setOpaque(false);
        box_showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_showPassActionPerformed(evt);
            }
        });
        getContentPane().add(box_showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, 35));

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
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 70, 70));
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseMoved
        // TODO add your handling code here:
        lblClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblCloseMouseMoved

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        this.setVisible(false);
        new AdminMainMenu().setVisible(true);  
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblMinusMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinusMouseMoved
        lblMinus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblMinusMouseMoved

    private void lblMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinusMouseClicked

        this.setState(WIDTH);
    }//GEN-LAST:event_lblMinusMouseClicked

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyPressed

    }//GEN-LAST:event_txt_emailKeyPressed

    private void txt_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyTyped

    }//GEN-LAST:event_txt_emailKeyTyped

    private void txt_userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userNameActionPerformed

    private void txt_userNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userNameKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isAlphabetic(c)) || (c == KeyEvent.VK_SPACE) )) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_userNameKeyTyped

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed

    }//GEN-LAST:event_txt_phoneActionPerformed

    private void txt_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
        if (txt_phone.getText().length() >= 10) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txt_phoneKeyTyped

    private void btn_saveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMouseMoved
        btn_save.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_saveMouseMoved

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        try {
            if (!(txt_address.getText().equals("") || txt_Id.getText().equals("")
                    || txt_email.getText().equals("") || txt_userName.getText().equals("")
                    || txtPassword.getText().equals("")
                    || txt_phone.getText().equals("") || cmbSpecialization.getSelectedIndex() == -1)) {

                Statement stmt;
                stmt = con.createStatement();
                String sql1 = "Select id from student where id= '" + txt_Id.getText() + "'";
                rs = stmt.executeQuery(sql1);
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "User ID is already exists", "Error", JOptionPane.ERROR_MESSAGE);

                } else {
                    String sql = "insert into student(id,name,phone,address,specialization,email,password)"
                            + "values('" + Integer.parseInt(txt_Id.getText()) + "','"
                            + txt_userName.getText() + "','" + txt_phone.getText() + "','"
                            + txt_address.getText() + "','"
                            + cmbSpecialization.getSelectedItem() + "','"
                            + txt_email.getText() + "','"
                            + txtPassword.getText() + "')";
                    prs = con.prepareStatement(sql);
                    prs.execute();
                    JOptionPane.showMessageDialog(this, "Successfully saved", "Added Student", JOptionPane.INFORMATION_MESSAGE);
                    rs.close();
                    prs.close();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please!! Refill all filed");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

    }//GEN-LAST:event_btn_saveActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void txt_addressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_addressKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressKeyTyped

    private void txt_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdActionPerformed

    private void txt_IdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IdKeyTyped
        char c = evt.getKeyChar();
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_IdKeyTyped

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed

    }//GEN-LAST:event_txtPasswordKeyPressed

    private void box_showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_showPassActionPerformed
        if (box_showPass.isSelected()) {
            txtPassword.setEchoChar((char) 0);
        } else {
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_box_showPassActionPerformed

    private void btn_backMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseMoved
        btn_back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_backMouseMoved

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        this.setVisible(false);
        new AdminMainMenu().setVisible(true);
    }//GEN-LAST:event_btn_backMouseClicked

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
            java.util.logging.Logger.getLogger(StudentRegisteration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegisteration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegisteration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegisteration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegisteration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox box_showPass;
    private javax.swing.JLabel btn_back;
    private javax.swing.JButton btn_save;
    public javax.swing.JComboBox cmbSpecialization;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMinus;
    private javax.swing.JLabel lbl_NationalNumber;
    private javax.swing.JLabel lbl_TreatmentCardNumber;
    private javax.swing.JLabel lbl_birthday;
    private javax.swing.JLabel lbl_fileNumber;
    private javax.swing.JLabel lbl_fileNumber1;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_userId;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_userName;
    // End of variables declaration//GEN-END:variables
}
