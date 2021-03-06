package TimelineApplication;


import static TimelineApplication.Maintimeline.exportBtnClicked;
import static TimelineApplication.Maintimeline.mainPanel;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static TimelineApplication.TitleEditForm.title;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KIDS
 */
public class ExportTimeline extends javax.swing.JFrame {

    public static String directoryAbsolutePath;
    
    /**
     * Creates new form ExportTimeline
     */
    public ExportTimeline() {
        initComponents();
        outputTitleTextField.setText(title);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pageSymbol = new javax.swing.JLabel();
        exportLabel = new javax.swing.JLabel();
        filePathLabel = new javax.swing.JPanel();
        outputTitleLabel = new javax.swing.JLabel();
        outputTitleLabel1 = new javax.swing.JLabel();
        outputTitleTextField = new javax.swing.JTextField();
        filePathTextField = new javax.swing.JTextField();
        browseFileBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pageSymbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/exportBtnHover.png"))); // NOI18N

        exportLabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 48)); // NOI18N
        exportLabel.setText("EXPORT");

        filePathLabel.setBackground(new java.awt.Color(252, 252, 252));

        outputTitleLabel.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        outputTitleLabel.setText("Output Title");

        outputTitleLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        outputTitleLabel1.setText("File Path");

        javax.swing.GroupLayout filePathLabelLayout = new javax.swing.GroupLayout(filePathLabel);
        filePathLabel.setLayout(filePathLabelLayout);
        filePathLabelLayout.setHorizontalGroup(
            filePathLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filePathLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(filePathLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputTitleLabel)
                    .addComponent(outputTitleLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        filePathLabelLayout.setVerticalGroup(
            filePathLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filePathLabelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(outputTitleLabel)
                .addGap(26, 26, 26)
                .addComponent(outputTitleLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        browseFileBtn.setText("Browse for Location");
        browseFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseFileBtnActionPerformed(evt);
            }
        });

        nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/nextBtnNonHover.png"))); // NOI18N
        nextBtn.setBorderPainted(false);
        nextBtn.setContentAreaFilled(false);
        nextBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/nextBtnHover.png"))); // NOI18N
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        cancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/cancelBtnNonHover.png"))); // NOI18N
        cancelBtn.setBorderPainted(false);
        cancelBtn.setContentAreaFilled(false);
        cancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/TimelineApplication/cancelBtnHover.png"))); // NOI18N
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(pageSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(exportLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(filePathLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(outputTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(filePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(browseFileBtn))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pageSymbol))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(exportLabel)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(outputTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browseFileBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nextBtn)
                            .addComponent(cancelBtn))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(filePathLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browseFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseFileBtnActionPerformed
        JFileChooser saveFileChooser = new JFileChooser();
        saveFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); //doesnt show files - no need to show them since your saving in a folder
        int response = saveFileChooser.showSaveDialog(saveFileChooser);
        
        //Checking if user presses save or not
        if(response == JFileChooser.APPROVE_OPTION){
            File selectedDirectory = saveFileChooser.getSelectedFile();
            directoryAbsolutePath = selectedDirectory.toString();
        }
        else{
            JOptionPane.showMessageDialog(null, "File browsing was cancelled.");
        }
        
        
        
        filePathTextField.setText(directoryAbsolutePath);
    }//GEN-LAST:event_browseFileBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        exportBtnClicked = true; 
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        directoryAbsolutePath = filePathTextField.getText();
        String imageTitle = outputTitleTextField.getText();
        Dimension d = mainPanel.getSize();
        BufferedImage image = new BufferedImage(d.width, d.height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();
        mainPanel.print( g2d );
        g2d.dispose();
        try {
            ImageIO.write(image, "png", new File(directoryAbsolutePath +"\\" + imageTitle + ".png"));
            exportBtnClicked = false; 
            this.dispose();
            String output = "Your timeline ha been saved. File Path: " + directoryAbsolutePath +"\\" + imageTitle + ".png";
            JOptionPane.showMessageDialog(null, output);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File path not found!");
        }
        
        
        
    }//GEN-LAST:event_nextBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ExportTimeline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExportTimeline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExportTimeline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExportTimeline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExportTimeline().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseFileBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel exportLabel;
    private javax.swing.JPanel filePathLabel;
    private javax.swing.JTextField filePathTextField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel outputTitleLabel;
    private javax.swing.JLabel outputTitleLabel1;
    private javax.swing.JTextField outputTitleTextField;
    private javax.swing.JLabel pageSymbol;
    // End of variables declaration//GEN-END:variables
}
