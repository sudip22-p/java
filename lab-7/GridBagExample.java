import java.awt.*;
import javax.swing.*;
public class GridBagExample {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JPanel p=new JPanel();
        p.setLayout(new GridBagLayout());
        p.add(new JLabel("JAVA"));
        p.add(new JLabel("Programming"));
        p.add(new JLabel("Year 1"));
        p.add(new JButton("Button1"));
        p.add(new JButton("Button2"));
        p.add(new JTextField("Pokhara Gandaki"));
        p.add(new JTextField("2"));
        p.add(new JTextField("3"));
        f.getContentPane().add(p);
        f.setSize(300,200);
        f.setVisible(true);
    }
}
