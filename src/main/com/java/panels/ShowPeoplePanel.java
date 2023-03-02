package main.com.java.panels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import main.com.java.buttons.Buttons;
import main.com.java.interfaces.Themes;
import main.com.java.tables.Tables;
import main.com.java.textFields.TextFields;
import main.resources.data.Data;

import javax.swing.table.DefaultTableModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class ShowPeoplePanel extends JPanel implements Themes {
	private JTable tablePeople;
	private JTextField textFieldSearch;

	/**
	 * Create the panel.
	 */
	public ShowPeoplePanel() {
		
		/* Creates the panel for the showing of people uploaded into the program */

		setBounds(269, 0, 739, 729);
		setLayout(null);
		
		JScrollPane scrollPanePeopTable = new JScrollPane();
		scrollPanePeopTable.setBounds(10, 120, 719, 598);
		add(scrollPanePeopTable);
		
		tablePeople = new JTable();
		scrollPanePeopTable.setViewportView(tablePeople);
		tablePeople.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Gonza", "Ruiz", null},
				{"2", "Juan", "Perez", null},
			},
			new String[] {
				"ID", "Nombre", "Apellido", "Telefono"
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
		
		tablePeople.getColumnModel().getColumn(0).setResizable(false);
		
		
	}
}
