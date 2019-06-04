import java.awt.Dimension;
import javax.swing.JButton;

public class Brick extends JButton implements Updatable
{

	private JButton brick;
	private int level = 1;
	private int hp;
	
	
	public Brick()
	{
//		brick = new JButton();
//		setPreferredSize(new Dimension(75,50));
		
		double test = Math.random();
		if(test < .2)
		{
			hp = level*2;
		}
		else
		{
			hp = level;
		}
		
		brick = new JButton("Test");
		setPreferredSize(new Dimension(75,50));
		
		
		setVisible(true);
		setEnabled(false);
		
	}
	
	public void drawText()
	{
		brick.setText("" + hp);
	}


	
	public void update()
	{
		setLocation(getX(), getY() + 50);
		level++;
	}
	
	public void updateHP()
	{
		hp--;
	}
	
	public int getHP() 
	{
		return hp;
	}
	
	

}