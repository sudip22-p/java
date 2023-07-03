import java.awt.*;
public class TextFieldDemo extends Frame{
/* Declaration */
TextField Input;
TextField Echo;
LayoutManager Layout;
public TextFieldDemo () {
/* Instantiation */
Input = new TextField ("Input", 35);
Echo = new TextField ("Text entered above will appear here.",35);
Layout = new FlowLayout();
/* Decoration */
setBackground (Color.yellow);
Input. setBackground (Color.green);
Echo.setForeground (Color.blue);
/* Location */
setLayout(Layout);
add (Input);
add (Echo);
/* Configuration */
Echo.setEditable (false);
}
public static void main(String[] args){
TextFieldDemo tfd= new TextFieldDemo ();
tfd.setVisible(true);
tfd.setSize(300,300);
}
}