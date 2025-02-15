/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schedulingsoftware;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shano
 */
public class rr extends javax.swing.JFrame {
   private DefaultTableModel tm;  // move this declaration to the class level
    private int processCounter = 1; // move this declaration to the class level
    /**
     * Creates new form rr
     */
    public rr() {
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
        bt = new javax.swing.JTextField();
        next = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        wt = new javax.swing.JTextField();
        tt = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ptable = new javax.swing.JTable();
        at = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tq = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(300, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 599, -1, -1));

        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });
        getContentPane().add(bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 218, 70, -1));

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 218, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Arrival Time:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 221, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Burst Time:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 221, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Average Waiting Time:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 565, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Average Turnaround Time:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 602, -1, -1));

        wt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wtActionPerformed(evt);
            }
        });
        getContentPane().add(wt, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 565, 118, -1));
        getContentPane().add(tt, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 599, 117, -1));

        calculate.setText("Apply Round Robin Algorithm");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        getContentPane().add(calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 510, 427, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Details of Processes:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 196, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 259, 427, 103));
        getContentPane().add(at, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 218, 70, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Enter Time Quantum:");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 479, -1, -1));
        getContentPane().add(tq, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 476, 103, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shano\\Documents\\NetBeansProjects\\SchedulingSoftware\\build\\classes\\schedulingsoftware\\icons\\rr.gif")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
    int n = tm.getRowCount();
    int[] arrivalTime = new int[n];
    int[] burstTime = new int[n];
    int[] remainingBurstTime = new int[n];
    int[] waitingTime = new int[n];
    int[] turnaroundTime = new int[n];

    int timeQuantum = Integer.parseInt(tq.getText());

    for (int i = 0; i < n; i++) {
        arrivalTime[i] = Integer.parseInt(tm.getValueAt(i, 1).toString());
        burstTime[i] = Integer.parseInt(tm.getValueAt(i, 2).toString());
        remainingBurstTime[i] = burstTime[i];
    }

    List<Integer> burstTimes = new ArrayList<>();
    List<Integer> processIds = new ArrayList<>();

    Queue<Integer> queue = new LinkedList<>();
    int currentTime = 0;
    int completed = 0;

    while (completed != n) {
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arrivalTime[i] <= currentTime && remainingBurstTime[i] > 0 && !queue.contains(i)) {
                queue.add(i);
                found = true;
            }
        }

        if (!found) {
            currentTime++;
            continue;
        }

        while (!queue.isEmpty()) {
            int i = queue.poll();
            if (remainingBurstTime[i] > timeQuantum) {
                burstTimes.add(timeQuantum);
                processIds.add(i + 1);

                currentTime += timeQuantum;
                remainingBurstTime[i] -= timeQuantum;
                for (int j = 0; j < n; j++) {
                    if (arrivalTime[j] <= currentTime && remainingBurstTime[j] > 0 && !queue.contains(j) && i != j) {
                        queue.add(j);
                    }
                }
                queue.add(i);
            } else {
                burstTimes.add(remainingBurstTime[i]);
                processIds.add(i + 1);

                currentTime += remainingBurstTime[i];
                waitingTime[i] = currentTime - arrivalTime[i] - burstTime[i];
                turnaroundTime[i] = currentTime - arrivalTime[i];
                remainingBurstTime[i] = 0;
                completed++;
            }
        }
    }

    int totalWaitingTime = 0;
    int totalTurnaroundTime = 0;
    for (int i = 0; i < n; i++) {
        totalWaitingTime += waitingTime[i];
        totalTurnaroundTime += turnaroundTime[i];
    }

    double avgWaitingTime = (double) totalWaitingTime / n;
    double avgTurnaroundTime = (double) totalTurnaroundTime / n;

    wt.setText(String.format("%.2f", avgWaitingTime));
    tt.setText(String.format("%.2f", avgTurnaroundTime));

    GanttChartrr ganttChart = new GanttChartrr(burstTimes, processIds);
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
            java.util.logging.Logger.getLogger(rr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField at;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField bt;
    private javax.swing.JButton calculate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton next;
    private javax.swing.JTable ptable;
    private javax.swing.JTextField tq;
    private javax.swing.JTextField tt;
    private javax.swing.JTextField wt;
    // End of variables declaration//GEN-END:variables
}
