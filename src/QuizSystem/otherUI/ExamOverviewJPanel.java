/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package QuizSystem.otherUI;

import QuizSystem.ui.ExamDetailJDialog;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author trant
 */
public class ExamOverviewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    String examCode;
    
    public ExamOverviewJPanel() {
        initComponents();
    }
    
    public JLabel getLbFinishTime() {
        return lbFinishTime;
    }
    
    public void setLbFinishTime(JLabel lbFinishTime) {
        this.lbFinishTime = lbFinishTime;
    }
    
    public JLabel getLbQuantity() {
        return lbQuantity;
    }
    
    public void setLbQuantity(JLabel lbQuantity) {
        this.lbQuantity = lbQuantity;
    }
    
    public JLabel getLbStartTime() {
        return lbStartTime;
    }
    
    public void setLbStartTime(JLabel lbStartTime) {
        this.lbStartTime = lbStartTime;
    }
    
    public JLabel getLbDuration() {
        return lbDuration;
    }
    
    public void setLbDuration(JLabel lbDuration) {
        this.lbDuration = lbDuration;
    }
    
    public JLabel getLbTitle() {
        return lbTitle;
    }
    
    public void setLbTitle(JLabel lbTitle) {
        this.lbTitle = lbTitle;
    }
    
    public String getExamCode() {
        return examCode;
    }
    
    public void setExamCode(String examCode) {
        this.examCode = examCode;
    }
    
    public JButton getBtnGetCode() {
        return btnGetCode;
    }
    
    public void setBtnGetCode(JButton btnGetCode) {
        this.btnGetCode = btnGetCode;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        lbStartTime = new javax.swing.JLabel();
        lbFinishTime = new javax.swing.JLabel();
        lbQuantity = new javax.swing.JLabel();
        lbDuration = new javax.swing.JLabel();
        btnGetCode = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        lbTitle.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 0, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("KIỂM TRA 15 PHÚT MÔN TOÁN");

        lbStartTime.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        lbStartTime.setText("Bắt đầu: 9:00 AM - 20/11/2022");

        lbFinishTime.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        lbFinishTime.setText("Kết thúc: 9:15 AM - 20/11/2022");

        lbQuantity.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        lbQuantity.setText("Tổng số câu: 10");

        lbDuration.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        lbDuration.setText("Thời gian: 15 phút");

        btnGetCode.setBackground(new java.awt.Color(0, 255, 255));
        btnGetCode.setFont(new java.awt.Font("JetBrains Mono", 1, 16)); // NOI18N
        btnGetCode.setText("LẤY MÃ");
        btnGetCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetCodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbStartTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbFinishTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDuration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGetCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbStartTime)
                .addGap(18, 18, 18)
                .addComponent(lbFinishTime)
                .addGap(18, 18, 18)
                .addComponent(lbQuantity)
                .addGap(18, 18, 18)
                .addComponent(lbDuration)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnGetCode)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        ExamDetailJDialog examDetailJDialog = new ExamDetailJDialog(null, true, examCode);
        examDetailJDialog.writeToFormExam();
        examDetailJDialog.setVisible(true);
    }//GEN-LAST:event_formMouseClicked

    private void btnGetCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetCodeActionPerformed
        ExamCode e = new ExamCode(null, true);
        e.getLbExamCode().setText(examCode);
        e.setVisible(true);
    }//GEN-LAST:event_btnGetCodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetCode;
    private javax.swing.JLabel lbDuration;
    private javax.swing.JLabel lbFinishTime;
    private javax.swing.JLabel lbQuantity;
    private javax.swing.JLabel lbStartTime;
    private javax.swing.JLabel lbTitle;
    // End of variables declaration//GEN-END:variables
}
