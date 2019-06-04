import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;



public class AddBalls extends JComponent implements Updatable
{
		
	private Ellipse2D.Double addBall;

	
	
	public void update() {}
		
	public AddBalls(int x,  int y) 
	{
		setBounds(x,y,20,20);
		this.setPreferredSize(new Dimension(75,50));
		addBall = new Ellipse2D.Double(0, 0 , 19, 19);
	}
		
	public void paintComponent (Graphics g)
	{
		
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(addBall);
		g2.fill(addBall);
	}
}
