import java.awt.*;
public class BorderLayoutExample extends Frame {
    public BorderLayoutExample(String title){
        super(title);
        add("North", new Button("North"));
        add("South", new Button("South"));
        add("East", new Button("East"));
        add("West", new Button("West"));
        add("Center", new Button("Center"));
    }
    public static void main(String[] args) {
        BorderLayoutExample ble =new BorderLayoutExample("Border Layout Example");
        ble.setSize(300,200);
        ble.setVisible(true);
    }
}
