package Viewer;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sahera Al Omari
 */
public class AdminMainMenu extends javax.swing.JFrame {

    
    public AdminMainMenu() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Main Menu");

        try {
            File f = new File("user_admin.png");
            Image img = ImageIO.read(f);
            Image newImg = img.getScaledInstance(lbl_ProfileImage1.getWidth(), lbl_ProfileImage1.getHeight(), Image.SCALE_AREA_AVERAGING);
            lbl_ProfileImage1.setIcon(new ImageIcon(newImg));
        } catch (IOException ex) {

        }
        
        try {
            File f = new File("background.png");
            Image img = ImageIO.read(f);
            Image newImg = img.getScaledInstance(lblBackground.getWidth(), lblBackground.getHeight(), Image.SCALE_AREA_AVERAGING);
            lblBackground.setIcon(new ImageIcon(newImg));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_AddNewLecturer = new javax.swing.JButton();
        btn_AddNewStudent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_ProfileImage1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1054, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_AddNewLecturer.setBackground(new java.awt.Color(0, 51, 102));
        btn_AddNewLecturer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_AddNewLecturer.setForeground(new java.awt.Color(204, 204, 204));
        btn_AddNewLecturer.setText("Add New Lecturer");
        btn_AddNewLecturer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_AddNewLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddNewLecturerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AddNewLecturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 340, 100));

        btn_AddNewStudent.setBackground(new java.awt.Color(0, 51, 102));
        btn_AddNewStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_AddNewStudent.setForeground(new java.awt.Color(204, 204, 204));
        btn_AddNewStudent.setText("Add New Student");
        btn_AddNewStudent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_AddNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddNewStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AddNewStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 340, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconfinder_logout_close_sign_out_exit_access_3994382 (1).png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 50, 60));
        getContentPane().add(lbl_ProfileImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 100, 90));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 108));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("System Admin");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 260, 40));
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AddNewLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddNewLecturerActionPerformed
        this.setVisible(false);
        LecturerRegisteration registeration = new LecturerRegisteration();
        registeration.setVisible(true);
    }//GEN-LAST:event_btn_AddNewLecturerActionPerformed

    private void btn_AddNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddNewStudentActionPerformed
        this.setVisible(false);
        StudentRegisteration registeration = new StudentRegisteration();
        registeration.setVisible(true);
    }//GEN-LAST:event_btn_AddNewStudentActionPerformed

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
        jLabel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel1MouseMoved

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setVisible(false);
        new Splash().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(AdminMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AdminMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddNewLecturer;
    private javax.swing.JButton btn_AddNewStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lbl_ProfileImage1;
    // End of variables declaration//GEN-END:variables

}
