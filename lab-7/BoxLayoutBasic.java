import java.awt.*;
import javax.swing.*;

public class BoxLayoutBasic extends Frame {
    public BoxLayoutBasic(String title) {
        super(title);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        // setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));
    }

    public static void main(String[] args) {
        BoxLayoutBasic blb = new BoxLayoutBasic("Box Layout Basic ");
        blb.setSize(300, 200);
        blb.setVisible(true);
    }
}
