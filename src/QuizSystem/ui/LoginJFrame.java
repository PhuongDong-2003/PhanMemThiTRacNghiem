/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QuizSystem.ui;

import QuizSystem.dao.LecturerDAO;
import QuizSystem.dao.StudentDAO;
import QuizSystem.otherUI.QRCodeScanJDialog;
import QuizSystem.entity.Lecturer;
import QuizSystem.entity.Person;
import QuizSystem.entity.Student;
import QuizSystem.utils.AuthOfLecturer;
import QuizSystem.utils.AuthOfStudent;
import QuizSystem.utils.MsgBox;
import java.awt.Image;
import java.util.concurrent.ThreadFactory;
import javax.swing.ImageIcon;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executors;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author trant
 */
public class LoginJFrame extends javax.swing.JFrame implements Runnable, ThreadFactory {

    /**
     * Creates new form LoginJFrame
     */
    LecturerDAO lecturerDAO = new LecturerDAO();
    StudentDAO studentDAO = new StudentDAO();

    public LoginJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void login() {
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());

        Student student = null;
        Lecturer lecturer = null;

        if (!rdoStudent.isSelected() && !rdoLecturer.isSelected()) {
            MsgBox.alert(this, "Đăng nhập không thành công");
            return;
        }
        
        if (rdoStudent.isSelected()) {
            student = studentDAO.selectByTK(username);
            execute(student, username, password);
        } else {
            lecturer = lecturerDAO.selectByTK(username);
            execute(lecturer, username, password);
        }
    }

    public void execute(Person person, String username, String password) {
        if (username.isEmpty() || password.isEmpty()) {
            MsgBox.alert(this, "Không để trống thông tin đăng nhập");
        } else if (person == null) {
            MsgBox.alert(this, "Tài khoản này không tồn tại");
        } else if (!username.equals(person.getTaiKhoan()) && !password.equals(person.getMatKhau())) {
            MsgBox.alert(this, "Tên đăng nhập hoặc mật khẩu không chính xác");
        } else {
            if (person instanceof Student) {
                AuthOfStudent.student = (Student) person;
                MsgBox.alert(this, "Đăng nhập thành công");
                this.dispose();
                new MainStudentJFrame().setVisible(true);
            } else {
                AuthOfLecturer.lecturer = (Lecturer) person;
                MsgBox.alert(this, "Đăng nhập thành công");
                this.dispose();
                new MainLecturerJFrame().setVisible(true);
            }
        }
    }

    @Override
    public void run() {
        QRCodeScanJDialog scan = new QRCodeScanJDialog(this, true);
        while (true) {
            try {
                BufferedImage image = null;
                if (scan.getWebcam().isOpen()) {
                    if ((image = scan.getWebcam().getImage()) == null) {
                        continue;
                    }
                }
                LuminanceSource source = new BufferedImageLuminanceSource(image);
                BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
                Result result = new MultiFormatReader().decode(bitmap);
                if (result != null) {
                    String[] results = result.getText().split(" ", 3);
                    String username = results[0];
                    String password = results[1];
                    String role = results[2];
                    if (role.equals("Sinh viên")) {
                        Student student = studentDAO.selectByTK(username);
                        execute(student, username, password);
                    } else {
                        Lecturer lecturer = lecturerDAO.selectByTK(username);
                        execute(lecturer, username, password);
                    }
                    scan.getWebcam().close();
                    break;
                }
            } catch (NotFoundException ex) {
                Logger.getLogger(LoginJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        chbDisplayPassword = new javax.swing.JCheckBox();
        rdoStudent = new javax.swing.JRadioButton();
        rdoLecturer = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        btnQRCode = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QuizSystem - Đăng nhập");
        setIconImage(new ImageIcon(getClass().getResource("/QuizSystem/icon/quiz-comic.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("ĐĂNG NHẬP");

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nhập tài khoản và mật khẩu để đăng nhập hệ thống");

        txtUsername.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        txtUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 1, 16)); // NOI18N
        jLabel3.setText("Tài khoản:");

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 1, 16)); // NOI18N
        jLabel4.setText("Mật khẩu:");

        btnLogin.setBackground(new java.awt.Color(255, 204, 102));
        btnLogin.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btnLogin.setText("Đăng nhập");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        chbDisplayPassword.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        chbDisplayPassword.setText("Hiện mật khẩu");
        chbDisplayPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chbDisplayPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbDisplayPasswordActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoStudent);
        rdoStudent.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        rdoStudent.setText("Sinh viên");

        buttonGroup1.add(rdoLecturer);
        rdoLecturer.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        rdoLecturer.setText("Giảng viên");

        jLabel6.setFont(new java.awt.Font("JetBrains Mono", 1, 16)); // NOI18N
        jLabel6.setText("Vai trò:");

        btnQRCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizSystem/icon/qr-code-scan.png"))); // NOI18N
        btnQRCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQRCodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 252, Short.MAX_VALUE)
                        .addComponent(chbDisplayPassword))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                            .addComponent(txtUsername)
                            .addComponent(txtPassword)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdoLecturer)
                                        .addGap(47, 47, 47)
                                        .addComponent(rdoStudent))
                                    .addComponent(jLabel4)
                                    .addComponent(btnQRCode))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogin)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chbDisplayPassword)
                .addGap(3, 3, 3)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoLecturer)
                    .addComponent(rdoStudent))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQRCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        jLabel5.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/QuizSystem/icon/LogoLogin.jpg")).getImage().getScaledInstance(375, 400, Image.SCALE_SMOOTH)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        this.login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void chbDisplayPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbDisplayPasswordActionPerformed
        if (chbDisplayPassword.isSelected()) {
            txtPassword.setEchoChar((char) 0);
        } else {
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_chbDisplayPasswordActionPerformed

    private void btnQRCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQRCodeActionPerformed
        QRCodeScanJDialog scan = new QRCodeScanJDialog(this, true);
        scan.setExecutor(Executors.newSingleThreadExecutor(this));
        scan.getExecutor().execute(this);
        scan.setVisible(true);
    }//GEN-LAST:event_btnQRCodeActionPerformed

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
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnQRCode;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chbDisplayPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rdoLecturer;
    private javax.swing.JRadioButton rdoStudent;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
