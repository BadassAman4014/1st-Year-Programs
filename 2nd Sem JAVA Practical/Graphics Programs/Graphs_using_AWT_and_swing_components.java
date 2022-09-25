
//Graph
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphs_using_AWT_and_swing_components {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setBounds(10, 10, 500, 500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel() {
			public void paint(Graphics g) {
				g.setFont(new Font("Calibri", Font.BOLD, 30));
				g.drawString("Placement Of Ycce", 150, 100);
				g.setFont(new Font("Arial", Font.BOLD, 16));
				g.drawLine(90, 395, 90, 50);// Y
				g.drawString("NUMBER OF STUDENTS", 150, 400);
				g.drawLine(50, 350, 450, 350);// X

				g.drawString("100", 150, 380);
				g.drawString("200", 230, 380);
				g.drawString("300", 330, 380);
				g.drawString("400", 400, 380);

				g.drawString("19-20", 30, 320);
				g.drawString("20-21", 30, 270);
				g.drawString("21-22", 30, 220);

				g.drawString("|", 340, 355);
				g.drawString("|", 410, 355);
				g.drawString("|", 240, 355);
				g.drawString("|", 160, 355);

				g.drawString("YEAR", 30, 150);
				g.setColor(Color.ORANGE);
				g.fillRect(91, 300, 150, 30);
				g.setColor(Color.green);
				g.fillRect(91, 250, 250, 30);
				g.setColor(Color.blue);
				g.fillRect(91, 200, 320, 30);

			}
		};
		panel.setBounds(10, 10, 500, 500);
		frame.add(panel);

		frame.setVisible(true);
	}

}