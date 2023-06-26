import java.awt.*;
import java.awt.event.*;

public class LabelDemo extends Frame {
    private Label Label1;
    private Label Label2;
    private Label Label3;
    private Label Label4;
    
    public LabelDemo() {
        // Instantiation
        Label1 = new Label("A Simple Label!");
        Label2 = new Label("A Label with LEFT alignment!!", Label.LEFT);
        Label3 = new Label("A Label with CENTER alignment!!!", Label.CENTER);
        Label4 = new Label("A Label with RIGHT alignment!!!", Label.RIGHT);
        
        // Location
        setLayout(new GridLayout(7, 1));
        add(Label1);
        add(Label2);
        add(Label3);
        add(Label4);
        
        // Decoration
        Label1.setBackground(Color.yellow);
        Label2.setForeground(Color.blue);
        Label3.setBackground(Color.red);
        Label4.setForeground(Color.green);
        
        // Add window listener
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Close the application
            }
        });
    }
    
    public static void main(String[] args) {
        LabelDemo id = new LabelDemo();
        id.setVisible(true);
        id.setSize(400, 300);
    }
}