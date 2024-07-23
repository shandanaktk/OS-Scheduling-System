/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schedulingsoftware;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Shano
 */
public class mq extends javax.swing.JFrame {

    /**
     * Creates new form mq
     */
    private DefaultTableModel tm4;
    private int processCounter = 1;
    private List<Process> processes = new ArrayList<>();
    private Map<Integer, String> queueAlgorithms = new HashMap<>();
    private Map<Integer, Integer> rrQuantumTimes = new HashMap<>();

    public mq() {
        initComponents();
        this.tm4 = (DefaultTableModel) ptable4.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

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
        bt = new javax.swing.JTextField();
        next = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        wt4 = new javax.swing.JTextField();
        tt4 = new javax.swing.JTextField();
        calculate1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ptable4 = new javax.swing.JTable();
        at4 = new javax.swing.JTextField();
        bt4 = new javax.swing.JTextField();
        next1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        qn4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel4.setText("Burst Time:");

        jLabel5.setText("Average Waiting Time:");

        jLabel6.setText("Average Turnaround Time:");

        wt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wtActionPerformed(evt);
            }
        });

        calculate.setText("Apply First Come First Serve Algorithm");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Details of Processes:");

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

        at.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atActionPerformed(evt);
            }
        });

        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jLabel3.setText("Arrival Time:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Multilevel Queue");

        jLabel7.setText("Burst Time:");

        jLabel8.setText("Average Waiting Time:");

        jLabel9.setText("Average Turnaround Time:");

        wt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wt4ActionPerformed(evt);
            }
        });

        calculate1.setText("Apply Multilevel Queue (MLQ) Algorithm");
        calculate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculate1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Enter Details of Processes:");

        ptable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process", "Arrival Time", "Burst Time", "Queue Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ptable4);

        at4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                at4ActionPerformed(evt);
            }
        });

        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        next1.setText("Next");
        next1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Arrival Time:");

        jLabel12.setText("Queue Number:");

        qn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qn4ActionPerformed(evt);
            }
        });

        jButton1.setText("Enter Scheduling Algorithm For Each Queue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backbtn)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(wt4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tt4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(at4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qn4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(next1))
                    .addComponent(calculate1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(at4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(qn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(next1))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(calculate1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(wt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(backbtn)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>                        

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        setVisible(false);
        dashboard su = new dashboard();
        su.setVisible(true);
    }                                       

    private void wtActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        
    }                                         

    private void atActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void btActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:

   
    }                                    

    private void wt4ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void calculate1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        processes.clear();
    
    // Lists to store burst times, process IDs, and queue levels for Gantt Chart
    List<Integer> burstTimes = new ArrayList<>();
    List<Integer> processIds = new ArrayList<>();
    List<Integer> queueLevels = new ArrayList<>();
    
    // Read data from the table model and create process objects
    for (int i = 0; i < tm4.getRowCount(); i++) {
        String arrivalTime = tm4.getValueAt(i, 1).toString();
        String burstTime = tm4.getValueAt(i, 2).toString();
        String queueNumber = tm4.getValueAt(i, 3).toString();

        int arrTime = Integer.parseInt(arrivalTime);
        int burTime = Integer.parseInt(burstTime);
        int queueNum = Integer.parseInt(queueNumber);

        processes.add(new Process("Process " + (i + 1), arrTime, burTime, queueNum));
    }

    // Apply multilevel queue scheduling
    applyMultilevelQueueScheduling();

    // Populate lists for Gantt Chart
    for (Process process : processes) {
        burstTimes.add(process.getBurstTime());
        processIds.add(Integer.parseInt(process.getName().replace("Process ", "")));
        queueLevels.add(process.getQueueNumber());
    }

    // Calculate and display average waiting time and turnaround time
    double avgWaitingTime = calculateAverageWaitingTime();
    double avgTurnaroundTime = calculateAverageTurnaroundTime();

    wt4.setText(String.valueOf(avgWaitingTime));
    tt4.setText(String.valueOf(avgTurnaroundTime));

    // Display Gantt Chart
    GanttChartmq ganttChart = new GanttChartmq(burstTimes, processIds, queueLevels);
    ganttChart.setVisible(true);
    }                                          

    private void applyMultilevelQueueScheduling() {
    processes.sort(Comparator.comparingInt(Process::getQueueNumber).thenComparingInt(Process::getArrivalTime));

    int currentTime = 0;
    int previousQueueNumber = -1;

    for (Process process : processes) {
        if (process.getQueueNumber() != previousQueueNumber) {
            currentTime = 0;
            previousQueueNumber = process.getQueueNumber();
        }

        switch (process.getQueueNumber()) {
            case 1:
                scheduleFCFS(process, currentTime);
                break;
            case 2:
                scheduleSJF(process, currentTime);
                break;
            case 3:
                scheduleRR(process, currentTime);
                break;
            // Add more cases for additional queues if needed
            default:
                break;
        }

        currentTime = process.getFinishTime();
    }
   }
   

    private void scheduleFCFS(Process process, int currentTime) {
        process.setStartTime(Math.max(currentTime, process.getArrivalTime()));
        process.setFinishTime(process.getStartTime() + process.getBurstTime());
        process.setWaitingTime(process.getStartTime() - process.getArrivalTime());
        process.setTurnaroundTime(process.getFinishTime() - process.getArrivalTime());
    }

    private void scheduleSJF(Process process, int currentTime) {
        process.setStartTime(Math.max(currentTime, process.getArrivalTime()));
        process.setFinishTime(process.getStartTime() + process.getBurstTime());
        process.setWaitingTime(process.getStartTime() - process.getArrivalTime());
        process.setTurnaroundTime(process.getFinishTime() - process.getArrivalTime());
    }

    private void scheduleRR(Process process, int currentTime) {
    int remainingBurstTime = process.getBurstTime();
    int timeQuantum = quantumTime; // Ensure quantumTime is properly set

    process.setStartTime(Math.max(currentTime, process.getArrivalTime()));

    while (remainingBurstTime > 0) {
        if (remainingBurstTime <= timeQuantum) {
            currentTime += remainingBurstTime;
            remainingBurstTime = 0;
        } else {
            currentTime += timeQuantum;
            remainingBurstTime -= timeQuantum;
        }
    }

    process.setFinishTime(currentTime);
    process.setWaitingTime(process.getStartTime() - process.getArrivalTime());
    process.setTurnaroundTime(process.getFinishTime() - process.getArrivalTime());
}


    private double calculateAverageWaitingTime() {
        double totalWaitingTime = 0;
        for (Process process : processes) {
            totalWaitingTime += process.getWaitingTime();
        }
        return totalWaitingTime / processes.size();
    }

    private double calculateAverageTurnaroundTime() {
        double totalTurnaroundTime = 0;
        for (Process process : processes) {
            totalTurnaroundTime += process.getTurnaroundTime();
        }
        return totalTurnaroundTime / processes.size();
    }

private static class Process {
    private String name;
    private int arrivalTime;
    private int burstTime;
    private int queueNumber;
    private int startTime;
    private int finishTime;
    private int waitingTime;
    private int turnaroundTime;

    public Process(String name, int arrivalTime, int burstTime, int queueNumber) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.queueNumber = queueNumber;
    }

    // Getters and setters for all fields
    public String getName() { return name; }
    public int getArrivalTime() { return arrivalTime; }
    public int getBurstTime() { return burstTime; }
    public int getQueueNumber() { return queueNumber; }
    public int getStartTime() { return startTime; }
    public void setStartTime(int startTime) { this.startTime = startTime; }
    public int getFinishTime() { return finishTime; }
    public void setFinishTime(int finishTime) { this.finishTime = finishTime; }
    public int getWaitingTime() { return waitingTime; }
    public void setWaitingTime(int waitingTime) { this.waitingTime = waitingTime; }
    public int getTurnaroundTime() { return turnaroundTime; }
    public void setTurnaroundTime(int turnaroundTime) { this.turnaroundTime = turnaroundTime; }
}


    private void at4ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void next1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:

       String arrivalTime = at4.getText();
        String burstTime = bt4.getText();
        String queueNumber = qn4.getText();

        if (arrivalTime.isEmpty() || burstTime.isEmpty() || queueNumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all fields.");
            return;
        }

        tm4.addRow(new Object[] { "Process " + processCounter++, arrivalTime, burstTime, queueNumber });

        at4.setText("");
        bt4.setText("");
        qn4.setText("");

    }                                     

    private void qn4ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   
private int quantumTime = 4;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int numQueues = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter number of queues:"));
    for (int i = 1; i <= numQueues; i++) {
        String algo = JOptionPane.showInputDialog(this, "Enter scheduling algorithm for Queue " + i + " (FCFS, SJF, RR):");
        // You can store the scheduling algorithm in a list or map based on your needs
        // Here, I'll just show an example with print statements
        System.out.println("Queue " + i + " Algorithm: " + algo);

        if ("RR".equalsIgnoreCase(algo)) {
            quantumTime = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter time quantum for Queue " + i + ":"));
            System.out.println("Time Quantum for Queue " + i + ": " + quantumTime);
        }
    }
    }                                        

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
            java.util.logging.Logger.getLogger(mq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new mq().setVisible(true));
    }
    

    // Variables declaration - do not modify                     
    private javax.swing.JTextField at;
    private javax.swing.JTextField at4;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField bt;
    private javax.swing.JTextField bt4;
    private javax.swing.JButton calculate;
    private javax.swing.JButton calculate1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton next;
    private javax.swing.JButton next1;
    private javax.swing.JTable ptable;
    private javax.swing.JTable ptable4;
    private javax.swing.JTextField qn4;
    private javax.swing.JTextField tt;
    private javax.swing.JTextField tt4;
    private javax.swing.JTextField wt;
    private javax.swing.JTextField wt4;
    // End of variables declaration                   

}