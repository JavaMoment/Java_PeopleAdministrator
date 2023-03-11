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
import main.resources.data.Data;

public class Buttons implements Themes {
	//Icons locations:
	private static String locShowVehiBtn = "/main/resources/images/icons/transporte.png";
	private static String locShowPeopBtn = "/main/resources/images/icons/avatares.png";
	private static String locAddPersBtn = "/main/resources/images/icons/avatar-de-hombre.png";
	private static String locDashBtn = "/main/resources/images/icons/sitio-web.png";
	private static String locHomeBtn = "C:\\PeopleAdministrator\\PeopleAdministrator\\src\\main\\resources\\images\\icons\\casa.png";
	private static String locRefrBtn = "C:\\PeopleAdministrator\\PeopleAdministrator\\src\\main\\resources\\images\\icons\\refresh.png";
	private static String locOrderByAscBtn = "C:\\PeopleAdministrator\\PeopleAdministrator\\src\\main\\resources\\images\\icons\\sort-ascending.png";
	private static String locOrderByDescBtn = "C:\\PeopleAdministrator\\PeopleAdministrator\\src\\main\\resources\\images\\icons\\sort-descending.png";
	private static String locSearchBtn = "C:\\PeopleAdministrator\\PeopleAdministrator\\src\\main\\resources\\images\\icons\\search.png";
	
	
	/*
	 * This class will contain all the buttons used by the frames and the panels
	 **/
	public static JButton showVehiclesButton() {
		JButton btnShowVehicles = new JButton("Show vehicles");
		btnShowVehicles.setIcon(new ImageIcon(Menu.class.getResource(locShowVehiBtn)));
		btnShowVehicles.setHorizontalAlignment(SwingConstants.LEADING);
		btnShowVehicles.setToolTipText("Click here to get a vehicles list");
		btnShowVehicles.setOpaque(false);
		btnShowVehicles.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnShowVehicles.setBorderPainted(false);
		btnShowVehicles.setBounds(45, 441, 230, 35);
		return btnShowVehicles;
	}
	
	public static JButton showPeopleButton() {
		JButton btnShowPeople = new JButton("Show people");
		btnShowPeople.setIcon(new ImageIcon(Menu.class.getResource(locShowPeopBtn)));
		btnShowPeople.setHorizontalAlignment(SwingConstants.LEADING);
		btnShowPeople.setToolTipText("Click here to get a people list");
		btnShowPeople.setOpaque(false);
		btnShowPeople.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnShowPeople.setBorderPainted(false);
		btnShowPeople.setBounds(45, 381, 230, 35);
		return btnShowPeople;
	}
	
	public static JButton addPersonButton() {
		JButton btnAddPerson = new JButton("Add a Person");
		btnAddPerson.setIcon(new ImageIcon(Menu.class.getResource(locAddPersBtn)));
		btnAddPerson.setHorizontalAlignment(SwingConstants.LEADING);
		btnAddPerson.setToolTipText("Click here to add a Person");
		btnAddPerson.setOpaque(false);
		btnAddPerson.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnAddPerson.setBorderPainted(false);
		btnAddPerson.setBounds(45, 321, 230, 35);
		return btnAddPerson;
	}
	
	public static JButton dashboardButton() {
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.setIcon(new ImageIcon(Menu.class.getResource(locDashBtn)));
		btnDashboard.setHorizontalAlignment(SwingConstants.LEADING);
		btnDashboard.setToolTipText("Click here to get the dashboard");
		btnDashboard.setOpaque(false);
		btnDashboard.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnDashboard.setBorderPainted(false);
		btnDashboard.setBounds(45, 503, 230, 35);
		return btnDashboard;
	}
	
	public static JButton homeButton() {
		JButton btnHome = new JButton("Home");
		btnHome.setIcon(new ImageIcon(locHomeBtn));
		btnHome.setHorizontalAlignment(SwingConstants.LEADING);
		btnHome.setToolTipText("Click here to get Home");
		btnHome.setBorderPainted(false);
		btnHome.setOpaque(false);
		btnHome.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnHome.setBounds(45, 261, 230, 35);
		return btnHome;
	}
	
	public static JToggleButton themeButton() {
		JToggleButton tglbtnTheme = new JToggleButton("Light Theme");
		tglbtnTheme.setOpaque(true);
		tglbtnTheme.setFont(new Font("Tahoma", Font.PLAIN, 13));
		tglbtnTheme.setBorder(new CompoundBorder());
		tglbtnTheme.setBounds(635, 11, 94, 23);
		tglbtnTheme.setSelected(true);
		return tglbtnTheme;
	}
	
	public static JButton refreshButton() {
		JButton btnRefresh = new JButton();
		btnRefresh.setIcon(new ImageIcon(locRefrBtn));
		btnRefresh.setToolTipText("Click here to refresh the table");
		btnRefresh.setBounds(560, 11, 45, 40);
		btnRefresh.setOpaque(false);
		btnRefresh.setBorderPainted(false);
		btnRefresh.setHorizontalAlignment(SwingConstants.LEADING);
		return btnRefresh;
	}
	
	public static JButton orderByAscButton() {
		JButton btnOrderByAscID = new JButton();
		btnOrderByAscID.setIcon(new ImageIcon(locOrderByAscBtn));
		btnOrderByAscID.setBounds(460, 11, 45, 40);
		btnOrderByAscID.setOpaque(false);
		btnOrderByAscID.setBorderPainted(false);
		btnOrderByAscID.setHorizontalAlignment(SwingConstants.LEFT);
		return btnOrderByAscID;
	}
	
	public static JButton orderByDescButton() {
		JButton btnOrderByDescID = new JButton();
		btnOrderByDescID.setIcon(new ImageIcon(locOrderByDescBtn));
		btnOrderByDescID.setBounds(510, 11, 45, 40);
		btnOrderByDescID.setOpaque(false);
		btnOrderByDescID.setBorderPainted(false);
		btnOrderByDescID.setHorizontalAlignment(SwingConstants.LEFT);
		return btnOrderByDescID;
	}
	
	public static JButton searchButton() {
		JButton btnSearch = new JButton();
		btnSearch.setIcon(new ImageIcon(locSearchBtn));
		btnSearch.setToolTipText("Click here to search by name");
		btnSearch.setBounds(210, 11, 45, 40);
		btnSearch.setOpaque(false);
		btnSearch.setBorderPainted(false);
		btnSearch.setHorizontalAlignment(SwingConstants.LEADING);
		return btnSearch;
	}

}
