package main.com.java.textFields;

import java.awt.Font;

import javax.swing.JTextField;

public class TextFields {

	public static JTextField searchTxtField() {
		/* Search box for the tables */
		
		JTextField textFieldSearch = new JTextField();
		textFieldSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldSearch.setToolTipText("Write here to search by name");
		textFieldSearch.setBounds(10, 11, 200, 40);
		textFieldSearch.setColumns(10);
		return textFieldSearch;
	}
	
	public static JTextField boatFormTextFields(int yPos) {
		JTextField jTxtField = new JTextField();
		jTxtField.setColumns(10);
		jTxtField.setBounds(86, yPos, 187, 20);
		return jTxtField;
	}
}
