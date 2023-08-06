import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class XORPaintingExample extends JFrame {
    private int lastX, lastY;

    public XORPaintingExample() {
        setTitle("XOR Painting Mode Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                Graphics g = getGraphics();
                g.setXORMode(Color.GREEN);
                g.drawLine(lastX, lastY, x, y);
                lastX = x;
                lastY = y;
            }
        });

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                lastX = e.getX();
                lastY = e.getY();
            }
        });
    }

    public static void main(String[] args) {
        new XORPaintingExample().setVisible(true);
    }
}
