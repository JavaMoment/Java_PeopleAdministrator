package main.com.java.panels;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.com.java.interfaces.Themes;
import main.com.java.labels.Labels;
import main.resources.data.Data;

public class HomePanel extends JPanel implements Themes {

	/**
	 * Create the panel.
	 */
	public HomePanel() {
		
		/* Creates the initial panel showed and accessed by the Home button */

		setBounds(269, 0, 739, 729);
		setLayout(null);
		
		JLabel lblWelcome = Labels.welcomeLabel();
		add(lblWelcome);
		
		JLabel lblPeopleCount = Labels.peopleCountLabel();
		add(lblPeopleCount);
		
		JLabel lblVehiclesCount = Labels.vehiclesCountLabel();
		add(lblVehiclesCount);

		JLabel lblPCount = Labels.peopleCount();
		add(lblPCount);
		
		JLabel lblVCount = Labels.vehiCount();
		add(lblVCount);

		
	}

}
