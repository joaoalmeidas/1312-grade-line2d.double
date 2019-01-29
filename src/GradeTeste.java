import java.awt.Color;

import javax.swing.JFrame;

public class GradeTeste {

	public static void main(String[] args) {
		JFrame frame = new JFrame("grade");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Grade grade = new Grade();
		frame.add(grade);
		frame.setBackground(Color.WHITE);
		frame.setSize(315, 330);
		frame.setVisible(true);

	}

}
