import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

public class Grade extends JPanel{
	
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		for(int x = getWidth()/8; x < getWidth()/8 * 8; x += getWidth()/8) {
			
			g2d.draw(new Line2D.Double(x, 0, x, getHeight()));
			
		}
		
		for(int y = getHeight()/8; y < getHeight()/8 * 8; y += getHeight()/8) {
			
			g2d.draw(new Line2D.Double(0, y, getWidth(), y));
			
		}
		
	}
}
