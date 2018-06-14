package TimelineApplication;
import static TimelineApplication.EditEventNum.EditEventField;
import static TimelineApplication.Maintimeline.editBtnClicked;
import static TimelineApplication.Maintimeline.eventInformationList;
import static TimelineApplication.Maintimeline.numOfEvents;
import static TimelineApplication.Maintimeline.updateScreen;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Editevent extends javax.swing.JFrame {

    public static String oldColorR;
    public static String oldColorG;
    public static String oldColorB;
    public static int oldPosition;
    
    public Editevent() {
        initComponents();
        
        //Getting all the info of chosen event and displaying it in text fields
        String edit_pos = EditEventField.getText();
        int edit_pos_num = parseInt(edit_pos);
        shiftNewPosTextField.setText(edit_pos);
        EditEventNameTextField.setText(eventInformationList.get(edit_pos_num).get(0).toString());
        EditTimeTextField.setText(eventInformationList.get(edit_pos_num).get(1).toString());
        EditDescriptionTextArea.setText(eventInformationList.get(edit_pos_num).get(2).toString());
        EditImageUrlTextField.setText(eventInformationList.get(edit_pos_num).get(3).toString());
        oldColorR = eventInformationList.get(edit_pos_num).get(4);
        oldColorG = eventInformationList.get(edit_pos_num).get(5);
        oldColorB = eventInformationList.get(edit_pos_num).get(6);
        
        setOldPosition();
     
    }

    public static void setOldPosition(){
        oldPosition = parseInt(shiftNewPosTextField.getText());  
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EventNameLabel = new javax.swing.JLabel();
        EditEventNameTextField = new javax.swing.JTextField();
        TimeLabel = new javax.swing.JLabel();
        EditTimeTextField = new javax.swing.JTextField();
        DescriptionLabel = new javax.swing.JLabel();
        EditImageUrlTextField = new javax.swing.JTextField();
        ImageUrlLabel = new javax.swing.JLabel();
        EditBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        switchEventRadioButton = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        EditDescriptionTextArea = new javax.swing.JTextArea();
        parentPanel = new javax.swing.JPanel();
        shiftPane = new javax.swing.JPanel();
        shiftNewPosTextField = new javax.swing.JTextField();
        shiftNewPosLabel = new javax.swing.JLabel();
        switchPane = new javax.swing.JPanel();
        switchOldPosLabel = new javax.swing.JLabel();
        switchOldPosTextField = new javax.swing.JTextField();
        switchNewPosLabel = new javax.swing.JLabel();
        switchNewPosTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));
        setMinimumSize(new java.awt.Dimension(500, 600));
        setPreferredSize(new java.awt.Dimension(500, 600));

        EventNameLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        EventNameLabel.setText("Edit Event Name:");

        EditEventNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditEventNameTextFieldActionPerformed(evt);
            }
        });

        TimeLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TimeLabel.setText("Time:");

        EditTimeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditTimeTextFieldActionPerformed(evt);
            }
        });

        DescriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        DescriptionLabel.setText("Description:");

        EditImageUrlTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditImageUrlTextFieldActionPerformed(evt);
            }
        });

        ImageUrlLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ImageUrlLabel.setText("Image URL:");

        EditBtn.setText("EDIT");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        CancelBtn.setText("CANCEL");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Current Position: ");

        switchEventRadioButton.setText("Switch Events (default shift)");
        switchEventRadioButton.setContentAreaFilled(false);
        switchEventRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                switchEventRadioButtonMousePressed(evt);
            }
        });
        switchEventRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchEventRadioButtonActionPerformed(evt);
            }
        });

        EditDescriptionTextArea.setColumns(20);
        EditDescriptionTextArea.setLineWrap(true);
        EditDescriptionTextArea.setRows(5);
        EditDescriptionTextArea.setToolTipText("");
        EditDescriptionTextArea.setWrapStyleWord(true);
        jScrollPane2.setViewportView(EditDescriptionTextArea);

        parentPanel.setOpaque(false);
        parentPanel.setLayout(new java.awt.CardLayout());

        shiftPane.setOpaque(false);

        shiftNewPosTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftNewPosTextFieldActionPerformed(evt);
            }
        });

        shiftNewPosLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        shiftNewPosLabel.setText("New Positon (Enter a number)");

        javax.swing.GroupLayout shiftPaneLayout = new javax.swing.GroupLayout(shiftPane);
        shiftPane.setLayout(shiftPaneLayout);
        shiftPaneLayout.setHorizontalGroup(
            shiftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shiftPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(shiftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shiftNewPosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shiftNewPosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        shiftPaneLayout.setVerticalGroup(
            shiftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shiftPaneLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(shiftNewPosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shiftNewPosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        parentPanel.add(shiftPane, "card2");

        switchPane.setOpaque(false);

        switchOldPosLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        switchOldPosLabel.setText("Old Position");

        switchOldPosTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchOldPosTextFieldActionPerformed(evt);
            }
        });

        switchNewPosLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        switchNewPosLabel.setText("New Position");

        switchNewPosTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchNewPosTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout switchPaneLayout = new javax.swing.GroupLayout(switchPane);
        switchPane.setLayout(switchPaneLayout);
        switchPaneLayout.setHorizontalGroup(
            switchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(switchPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(switchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(switchOldPosLabel)
                    .addComponent(switchOldPosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addGroup(switchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(switchNewPosLabel)
                    .addComponent(switchNewPosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        switchPaneLayout.setVerticalGroup(
            switchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(switchPaneLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(switchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(switchOldPosLabel)
                    .addComponent(switchNewPosLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(switchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(switchOldPosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(switchNewPosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        parentPanel.add(switchPane, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(ImageUrlLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(CancelBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(EditBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EditImageUrlTextField))
                            .addComponent(EditTimeTextField, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(EventNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditEventNameTextField)))
                .addGap(126, 126, 126))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(231, 231, 231)
                    .addComponent(TimeLabel)
                    .addContainerGap(611, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(212, 212, 212)
                    .addComponent(DescriptionLabel)
                    .addContainerGap(593, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(155, 155, 155)
                    .addComponent(switchEventRadioButton)
                    .addContainerGap(536, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(430, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(359, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ImageUrlLabel)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(EditImageUrlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EditBtn)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(CancelBtn)
                                            .addComponent(jLabel1))))))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EditTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EventNameLabel)
                    .addComponent(EditEventNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(273, 273, 273)
                    .addComponent(TimeLabel)
                    .addContainerGap(273, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(273, 273, 273)
                    .addComponent(DescriptionLabel)
                    .addContainerGap(273, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(switchEventRadioButton)
                    .addContainerGap(270, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(235, 235, 235)
                    .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(236, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void switchNewPosTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchNewPosTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_switchNewPosTextFieldActionPerformed

    private void switchOldPosTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchOldPosTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_switchOldPosTextFieldActionPerformed

    private void shiftNewPosTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftNewPosTextFieldActionPerformed

    }//GEN-LAST:event_shiftNewPosTextFieldActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        editBtnClicked = false;
        this.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed

        //Getting text from text fields
        String name = EditEventNameTextField.getText();
        String time = EditTimeTextField.getText();
        String desc = EditDescriptionTextArea.getText();
        String URL = EditImageUrlTextField.getText();

        int positionNew = parseInt(shiftNewPosTextField.getText());

        //Verifying that the inputted position number is within the possible range
        //and then removing sublsit at that pos, adding new sublist and inserting all relevant info into main event info list
        if(positionNew <= numOfEvents && positionNew > 0){
            eventInformationList.remove(oldPosition);
            eventInformationList.add(positionNew, new ArrayList<String>());
            eventInformationList.get(positionNew).add(name);
            eventInformationList.get(positionNew).add(time);
            eventInformationList.get(positionNew).add(desc);
            eventInformationList.get(positionNew).add(URL);
            eventInformationList.get(positionNew).add(oldColorR);
            eventInformationList.get(positionNew).add(oldColorG);
            eventInformationList.get(positionNew).add(oldColorB);
            updateScreen(numOfEvents);
            editBtnClicked = false;
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "That position is invalid.");
        }

    }//GEN-LAST:event_EditBtnActionPerformed

    private void EditImageUrlTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditImageUrlTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditImageUrlTextFieldActionPerformed

    private void EditEventNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditEventNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditEventNameTextFieldActionPerformed

    private void switchEventRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchEventRadioButtonActionPerformed
        if(!switchEventRadioButton.isSelected()){ //if it was not previously selected
            parentPanel.removeAll();
            parentPanel.add(switchPane);
            parentPanel.repaint();
            parentPanel.revalidate();
        }
        else{ //was previosuly selected
            parentPanel.removeAll();
            parentPanel.add(shiftPane);
            parentPanel.repaint();
            parentPanel.revalidate();
        }
    }//GEN-LAST:event_switchEventRadioButtonActionPerformed

    private void switchEventRadioButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchEventRadioButtonMousePressed

    }//GEN-LAST:event_switchEventRadioButtonMousePressed

    private void EditTimeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTimeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditTimeTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Editevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editevent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextArea EditDescriptionTextArea;
    private javax.swing.JTextField EditEventNameTextField;
    private javax.swing.JTextField EditImageUrlTextField;
    private javax.swing.JTextField EditTimeTextField;
    private javax.swing.JLabel EventNameLabel;
    private javax.swing.JLabel ImageUrlLabel;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JLabel shiftNewPosLabel;
    public static javax.swing.JTextField shiftNewPosTextField;
    private javax.swing.JPanel shiftPane;
    private javax.swing.JRadioButton switchEventRadioButton;
    private javax.swing.JLabel switchNewPosLabel;
    private javax.swing.JTextField switchNewPosTextField;
    private javax.swing.JLabel switchOldPosLabel;
    private javax.swing.JTextField switchOldPosTextField;
    private javax.swing.JPanel switchPane;
    // End of variables declaration//GEN-END:variables
}
