/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package core.views;

import core.controllers.CalculatorController;
import core.models.Operation;
import core.models.history.History;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author edangulo
 */
public class CalculatorFrame extends javax.swing.JFrame {

    private History history;

    /**
     * Creates new form Calculator
     */
    private final CalculatorController calculatorController;

    public CalculatorFrame() {
        // Se inicializa history en el constructor
        this.history = new History();
        this.calculatorController = new CalculatorController(history);
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

        jLabel1 = new javax.swing.JLabel();
        addActionPerformedActionPerformed = new javax.swing.JButton();
        subtractActionPerformedActionPerformed = new javax.swing.JButton();
        multiplyActionPerformedActionPerformed = new javax.swing.JButton();
        divideActionPerformedActionPerformed = new javax.swing.JButton();
        potencyActionPerformedActionPerformed = new javax.swing.JButton();
        clearActionPerformedActionPerformed = new javax.swing.JButton();
        updateHistoryActionPerformedActionPerformed = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Calculator");

        addActionPerformedActionPerformed.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addActionPerformedActionPerformed.setText("Add");
        addActionPerformedActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformedActionPerformedActionPerformed(evt);
            }
        });

        subtractActionPerformedActionPerformed.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        subtractActionPerformedActionPerformed.setText("Subtract");
        subtractActionPerformedActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractActionPerformedActionPerformedActionPerformed(evt);
            }
        });

        multiplyActionPerformedActionPerformed.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        multiplyActionPerformedActionPerformed.setText("Multiply");
        multiplyActionPerformedActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformedActionPerformedActionPerformed(evt);
            }
        });

        divideActionPerformedActionPerformed.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        divideActionPerformedActionPerformed.setText("Divide");
        divideActionPerformedActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformedActionPerformedActionPerformed(evt);
            }
        });

        potencyActionPerformedActionPerformed.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        potencyActionPerformedActionPerformed.setText("Potency");
        potencyActionPerformedActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potencyActionPerformedActionPerformedActionPerformed(evt);
            }
        });

        clearActionPerformedActionPerformed.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        clearActionPerformedActionPerformed.setText("Clear numbers");
        clearActionPerformedActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformedActionPerformedActionPerformed(evt);
            }
        });

        updateHistoryActionPerformedActionPerformed.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        updateHistoryActionPerformedActionPerformed.setText("Update history");
        updateHistoryActionPerformedActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateHistoryActionPerformedActionPerformedActionPerformed(evt);
            }
        });

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Number 1");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Number 2");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Result");

        jList1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jList1.setEnabled(false);
        jScrollPane1.setViewportView(jList1);

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearActionPerformedActionPerformed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(potencyActionPerformedActionPerformed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(multiplyActionPerformedActionPerformed, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(addActionPerformedActionPerformed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subtractActionPerformedActionPerformed, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(divideActionPerformedActionPerformed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateHistoryActionPerformedActionPerformed, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateHistoryActionPerformedActionPerformed))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addActionPerformedActionPerformed)
                            .addComponent(subtractActionPerformedActionPerformed))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(divideActionPerformedActionPerformed)
                            .addComponent(multiplyActionPerformedActionPerformed))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(potencyActionPerformedActionPerformed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearActionPerformedActionPerformed))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformedActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformedActionPerformedActionPerformed
        // TODO add your handling code here:
        try {
            double number1 = Double.parseDouble(jTextField1.getText());
            double number2 = Double.parseDouble(jTextField2.getText());
            double result = calculatorController.add(number1, number2);
            jTextField3.setText(String.valueOf(result));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addActionPerformedActionPerformedActionPerformed

    private void subtractActionPerformedActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractActionPerformedActionPerformedActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        try {
            double number1 = Double.parseDouble(jTextField1.getText());
            double number2 = Double.parseDouble(jTextField2.getText());
            double result = calculatorController.multiply(number1, number2);
            jTextField3.setText(String.valueOf(result));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_subtractActionPerformedActionPerformedActionPerformed

    private void multiplyActionPerformedActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformedActionPerformedActionPerformed
        // TODO add your handling code here:
        try {
            double number1 = Double.parseDouble(jTextField1.getText());
            double number2 = Double.parseDouble(jTextField2.getText());
            double result = calculatorController.multiply(number1, number2);
            jTextField3.setText(String.valueOf(result));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_multiplyActionPerformedActionPerformedActionPerformed

    private void divideActionPerformedActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformedActionPerformedActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        try {
            double number1 = Double.parseDouble(jTextField1.getText());
            double number2 = Double.parseDouble(jTextField2.getText());
            double result = calculatorController.divide(number1, number2);
            jTextField3.setText(String.valueOf(result));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_divideActionPerformedActionPerformedActionPerformed

    private void potencyActionPerformedActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potencyActionPerformedActionPerformedActionPerformed
// TODO add your handling code here:
         try {
            double number1 = Double.parseDouble(jTextField1.getText());
            double number2 = Double.parseDouble(jTextField2.getText());
            double result = calculatorController.potency(number1, number2);
            jTextField3.setText(String.valueOf(result));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_potencyActionPerformedActionPerformedActionPerformed

    private void clearActionPerformedActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformedActionPerformedActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }//GEN-LAST:event_clearActionPerformedActionPerformedActionPerformed

    private void updateHistoryActionPerformedActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateHistoryActionPerformedActionPerformedActionPerformed
        // TODO add your handling code here:
        // Obtiene el historial de operaciones
        List<Operation> operationHistory = this.history.getOperations();

        // Crea una nueva lista para almacenar las operaciones
        ArrayList<Operation> reversedHistory = new ArrayList<>(operationHistory);
        Collections.reverse(reversedHistory);

        // Crea un modelo para la lista
        // Crea un modelo para la lista
        DefaultListModel<String> model = new DefaultListModel<>();

// Agrega las operaciones al modelo
        for (Operation operation : reversedHistory) {
            model.addElement(operation.toString()); // Convierte Operation a String
        }

// Asigna el modelo a la lista
        jList1.setModel(model);

    }//GEN-LAST:event_updateHistoryActionPerformedActionPerformedActionPerformed
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
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addActionPerformedActionPerformed;
    private javax.swing.JButton clearActionPerformedActionPerformed;
    private javax.swing.JButton divideActionPerformedActionPerformed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton multiplyActionPerformedActionPerformed;
    private javax.swing.JButton potencyActionPerformedActionPerformed;
    private javax.swing.JButton subtractActionPerformedActionPerformed;
    private javax.swing.JButton updateHistoryActionPerformedActionPerformed;
    // End of variables declaration//GEN-END:variables
}
