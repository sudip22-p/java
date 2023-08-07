package Face_EMT;
import java.awt.*;
import java.awt.event.*;

public class FaceSwapApp extends Frame implements ActionListener {
    private String currentEmotion;
    public FaceSwapApp() {
        setSize(400, 400);
        setBackground(Color.WHITE);
        currentEmotion="smiley";
        Button swapButton = new Button("Next Face");
        Panel p=new Panel();
        swapButton.addActionListener(this);
        swapButton.setBackground(Color.RED);
        swapButton.setForeground(Color.WHITE);
        p.add(swapButton);
        add(p,BorderLayout.SOUTH);
    }

    @Override
    public void paint(Graphics g) {
        if (currentEmotion.equals("smiley")) {
            drawSmileyFace(g);
        } else if (currentEmotion.equals("sad")) {
            drawSadFace(g);
        } else if (currentEmotion.equals("surprise")) {
            drawSurpriseFace(g);
        } else if (currentEmotion.equals("angry")) {
            drawAngryFace(g);
        }
    }

    private void drawSmileyFace(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(50, 50, 200, 200);
        g.setColor(Color.BLACK);
        g.fillOval(85, 105, 15, 25);
        g.setColor(Color.BLACK);
        g.fillOval(195, 105, 15, 25);
        g.setColor(Color.BLACK);
        g.fillArc(90, 140, 120, 60, 180, 180);
    }

    private void drawSadFace(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(50, 50, 200, 200);
        g.setColor(Color.BLACK);
        g.fillOval(85, 105, 15, 25);
        g.setColor(Color.BLACK);
        g.fillOval(195, 105, 15, 25);
        g.setColor(Color.BLACK);
        g.fillArc(90, 160, 120, 60, -180, -180);
    }
    private void drawSurpriseFace(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(50, 50, 200, 200);
        g.setColor(Color.BLACK);
        g.fillOval(85, 105, 15, 25);
        g.setColor(Color.BLACK);
        g.fillOval(195, 105, 15, 25);
        g.setColor(Color.BLACK);
        g.fillOval(130, 180, 30, 30);
    }
    private void drawAngryFace(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(50, 50, 200, 200);
        g.setColor(Color.BLACK);
        g.fillOval(90, 110, 30, 15);
        g.setColor(Color.BLACK);
        g.fillOval(190, 110, 30, 15);
        g.setColor(Color.BLACK);
        g.fillOval(98, 180, 110, 25);
        g.setColor(Color.WHITE);
        g.fillRect(115, 182, 5, 20);
        g.setColor(Color.WHITE);
        g.fillRect(145, 183, 5, 20);
        g.setColor(Color.WHITE);
        g.fillRect(125, 183, 5, 20);
        g.setColor(Color.WHITE);
        g.fillRect(155, 183, 5, 20);
        g.setColor(Color.WHITE);
        g.fillRect(135, 183, 5, 20);
        g.setColor(Color.WHITE);
        g.fillRect(165, 183, 5, 20);
        g.setColor(Color.WHITE);
        g.fillRect(175, 183, 5, 20);
        g.setColor(Color.WHITE);
        g.fillRect(185, 182, 5, 20);
    }

    public void actionPerformed(ActionEvent e) {
        if (currentEmotion.equals("smiley")) {
            currentEmotion = "sad";
        } else if (currentEmotion.equals("sad")) {
            currentEmotion = "surprise";
        } else if (currentEmotion.equals("surprise")) {
            currentEmotion = "angry";
        } else if (currentEmotion.equals("angry")) {
            currentEmotion = "smiley";
        }
        repaint();
    }

    public static void main(String[] args) {
        FaceSwapApp app = new FaceSwapApp();
        app.setVisible(true);
    }
}
