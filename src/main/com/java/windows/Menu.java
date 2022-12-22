package main.com.java.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Component;
import java.awt.Panel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import main.com.java.buttons.Buttons;
import main.com.java.labels.Labels;
import main.com.java.interfaces.Themes;
import main.com.java.panels.HomePanel;
import main.com.java.panels.MenuPanel;
import main.com.java.panels.ShowPeoplePanel;
import main.resources.data.Data;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Menu extends JFrame implements Themes{

	private JPanel contentPane;
	private JPanel dynamicPanel;
	private MenuPanel menuPanel;
	private HomePanel homePanel;
	private ShowPeoplePanel showPeopPanel;
	private JToggleButton tglbtnTheme = Buttons.themeButton();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setMaximumSize(new Dimension(1024, 768));
		setMinimumSize(new Dimension(1024, 768));
		setTitle("Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 429);
		contentPane = new JPanel();
		contentPane.setForeground(darkTheme[0]);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuPanel = new MenuPanel();
		homePanel = new HomePanel();
		showPeopPanel = new ShowPeoplePanel();

		dynamicPanel = homePanel;
		dynamicPanel.add(tglbtnTheme);
		
		JButton btnHome = Buttons.homeButton();
		menuPanel.add(btnHome);
		Data.btnArr.add(btnHome);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePanel(homePanel);
			}
		});
		
		JButton btnAddPerson = Buttons.addPersonButton();
		menuPanel.add(btnAddPerson);
		Data.btnArr.add(btnAddPerson);
		
		JButton btnShowPeople = Buttons.showPeopleButton();
		menuPanel.add(btnShowPeople);
		Data.btnArr.add(btnShowPeople);
		btnShowPeople.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePanel(showPeopPanel);
							}
		});
		
		JButton btnShowVehicles = Buttons.showVehiclesButton();
		menuPanel.add(btnShowVehicles);
		Data.btnArr.add(btnShowVehicles);
		
		JButton btnDashboard = Buttons.dashboardButton();
		menuPanel.add(btnDashboard);
		Data.btnArr.add(btnDashboard);
		
		JLabel lblVersion = Labels.versionLabel();
		menuPanel.add(lblVersion);
		Data.lblArr.add(lblVersion);

				
		tglbtnTheme.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(tglbtnTheme.isSelected()) {
					changeToDarkTheme();
				} else {
					changeToLightTheme();
				}
			}
		});
		contentPane.add(dynamicPanel);
		contentPane.add(homePanel);
		contentPane.add(menuPanel);
		contentPane.add(showPeopPanel);
		homePanel.setVisible(true);
		menuPanel.setVisible(true);
	}
	
	private void changePanel(JPanel pane) {
		dynamicPanel.setVisible(false);
		dynamicPanel = pane;
		dynamicPanel.setVisible(true);
		dynamicPanel.add(tglbtnTheme);
	}
	
	private void changeToLightTheme() {
		menuPanel.setBackground(darkTheme[0]);
		dynamicPanel.setBackground(darkTheme[1]);
		tglbtnTheme.setText("Light Theme");
		tglbtnTheme.setBackground(Color.WHITE);
		for(JButton btn : Data.btnArr) {btn.setForeground(lightTheme[1]);}
		for(JLabel lbl : Data.lblArr) {lbl.setForeground(lightTheme[1]);}
	}
	
	private void changeToDarkTheme() {
		menuPanel.setBackground(lightTheme[0]);
		dynamicPanel.setBackground(lightTheme[1]);
		tglbtnTheme.setText("Dark Theme");
		tglbtnTheme.setBackground(Color.GRAY);
		for(JLabel lbl : Data.lblArr) {lbl.setForeground(darkTheme[0]);}
		for(JButton btn : Data.btnArr) {btn.setForeground(darkTheme[0]);}
	}
}
