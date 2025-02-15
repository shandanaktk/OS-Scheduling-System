/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schedulingsoftware;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shano
 */
public class fcfs extends javax.swing.JFrame {

    private DefaultTableModel tm;  // move this declaration to the class level
    private int processCounter = 1; // move this declaration to the class level
    public fcfs() {
        
        initComponents();
        this.tm = (DefaultTableModel)ptable.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ptable = new javax.swing.JTable();
        at = new javax.swing.JTextField();
        bt = new javax.swing.JTextField();
        next = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        wt = new javax.swing.JTextField();
        tt = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 611, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Details of Processes:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        ptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process", "Arrival Time", "Burst Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ptable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 427, 103));
        getContentPane().add(at, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 70, -1));

        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });
        getContentPane().add(bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 70, -1));

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Arrival Time:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Burst Time:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Average Waiting Time:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Average Turnaround Time:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, -1, -1));

        wt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wtActionPerformed(evt);
            }
        });
        getContentPane().add(wt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 118, -1));
        getContentPane().add(tt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 117, -1));

        calculate.setText("Apply First Come First Serve Algorithm");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        getContentPane().add(calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 427, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shano\\Documents\\NetBeansProjects\\SchedulingSoftware\\build\\classes\\schedulingsoftware\\icons\\fcfs.gif")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
            setVisible(false);
            dashboard su = new dashboard();
            su.setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

           
    private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btActionPerformed
   
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
         
        String arrivalTime = at.getText();
        String burstTime = bt.getText();
        
        if (arrivalTime.isEmpty() || burstTime.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter both arrival time and burst time.");
            return;
        }
        
        tm.addRow(new Object[] { "Process " + processCounter++, arrivalTime, burstTime });

        at.setText("");
        bt.setText("");
            
    }//GEN-LAST:event_nextActionPerformed

    private void wtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wtActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
int n = tm.getRowCount(); // Number of processes
    int[] arrivalTime = new int[n];
    int[] burstTime = new int[n];
    int[] waitingTime = new int[n];
    int[] turnaroundTime = new int[n];
    int[] processId = new int[n];

    // Extract arrival time and burst time from the table
    for (int i = 0; i < n; i++) {
        arrivalTime[i] = Integer.parseInt(tm.getValueAt(i, 1).toString());
        burstTime[i] = Integer.parseInt(tm.getValueAt(i, 2).toString());
        processId[i] = i; // Save original index to identify the process later
    }

    // Sort processes by arrival time
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - 1 - i; j++) {
            if (arrivalTime[j] > arrivalTime[j + 1]) {
                // Swap arrival time
                int temp = arrivalTime[j];
                arrivalTime[j] = arrivalTime[j + 1];
                arrivalTime[j + 1] = temp;
                
                // Swap burst time
                temp = burstTime[j];
                burstTime[j] = burstTime[j + 1];
                burstTime[j + 1] = temp;

                // Swap process ID
                temp = processId[j];
                processId[j] = processId[j + 1];
                processId[j + 1] = temp;
            }
        }
    }

    // Calculate waiting time and turnaround time
    int totalWaitingTime = 0;
    int totalTurnaroundTime = 0;
    int currentTime = 0; // Current time in the CPU
    for (int i = 0; i < n; i++) {
        waitingTime[i] = Math.max(0, currentTime - arrivalTime[i]);
        turnaroundTime[i] = waitingTime[i] + burstTime[i];
        currentTime += burstTime[i];
        totalWaitingTime += waitingTime[i];
        totalTurnaroundTime += turnaroundTime[i];
    }

    // Calculate average waiting time and average turnaround time
    double avgWaitingTime = (double) totalWaitingTime / n;
    double avgTurnaroundTime = (double) totalTurnaroundTime / n;

    // Display average waiting time and average turnaround time
    wt.setText(String.format("%.2f", avgWaitingTime));
    tt.setText(String.format("%.2f", avgTurnaroundTime));

    // Collect burst times and process IDs for Gantt Chart
    List<Integer> burstTimes = new ArrayList<>();
    List<Integer> processIds = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        processIds.add(processId[i] + 1); // Adjusting process ID for display
        burstTimes.add(burstTime[i]); // Assuming Burst Time is in the third column
    }

    // Display Gantt Chart
    GanttChart ganttChart = new GanttChart(burstTimes, processIds);
    ganttChart.setVisible(true);
    }//GEN-LAST:event_calculateActionPerformed

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
            java.util.logging.Logger.getLogger(fcfs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fcfs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fcfs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fcfs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fcfs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField at;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField bt;
    private javax.swing.JButton calculate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton next;
    private javax.swing.JTable ptable;
    private javax.swing.JTextField tt;
    private javax.swing.JTextField wt;
    // End of variables declaration//GEN-END:variables
}
