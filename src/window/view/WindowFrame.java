package window.view;

import javax.swing.JFrame;
import window.controller.WindowController;

/**
 * 
 * @author Alejandro Magallanes
 * @version 0.1 Nov 9, 2015
 *
 */

public class WindowFrame extends JFrame
{
	private WindowController baseController;
	private WindowPanel basePanel;
	
	public WindowFrame(WindowController baseController)
	{
		this.baseController = baseController;
		basePanel = new WindowPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400,400);
		this.setTitle("Window");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public WindowController getBaseController()
	{
		return baseController;
	}
}
