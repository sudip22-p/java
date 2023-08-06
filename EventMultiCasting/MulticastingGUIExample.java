import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MulticastingGUIExample{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Multicasting Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        JPanel panel = new JPanel();
        JButton button = new JButton("BTN");
        // Add the first listener to change the button text
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("BTN CLICKED");
            }
        });

        // Add the second listener to change the button background color
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setBackground(Color.RED);
            }
        });

        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
