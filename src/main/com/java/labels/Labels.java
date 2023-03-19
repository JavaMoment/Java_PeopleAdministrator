package main.com.java.labels;

import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import main.com.java.windows.Menu;
import main.com.java.windows.forms.BoatForm;

public class Labels {
	//Icons images locations:
	private final static String locPeopCount = "/main/resources/images/icons/ancestors.png";
	private final static String locVehiCount = "/main/resources/images/icons/transportation.png";
	
	// Labels setup and common characteristics
	private final static Font font = new Font("Verdana", Font.BOLD, 15); 
	
	/*
	 * This class will contain all the labels used by the frames and the panels
	 **/

	public static JLabel versionLabel() {
		JLabel lblVersion = new JLabel("Version 1.0.0");
		lblVersion.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblVersion.setBounds(166, 715, 97, 14);
		return lblVersion;
	}
	
	public static JLabel welcomeLabel() {
		JLabel lblWelcome = new JLabel("¡Welcome to People Administration!");
		lblWelcome.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblWelcome.setBounds(180, 381, 402, 35);
		return lblWelcome;
	}
	
	public static JLabel peopleCountLabel() {
		JLabel lblPeopleCount = new JLabel("<html>People<br/>count:</html>");
		lblPeopleCount.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 11));
		lblPeopleCount.setBounds(675, 649, 80, 35);
		return lblPeopleCount;
	}
	
	public static JLabel vehiclesCountLabel() {
		JLabel lblVehiclesCount = new JLabel("<html>Vehicles<br/>count:</html>");
		lblVehiclesCount.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 11));
		lblVehiclesCount.setBounds(578, 649, 80, 35);
		return lblVehiclesCount;
	}
	
	public static JLabel peopleCount() {
		JLabel lblPCount = new JLabel("0");
		lblPCount.setIcon(new ImageIcon(Menu.class.getResource(locPeopCount)));
		lblPCount.setFont(new Font("Unispace", Font.BOLD, 14));
		lblPCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblPCount.setBounds(636, 683, 46, 28);
		return lblPCount;
	}
	
	public static JLabel vehiCount() {
		JLabel lblVCount = new JLabel("0");
		lblVCount.setIcon(new ImageIcon(Menu.class.getResource(locVehiCount)));
		lblVCount.setFont(new Font("Unispace", Font.BOLD, 14));
		lblVCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblVCount.setBounds(540, 682, 46, 28);
		return lblVCount;
	}
	
	public static JLabel shipLogo() {
		JLabel lblShipLogo = new JLabel("");
		lblShipLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblShipLogo.setIcon(new ImageIcon(BoatForm.class.getResource("/main/resources/images/logos/ship.png")));
		lblShipLogo.setBounds(306, 65, 290, 296);
		return lblShipLogo;
	}
	
	public static JLabel boatFormTitle() {
		JLabel lblBtFormTitle = new JLabel("Ship Form");
		lblBtFormTitle.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 40));
		lblBtFormTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblBtFormTitle.setBounds(31, 11, 280, 61);
		return lblBtFormTitle;
	}
	
	public static JLabel boatFormTextFieldsLabels(String title, int[] bounds) {
		JLabel lbl = new JLabel(title);
		lbl.setFont(font);
		lbl.setBounds(bounds[0], bounds[1], bounds[2], bounds[3]);
		return lbl;
	}
}
