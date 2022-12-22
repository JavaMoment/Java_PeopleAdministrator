package main.com.java.panels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import main.com.java.interfaces.Themes;
import main.com.java.tables.Tables;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

public class ShowPeoplePanel extends JPanel implements Themes {
	private JTable tablePeople;

	/**
	 * Create the panel.
	 */
	public ShowPeoplePanel() {

		setBackground(darkTheme[1]);
		setBounds(269, 0, 739, 729);
		setLayout(null);
				
		JLabel lblNewLabel = new JLabel("Probando");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(556, 11, 226, 56);
		add(lblNewLabel);
		
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
		tablePeople.getColumnModel().getColumn(0).setResizable(false);
		
		
	}
}
