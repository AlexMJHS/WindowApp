package window.view;

import javax.swing.JPanel;
import window.controller.WindowController;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 * 
 * @author Alejandro Magallanes
 * @version 0.1 Nov 11, 2015
 *
 */

public class WindowPanel extends JPanel
{
	private WindowController baseController;
	private SpringLayout baseLayout;
	private JTextField firstTextField;
	private JButton firstButton;
	private JButton secondButton;
	
	public WindowPanel(WindowController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("Click here");
		firstTextField = new JTextField("Type here");
		secondButton = new JButton("Don't Click here");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
		this.add(secondButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -168, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 60, SpringLayout.SOUTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 59, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, -184, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, secondButton, 16, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.EAST, secondButton, -150, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		
	}

}
