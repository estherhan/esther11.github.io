import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JApplet1 extends JApplet implements ActionListener{
	JButton b;
	MyPanel p;

	
		public void init(){
			b=new JButton("Change color");
			getContentPane().add(BorderLayout.SOUTH,b);
			b.addActionListener(this);
			
			p=new MyPanel();
			getContentPane().add(BorderLayout.CENTER, p);
			
		}
		
		public void actionPerformed(ActionEvent e) {
		repaint();
		
	}
		
	

	

class 	MyPanel extends JPanel{
	public void paintComponent(Graphics g)
	{
		int red=(int)(Math.random()*255);
		int green=(int)(Math.random()*255);
		int blue=(int)(Math.random()*255);
		Color random=new Color(red, green, blue);
		
		g.setColor(random);
		g.fillOval(50, 50, 200, 100);
	}
		
	}

}
