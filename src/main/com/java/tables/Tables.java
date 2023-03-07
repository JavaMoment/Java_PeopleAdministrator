package main.com.java.tables;

import java.awt.Color;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tables {
	
	public static JTable showPeopTable() {
		/* Table made for the showing of the people uploaded into the program */
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
	
	public static JTable showVehiclesTable() {
		/* Table made for the showing of the people uploaded into the program */
		JTable vehiclesTable = new JTable();
		vehiclesTable.setModel(new DefaultTableModel(
				new Object[][] {
					{"1", "Mercedes", "Azul", 5, "7x5", "PEP GUARDIOLA"},
				},
				new String[] {
					"ID", "Nombre", "Color", "Cantida de pasajeros", "Medidas (m)", "Dueño"
				}
			));
			vehiclesTable.getColumnModel().getColumn(0).setResizable(false);
		return vehiclesTable;
	}

}
