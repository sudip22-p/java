package Face_EMT;
import java.awt.*;
public class SurpriseFace extends Frame{
    public SurpriseFace(){
        setSize(400,400);
        setBackground(Color.BLACK);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.GREEN);
        g.fillOval(50, 50, 200, 200);
        g.setColor(Color.BLACK);
        g.fillOval(85, 105, 15, 25);
        g.setColor(Color.BLACK);
        g.fillOval(195, 105, 15, 25);
        g.setColor(Color.BLACK);
        g.fillOval(130, 180, 30, 30);
    }
    public static void main(String[] args) {
        new SurpriseFace().setVisible(true);
    }
}