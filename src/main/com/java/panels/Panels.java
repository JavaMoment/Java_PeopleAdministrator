package main.com.java.panels;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import main.com.java.interfaces.Themes;
import main.com.java.labels.Labels;
import main.com.java.tables.Tables;
import main.resources.data.Data;

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
		
		JLabel lblWelcome = Labels.welcomeLabel();
		homePane.add(lblWelcome);
		Data.lblArr.add(lblWelcome);
		
		JLabel lblPeopleCount = Labels.peopleCountLabel();
		homePane.add(lblPeopleCount);
		Data.lblArr.add(lblPeopleCount);
		
		JLabel lblVehiclesCount = Labels.vehiclesCountLabel();
		homePane.add(lblVehiclesCount);
		Data.lblArr.add(lblVehiclesCount);

		JLabel lblPCount = Labels.peopleCount();
		homePane.add(lblPCount);
		Data.lblArr.add(lblPCount);
		
		JLabel lblVCount = Labels.vehiCount();
		homePane.add(lblVCount);
		Data.lblArr.add(lblVCount);

		return homePane;
	}
	
	public static JPanel showPeoplePanel() {
		JPanel showPeopPane = new JPanel();
		showPeopPane.setBackground(darkTheme[1]);
		showPeopPane.setBounds(269, 0, 739, 729);
		showPeopPane.setLayout(null);
		
		JTable tablePeople = Tables.showPeopTable();
		showPeopPane.add(tablePeople);
		
		return showPeopPane;
	}
}
