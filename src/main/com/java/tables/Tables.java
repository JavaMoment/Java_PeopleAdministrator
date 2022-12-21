package main.com.java.tables;

import java.awt.Color;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tables {
	
	public static JTable showPeopTable() {
		JTable tablePeople = new JTable();
		tablePeople.setShowVerticalLines(false);
		tablePeople.setShowHorizontalLines(false);
		tablePeople.setShowGrid(false);
		tablePeople.setForeground(new Color(255, 255, 255));
		tablePeople.setBackground(new Color(255, 255, 255));
		tablePeople.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Gonza"},
				{"2", "Gonza2"},
			},
			new String[] {
				"Prueba", "Prueba2"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tablePeople.getColumnModel().getColumn(0).setResizable(false);
		tablePeople.getColumnModel().getColumn(1).setResizable(false);
		tablePeople.setBounds(270, 150, 738, 568);
		return tablePeople;
	}

}
