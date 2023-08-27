import java.awt.*;

public class PieChart extends Panel {
    private int[] data;
    private Color[] colors;

    public PieChart(int[] data, Color[] colors) {
        this.data = data;
        this.colors = colors;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }

        int startAngle = 0;
        for (int i = 0; i < data.length; i++) {
            int angle = (int) (data[i] * 360.0 / total);
            g.setColor(colors[i]);
            g.fillArc(0, 0, 100, 100, startAngle, angle);
            startAngle += angle;
        }
    }

    public static void main(String[] args) {
        int[] data = {20, 15, 10, 15, 20};
        Color[] colors = {Color.red, Color.green, Color.blue, Color.orange, Color.yellow};

        PieChart pieChart = new PieChart(data, colors);
        Frame frame = new Frame("Pie Chart");
        frame.add(pieChart);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
