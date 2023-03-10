package main.com.java.panels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import main.com.java.buttons.Buttons;
import main.com.java.interfaces.Themes;
import main.com.java.tables.Tables;
import main.com.java.textFields.*;
import main.resources.data.Data;

import javax.swing.table.DefaultTableModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class ShowVehiclesPanel extends JPanel implements Themes {
	private JTable vehiclesTable;
	private JTextField textFieldSearch;

	/**
	 * Create the panel.
	 */
	public ShowVehiclesPanel() {
		
		/* Creates the panel for the showing of people uploaded into the program */

		setBounds(269, 0, 739, 729);
		setLayout(null);
		
		JScrollPane scrollPaneVehiclesPanel= new JScrollPane();
		scrollPaneVehiclesPanel.setBounds(10, 120, 719, 598);
		add(scrollPaneVehiclesPanel);
		
		vehiclesTable = new JTable();
		scrollPaneVehiclesPanel.setViewportView(vehiclesTable);
		vehiclesTable.setModel(new DefaultTableModel(
			new Object[][] {
				
				{"1", "Mercedes", "Azul", 5, "7x5", "PEP GUARDIOLA"},

			},
			new String[] {
				"ID", "Nombre", "Color", "Cantida de pasajeros", "Meidadas (m)" ,"Dueño"
			}
		));
		
		JTextField textFieldSearch = TextFields.searchTxtField();
		add(textFieldSearch);
		
		add(Buttons.refreshButton());
		JButton btnOrderAscBy = Buttons.orderByAscButton();
		add(btnOrderAscBy);
		JButton btnOrderDescBy = Buttons.orderByDescButton();
		add(btnOrderDescBy);
		add(Buttons.searchButton());
		
		vehiclesTable.getColumnModel().getColumn(0).setResizable(false);
		
		
	}
}
