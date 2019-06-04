import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import javax.swing.JComponent;

public class Ball extends JComponent
{
	private Ellipse2D.Double ball;
	private int dx = 0, dy = -5;
	private ArrayList<Ball> balls;
	
	public Ball(int x, int y)
	{
		setBounds(x,y,9,9);
		ball = new Ellipse2D.Double(0,0,10,10);
		this.setSize(11,11);
	
	}
	
	public void updateBrick(ArrayList<Brick> bricks)
	{
		for(Brick b : bricks)
		{
			for(Ball ball : balls)
			{
				if(b.getX() == ball.getX() && b.getY() == ball.getY())
				{
					b.updateHP();
				}
			}
		}
	}
	
	public void update()
	{
		setLocation(getX() + dx, getY() + dy);
	}
	
	public void setDx(int x)
	{
		dx = x;
	}
	
	public void setDy(int y)
	{
		dy = y;
	}
	
	public int getDx()
	{
		return dx;
	}
	
	public int getDy()
	{
		return dy;
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(ball);
		
	}
		
}
	
