package loop.view;

import javax.swing.JPanel;

import loop.controller.LoopController;
import javax.swing.JToolBar;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.SpringLayout;

public class LoopPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private LoopController baseController;
	public LoopPanel(LoopController baseController)
		
	{
	
		this.baseController = baseController;
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 290, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, 331, SpringLayout.EAST, this);
		add(panel);
		
		
		
		
		setupPanel();
		setupLayout();
	//	setupListeners();
			
	}
	private void setupPanel()
	{
			
		//	this.setLineWrap();
	}
		
	private void setupLayout()
	{

	}
}
