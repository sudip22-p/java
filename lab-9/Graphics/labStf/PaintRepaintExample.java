import java.awt.*;
public class PaintRepaintExample extends Frame {
    private int x = 90;
    private int y = 90;

    public PaintRepaintExample() {
        setTitle("Paint & Repaint Example");
         
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 50, 50);
    }

    public void moveRectangle() {
        
            
            x += 50;
            y += 50;
            repaint();
        
    }

    public static void main(String[] args) {
        PaintRepaintExample frm = new PaintRepaintExample();
        frm.setSize(200, 200);
        frm.setVisible(true);
        frm.moveRectangle();
    }
}
