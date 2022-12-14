package main.com.java.buttons;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;

public class Buttons {
	/*
	 * This class will contain all the buttons used by the frames and the panels
	 **/
	public static JButton showVehiclesButton() {
		JButton btnShowVehicles = new JButton("Show vehicles");
		btnShowVehicles.setHorizontalAlignment(SwingConstants.LEADING);
		btnShowVehicles.setToolTipText("Click here to get a vehicles list");
		btnShowVehicles.setOpaque(false);
		btnShowVehicles.setForeground(Color.WHITE);
		btnShowVehicles.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnShowVehicles.setBorderPainted(false);
		btnShowVehicles.setBackground(Color.BLACK);
		btnShowVehicles.setBounds(71, 441, 191, 27);
		return btnShowVehicles;
	}
	
	public static JButton showPeopleButton() {
		JButton btnShowPeople = new JButton("Show people");
		btnShowPeople.setHorizontalAlignment(SwingConstants.LEADING);
		btnShowPeople.setToolTipText("Click here to get a people list");
		btnShowPeople.setOpaque(false);
		btnShowPeople.setForeground(Color.WHITE);
		btnShowPeople.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnShowPeople.setBorderPainted(false);
		btnShowPeople.setBackground(Color.BLACK);
		btnShowPeople.setBounds(71, 381, 188, 27);
		return btnShowPeople;
	}
	
	public static JButton addPersonButton() {
		JButton btnAddPerson = new JButton("Add a Person");
		btnAddPerson.setHorizontalAlignment(SwingConstants.LEADING);
		btnAddPerson.setToolTipText("Click here to add a Person");
		btnAddPerson.setOpaque(false);
		btnAddPerson.setForeground(Color.WHITE);
		btnAddPerson.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnAddPerson.setBorderPainted(false);
		btnAddPerson.setBackground(Color.BLACK);
		btnAddPerson.setBounds(71, 321, 188, 27);
		return btnAddPerson;
	}
	
	public static JButton dashboardButton() {
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.setHorizontalAlignment(SwingConstants.LEADING);
		btnDashboard.setToolTipText("Click here to get the dashboard");
		btnDashboard.setOpaque(false);
		btnDashboard.setForeground(Color.WHITE);
		btnDashboard.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnDashboard.setBorderPainted(false);
		btnDashboard.setBackground(Color.BLACK);
		btnDashboard.setBounds(71, 503, 202, 27);
		return btnDashboard;
	}
	
	public static JButton homeButton() {
		JButton btnHome = new JButton("Home");
		btnHome.setHorizontalAlignment(SwingConstants.LEADING);
		btnHome.setToolTipText("Click here to get Home");
		btnHome.setBorderPainted(false);
		btnHome.setOpaque(false);
		btnHome.setForeground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnHome.setBackground(new Color(0, 0, 0));
		btnHome.setBounds(71, 261, 154, 27);
		return btnHome;
	}
	
	public static JToggleButton themeButton() {
		JToggleButton tglbtnTheme = new JToggleButton("Dark Theme");
		tglbtnTheme.setOpaque(true);
		tglbtnTheme.setBackground(new Color(128, 128, 128));
		tglbtnTheme.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tglbtnTheme.setForeground(new Color(0, 0, 0));
		tglbtnTheme.setBorder(new CompoundBorder());
		tglbtnTheme.setBounds(635, 11, 94, 23);
		return tglbtnTheme;
	}

}
