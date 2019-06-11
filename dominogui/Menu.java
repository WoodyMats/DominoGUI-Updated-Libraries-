package dominogui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John, Leos
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */

    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Solo1 = new JButton();
        AllSeven = new JButton();
        jLabel1 = new JLabel();
        Exit = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ResourceBundle bundle = ResourceBundle.getBundle("dominogui/MessageBundles"); // NOI18N
        setTitle(bundle.getString("welcome")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        Solo1.setText(bundle.getString("Menu.Solo1.text")); // NOI18N
        Solo1.setName("Solo1"); // NOI18N
        Solo1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Solo1ActionPerformed(evt);
            }
        });



        AllSeven.setText(bundle.getString("Menu.AllSeven.text")); // NOI18N
        AllSeven.setName("AllSeven"); // NOI18N
        AllSeven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AllSevenActionPerformed(evt);
            }
        });

        jLabel1.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText(bundle.getString("Menu.jLabel1.welcome")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        Exit.setText(bundle.getString("Menu.Exit.label")); // NOI18N
        Exit.setLabel(bundle.getString("Menu.Exit.label")); // NOI18N
        Exit.setName("Exit"); // NOI18N
        Exit.setPreferredSize(new Dimension(91, 25));
        Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(AllSeven, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Exit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15,15,15)
                        .addComponent(jLabel1)
                        .addGap(0,14,Short.MAX_VALUE)
                        .addComponent(Solo1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Solo1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AllSeven, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Exit, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Solo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Solo1ActionPerformed
        this.dispose();
        new Solo1GUI().setVisible(true);
    }//GEN-LAST:event_Solo1ActionPerformed


    private void AllSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllSevenActionPerformed
        this.dispose();
        new AllSevenGUI().setVisible(true);
    }//GEN-LAST:event_AllSevenActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed

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
                if (java.util.ResourceBundle.getBundle("dominogui/MessageBundles").getString("NIMBUS").equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllSeven;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Hungarian;
    private javax.swing.JButton Solo1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
