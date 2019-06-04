import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;


public class BallzMain extends JFrame implements ActionListener, Updatable
{
	
	private ArrayList<Ball> balls;
	private ArrayList<Brick> bricks;
	private ArrayList<AddBalls> addBalls;
	
	public BallzMain()
	{
		setBounds(400,200,800,500);
		setLayout(null);
		
		Timer t1 = new Timer(1000/60,this);
		
		balls = new ArrayList<Ball>();
		bricks = new ArrayList<Brick>();
		addBalls = new ArrayList<AddBalls>();
		
		JButton fire = new JButton("Press to fire");
		fire.setBounds(50,415,150,25);
		add(fire);
		fire.setVisible(true);
		
		JLabel launch = new JLabel("Enter Launch angle.  Between 30 and 150");
		launch.setBounds(50,370,400,25);
		add(launch);
		launch.setVisible(true);
		
		JTextField answer = new JTextField();
		answer.setBounds(50,390,200,25);
		add(answer);
		answer.setVisible(true);
		
		//creating bricks and addBalls
		double random = 0;
		for(int i=1;i<8;i++)
		{
			random = Math.random();
			if(random<.4)
			{
//				JButton test = new JButton("");
//				test.setBounds((i*70), 20, 65, 40);
//				test.setEnabled(false);
//				add(test);
				
				Brick brick = new Brick();
				brick.setBounds((i*70), 20, 65, 40);
				brick.drawText();
				add(brick);
				bricks.add(brick);
				
			}
			
			else if(.4<=random && random<=.6)
			{
				AddBalls addB = new AddBalls((i)*70,25);
				addBalls.add(addB);
				add(addB);
			}
		}
		
		
		
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) 
	{
		new BallzMain();
	}

}
