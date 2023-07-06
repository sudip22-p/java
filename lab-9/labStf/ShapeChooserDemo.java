import java.awt.*;
import java.awt.event.*;

public class ShapeChooserDemo extends Frame implements ItemListener {

    Choice shapeChoice;
    RectangleClass rectangle;
    CircleClass circle;
    SquareClass square;

    public ShapeChooserDemo() {
        super("Shapes Chooser Demo");
        setSize(500, 200);
        setVisible(true);

        rectangle = new RectangleClass();
        circle = new CircleClass();
		square=new SquareClass();
        shapeChoice = new Choice();
        shapeChoice.add("Rectangle");
        shapeChoice.add("Circle");
        shapeChoice.add("Square");
        setLayout(new FlowLayout());
        add(shapeChoice);
        shapeChoice.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        String selectedShape = shapeChoice.getSelectedItem();
        if (selectedShape.equals("Rectangle")) {
            rectangle.setVisible(true);
            circle.setVisible(false);
            square.setVisible(false);
        } else if (selectedShape.equals("Circle")) {
            rectangle.setVisible(false);
            square.setVisible(false);
            circle.setVisible(true);
        } else if (selectedShape.equals("Square")) {
            rectangle.setVisible(false);
            circle.setVisible(false);
            square.setVisible(true);
        }
    }

    public static void main(String args[]) {
        new ShapeChooserDemo();
    }
}

class CircleClass extends Frame {

    public CircleClass() {
        setSize(300, 300);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.green);
        g.fillArc(100, 100, 70, 70, 0, 360);
    }
}

class RectangleClass extends Frame {

    public RectangleClass() {
        setSize(300, 300);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);
        g.fillRect(60, 60, 150, 100);
    }
}
class SquareClass extends Frame {

    public SquareClass() {
        setSize(300, 300);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        g.fillRect(60, 60, 150, 150);
    }
}
