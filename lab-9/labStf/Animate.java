import java.awt.*;
public class Animate extends Frame {
    static Image[] im;
    static int numImages = 4;
    static int counter = 0;

    Animate() {
        super("Animate");
    }

    public static void main(String[] args) {
        Animate f = new Animate();
        f.setSize(400, 400);
        f.setVisible(true);
        im = new Image[numImages];
        for (int i = 0; i < numImages; i++) {
            im[i] = Toolkit.getDefaultToolkit().getImage("clock" + i + ".png");
            /*
             * Note that you must have four images in the current directory i.e.
             * clock1.png, clock2.png, clock3.png, and clock4.png
             */
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.translate(getInsets().left, getInsets().top);
        g.drawImage(im[counter], 0, 0, this);
        counter++;
        if (counter == numImages)
            counter = 0;
        repaint(200);
    }
}
