package BarDiagram;
import java.awt.*;
public class BarDiagramAWT extends Frame {
    private int java = 20;
    private int php = 35;
    private int python = 30;
    private int goLang=100-(20+35+30);

    public BarDiagramAWT() {
        setTitle("Bar Diagram");
        setSize(500, 400);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawBar(g, "Java", java, 100, Color.BLUE, 50);
        drawBar(g, "PHP", php, 100, Color.RED, 150);
        drawBar(g, "Python", python, 100, Color.GREEN, 250);
        drawBar(g, "GoLang", goLang, 100, Color.CYAN, 350);
    }

    private void drawBar(Graphics g, String label, int value, int total, Color color, int x) {
        int maxHeight = 250; // Maximum height for the bars
        int barHeight = (int) ((double) value / total * maxHeight);
        int barY = maxHeight - barHeight;
    
        g.setColor(color);
        g.fillRect(x, barY, 100, barHeight);
        g.setColor(Color.PINK);
        g.drawString(label, x, maxHeight+20);
    }
    

    public static void main(String[] args) {
        new BarDiagramAWT();
    }
}