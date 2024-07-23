package schedulingsoftware;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GanttChartps extends JFrame {
    private List<Integer> timeline;  // List to represent the timeline of process executions
    private List<Integer> processIds;  // List of process IDs in the order they appear on the timeline

    public GanttChartps(List<Integer> timeline, List<Integer> processIds) {
        this.timeline = timeline;
        this.processIds = processIds;
        initUI();
    }

    private void initUI() {
        setTitle("Gantt Chart - Preemptive Priority Scheduling");
        setSize(800, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        GanttChartPanel chartPanel = new GanttChartPanel(timeline, processIds);
        add(chartPanel);
    }

    public class GanttChartPanel extends JPanel {
        private List<Integer> timeline;
        private List<Integer> processIds;

        public GanttChartPanel(List<Integer> timeline, List<Integer> processIds) {
            this.timeline = timeline;
            this.processIds = processIds;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawGanttChart(g);
        }

        private void drawGanttChart(Graphics g) {
            int x = 35;
            int y = 35;
            int height = 25;
            int unitWidth = 15;  // Width for each time unit
            int prevProcess = -1;

            for (int i = 0; i < timeline.size(); i++) {
                int processId = processIds.get(i);
                int width = unitWidth;
                
                g.setColor(getColor(processId));
                g.fillRect(x, y, width, height);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, width, height);

                if (processId != prevProcess) {
                    g.drawString("P" + processId, x + width / 2 - 10, y + height / 2 + 5);
                }

                g.drawString(String.valueOf(i), x, y + height + 20);
                x += width;
                prevProcess = processId;
            }
            g.drawString(String.valueOf(timeline.size()), x, y + height + 20);
        }

        private Color getColor(int processId) {
            Color[] colors = { Color.CYAN, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.PINK, Color.LIGHT_GRAY, Color.MAGENTA };
            return colors[(processId - 1) % colors.length];
        }
    }

    public static void main(String[] args) {
        // Test data
        List<Integer> timeline = List.of(1, 1, 2, 2, 3, 1, 1, 4, 4, 4, 4);
        List<Integer> processIds = List.of(1, 1, 2, 2, 3, 1, 1, 4, 4, 4, 4);
        GanttChartps ganttChart = new GanttChartps(timeline, processIds);
        ganttChart.setVisible(true);
    }
}