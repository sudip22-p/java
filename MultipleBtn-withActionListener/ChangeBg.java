import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ChangeBg extends JFrame implements ActionListener{
    JButton greenBtn;
    JButton blueBtn;
    public static void main(String[] args) {
        ChangeBg event=new ChangeBg();
        event.setVisible(true);
    }
    public ChangeBg(){
        setSize(300,300);
        greenBtn=new JButton("Green");
        blueBtn=new JButton("Blue");


        getContentPane().setBackground(Color.YELLOW);
        getContentPane().setLayout(new FlowLayout()); 

        getContentPane().add(blueBtn);
        blueBtn.addActionListener(this);

        getContentPane().add(greenBtn);
        greenBtn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        JButton source =(JButton)e.getSource();
        if(source==greenBtn){
            getContentPane().setBackground(Color.GREEN);
        }else if(source==blueBtn){
            getContentPane().setBackground(Color.BLUE);
        }else{
            getContentPane().setBackground(Color.RED);
        }
    }
}