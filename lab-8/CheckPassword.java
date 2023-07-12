import java.awt.*;
import java.awt.event.*;
public class CheckPassword extends Frame implements ActionListener{
    Button b; 
    Label l1,l2;
    TextField t;
    GridLayout layout;
    CheckPassword(String s){
        super(s);
        b=new Button("Check");
        l1=new Label("Enter Password:)");
        l2=new Label();
        t=new TextField(10);
        t.setEchoChar('#');
        layout=new GridLayout(4,1);
        setSize(300, 150);
        setLayout(layout);
        add(l1);
        add(l2);
        add(b);
        add(t);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String s=e.getActionCommand();
        String psw;
        if(s.equals("Check")){
            psw=t.getText();
            if(psw.equals("java")){
                l2.setText("Correct Password");
                l2.setBackground(Color.green);
            } else{
                l2.setText("Inorrect Password");
                l2.setBackground(Color.red);
            }
        }
    }
    public static void main(String[] args) {
        CheckPassword cp=new CheckPassword("** PW CHECK **");
        cp.setVisible(true);
    }
}