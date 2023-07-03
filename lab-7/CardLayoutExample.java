import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CardLayoutExample extends JFrame implements ActionListener {
    CardLayout card;
    JButton b1,b2,b3,b4;
    Container c;
    CardLayoutExample (){
        c=getContentPane();
        card=new CardLayout(40,50);
        c.setLayout(card);
        b1=new JButton("Ace");
        b2=new JButton("King");
        b3=new JButton("Queen");
        b4=new JButton("Servent");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
    }
    public void actionPerformed(ActionEvent e){
        card.next(c);
    }
    public static void main(String[] args) {
        CardLayoutExample cle=new CardLayoutExample();
        cle.setSize(500, 400);
        cle.setVisible(true);
        cle.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
