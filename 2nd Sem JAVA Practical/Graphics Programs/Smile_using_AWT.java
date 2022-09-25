
//Smile
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Smile_using_AWT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setBounds(10, 10, 500, 500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel() {
			public void paint(Graphics g) {
				// super.paint(g);//constructor
				g.drawLine(90, 10, 50, 70);// (x,y)
				g.drawLine(90, 10, 130, 70);
				g.drawLine(50, 70, 130, 70);
				g.setColor(Color.ORANGE);
				g.fillOval(40, 70, 100, 100);
				g.setColor(Color.PINK);
				g.fillOval(20, 100, 20, 30);
				g.setColor(Color.PINK);
				g.fillOval(140, 100, 20, 30);
				g.setColor(Color.BLUE);
				g.fillOval(60, 100, 15, 15);
				g.setColor(Color.BLUE);
				g.fillOval(100, 100, 15, 15);
				g.setColor(Color.green);
				g.fillOval(85, 120, 10, 10);
				g.setColor(Color.blue);
				g.fillRoundRect(20, 175, 40, 20, 10, 10);
				g.setColor(Color.blue);
				g.fillRoundRect(70, 175, 40, 20, 10, 10);
				g.setColor(Color.blue);
				g.fillRoundRect(120, 175, 40, 20, 10, 10);
				g.drawArc(65, 120, 50, 20, 180, 180);
			}
		};
		panel.setBounds(10, 10, 500, 500);
		frame.add(panel);

		frame.setVisible(true);
	}

}