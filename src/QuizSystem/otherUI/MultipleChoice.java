package QuizSystem.otherUI;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author trant
 */
public class MultipleChoice extends javax.swing.JPanel {

    /**
     * Creates new form Dip
     */
    private JCheckBox[] cbs;
    
    public MultipleChoice() {
        initComponents();
        cbs = new JCheckBox[]{cb1, cb2, cb3, cb4};
    }

    public JCheckBox[] getCbs() {
        return cbs;
    }

    public void setCbs(JCheckBox[] cbs) {
        this.cbs = cbs;
    }

    public JCheckBox getCb1() {
        return cb1;
    }

    public void setCb1(JCheckBox cb1) {
        this.cb1 = cb1;
    }

    public JCheckBox getCb2() {
        return cb2;
    }

    public void setCb2(JCheckBox cb2) {
        this.cb2 = cb2;
    }

    public JCheckBox getCb3() {
        return cb3;
    }

    public void setCb3(JCheckBox cb3) {
        this.cb3 = cb3;
    }

    public JCheckBox getCb4() {
        return cb4;
    }

    public void setCb4(JCheckBox cb4) {
        this.cb4 = cb4;
    }

    public JLabel getLbImage() {
        return lbImage;
    }

    public void setLbImage(JLabel lbImage) {
        this.lbImage = lbImage;
    }

    public JTextArea getTxtaQuestion() {
        return txtaQuestion;
    }

    public void setTxtaQuestion(JTextArea txtaQuestion) {
        this.txtaQuestion = txtaQuestion;
    }
    
    public String getSelected() {
        String choose = "";
        for (JCheckBox cb : cbs) {
            if (cb.isSelected()) choose = choose.concat(cb.getText());
        }
        return choose;
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
        panelQuestion = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaQuestion = new javax.swing.JTextArea();
        lbImage = new javax.swing.JLabel();
        panelAnswer = new javax.swing.JPanel();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(738, 360));
        setLayout(new java.awt.GridLayout(2, 1));

        jScrollPane2.setBorder(null);

        txtaQuestion.setEditable(false);
        txtaQuestion.setBackground(new java.awt.Color(214, 217, 223));
        txtaQuestion.setColumns(20);
        txtaQuestion.setFont(new java.awt.Font("JetBrains Mono", 0, 16)); // NOI18N
        txtaQuestion.setLineWrap(true);
        txtaQuestion.setRows(1);
        txtaQuestion.setBorder(null);
        jScrollPane2.setViewportView(txtaQuestion);

        lbImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImage.setOpaque(true);

        javax.swing.GroupLayout panelQuestionLayout = new javax.swing.GroupLayout(panelQuestion);
        panelQuestion.setLayout(panelQuestionLayout);
        panelQuestionLayout.setHorizontalGroup(
            panelQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQuestionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        panelQuestionLayout.setVerticalGroup(
            panelQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQuestionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panelQuestion);

        cb1.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N

        cb2.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N

        cb3.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N

        cb4.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelAnswerLayout = new javax.swing.GroupLayout(panelAnswer);
        panelAnswer.setLayout(panelAnswerLayout);
        panelAnswerLayout.setHorizontalGroup(
            panelAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAnswerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb1)
                    .addComponent(cb2)
                    .addComponent(cb3)
                    .addComponent(cb4))
                .addContainerGap(715, Short.MAX_VALUE))
        );
        panelAnswerLayout.setVerticalGroup(
            panelAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAnswerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb1)
                .addGap(18, 18, 18)
                .addComponent(cb2)
                .addGap(18, 18, 18)
                .addComponent(cb3)
                .addGap(18, 18, 18)
                .addComponent(cb4)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        add(panelAnswer);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbImage;
    private javax.swing.JPanel panelAnswer;
    private javax.swing.JPanel panelQuestion;
    private javax.swing.JTextArea txtaQuestion;
    // End of variables declaration//GEN-END:variables
}