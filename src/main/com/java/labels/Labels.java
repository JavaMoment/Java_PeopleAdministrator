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
	public static JLabel homeIcon() {
		JLabel homeIco = new JLabel("");
		homeIco.setBounds(43, 232, 40, 78);
		homeIco.setIcon(new ImageIcon("C:\\PeopleAdministrator\\PeopleAdministrator\\src\\main\\resources\\images\\casa.png"));
		return homeIco;
	}
	
	public static JLabel personIcon() {
		JLabel personIco = new JLabel("");
		personIco.setBounds(43, 310, 37, 42);
		personIco.setIcon(new ImageIcon(Menu.class.getResource("/main/resources/images/avatar-de-hombre.png")));
		return personIco;
	}
	
	public static JLabel peopleIcon() {
		JLabel peopleIco = new JLabel("");
		peopleIco.setBounds(43, 371, 39, 47);
		peopleIco.setIcon(new ImageIcon(Menu.class.getResource("/main/resources/images/avatares.png")));
		return peopleIco;
	}
	
	public static JLabel vehiclesIcon() {
		JLabel vehiclesIco = new JLabel("");
		vehiclesIco.setBounds(43, 432, 41, 40);
		vehiclesIco.setIcon(new ImageIcon(Menu.class.getResource("/main/resources/images/transporte.png")));
		return vehiclesIco;
	}
	
	public static JLabel dashboardIcon() {
		JLabel dashboardIco = new JLabel("");
		dashboardIco.setBounds(43, 496, 37, 38);
		dashboardIco.setIcon(new ImageIcon(Menu.class.getResource("/main/resources/images/sitio-web.png")));
		return dashboardIco;
	}
	
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
		lblVehiclesCount.setBounds(570, 649, 80, 35);
		return lblVehiclesCount;
	}

	public static JLabel peopleCountIcon() {
		JLabel peopCountIcon = new JLabel("New label");
		peopCountIcon.setIcon(new ImageIcon(Menu.class.getResource("/main/resources/images/ancestors.png")));
		peopCountIcon.setBounds(637, 676, 40, 42);
		return peopCountIcon;
	}
	
	public static JLabel vehiCountIcon() {
		JLabel vehiCountIcon = new JLabel("New label");
		vehiCountIcon.setIcon(new ImageIcon(Menu.class.getResource("/main/resources/images/transportation.png")));
		vehiCountIcon.setBounds(531, 676, 40, 42);
		return vehiCountIcon;
	}
	
	public static JLabel PCount() {
		JLabel lblPCount = new JLabel("0");
		lblPCount.setFont(new Font("Unispace", Font.BOLD, 14));
		lblPCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblPCount.setForeground(new Color(255, 255, 255));
		lblPCount.setBounds(570, 682, 46, 28);
		return lblPCount;
	}
	
	public static JLabel VCount() {
		JLabel lblVCount = new JLabel("0");
		lblVCount.setFont(new Font("Unispace", Font.BOLD, 14));
		lblVCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblVCount.setForeground(Color.WHITE);
		lblVCount.setBounds(666, 683, 46, 28);
		return lblVCount;
	}
}
