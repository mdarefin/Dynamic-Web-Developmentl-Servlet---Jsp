/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review2.GUI;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author WaLiD
 */
public class AssignmentPhoneBook extends javax.swing.JFrame {

    private static String name, number, errorMessage = "";
    private Map contactList = new HashMap();

    /**
     * Creates new form AssignmentPhoneBook
     */
    public AssignmentPhoneBook() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        headingLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        numberLabel = new javax.swing.JLabel();
        numberTxtField = new javax.swing.JTextField();
        contactListComboBox = new javax.swing.JComboBox();
        findButton = new javax.swing.JButton();
        enterButton = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headingLabel.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        headingLabel.setForeground(new java.awt.Color(255, 51, 51));
        headingLabel.setText("Phone Book Entry");

        nameLabel.setText("Name: ");

        nameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFieldActionPerformed(evt);
            }
        });

        numberLabel.setText("Number:");

        contactListComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Contact List" }));
        contactListComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactListComboBoxActionPerformed(evt);
            }
        });

        findButton.setText("Find");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(headingLabel)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enterButton)
                        .addGap(107, 107, 107))))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(numberLabel)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contactListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nameTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(numberTxtField)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(findButton)
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(headingLabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberLabel)
                    .addComponent(numberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(enterButton)
                .addGap(18, 18, 18)
                .addComponent(contactListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(findButton)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFieldActionPerformed
       
    }//GEN-LAST:event_nameTxtFieldActionPerformed

    private void contactListComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactListComboBoxActionPerformed
        

    }//GEN-LAST:event_contactListComboBoxActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        // Get the name and number from txtBox and add them to ComboBox

        name = nameTxtField.getText();
        //this will check if the name is valid
        if (!name.matches("[a-zA-Z- ]+")) {
            errorMessage = "Please enter valid name\n";
        }

        number = numberTxtField.getText();
        if (number.length() < 0 || number.length() > 10) {
            errorMessage = errorMessage + "Please enter valid number\n";
        }

        if (!errorMessage.equals("")) {
            JOptionPane.showMessageDialog(null, errorMessage);
            nameTxtField.setText("");
            numberTxtField.setText("");
        } else {
            contactList.put(name, number);
            contactListComboBox.addItem(name);
            JOptionPane.showMessageDialog(null, "Contact is Entered Successfully");
            nameTxtField.setText("");
            numberTxtField.setText("");
        }
    }//GEN-LAST:event_enterButtonActionPerformed

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        // TODO add your handling code here:
        // Reding ContactCombo list
        if (contactListComboBox.getSelectedIndex() == -1 || contactListComboBox.getSelectedIndex() == 0) {
            errorMessage = errorMessage + "Please select Contact";

        } else {
            //getting the selected name, which is key of out HashMap
            String keyName = contactListComboBox.getSelectedItem().toString();
            if (!contactList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Name: " + keyName + "\nNumber: " + contactList.get(keyName));
            }
            //setting default to contactList
            contactListComboBox.setSelectedIndex(0);

        }
    }//GEN-LAST:event_findButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AssignmentPhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignmentPhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignmentPhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignmentPhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        new AssignmentPhoneBook().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignmentPhoneBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox contactListComboBox;
    private javax.swing.JButton enterButton;
    private javax.swing.JButton findButton;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JTextField numberTxtField;
    // End of variables declaration//GEN-END:variables
}
