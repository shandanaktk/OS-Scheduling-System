package schedulingsoftware;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Random;

public class GanttChart extends JFrame {
    private List<Integer> burstTimes;
    private List<Integer> processIds;

    public GanttChart(List<Integer> burstTimes, List<Integer> processIds) {
        this.burstTimes = burstTimes;
        this.processIds = processIds;
        initUI();
    }

   private void initUI() {
    setTitle("Gantt Chart");
    
    // Calculate the total width required for the Gantt chart
    int totalBurstTime = burstTimes.stream().mapToInt(Integer::intValue).sum();
    int scalingFactor = Math.max(1, (getWidth() - 60) / totalBurstTime); // Scale to fit within panel width
    int totalWidth = 0;
    for (int burstTime : burstTimes) {
        totalWidth += burstTime * scalingFactor;
    }

    // Set the minimum width of the JFrame to half of the screen width
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int minWidth = screenSize.width / 2;

    // Set the preferred height of the JFrame based on the number of processes
    int preferredHeight = Math.max(200, processIds.size() * 40); // Base height of 200, increase with number of processes

    // Set the preferred size of the JFrame
    int preferredWidth = Math.max(minWidth, totalWidth + 60); // Limit the width to minWidth and add padding
    setPreferredSize(new Dimension(preferredWidth, preferredHeight)); // Set preferred size

    // Center the JFrame on the screen
    int xPos = (screenSize.width - preferredWidth) / 2;
    int yPos = (screenSize.height - preferredHeight) / 2;
    setLocation(xPos, yPos);
    
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    GanttChartPanel panel = new GanttChartPanel(burstTimes, processIds);
    add(panel);
    pack();
}


    class GanttChartPanel extends JPanel {
        private List<Integer> burstTimes;
        private List<Integer> processIds;
        private final Color[] colors;

        public GanttChartPanel(List<Integer> burstTimes, List<Integer> processIds) {
            this.burstTimes = burstTimes;
            this.processIds = processIds;
            setPreferredSize(new Dimension(800, 200));

            // Generate random colors for each process
            colors = new Color[processIds.size()];
            Random rand = new Random();
            for (int i = 0; i < processIds.size(); i++) {
                colors[i] = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawGanttChart(g);
        }

    private void drawGanttChart(Graphics g) {
    int panelWidth = getWidth() - 60; // Available width in the panel
    int totalBurstTime = burstTimes.stream().mapToInt(Integer::intValue).sum();
    int scalingFactor = Math.max(1, panelWidth / totalBurstTime); // Scale to fit within panel width
    int barHeight = 30; // Height of each bar
    int y = 50; // Y position for the bar
    int time = 0; // Time counter
    int height = 30; // Height of each bar

    // Calculate the total width required for the Gantt chart
    int totalWidth = 0;
    for (int burstTime : burstTimes) {
        totalWidth += burstTime * scalingFactor;
    }

    // Calculate the starting x position to center the Gantt chart
    int x = (getWidth() - totalWidth) / 2;

    // Draw Gantt chart bars and process labels
    for (int i = 0; i < burstTimes.size(); i++) {
        int width = burstTimes.get(i) * scalingFactor; // Scale burst time to width

        // Draw time axis only at the beginning of each block
        if (i == 0) {
            g.drawString("" + time, x, y + height + 20);
        }
        time += burstTimes.get(i);
        FontMetrics fm = g.getFontMetrics();
        g.drawString("" + time, x + width - fm.stringWidth("" + time), y + height + 20);

        // Draw Gantt chart bar
        g.setColor(colors[i]);
        g.fillRect(x, y, width, barHeight);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, barHeight);

        // Draw process ID centered in the block
        String processIdText = "P" + processIds.get(i);
        int textWidth = fm.stringWidth(processIdText);
        int textX = x + (width - textWidth) / 2;
        int textY = y + (barHeight - fm.getHeight()) / 2 + fm.getAscent();
        g.drawString(processIdText, textX, textY);

        // Move to the next position without space
        x += width;
    }
}


    }
}