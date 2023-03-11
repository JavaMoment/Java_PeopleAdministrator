package main.com.java.windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.com.java.buttons.Buttons;
import main.com.java.labels.Labels;
import main.com.java.interfaces.Themes;
import main.com.java.panels.HomePanel;
import main.com.java.panels.MenuPanel;
import main.com.java.panels.ShowPeoplePanel;
<<<<<<< Updated upstream
import main.com.java.panels.ShowVehiclesPanel;
=======
import main.com.java.windows.forms.BoatForm;
>>>>>>> Stashed changes
import main.resources.data.Data;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Menu extends JFrame implements Themes{

	private JPanel contentPane;
	private JPanel dynamicPanel;
	private MenuPanel menuPanel;
	private HomePanel homePanel;
	private ShowPeoplePanel showPeopPanel;
	private ShowVehiclesPanel showVehiclesPanel;
	private JToggleButton tglbtnTheme = Buttons.themeButton();
	private static Menu frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(hiFiTheme);
					
					frame = new Menu();
					frame.setVisible(true);
					
				} catch (UnsupportedLookAndFeelException ex) {
					Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/* Creation of the panels used by the program */
		menuPanel = new MenuPanel();
		homePanel = new HomePanel();
		showPeopPanel = new ShowPeoplePanel();
		showVehiclesPanel = new ShowVehiclesPanel();

		/* Starting the home panel as the initial panel */
		dynamicPanel = homePanel;
		dynamicPanel.add(tglbtnTheme);
		
		JButton btnHome = Buttons.homeButton();
		menuPanel.add(btnHome);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePanel(homePanel);
			}
		});
		
		JButton btnAddPerson = Buttons.addPersonButton();
		menuPanel.add(btnAddPerson);
		btnAddPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BoatForm bf = new BoatForm();
				bf.setVisible(true);
							}
		});
		
		JButton btnShowPeople = Buttons.showPeopleButton();
		menuPanel.add(btnShowPeople);
		btnShowPeople.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePanel(showPeopPanel);
							}
		});
				
		JButton btnShowVehicles = Buttons.showVehiclesButton();
		menuPanel.add(btnShowVehicles);
		btnShowVehicles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePanel(showVehiclesPanel);
							}
		});
		
		JButton btnDashboard = Buttons.dashboardButton();
		menuPanel.add(btnDashboard);
		
		JLabel lblVersion = Labels.versionLabel();
		menuPanel.add(lblVersion);

				
		tglbtnTheme.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				/* Logic for the selection of program themes between light and dark depending on the tglbtnTheme */
				if(tglbtnTheme.isSelected()) {
					changeToDarkTheme();
				} else {
					changeToLightTheme();
				}
			}
		});
		
		/* Adding all of the panels into the main pane and starting the program with the menu and home panel visibles */
		contentPane.add(dynamicPanel);
		contentPane.add(homePanel);
		contentPane.add(menuPanel);
		contentPane.add(showPeopPanel);
		contentPane.add(showVehiclesPanel);
		homePanel.setVisible(true);
		menuPanel.setVisible(true);
		showPeopPanel.setVisible(false);
		showVehiclesPanel.setVisible(false);
	}
	
	private void changePanel(JPanel pane) {
		/* This method will change the panel depending on the panel needed by the interaction of the user with the menu buttons */
		dynamicPanel.setVisible(false);
		dynamicPanel = pane;
		dynamicPanel.setVisible(true);
		dynamicPanel.add(tglbtnTheme);
	}
	
	private void changeTheme(String theme, LookAndFeel look) {
		tglbtnTheme.setText(theme);
		try {
			UIManager.setLookAndFeel(look);
			SwingUtilities.updateComponentTreeUI(frame);
			frame.pack();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	private void changeToLightTheme() {
		/* This method will change the UI to the light theme */
		changeTheme("Dark Theme", mintTheme);
	}
	
	private void changeToDarkTheme() {
		/* This method will change the UI to the dark theme */
		changeTheme("Light Theme", hiFiTheme);
	}
}
