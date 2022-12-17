package main.com.java.panels;

import java.awt.Color;

import javax.swing.JPanel;

import main.com.java.interfaces.Themes;

public class Panels implements Themes {
	
	public static JPanel menuPanel() {
		JPanel menuPane = new JPanel();
		menuPane.setBackground(darkTheme[0]);
		menuPane.setForeground(new Color(255, 255, 255));
		menuPane.setBounds(0, 0, 269, 729);
		menuPane.setLayout(null);
		return menuPane;
	}

	public static JPanel homePanel() {
		JPanel homePane = new JPanel();
		homePane.setBackground(darkTheme[1]);
		homePane.setBounds(269, 0, 739, 729);
		homePane.setLayout(null);
		return homePane;
	}	
}
