package main.com.java.panels;


import javax.swing.JPanel;

import main.com.java.interfaces.Themes;

@SuppressWarnings("serial")
public class MenuPanel extends JPanel implements Themes {

	/**
	 * Create the panel.
	 */
	public MenuPanel() {
		/* Creates the Menu panel which will contain the action buttons to navigate through all the features in the program */
		
		setBounds(0, 0, 269, 729);
		setLayout(null);
		
	}

}
