package Face_EMT;
import java.awt.*;
public class AngryFace extends Frame{
    public AngryFace(){
        setSize(400,400);
        setBackground(Color.BLACK);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.GREEN);
        g.fillOval(50, 50, 200, 200);
        g.setColor(Color.BLACK);
        g.fillOval(90, 110, 30, 15);
        g.setColor(Color.BLACK);
        g.fillOval(190, 110, 30, 15);
        g.setColor(Color.BLACK);
        g.fillOval(98, 180, 110, 25);
        g.setColor(Color.WHITE);
        g.fillRect(115, 182, 5, 20);
        g.setColor(Color.WHITE);
        g.fillRect(145, 183, 5, 20);
        g.setColor(Color.WHITE);
        g.fillRect(125, 183, 5, 20);
        g.setColor(Color.WHITE);
        g.fillRect(155, 183, 5, 20);
        g.setColor(Color.WHITE);
        g.fillRect(135, 183, 5, 20);
        g.setColor(Color.WHITE);
        g.fillRect(165, 183, 5, 20);
        g.setColor(Color.WHITE);
        g.fillRect(175, 183, 5, 20);
        g.setColor(Color.WHITE);
        g.fillRect(185, 182, 5, 20);
    }
    public static void main(String[] args) {
        new AngryFace().setVisible(true);
    }
}