import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;



public class AddBalls extends JComponent implements Updatable
{
		
	private Ellipse2D.Double addBall;
	private int x;
	private int y;
		
	public AddBalls(int x,  int y) 
	{
		this.x = x;
		this.y = y;
		setBounds(x,y,20,20);
		this.setPreferredSize(new Dimension(75,50));
		addBall = new Ellipse2D.Double(0, 0 , 19, 19);
	}
	
	public void update()
	{
		setLocation(getX(), getY() + 50);
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
		
	public void paintComponent (Graphics g)
	{
		
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(addBall);
		g2.fill(addBall);
	}
}
