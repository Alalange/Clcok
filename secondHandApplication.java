// Driver program:
import javax.swing.JComponent; 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JFrame;

public class secondHandApplication
{
	public static void main(String[] args)
	{
	MenuFrame frame = new MenuFrame();
	
	secondHandApp component = new secondHandApp();
 
	frame.setSize(500, 500);
	frame.add(component);
	frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	}
	
	private static final int FRAME_WIDTH = 1000;
	private static final int FRAME_HEIGHT = 500;
}
