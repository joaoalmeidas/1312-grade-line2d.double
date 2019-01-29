import java.awt.Graphics;

import javax.swing.JPanel;

public class Grade extends JPanel{
	
	
	@Override
	public void paintComponent(Graphics g) {
		
		for(int x = getWidth()/8; x < getWidth()/8 * 8; x += getWidth()/8) {
			
			g.drawLine(x, 0, x, getHeight());
			
		}
		
		for(int y = getHeight()/8; y < getHeight()/8 * 8; y += getHeight()/8) {
			
			g.drawLine(0, y, getWidth(), y);
			
		}
		
	}
}
