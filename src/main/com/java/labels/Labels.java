package main.com.java.labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import main.com.java.windows.Menu;

public class Labels {
	/*
	 * This class will contain all the labels used by the frames and the panels
	 **/

	public static JLabel versionLabel() {
		JLabel lblVersion = new JLabel("Version 1.0.0");
		lblVersion.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblVersion.setForeground(new Color(255, 255, 255));
		lblVersion.setBounds(166, 715, 97, 14);
		return lblVersion;
	}
	
	public static JLabel welcomeLabel() {
		JLabel lblWelcome = new JLabel("¡Welcome to People Administration!");
		lblWelcome.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblWelcome.setForeground(new Color(255, 255, 255));
		lblWelcome.setBounds(180, 381, 402, 35);
		return lblWelcome;
	}
	
	public static JLabel peopleCountLabel() {
		JLabel lblPeopleCount = new JLabel("<html>People<br/>count:</html>");
		lblPeopleCount.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 11));
		lblPeopleCount.setForeground(new Color(255, 255, 255));
		lblPeopleCount.setBounds(675, 649, 80, 35);
		return lblPeopleCount;
	}
	
	public static JLabel vehiclesCountLabel() {
		JLabel lblVehiclesCount = new JLabel("<html>Vehicles<br/>count:</html>");
		lblVehiclesCount.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 11));
		lblVehiclesCount.setForeground(new Color(255, 255, 255));
		lblVehiclesCount.setBounds(578, 649, 80, 35);
		return lblVehiclesCount;
	}
	
	public static JLabel peopleCount() {
		JLabel lblPCount = new JLabel("0");
		lblPCount.setIcon(new ImageIcon(Menu.class.getResource("/main/resources/images/ancestors.png")));
		lblPCount.setFont(new Font("Unispace", Font.BOLD, 14));
		lblPCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblPCount.setForeground(new Color(255, 255, 255));
		lblPCount.setBounds(636, 683, 46, 28);
		return lblPCount;
	}
	
	public static JLabel vehiCount() {
		JLabel lblVCount = new JLabel("0");
		lblVCount.setIcon(new ImageIcon(Menu.class.getResource("/main/resources/images/transportation.png")));
		lblVCount.setFont(new Font("Unispace", Font.BOLD, 14));
		lblVCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblVCount.setForeground(Color.WHITE);
		lblVCount.setBounds(540, 682, 46, 28);
		return lblVCount;
	}
}
