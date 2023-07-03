import java.awt.*;
public class FlowLayoutExample extends Frame{
    public FlowLayoutExample(String title){
        super(title);
        setLayout(new FlowLayout());
        Button b1=new Button ("1");
        add(b1);
        Button b2=new Button ("2");
        add(b2);
        Button b3=new Button ("3");
        add(b3);
        Button b4=new Button ("4");
        add(b4);
        Button b5=new Button ("5");
        add(b5);
        Button b6=new Button ("6");
        add(b6);
        Button b7=new Button ("7");
        add(b7);
        Button b8=new Button ("8");
        add(b8);
    }
    public static void main(String[] args) {
        FlowLayoutExample screen=new FlowLayoutExample("Flow Layout Example");
        screen.setSize(150,500);
        screen.setVisible(true);
    }

}