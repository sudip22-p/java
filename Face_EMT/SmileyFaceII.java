import java.awt.*;
public class SmileyFaceII extends Frame{
    public SmileyFaceII(){
        setSize(400,400);
        setBackground(Color.WHITE);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLACK);//border
        g.fillOval(40, 40, 220, 220);

        g.setColor(Color.YELLOW);//face
        g.fillOval(50, 50, 200, 200);

        g.setColor(Color.BLACK);//left-eye
        g.fillOval(85, 105, 20, 50);

        g.setColor(Color.BLACK);//right-eye
        g.fillOval(195, 105, 20, 50);

        
        g.setColor(Color.BLACK);//nose
        g.fillOval(145, 160, 10, 10);


        g.setColor(Color.BLACK);//mouth
        // g.fillArc(90, 140, 120, 60, 180, 180);
        
        g.fillArc(90, 170, 120, 60, 0, -180);
    }
    public static void main(String[] args) {
        new SmileyFaceII().setVisible(true);
    }
}