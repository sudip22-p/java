import javax.swing.*;
import java.awt.event.*;
public class MyEvent extends JFrame{
    JButton b1;
    public static void main(String[] args) {
        MyEvent event=new MyEvent("Btn Clk Demo!!");
        event.setVisible(true);
    }
    public MyEvent(String s){
        super(s);
        b1=new JButton("Click me:)");
        getContentPane().add(b1);
        ButtonListener listen =new ButtonListener();
        b1.addActionListener(listen);
        setSize(300,300);
    }
    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JButton source =(JButton)e.getSource();
            source.setText("Button Clicked!!");
        }
    }
}
