package main.com.java.buttons;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;

import main.com.java.interfaces.Themes;
import main.com.java.windows.Menu;

public class Buttons implements Themes {
	/*
	 * This class will contain all the buttons used by the frames and the panels
	 **/
	public static JButton showVehiclesButton() {
		JButton btnShowVehicles = new JButton("Show vehicles");
		btnShowVehicles.setIcon(new ImageIcon(Menu.class.getResource("/main/resources/images/transporte.png")));
		btnShowVehicles.setHorizontalAlignment(SwingConstants.LEADING);
		btnShowVehicles.setToolTipText("Click here to get a vehicles list");
		btnShowVehicles.setOpaque(false);
		btnShowVehicles.setForeground(Color.WHITE);
		btnShowVehicles.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnShowVehicles.setBorderPainted(false);
		btnShowVehicles.setBackground(Color.BLACK);
		btnShowVehicles.setBounds(45, 441, 230, 35);
		return btnShowVehicles;
	}
	
	public static JButton showPeopleButton() {
		JButton btnShowPeople = new JButton("Show people");
		btnShowPeople.setIcon(new ImageIcon(Menu.class.getResource("/main/resources/images/avatares.png")));
		btnShowPeople.setHorizontalAlignment(SwingConstants.LEADING);
		btnShowPeople.setToolTipText("Click here to get a people list");
		btnShowPeople.setOpaque(false);
		btnShowPeople.setForeground(Color.WHITE);
		btnShowPeople.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnShowPeople.setBorderPainted(false);
		btnShowPeople.setBackground(Color.BLACK);
		btnShowPeople.setBounds(45, 381, 230, 35);
		return btnShowPeople;
	}
	
	public static JButton addPersonButton() {
		JButton btnAddPerson = new JButton("Add a Person");
		btnAddPerson.setIcon(new ImageIcon(Menu.class.getResource("/main/resources/images/avatar-de-hombre.png")));
		btnAddPerson.setHorizontalAlignment(SwingConstants.LEADING);
		btnAddPerson.setToolTipText("Click here to add a Person");
		btnAddPerson.setOpaque(false);
		btnAddPerson.setForeground(Color.WHITE);
		btnAddPerson.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnAddPerson.setBorderPainted(false);
		btnAddPerson.setBackground(Color.BLACK);
		btnAddPerson.setBounds(45, 321, 230, 35);
		return btnAddPerson;
	}
	
	public static JButton dashboardButton() {
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.setIcon(new ImageIcon(Menu.class.getResource("/main/resources/images/sitio-web.png")));
		btnDashboard.setHorizontalAlignment(SwingConstants.LEADING);
		btnDashboard.setToolTipText("Click here to get the dashboard");
		btnDashboard.setOpaque(false);
		btnDashboard.setForeground(Color.WHITE);
		btnDashboard.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnDashboard.setBorderPainted(false);
		btnDashboard.setBackground(Color.BLACK);
		btnDashboard.setBounds(45, 503, 230, 35);
		return btnDashboard;
	}
	
	public static JButton homeButton() {
		JButton btnHome = new JButton("Home");
		btnHome.setIcon(new ImageIcon("C:\\PeopleAdministrator\\PeopleAdministrator\\src\\main\\resources\\images\\casa.png"));
		btnHome.setHorizontalAlignment(SwingConstants.LEADING);
		btnHome.setToolTipText("Click here to get Home");
		btnHome.setBorderPainted(false);
		btnHome.setOpaque(false);
		btnHome.setForeground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnHome.setBackground(new Color(0, 0, 0));
		btnHome.setBounds(45, 261, 230, 35);
		return btnHome;
	}
	
	public static JToggleButton themeButton() {
		JToggleButton tglbtnTheme = new JToggleButton("Light Theme");
		tglbtnTheme.setOpaque(true);
		tglbtnTheme.setText("Light Theme");
		tglbtnTheme.setBackground(Color.WHITE);
		//tglbtnTheme.setBackground(new Color(128, 128, 128));
		tglbtnTheme.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tglbtnTheme.setForeground(new Color(0, 0, 0));
		tglbtnTheme.setBorder(new CompoundBorder());
		tglbtnTheme.setBounds(635, 11, 94, 23);
		return tglbtnTheme;
	}

}
