import java.awt.*;
import java.awt.event.*;
public class ChoiceDemo extends Frame implements ItemListener{
    private LayoutManager Layout;
    private Choice Selector;
    private Font SansSerif;
    public ChoiceDemo(){
        String [] ColorList;
        int i;
        ColorList=new String [3];
       SansSerif=new Font("SansSerif", Font.BOLD, 14);
       Layout=new FlowLayout();
       Selector=new Choice();
       ColorList[0]="Red";
       ColorList[1]="Green";
       ColorList[2]="Blue";
       for(i=0;i<ColorList.length;i++){
        Selector.insert(ColorList[i],i);
       }
       Selector.setBackground((Color.magenta));
       Selector.setForeground((Color.white));
       Selector.setFont((SansSerif));
       setLayout(Layout);
       add(Selector);
       Selector.addItemListener(this);
       Selector.select(2);
       setBackground(Color.blue);

        // Add window listener
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Close the application
            }
        });
    }
    public void itemStateChanged(ItemEvent e){
        int Selection;
        Selection =Selector.getSelectedIndex();
        if(Selection==0){
            setBackground(Color.red);
     }
     else if(Selection==1){
         setBackground(Color.green);

     }
     else if(Selection==2){
         setBackground(Color.blue);

     }
    }
    public static void main(String[] args) {
        ChoiceDemo cd=new ChoiceDemo();
        cd.setVisible(true);
        cd.setSize(300, 300);
    }

}