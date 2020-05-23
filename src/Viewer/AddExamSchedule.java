/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewer;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author sahera alomari
 */
public class AddExamSchedule extends javax.swing.JFrame {

    
    private String schedule_id= "" ;

    public AddExamSchedule() {
        initComponents();

        findUsers();
        setIcon();
        Appo_date3.setDateFormatString("dd/MM/yyyy");
        fillDoctorCompoBox();
        fillPeopleSSDCompoBox();
        //jCheckBox1.setSelected(true);
    }

    public AddExamSchedule(String schedule_id) {
        initComponents();
        this.schedule_id = schedule_id;
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        fillLectureInfo();
        fillPeopleSSDCompoBox();
        findUsers();
        setIcon();
        Appo_date3.setDateFormatString("dd/MM/yyyy");
       // jCheckBox1.setSelected(true);

    }

    public ArrayList<Appo> ListUsers() {
        ArrayList<Appo> usersList = new ArrayList<Appo>();

        Statement st;
        ResultSet rs;

        try {
            Connection con = getConnection();
            st = con.createStatement();
            String searchQuery = "SELECT * FROM RESEVED_APPOINTMENTS";
            rs = st.executeQuery(searchQuery);

            Appo appo;

            while (rs.next()) {
                appo = new Appo(
                        rs.getString("PEOPLE_SSD"),
                        rs.getString("PEOPLE_NAME"),
                        rs.getString("DOCTOR_NAME"),
                        rs.getString("APPOINTMENT_DATE"),
                        rs.getString("APPOINTMENT_TIME")
                );
                usersList.add(appo);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong, please make sure you are connected to the Internet");
        }

        return usersList;
    }

    public void findUsers() {
        ArrayList<Appo> appo = ListUsers();
        DefaultTableModel model = new DefaultTableModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
        model.setColumnIdentifiers(new Object[]{"PEOPLE SSD", "PEOPLE NAME", "DOCTOR NAME", "APPOINTMENT DATE", "APPOINTMENT TIME"});
        Object[] row = new Object[5];

        for (int i = 0; i < appo.size(); i++) {
            row[0] = appo.get(i).get_Ssd();
            row[1] = appo.get(i).get_Name();
            row[2] = appo.get(i).get_Email();
            row[3] = appo.get(i).get_Phone();
            row[4] = appo.get(i).get_Category();

            model.addRow(row);
        }
        jTable222.setModel(model);
        jTable222.setRowSorter(sorter);
    }

    public void fillDoctorCompoBox() {
        PreparedStatement st;
        ResultSet rs;

        try {
            Connection con = getConnection();
            String searchQuery = "select * from DOCTOR";
            st = con.prepareStatement(searchQuery);
            rs = st.executeQuery();

            while (rs.next()) {
                String doctorName = rs.getString("DOCTOR_NAME");
                doc_name_res.addItem(doctorName);
            }
            if (!rs.next()) {
                {
                    doc_name_res.removeAll();
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong, please make sure you are connected to the Internet");
        }

    }

    public void fillPeopleSSDCompoBox() {
        PreparedStatement st;
        ResultSet rs;

        try {
            Connection con = getConnection();
            String searchQuery = "select * from PEOPLE";
            st = con.prepareStatement(searchQuery);
            rs = st.executeQuery();

            while (rs.next()) {
                String peopleSSD = rs.getString("SSD");
                ssd_res.addItem(peopleSSD);
            }
            if (!rs.next()) {
                {
                    ssd_res.removeAll();
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong, please make sure you are connected to the Internet");
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

        jLabel6 = new javax.swing.JLabel();
        doc_name_res = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ssd_res = new javax.swing.JComboBox<String>();
        jLabel8 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        app_time = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        add_res = new javax.swing.JButton();
        Appo_date3 = new com.toedter.calendar.JDateChooser();
        jButton23 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable222 = new javax.swing.JTable();
        lbl_CancleAll = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ssd_num = new javax.swing.JTextField();
        ssd_num1 = new javax.swing.JTextField();
        ssd_num2 = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reserved Apppoinment");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Appointment Time:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        doc_name_res.setEditable(true);
        doc_name_res.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        doc_name_res.setForeground(new java.awt.Color(171, 55, 162));
        doc_name_res.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Doctor Name..." }));
        doc_name_res.setBorder(null);
        doc_name_res.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        doc_name_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doc_name_resActionPerformed(evt);
            }
        });
        getContentPane().add(doc_name_res, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 271, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("People Social Security Number:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("*");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 20, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("*");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 20, 40));

        ssd_res.setEditable(true);
        ssd_res.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ssd_res.setForeground(new java.awt.Color(171, 55, 162));
        ssd_res.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select SSN Number..." }));
        ssd_res.setBorder(null);
        ssd_res.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ssd_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssd_resActionPerformed(evt);
            }
        });
        getContentPane().add(ssd_res, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 271, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("*");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 20, 40));

        delete.setBackground(new java.awt.Color(171, 55, 162));
        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Cancel Reservation");
        delete.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                deleteMouseMoved(evt);
            }
        });
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 236, 40));

        app_time.setEditable(true);
        app_time.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        app_time.setForeground(new java.awt.Color(171, 55, 162));
        app_time.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Time...", "8:00", "8:30", "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "00:00" }));
        app_time.setBorder(null);
        app_time.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        app_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                app_timeActionPerformed(evt);
            }
        });
        getContentPane().add(app_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 271, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Doctor Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Appointment Date:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("*");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 20, 40));

        add_res.setBackground(new java.awt.Color(171, 55, 162));
        add_res.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_res.setForeground(new java.awt.Color(255, 255, 255));
        add_res.setText("Reserve Custom Appointment");
        add_res.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                add_resMouseMoved(evt);
            }
        });
        add_res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_resMouseExited(evt);
            }
        });
        add_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_resActionPerformed(evt);
            }
        });
        getContentPane().add(add_res, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 240, 40));

        Appo_date3.setForeground(new java.awt.Color(171, 55, 162));
        getContentPane().add(Appo_date3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 271, 40));
        Appo_date3.getAccessibleContext().setAccessibleParent(Appo_date3);

        jButton23.setBackground(new java.awt.Color(255, 255, 255));
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton23.setForeground(new java.awt.Color(0, 51, 153));
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/imageedit_1_9149171211.png"))); // NOI18N
        jButton23.setText("Refresh Table");
        jButton23.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton23MouseMoved(evt);
            }
        });
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton23MouseExited(evt);
            }
        });
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 570, 230, 60));

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setForeground(new java.awt.Color(0, 51, 102));
        jScrollPane2.setEnabled(false);

        jTable222.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable222.setForeground(new java.awt.Color(0, 51, 102));
        jTable222.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable222.setRowHeight(23);
        jScrollPane2.setViewportView(jTable222);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 230, 610, 300));

        lbl_CancleAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconfinder_trash_bin_1370026.png"))); // NOI18N
        lbl_CancleAll.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbl_CancleAllMouseMoved(evt);
            }
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lbl_CancleAllMouseDragged(evt);
            }
        });
        lbl_CancleAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_CancleAllMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_CancleAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 170, 50, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 260, 130));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reception/system/iconfinder_logout_close_sign_out_exit_access_3994382 (1).png"))); // NOI18N
        lblBack.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblBackMouseMoved(evt);
            }
        });
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 60, 60));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Lecture Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 140, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Lecture Code:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 140, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Section Number:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, 140, 40));

        ssd_num.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ssd_num.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ssd_num.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ssd_num.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ssd_numMouseClicked(evt);
            }
        });
        getContentPane().add(ssd_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 250, 40));

        ssd_num1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ssd_num1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ssd_num1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ssd_num1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ssd_num1MouseClicked(evt);
            }
        });
        getContentPane().add(ssd_num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 60, 120, 40));

        ssd_num2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ssd_num2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ssd_num2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ssd_num2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ssd_num2MouseClicked(evt);
            }
        });
        getContentPane().add(ssd_num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 130, 40));

        lblBackground.setBackground(new java.awt.Color(255, 255, 255));
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background.png"))); // NOI18N
        lblBackground.setOpaque(true);
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1640, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doc_name_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doc_name_resActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doc_name_resActionPerformed

    private void ssd_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssd_resActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssd_resActionPerformed

    private void app_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_app_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_app_timeActionPerformed

    private void Appo_dateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Appo_dateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Appo_dateKeyTyped

    private void add_resMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_resMouseMoved
        add_res.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add_res.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_add_resMouseMoved

    private void add_resMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_resMouseExited
        // TODO add your handling code here:
        add_res.setBackground(new Color(171,55,162));
    }//GEN-LAST:event_add_resMouseExited

    private void add_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_resActionPerformed

        if (doc_name_res.getSelectedItem().equals("Select Doctor Name...")) {
            jLabel7.setVisible(true);
        } else {
            jLabel7.setVisible(false);
        }
        if (ssd_res.getSelectedItem().equals("Select SSN Number...")) {
            jLabel8.setVisible(true);
        } else {
            jLabel8.setVisible(false);
        }
        if (((JTextField) Appo_date3.getDateEditor().getUiComponent()).getText().isEmpty()) {
            jLabel10.setVisible(true);
        } else {
            jLabel10.setVisible(false);
        }
        if (app_time.getSelectedItem().equals("Select Time...")) {
            jLabel9.setVisible(true);
        } else {
            jLabel9.setVisible(false);
        }
        Connection Appointment = null;

        try {
            Appointment = DriverManager.getConnection("jdbc:sqlserver://appointmentserver.database.windows.net:1433;databaseName=Reception", "appointment", "Aa132456789@@");

            if (!doc_name_res.getSelectedItem().equals("Select Doctor Name...") && !((JTextField) Appo_date3.getDateEditor().getUiComponent()).getText().isEmpty() && !app_time.getSelectedItem().equals("Select Time...") && !ssd_res.getSelectedItem().equals("Select SSN Number...")) {

                if (isDate() == true) {

                    PreparedStatement ps1 = Appointment.prepareStatement("select * from RESEVED_APPOINTMENTS where PEOPLE_SSD=? AND DOCTOR_NAME=? AND APPOINTMENT_DATE=? AND APPOINTMENT_TIME=?");
                    ps1.setString(1, ssd_res.getSelectedItem().toString());
                    ps1.setString(2, doc_name_res.getSelectedItem().toString());
                    ps1.setString(3, ((JTextField) Appo_date3.getDateEditor().getUiComponent()).getText().toString());
                    ps1.setString(4, app_time.getSelectedItem().toString());
                    ResultSet resultSet = ps1.executeQuery();

                    PreparedStatement ps2 = Appointment.prepareStatement("select * from RESEVED_APPOINTMENTS where PEOPLE_SSD=?");
                    ps2.setString(1, ssd_res.getSelectedItem().toString());
                    ResultSet resultSet1 = ps2.executeQuery();
                    boolean Flag = false;
                    while (resultSet1.next()) {
                        String AppoDate = resultSet1.getString("APPOINTMENT_DATE");
                        String AppoTime = resultSet1.getString("APPOINTMENT_TIME");
                        if (((JTextField) Appo_date3.getDateEditor().getUiComponent()).getText().toString().equals(AppoDate) && app_time.getSelectedItem().toString().equals(AppoTime)) {
                            Flag = true;
                        }

                    }
                    if (!Flag) {

                        PreparedStatement ps = Appointment.prepareStatement("select * from APPOINTMENTS where DOCTOR_NAME=? AND APPOINTMENT_DATE=? AND APPOINTMENT_TIME=?");
                        ps.setString(1, doc_name_res.getSelectedItem().toString());
                        ps.setString(2, ((JTextField) Appo_date3.getDateEditor().getUiComponent()).getText());
                        ps.setString(3, app_time.getSelectedItem().toString());
                        ResultSet resultSet3 = ps.executeQuery();
                        findUsers();

                        if (!resultSet3.next()) {
                            PreparedStatement preparedStatement = Appointment.prepareStatement("insert into APPOINTMENTS (DOCTOR_NAME,APPOINTMENT_DATE,APPOINTMENT_TIME,EMPLOYEE_NAME,STATUS) values (?,?,?,?,?)");
                            preparedStatement.setString(1, doc_name_res.getSelectedItem().toString());
                            preparedStatement.setString(3, app_time.getSelectedItem().toString());
                            preparedStatement.setString(2, ((JTextField) Appo_date3.getDateEditor().getUiComponent()).getText());
                            preparedStatement.setString(4, EmpName);
                            preparedStatement.setString(5, "Reserved");

                            int check = preparedStatement.executeUpdate();
                            if (check > 0) {

                                if (!resultSet.next()) {

                                    PreparedStatement ps3 = Appointment.prepareStatement("select * from PEOPLE where SSD=?");
                                    ps3.setString(1, ssd_res.getSelectedItem().toString());
                                    ResultSet resultSet2 = ps3.executeQuery();

                                    if (resultSet2.next()) {
                                        String Name = resultSet2.getString("USER_NAME");
                                        PreparedStatement preparedStatement1 = Appointment.prepareStatement("insert into RESEVED_APPOINTMENTS (PEOPLE_SSD,PEOPLE_NAME,DOCTOR_NAME,APPOINTMENT_DATE,APPOINTMENT_TIME) values (?,?,?,?,?)");
                                        preparedStatement1.setString(1, ssd_res.getSelectedItem().toString());
                                        preparedStatement1.setString(2, Name.toString());
                                        preparedStatement1.setString(3, doc_name_res.getSelectedItem().toString());
                                        preparedStatement1.setString(4, ((JTextField) Appo_date3.getDateEditor().getUiComponent()).getText());
                                        preparedStatement1.setString(5, app_time.getSelectedItem().toString());
                                        int check1 = preparedStatement1.executeUpdate();
                                        findUsers();
                                    }

                                }
                            }
                        } else {
                            String Status = resultSet3.getString("STATUS");
                            if (Status.equals("Not Reserved")) {
                                PreparedStatement preparedStatement2 = Appointment.prepareStatement("update APPOINTMENTS set STATUS=? where DOCTOR_NAME=? AND APPOINTMENT_DATE=? AND APPOINTMENT_TIME=?");
                                preparedStatement2.setString(1, "Reserved");
                                preparedStatement2.setString(2, doc_name_res.getSelectedItem().toString());
                                preparedStatement2.setString(3, ((JTextField) Appo_date3.getDateEditor().getUiComponent()).getText());
                                preparedStatement2.setString(4, app_time.getSelectedItem().toString());
                                preparedStatement2.executeUpdate();
                                PreparedStatement ps3 = Appointment.prepareStatement("select * from PEOPLE where SSD=" + ssd_res.getSelectedItem().toString());
                                ResultSet resultSet2 = ps3.executeQuery();

                                if (resultSet2.next()) {
                                    String Name = resultSet2.getString("USER_NAME");
                                    PreparedStatement preparedStatement1 = Appointment.prepareStatement("insert into RESEVED_APPOINTMENTS (PEOPLE_SSD,PEOPLE_NAME,DOCTOR_NAME,APPOINTMENT_DATE,APPOINTMENT_TIME) values (?,?,?,?,?)");
                                    preparedStatement1.setString(1, ssd_res.getSelectedItem().toString());
                                    preparedStatement1.setString(2, Name.toString());
                                    preparedStatement1.setString(3, doc_name_res.getSelectedItem().toString());
                                    preparedStatement1.setString(4, ((JTextField) Appo_date3.getDateEditor().getUiComponent()).getText());
                                    preparedStatement1.setString(5, app_time.getSelectedItem().toString());
                                    int check1 = preparedStatement1.executeUpdate();
                                    findUsers();
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "The Appointment is already exist in Appointment Table and Reserved", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "This Person Has an Appointment at same Date and Time", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "You Can't Use a Past Date ", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Please Enter a Missing Information", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            try {
                PreparedStatement preparedStatement = Appointment.prepareStatement("delete from APPOINTMENTS where DOCTOR_NAME='" + doc_name_res.getSelectedItem().toString() + "' AND APPOINTMENT_DATE='" + ((JTextField) Appo_date3.getDateEditor().getUiComponent()).getText().toString() + "' AND APPOINTMENT_TIME='" + app_time.getSelectedItem().toString() + "'");
                preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "You Can not Reserve more than one Appointment at the same Doctor!!", "Error", JOptionPane.ERROR_MESSAGE);

            } catch (SQLException ex1) {
                JOptionPane.showMessageDialog(null, "Something went wrong, please make sure you are connected to the Internet");
            }

        }
    }//GEN-LAST:event_add_resActionPerformed

    private void deleteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseMoved
        delete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        delete.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_deleteMouseMoved

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        // TODO add your handling code here:
        delete.setBackground(new Color(171,55,162));
    }//GEN-LAST:event_deleteMouseExited

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
/*
        int p = JOptionPane.showConfirmDialog(null, "Do You Really Want to Cancel?!", "Delete", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            try {
                // TODO add your handling code here:

                Connection Appointment = DriverManager.getConnection("jdbc:sqlserver://appointmentserver.database.windows.net:1433;databaseName=Reception", "appointment", "Aa132456789@@");

                if (jCheckBox1.isSelected()) {
                    if (ssd_res.getSelectedItem().equals("Select SSN Number...")) {
                        jLabel8.setVisible(true);
                    } else {
                        jLabel8.setVisible(false);
                    }
                    if (!ssd_res.getSelectedItem().equals("Select SSN Number...")) {

                        boolean Flag = false;
                        PreparedStatement preparedStatement = Appointment.prepareStatement("select * from RESEVED_APPOINTMENTS where PEOPLE_SSD='" + ssd_res.getSelectedItem().toString() + "'");
                        ResultSet resultSet = preparedStatement.executeQuery();
                        while (resultSet.next()) {
                            Flag = true;

                            String DrName = resultSet.getString("DOCTOR_NAME");
                            String Date = resultSet.getString("APPOINTMENT_DATE");
                            String Time = resultSet.getString("APPOINTMENT_TIME");

                            PreparedStatement preparedStatement1 = Appointment.prepareStatement("delete from RESEVED_APPOINTMENTS where PEOPLE_SSD=?");
                            preparedStatement1.setString(1, ssd_res.getSelectedItem().toString());
                            int check = preparedStatement1.executeUpdate();

                            PreparedStatement preparedStatement2 = Appointment.prepareStatement("update APPOINTMENTS set STATUS=? where DOCTOR_NAME=? AND APPOINTMENT_DATE=? AND APPOINTMENT_TIME=?");
                            preparedStatement2.setString(1, "Not Reserved");
                            preparedStatement2.setString(2, DrName);
                            preparedStatement2.setString(3, Date);
                            preparedStatement2.setString(4, Time);
                            preparedStatement2.executeUpdate();
                            findUsers();

                        }

                        if (!Flag) {
                            JOptionPane.showMessageDialog(null, "No Reserved Appointments for this Person", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            findUsers();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Enter a  Social Security Number", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

                if (jCheckBox2.isSelected()) {

                    if (doc_name_res.getSelectedItem().equals("Select Doctor Name...")) {
                        jLabel7.setVisible(true);
                    } else {
                        jLabel7.setVisible(false);
                    }
                    if (ssd_res.getSelectedItem().equals("Select SSN Number...")) {
                        jLabel8.setVisible(true);
                    } else {
                        jLabel8.setVisible(false);
                    }
                    if (((JTextField) Appo_date3.getDateEditor().getUiComponent()).getText().isEmpty()) {
                        jLabel10.setVisible(true);
                    } else {
                        jLabel10.setVisible(false);
                    }
                    if (app_time.getSelectedItem().equals("Select Time...")) {
                        jLabel9.setVisible(true);
                    } else {
                        jLabel9.setVisible(false);
                    }

                    if (!doc_name_res.getSelectedItem().equals("Select Doctor Name...") && !((JTextField) Appo_date3.getDateEditor().getUiComponent()).getText().isEmpty() && !app_time.getSelectedItem().equals("Select Time...") && !ssd_res.getSelectedItem().equals("Select SSN Number...")) {

                        PreparedStatement ps = Appointment.prepareStatement("select * from RESEVED_APPOINTMENTS where PEOPLE_SSD=? AND DOCTOR_NAME=? AND APPOINTMENT_DATE=? AND APPOINTMENT_TIME=?");
                        ps.setString(1, ssd_res.getSelectedItem().toString());
                        ps.setString(2, doc_name_res.getSelectedItem().toString());
                        ps.setString(3, ((JTextField) Appo_date3.getDateEditor().getUiComponent()).getText().toString());
                        ps.setString(4, app_time.getSelectedItem().toString());

                        ResultSet resultSet = ps.executeQuery();

                        if (resultSet.next()) {

                            PreparedStatement preparedStatement = Appointment.prepareStatement("delete from RESEVED_APPOINTMENTS where PEOPLE_SSD=? AND DOCTOR_NAME=? AND APPOINTMENT_DATE=? AND APPOINTMENT_TIME=?");
                            preparedStatement.setString(1, ssd_res.getSelectedItem().toString());
                            preparedStatement.setString(2, doc_name_res.getSelectedItem().toString());
                            preparedStatement.setString(3, ((JTextField) Appo_date3.getDateEditor().getUiComponent()).getText().toString());
                            preparedStatement.setString(4, app_time.getSelectedItem().toString());
                            int check = preparedStatement.executeUpdate();
                            if (check > 0) {
                                PreparedStatement preparedStatement1 = Appointment.prepareCall("update APPOINTMENTS set STATUS=? where DOCTOR_NAME=? AND APPOINTMENT_DATE=? AND APPOINTMENT_TIME=?");
                                preparedStatement1.setString(1, "Not Reserved");
                                preparedStatement1.setString(2, doc_name_res.getSelectedItem().toString());
                                preparedStatement1.setString(3, ((JTextField) Appo_date3.getDateEditor().getUiComponent()).getText().toString());
                                preparedStatement1.setString(4, app_time.getSelectedItem().toString());
                                preparedStatement1.executeUpdate();
                                findUsers();
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "The Appointment Dose Not exist!!", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Please Enter a Missing Information", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong, please make sure you are connected to the Internet");
            }
        }*/
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton23MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseMoved
        
        jButton23.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton23MouseMoved

    private void jButton23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23MouseExited

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        findUsers();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void lbl_CancleAllMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CancleAllMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_CancleAllMouseDragged

    private void lbl_CancleAllMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CancleAllMouseMoved
        lbl_CancleAll.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl_CancleAllMouseMoved

    private void lbl_CancleAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CancleAllMouseClicked

    }//GEN-LAST:event_lbl_CancleAllMouseClicked

    private void lblBackMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseMoved
        lblBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblBackMouseMoved

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        
    }//GEN-LAST:event_lblBackMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            File f = new File("icon.jpg");
            Image img = ImageIO.read(f);
            Image newImg = img.getScaledInstance(lbl_CancleAll.getWidth(), lbl_CancleAll.getHeight(), Image.SCALE_AREA_AVERAGING);
            lbl_CancleAll.setIcon(new ImageIcon(newImg));
        } catch (IOException ex) {

        }
        
        this.setTitle("Reserved Apppoinment");
        setLocationRelativeTo(null);
        setIcon();
    }//GEN-LAST:event_formWindowOpened

    private void ssd_numMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ssd_numMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ssd_numMouseClicked

    private void ssd_num1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ssd_num1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ssd_num1MouseClicked

    private void ssd_num2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ssd_num2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ssd_num2MouseClicked

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
            java.util.logging.Logger.getLogger(AddExamSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddExamSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddExamSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddExamSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddExamSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Appo_date3;
    private javax.swing.JButton add_res;
    private javax.swing.JComboBox<String> app_time;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> doc_name_res;
    private javax.swing.JButton jButton23;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable222;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lbl_CancleAll;
    public javax.swing.JTextField ssd_num;
    public javax.swing.JTextField ssd_num1;
    public javax.swing.JTextField ssd_num2;
    private javax.swing.JComboBox<String> ssd_res;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }

    private boolean isDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        Date AppoDate = null;
        String dateStr = dateFormat.format(date);
        try {
            AppoDate = dateFormat.parse(((JTextField) Appo_date3.getDateEditor().getUiComponent()).getText());

        } catch (ParseException ex) {
            Logger.getLogger(addAppo.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (AppoDate.before(date)) {
            return false;
        } else {
            return true;
        }
    }

    private void fillLectureInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
