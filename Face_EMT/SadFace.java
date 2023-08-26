
import java.awt.*;
public class SadFace extends Frame{
    public SadFace(){
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
        g.fillArc(90, 160, 120, 60, -180, -180);
    }
    public static void main(String[] args) {
        new SadFace().setVisible(true);
    }
}