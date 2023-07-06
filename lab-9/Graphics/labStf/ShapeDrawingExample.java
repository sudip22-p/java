import javax.swing.*;
import java.awt.*;

public class ShapeDrawingExample extends JFrame {
    
    public ShapeDrawingExample() {
        setTitle("Shape Drawing Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // Draw a line
        g2d.setColor(Color.RED);
        g2d.drawLine(50, 50, 200, 50);
        
        // Draw a rectangle
        g2d.setColor(Color.BLUE);
        g2d.drawRect(50, 100, 150, 100);
        
        // Draw an ellipse
        g2d.setColor(Color.GREEN);
        g2d.drawOval(50, 250, 200, 100);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ShapeDrawingExample example = new ShapeDrawingExample();
            example.setVisible(true);
        });
    }
}
