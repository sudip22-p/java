import java.awt.*;
import java.awt.event.*;
public class KeyPress extends Frame{
    Label label;
    TextField field;
    public static void main(String[] args) {
        KeyPress k=new KeyPress("Key Press Event Frame");
        k.setVisible(true);
    }
    public KeyPress(String s){
        super(s);
        Panel panel=new Panel();
        label=new Label();
        field=new TextField(20);
        field.addKeyListener(new MyKeyListener());
        add(label,BorderLayout.NORTH);
        panel.add(field,BorderLayout.CENTER);
        add(panel,BorderLayout.CENTER);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        setSize(400, 400);
        setVisible(true);
    }
    public class MyKeyListener extends KeyAdapter{
        public void keyPressed(KeyEvent ke){
            char i=ke.getKeyChar();
            String str=Character.toString(i);
            label.setText(str);
        }
    }
}
