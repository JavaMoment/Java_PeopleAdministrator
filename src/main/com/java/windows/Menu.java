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

public class Menu extends JFrame {

	private JPanel contentPane;

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
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel menuPanel = new JPanel();
		menuPanel.setBackground(new Color(0, 0, 0));
		menuPanel.setForeground(new Color(255, 255, 255));
		menuPanel.setBounds(0, 0, 269, 729);
		contentPane.add(menuPanel);
		menuPanel.setLayout(null);
		
		JButton btnHome = new JButton("Home");
		btnHome.setHorizontalAlignment(SwingConstants.LEADING);
		btnHome.setToolTipText("Click here to get Home");
		btnHome.setBorderPainted(false);
		btnHome.setOpaque(false);
		btnHome.setForeground(new Color(255, 255, 255));
		btnHome.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnHome.setBackground(new Color(0, 0, 0));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHome.setBounds(71, 261, 154, 27);
		menuPanel.add(btnHome);
		
		JButton btnAddPerson = new JButton("Add a Person");
		btnAddPerson.setHorizontalAlignment(SwingConstants.LEADING);
		btnAddPerson.setToolTipText("Click here to add a Person");
		btnAddPerson.setOpaque(false);
		btnAddPerson.setForeground(Color.WHITE);
		btnAddPerson.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnAddPerson.setBorderPainted(false);
		btnAddPerson.setBackground(Color.BLACK);
		btnAddPerson.setBounds(71, 321, 188, 27);
		menuPanel.add(btnAddPerson);
		
		JButton btnShowPeople = new JButton("Show people");
		btnShowPeople.setHorizontalAlignment(SwingConstants.LEADING);
		btnShowPeople.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnShowPeople.setToolTipText("Click here to get a people list");
		btnShowPeople.setOpaque(false);
		btnShowPeople.setForeground(Color.WHITE);
		btnShowPeople.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnShowPeople.setBorderPainted(false);
		btnShowPeople.setBackground(Color.BLACK);
		btnShowPeople.setBounds(71, 381, 188, 27);
		menuPanel.add(btnShowPeople);
		
		JButton btnShowVehicles = new JButton("Show vehicles");
		btnShowVehicles.setHorizontalAlignment(SwingConstants.LEADING);
		btnShowVehicles.setToolTipText("Click here to get a vehicles list");
		btnShowVehicles.setOpaque(false);
		btnShowVehicles.setForeground(Color.WHITE);
		btnShowVehicles.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnShowVehicles.setBorderPainted(false);
		btnShowVehicles.setBackground(Color.BLACK);
		btnShowVehicles.setBounds(71, 441, 191, 27);
		menuPanel.add(btnShowVehicles);
		
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.setHorizontalAlignment(SwingConstants.LEADING);
		btnDashboard.setToolTipText("Click here to get the dashboard");
		btnDashboard.setOpaque(false);
		btnDashboard.setForeground(Color.WHITE);
		btnDashboard.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 21));
		btnDashboard.setBorderPainted(false);
		btnDashboard.setBackground(Color.BLACK);
		btnDashboard.setBounds(71, 503, 202, 27);
		menuPanel.add(btnDashboard);
		
		JLabel homeIcon = new JLabel("");
		homeIcon.setBounds(43, 232, 40, 78);
		menuPanel.add(homeIcon);
		homeIcon.setIcon(new ImageIcon("C:\\PeopleAdministrator\\PeopleAdministrator\\src\\main\\resources\\images\\casa.png"));
		
		JLabel personIcon = new JLabel("");
		personIcon.setBounds(43, 310, 37, 42);
		menuPanel.add(personIcon);
		personIcon.setIcon(new ImageIcon(Menu.class.getResource("/main/resources/images/avatar-de-hombre.png")));
		
		JLabel peopleIcon = new JLabel("");
		peopleIcon.setBounds(43, 371, 39, 47);
		menuPanel.add(peopleIcon);
		peopleIcon.setIcon(new ImageIcon(Menu.class.getResource("/main/resources/images/avatares.png")));
		
		JLabel vehiclesIcon = new JLabel("");
		vehiclesIcon.setBounds(43, 432, 41, 40);
		menuPanel.add(vehiclesIcon);
		vehiclesIcon.setIcon(new ImageIcon(Menu.class.getResource("/main/resources/images/transporte.png")));
		
		JLabel dashboardIcon = new JLabel("");
		dashboardIcon.setBounds(43, 496, 37, 38);
		menuPanel.add(dashboardIcon);
		dashboardIcon.setIcon(new ImageIcon(Menu.class.getResource("/main/resources/images/sitio-web.png")));
		
		JLabel lblVersion = new JLabel("Version 1.0.0");
		lblVersion.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblVersion.setForeground(new Color(255, 255, 255));
		lblVersion.setBounds(166, 715, 97, 14);
		menuPanel.add(lblVersion);
		ImageIcon imgHome = new ImageIcon("../../../resources/images/casa.png");
	}
}
