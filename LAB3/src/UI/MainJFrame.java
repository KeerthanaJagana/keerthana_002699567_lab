/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Model.Application;

/**
 *
 * @author keerthanajagana
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    Application application;
    public MainJFrame() {
        initComponents();
        this.application=new Application();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        createObservation = new javax.swing.JButton();
        viewVitalBtn = new javax.swing.JButton();
        medCatBtn = new javax.swing.JButton();
        assignMed = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createObservation.setText("Create Observation");
        createObservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createObservationActionPerformed(evt);
            }
        });
        jPanel1.add(createObservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 160, 50));

        viewVitalBtn.setText("View vital signs");
        viewVitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVitalBtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewVitalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 150, 50));

        medCatBtn.setText("Medicine Catalog");
        medCatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medCatBtnActionPerformed(evt);
            }
        });
        jPanel1.add(medCatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 160, 60));

        assignMed.setText("Assign medicine");
        jPanel1.add(assignMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, 60));

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createObservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createObservationActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new CreateJPanel(this.application));
    }//GEN-LAST:event_createObservationActionPerformed

    private void viewVitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVitalBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new ViewJPanel(this.application));
    }//GEN-LAST:event_viewVitalBtnActionPerformed

    private void medCatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medCatBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new MedicineAssignJPanel(this.application));
    }//GEN-LAST:event_medCatBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignMed;
    private javax.swing.JButton createObservation;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton medCatBtn;
    private javax.swing.JButton viewVitalBtn;
    // End of variables declaration//GEN-END:variables
}
