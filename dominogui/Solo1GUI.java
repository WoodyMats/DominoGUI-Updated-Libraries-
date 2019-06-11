/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominogui;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author John, Leos
 */
public class Solo1GUI extends javax.swing.JFrame {
    
    private Solo1 solo;
    private ArrayList<JRadioButton> tilesButton;
    private javax.swing.ButtonGroup stackGroup;
    ResourceBundle bundle = ResourceBundle.getBundle("dominogui.MessageBundles");
    private int selected = -1;
    
    /**
     * Creates new form Solo1GUI
     */
    public Solo1GUI() {
        solo = new Solo1();
        tilesButton = new ArrayList<JRadioButton>();
        solo.initGame();
        initComponents();
        initStackGroup();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        Table = new javax.swing.JLabel();
        PlaceLeft = new javax.swing.JButton();
        PlaceRight = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Info = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("dominogui/MessageBundles"); // NOI18N
        setTitle(bundle.getString("Solo1GUI.title")); // NOI18N

        Title.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText(bundle.getString("Solo1GUI.Title.text")); // NOI18N

        Table.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        Table.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Table.setToolTipText(bundle.getString("Solo1GUI.Table.toolTipText")); // NOI18N
        Table.setAutoscrolls(true);
        Table.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("table"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Microsoft JhengHei UI", 1, 18))); // NOI18N
        Table.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PlaceLeft.setText(bundle.getString("placeLeftButton")); // NOI18N
        PlaceLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceLeftActionPerformed(evt);
            }
        });

        PlaceRight.setText(bundle.getString("placeRightButton")); // NOI18N
        PlaceRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceRightActionPerformed(evt);
            }
        });

        Reset.setText(bundle.getString("resetButton")); // NOI18N
        Reset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        p1.setLayout(new java.awt.GridLayout(4, 7));

        jMenu1.setMnemonic('G');
        jMenu1.setText(bundle.getString("Solo1GUI.jMenu1.text")); // NOI18N

        jMenuItem1.setMnemonic('H');
        jMenuItem1.setText(bundle.getString("Solo1GUI.jMenuItem1.text")); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setMnemonic('M');
        jMenuItem2.setText(bundle.getString("Solo1GUI.jMenuItem2.text")); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Table, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(PlaceLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(PlaceRight, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(Table, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlaceLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlaceRight, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void initStackGroup(){
        stackGroup = new javax.swing.ButtonGroup();
        for (int i = 0; i < 28; i++) {
            JRadioButton anotherButton = new JRadioButton();
            tilesButton.add(anotherButton);
            p1.add(tilesButton.get(i));
            tilesButton.get(i).setText(solo.stack.get(i).toString());
            stackGroup.add(tilesButton.get(i));
            tilesButton.get(i).setActionCommand("RB" + i);
            if(!((i+1)%7 == 0)){
                tilesButton.get(i).setEnabled(false);
            }else{
                tilesButton.get(i).setEnabled(true);
            }
        }
    }
    
    public boolean checkIfGameOver(){
        if(solo.stack.isEmpty()){
            return true;
        }else{
            for(int i=0;i<solo.stack.size();i++){
                if(tilesButton.get(i).isEnabled()){
                    if(solo.canMove(i)){
                        return false;
                    }
                }
            }
            return true;
        }
    }
    
    /**
     * Take the slected Radio Button as input and checks if left move can be done, then it ckecks if there are other possible moves...
     * After all it calls checkIfGameOver() method to check if the game is over.
     */
    public void makeLeftMove() {
        selected = -1;
        for (int i = 0; i < 28; i++) {
            if (stackGroup.getSelection() == null) {
                Info.setText(bundle.getString("didNotChose"));
            } else {
                if (stackGroup.getSelection().getActionCommand().equals(tilesButton.get(i).getActionCommand())) {
                    selected = i;
                    break;
                }
            }
        }

        if (selected != -1) {
            Tile toPlayed = solo.stack.get(selected);
            if (solo.canLeftMove(toPlayed) == true) {
                Info.setText(bundle.getString("leftMoveDone"));
                Table.setText(solo.showTableTiles());
                tilesButton.get(selected).setEnabled(false);
                if(selected > 0){
                    tilesButton.get(selected-1).setEnabled(true);
                }
                stackGroup.remove(tilesButton.get(selected));
                tilesButton.get(selected).setVisible(false);
                tilesButton.remove(selected);
                solo.stack.remove(selected);
            } else {
                Info.setText(bundle.getString("cantLeft"));
            }
            if(checkIfGameOver()){
                if(solo.stack.isEmpty()){
                    Info.setText(bundle.getString("wonMessage"));
                }else{
                    PlaceLeft.setEnabled(false);
                    PlaceRight.setEnabled(false);
                    JOptionPane.showMessageDialog(rootPane, bundle.getString("lost"));
                }
            }
        }
    }
    
    /**
     * Take the slected Radio Button as input and checks if right move can be done, then it ckecks if there are other possible moves...
     * After all it calls checkIfGameOver() method to check if the game is over.
     */
    public void makeRightMove() {
        selected = -1;
        for (int i = 0; i < 28; i++) {
            if (stackGroup.getSelection() == null) {
                Info.setText(bundle.getString("didNotChose"));
            } else {
                if (stackGroup.getSelection().getActionCommand().equals(tilesButton.get(i).getActionCommand())) {
                    selected = i;
                    break;
                }
            }
        }

        if (selected != -1) {
            Tile toPlayed = solo.stack.get(selected);
            if (solo.canRightMove(toPlayed) == true) {
                Info.setText(bundle.getString("rightMoveDone"));
                Table.setText(solo.showTableTiles());
                tilesButton.get(selected).setEnabled(false);
                if(selected > 0){
                    tilesButton.get(selected-1).setEnabled(true);
                }
                stackGroup.remove(tilesButton.get(selected));
                tilesButton.get(selected).setVisible(false);
                tilesButton.remove(selected);
                solo.stack.remove(selected);
            } else {
                Info.setText(bundle.getString("cantRight"));
            }
            if(checkIfGameOver()){
                if(solo.stack.isEmpty()){
                    Info.setText(bundle.getString("wonMessage"));
                }else{
                    PlaceLeft.setEnabled(false);
                    PlaceRight.setEnabled(false);
                    JOptionPane.showMessageDialog(rootPane, bundle.getString("lost"));
                }
            }
        }
    }
    
    private void PlaceLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceLeftActionPerformed
        makeLeftMove();
    }//GEN-LAST:event_PlaceLeftActionPerformed

    private void PlaceRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceRightActionPerformed
        makeRightMove();
    }//GEN-LAST:event_PlaceRightActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        Table.setText("");
        Info.setText("");      
        p1.removeAll();
        solo.initGame();
        initStackGroup();
        PlaceLeft.setEnabled(true);
        PlaceRight.setEnabled(true);
    }//GEN-LAST:event_ResetActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(rootPane, bundle.getString("Solo1.Rules"));
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Info;
    private javax.swing.JButton PlaceLeft;
    private javax.swing.JButton PlaceRight;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel Table;
    private javax.swing.JLabel Title;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel p1;
    // End of variables declaration//GEN-END:variables
}
