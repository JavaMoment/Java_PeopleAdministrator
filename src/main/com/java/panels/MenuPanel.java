package main.com.java.panels;

import java.awt.Color;

import javax.swing.JPanel;

import main.com.java.interfaces.Themes;

public class MenuPanel extends JPanel implements Themes {

	/**
	 * Create the panel.
	 */
	public MenuPanel() {

		setBackground(darkTheme[0]);
		setBounds(0, 0, 269, 729);
		setLayout(null);
		
	}

}
