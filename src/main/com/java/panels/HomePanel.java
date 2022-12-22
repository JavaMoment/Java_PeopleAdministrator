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

		setBackground(darkTheme[1]);
		setBounds(269, 0, 739, 729);
		setLayout(null);
		
		JLabel lblWelcome = Labels.welcomeLabel();
		add(lblWelcome);
		Data.lblArr.add(lblWelcome);
		
		JLabel lblPeopleCount = Labels.peopleCountLabel();
		add(lblPeopleCount);
		Data.lblArr.add(lblPeopleCount);
		
		JLabel lblVehiclesCount = Labels.vehiclesCountLabel();
		add(lblVehiclesCount);
		Data.lblArr.add(lblVehiclesCount);

		JLabel lblPCount = Labels.peopleCount();
		add(lblPCount);
		Data.lblArr.add(lblPCount);
		
		JLabel lblVCount = Labels.vehiCount();
		add(lblVCount);
		Data.lblArr.add(lblVCount);

		
	}

}
