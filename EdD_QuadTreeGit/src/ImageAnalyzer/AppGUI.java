package ImageAnalyzer;
import java.awt.Image;
import javax.swing.JSpinner.DefaultEditor;
public class AppGUI extends javax.swing.JFrame {
    //<editor-fold defaultstate="collapsed" desc="Constructor and More Autogenerated Code">
    public AppGUI() {
        initComponents();
        ((DefaultEditor) sp_depth.getEditor()).getTextField().setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_save = new javax.swing.JButton();
        panel_pic = new javax.swing.JPanel();
        lb_image = new javax.swing.JLabel();
        btn_load = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cb_filter = new javax.swing.JComboBox();
        sp_depth = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        pb_convert = new javax.swing.JProgressBar();
        btn_about = new javax.swing.JButton();
        btn_contourize = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contour Creator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        btn_save.setBackground(new java.awt.Color(153, 153, 153));
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageAnalyzer/save1_small.png"))); // NOI18N
        btn_save.setToolTipText("Save Result");
        btn_save.setEnabled(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        panel_pic.setBackground(new java.awt.Color(102, 102, 102));
        panel_pic.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lb_image.setBackground(new java.awt.Color(102, 102, 102));
        lb_image.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_image.setForeground(new java.awt.Color(204, 204, 204));
        lb_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_image.setText("No image loaded...");

        javax.swing.GroupLayout panel_picLayout = new javax.swing.GroupLayout(panel_pic);
        panel_pic.setLayout(panel_picLayout);
        panel_picLayout.setHorizontalGroup(
            panel_picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_picLayout.setVerticalGroup(
            panel_picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_image, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        btn_load.setBackground(new java.awt.Color(153, 153, 153));
        btn_load.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_load.setText("LOAD");
        btn_load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Grayscale Filter");

        cb_filter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_filter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lightness", "Average", "Luminosity", "Red", "Green", "Blue" }));
        cb_filter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_filterItemStateChanged(evt);
            }
        });

        sp_depth.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        sp_depth.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        sp_depth.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tree Depth");

        pb_convert.setForeground(new java.awt.Color(102, 102, 102));
        pb_convert.setValue(50);

        btn_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageAnalyzer/info_xsmall.png"))); // NOI18N
        btn_about.setText("About");
        btn_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aboutActionPerformed(evt);
            }
        });

        btn_contourize.setBackground(new java.awt.Color(102, 255, 102));
        btn_contourize.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn_contourize.setForeground(new java.awt.Color(0, 51, 0));
        btn_contourize.setText("CONTOURIZE");
        btn_contourize.setEnabled(false);
        btn_contourize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contourizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_load, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pb_convert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_about, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_filter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sp_depth, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(btn_contourize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panel_pic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pb_convert, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_load, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp_depth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_contourize, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_about))
                            .addComponent(jSeparator1))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="GUI Methods">
    private void btn_loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_loadActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_contourizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contourizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_contourizeActionPerformed

    private void cb_filterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_filterItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_filterItemStateChanged

    private void btn_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_aboutActionPerformed
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Custom Methods">
    public void grayify(){
        System.out.println("Gray-ifying...");
    }
    public boolean isGrayscale(){
        
        return false;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Main">
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
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppGUI().setVisible(true);
            }
        });
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Autogenerated Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_about;
    private javax.swing.JButton btn_contourize;
    private javax.swing.JButton btn_load;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox cb_filter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_image;
    private javax.swing.JPanel panel_pic;
    private javax.swing.JProgressBar pb_convert;
    private javax.swing.JSpinner sp_depth;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}