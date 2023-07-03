import java.awt.*;
public class BorderPanelExample extends Frame {
    public BorderPanelExample(String title){
        super(title);
        addComponent("North", new Button("North"));
        addComponent("South", new Button("South"));
        addComponent("East", new Button("East"));
        addComponent("West", new Button("West"));
        addComponent("Center", new Button("Center"));
    }
    public void addComponent(String region,Component component){
        Panel panel=new Panel();
        panel.add(component);
        add(region,panel);
    }
    public static void main(String[] args) {
        BorderPanelExample bpe =new BorderPanelExample("Border Panel Example");
        bpe.setSize(200,100);
        bpe.setVisible(true);
    }
}
