import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
// Create the menu for simpleAnimation2
	public class MenuFrame extends JFrame
	{
 		public MenuFrame()
 	   	{
// Construct menu
 		JMenuBar menuBar = new JMenuBar();
 	   	setJMenuBar(menuBar);
 	   	menuBar.add(createFileMenu());
 	   	menuBar.add(createShowMenu());
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		//delayPeriod = 500;
 	   	}
// Creates the File menu. 
	    public JMenu createFileMenu()
 	   	{
 	   	JMenu menu = new JMenu("File");
 	   	menu.add(createFileExitItem());
		return menu;
 	   	}
// Creates the File->Exit menu item and sets its action listener.
	public JMenuItem createFileExitItem()
 	{
 	  JMenuItem item = new JMenuItem("Exit");
	  class MenuItemListener implements ActionListener
 	   {
		public void actionPerformed(ActionEvent event)
 	   	{
 	   	System.exit(0);
 	   	}
 	   }
	   ActionListener listener = new MenuItemListener();
 	   item.addActionListener(listener);
 	   return item;
 	}
// Creates the Speed menu
	public JMenu createShowMenu()
	{
		JMenu menu = new JMenu("Show");
		menu.add(createShowOn());
		menu.add(createShowOff());
		
		return menu;
	}
	public JMenuItem createShowOn()
	{
		JMenuItem item = new JMenuItem("second hand on");
		class MenuItemListener implements ActionListener
	   {
		  public void actionPerformed(ActionEvent event)
		  {
			  
			  secondHandApp.secondHandVisible=true;
		  }
	   }
	   ActionListener listener = new MenuItemListener();
	   item.addActionListener(listener);
	   return item;
	}
	public JMenuItem createShowOff()
	{
		JMenuItem item = new JMenuItem("off");

		class MenuItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				  secondHandApp.secondHandVisible=false;
			}
		}

		ActionListener listener = new MenuItemListener();
		item.addActionListener(listener);
		return item;
	}
    public int getDelayPeriod()
    {
    return delayPeriod;
    }
private static final int FRAME_WIDTH = 300;
private static final int FRAME_HEIGHT = 200;
private int delayPeriod;
   }
 
