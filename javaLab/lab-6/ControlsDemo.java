import java.awt.*;
import java.awt.event.*;
public class ControlsDemo extends Frame {
    private Label DemoLabel;
    private Button DemoButton;
    private Scrollbar DemoSlider;
    private Checkbox DemoRadio;
    private Checkbox DemoBox;
    private TextField DemoText;
    private TextArea DemoArea;
    private Choice DemoCombo;
    private List DemoList;
    private LayoutManager Layout;
    private CheckboxGroup Group;
    public ControlsDemo(){
        DemoLabel=new Label();
        DemoSlider=new Scrollbar();
        Group=new CheckboxGroup();
        DemoRadio=new Checkbox("CheckBox",Group,false);
        DemoBox=new Checkbox();
        DemoButton=new Button();
        DemoText=new TextField();
        DemoCombo=new Choice();
        DemoList=new List(3);
        DemoArea=new TextArea(5,30);
        Layout=new FlowLayout();

        setLayout(Layout);
        add(DemoLabel);
        add(DemoButton);
        add(DemoRadio);
        add(DemoBox);
        add(DemoText);
        add(DemoList);
        add(DemoCombo);
        add(DemoArea);
        add(DemoSlider);

        DemoLabel.setText("Label");
        DemoSlider.setName("ScrollBar");
        DemoButton.setLabel("Button");
        DemoBox.setLabel("CheckBox");
        DemoText.setText("TextField");
        DemoCombo.addItem("Choice");
        DemoCombo.addItem("Selection");
        DemoList.add("List");
        DemoList.add("Selection");
        DemoArea.setText("TextArea");
        // Add window listener
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Close the application
            }
        });
    }

    public static void main(String[] args) {
        ControlsDemo t=new ControlsDemo();
        t.setVisible(true);
        t.setSize(300,300);
    }
}