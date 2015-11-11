package window.controller;

import window.view.WindowFrame;

/**
 * WindowController for the Window Application
 * @author Alejandro Magallanes
 * @version 0.1 Nov 11, 2015
 */

public class WindowController
{
	private WindowFrame baseFrame;
	
	public WindowController()
	{
		baseFrame = new WindowFrame(this);
	}
	
	public void start()
	{
		
	}
}
