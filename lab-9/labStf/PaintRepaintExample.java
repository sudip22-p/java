import java.awt.*;
import java.awt.event.*;
public class PaintRepaintExample extends Frame implements ActionListener{
    private int x = 90;
    private int y = 90;
    Button b;
    public PaintRepaintExample() {
        add(b=new Button("move"));
        b.addActionListener(this);
        setSize(500, 500);
        b.setBounds(50, 50, 50, 20);
        setLayout(null);
        setTitle("Paint & Repaint Eg");
    }
    public void actionPerformed(ActionEvent e){
        moveRectangle();
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
        new PaintRepaintExample().setVisible(true);
    }
}
