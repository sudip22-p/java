import java.awt.event.*;
import java.awt.*;
public class KeyListenerExample extends Frame implements KeyListener{
    Label l;
    TextArea area;
    KeyListenerExample(String s){
        super(s);
        l=new Label();
        l.setBounds(100, 40, 100, 20);
        area=new TextArea();
        area.setBounds(10, 70, 300, 300);
        add(l);
        add(area);
        area.addKeyListener(this);
        setSize(500, 400);
        setLayout(null);
    }
    public void keyPressed(KeyEvent k){
        l.setText("PRESSED");
        l.setBackground(Color.green);
    }
    public void keyReleased(KeyEvent k){
        l.setText("RELEASED");
        l.setBackground(Color.blue);
    }
    public void keyTyped(KeyEvent k){
        // l.setText("TYPED");
        // l.setBackground(Color.red);
    }
    public static void main(String[] args) {
        KeyListenerExample eg=new KeyListenerExample("Key Listener Demo!");
        eg.setVisible(true);
    }
}