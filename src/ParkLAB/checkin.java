/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ParkLAB;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class checkin extends javax.swing.JFrame {

    private ArrayList<ArrayList<Object>> tableData;

     
    
    public checkin() {
        initComponents();
    tableData = new ArrayList<>();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        Etime = new javax.swing.JTextField();
        Pnumber = new javax.swing.JTextField();
        javax.swing.JButton btnAdd = new javax.swing.JButton();
        javax.swing.JButton jButton2 = new javax.swing.JButton();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        Vtype = new javax.swing.JTextField();
        Edate = new javax.swing.JTextField();
        javax.swing.JButton btnClear = new javax.swing.JButton();
        javax.swing.JButton btnDelete = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        Tableclient = new javax.swing.JTable();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel1.setText("Plate Number:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("Vehicle Type:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("Entry Time:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        Etime.setBackground(java.awt.SystemColor.control);
        getContentPane().add(Etime, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 322, 160, 30));

        Pnumber.setBackground(java.awt.SystemColor.control);
        getContentPane().add(Pnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 160, 30));

        btnAdd.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnAdd.setText("Check - In");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, -1, 30));

        jButton2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setText("Entry Date:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        Vtype.setBackground(java.awt.SystemColor.control);
        getContentPane().add(Vtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 272, 160, 30));

        Edate.setBackground(java.awt.SystemColor.control);
        getContentPane().add(Edate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 372, 160, 30));

        btnClear.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 90, 30));

        btnDelete.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 90, 30));

        Tableclient.setBackground(java.awt.SystemColor.control);
        Tableclient.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        Tableclient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plate Number", "Vehicle Type", "Entry Time", "Entry Date"
            }
        ));
        jScrollPane1.setViewportView(Tableclient);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 179, 430, 340));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Checkin.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
       try {
            FileOutputStream file = new FileOutputStream("file.bin");
            ObjectOutputStream output = new ObjectOutputStream(file);

            output.writeObject(tableData);

            output.close();
            file.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Home home = new Home();
        home.setVisible(true);
        home.pack();
        home.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
     String plateNumber = Pnumber.getText();
        String carType = Vtype.getText();
        String entryTime = Etime.getText();
        String entryDate = Edate.getText();

        if (plateNumber.isEmpty() || carType.isEmpty() || entryTime.isEmpty() || entryDate.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please Enter All Fields",
                    "Try Again",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            ArrayList<Object> rowData = new ArrayList<>();
            rowData.add(plateNumber);
            rowData.add(carType);
            rowData.add(entryTime);
            rowData.add(entryDate);

            tableData.add(rowData);

            DefaultTableModel model = (DefaultTableModel) Tableclient.getModel();
            model.addRow(new Object[]{plateNumber, carType, entryTime, entryDate});

            Pnumber.setText("");
            Vtype.setText("");
            Etime.setText("");
            Edate.setText("");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       Pnumber.setText("");
            Vtype.setText("");
            Etime.setText("");
            Edate.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = Tableclient.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(this,
                    "Please select your row",
                    "Select Row",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) Tableclient.getModel();
            model.removeRow(row);
            tableData.remove(row);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      try {
            FileOutputStream file = new FileOutputStream("file.bin");
            ObjectOutputStream output = new ObjectOutputStream(file);

            output.writeObject(tableData);

            output.close();
            file.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        try {
            FileInputStream file = new FileInputStream("file.bin");
            ObjectInputStream input = new ObjectInputStream(file);

            tableData = (ArrayList<ArrayList<Object>>) input.readObject();

            input.close();
            file.close();

            DefaultTableModel model = (DefaultTableModel) Tableclient.getModel();
            for (ArrayList<Object> rowData : tableData) {
                model.addRow(rowData.toArray());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

       
  
   
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
            java.util.logging.Logger.getLogger(checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Edate;
    private javax.swing.JTextField Etime;
    private javax.swing.JTextField Pnumber;
    private javax.swing.JTable Tableclient;
    private javax.swing.JTextField Vtype;
    // End of variables declaration//GEN-END:variables
}
