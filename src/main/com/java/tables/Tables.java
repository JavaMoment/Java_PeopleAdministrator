package main.com.java.tables;

import java.awt.Color;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tables {
	
	public static JTable showPeopTable() {
		JTable tablePeople = new JTable();
		tablePeople.setModel(new DefaultTableModel(
				new Object[][] {
					{"1", "Gonza", "Ruiz"},
					{"2", "Juan", "Perez"},
				},
				new String[] {
					"ID", "Nombre", "Apellido"
				}
			));
			tablePeople.getColumnModel().getColumn(0).setResizable(false);
		return tablePeople;
	}

}
