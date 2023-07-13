import java.awt.*;
import java.awt.event.*;
class FlagDemo extends Frame
{	Label l;
	Label showMetrics;
	public FlagDemo(){
		super("FlagDemo ");
		setSize(350, 250);
		l=new Label("Nepal Flag");
		showMetrics=new Label();
	    Font font = new Font("SansSerif", Font.ITALIC, 20);
		l.setFont(font);
		l.setForeground(Color.BLUE);
		showMetrics.setForeground(Color.red);
		setLayout(null);
		l.setBounds(10, 200, 200, 30);
		// add(l);
		setVisible(true);
		add(l);
		showMetrics.setBounds(10, 220, 700, 30);
		add(showMetrics);
	}
	public void paint(Graphics g){	
		super.paint(g);
		int x[]={10,80,30,80,10};
		int y[]={40,90,90,150,150};	
		//draw the body with red
		g.setColor(Color.red);
		g.fillPolygon(x,y,5);		
		//draw the border
		g.setColor(Color.blue);
		g.drawPolygon(x,y,5);		
		g.setColor(Color.white);
		//draw the sun
		g.fillOval(20,115,20,20);
		//draw the moon
		g.drawArc(20,60,20,20,0,-180);
		//draw the pole
		g.setColor(Color.green);		
		g.drawLine(10,150,10,190);
		FontMetrics metrics = g.getFontMetrics();
		showMetrics.setText("Ascent: " + metrics.getAscent() + ", Descent: " + metrics.getDescent() + ", Leading: " + metrics.getLeading() + ", Height: " + metrics.getHeight());
	}

	public static void main(String[] args){
		FlagDemo frame = new FlagDemo();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
	}
}
