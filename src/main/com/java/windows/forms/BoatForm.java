package main.com.java.windows.forms;

import javax.swing.JFrame;

import main.com.java.entities.Boat;
import main.com.java.labels.Labels;
import main.com.java.textFields.TextFields;
import main.com.java.windows.AbstractWindows;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class BoatForm extends AbstractWindows {

	private static int[] minDimension = {360, 240};
	private static int[] maxDimension = {360, 240};
	private static String title = "Boat Form";
	private static int closeOperation = JFrame.DISPOSE_ON_CLOSE;
	private static int[] bounds = {100, 100, 622, 429};
	private static int[] panelBorders = {5, 5, 5, 5};
	private int[] lblWidthMBounds = {275, 283, 24, 14};
	private String lblWidthLengthTxt = "m";
	private int[]lblLengthMBounds = {275, 233, 24, 14};
	private String lblNameTxt = "Name";
	private int[] lblNameBounds= {10, 128, 74, 14};
	private String lblColorTxt = "Color";
	private int[] lblColorBounds = {10, 180, 73, 14};
	private String lblLengthTxt = "Length";
	private int[] lblLengthBounds = {10, 230, 74, 17};
	private String lblWidthTxt = "Width";
	private int[] lblWidthBounds = {10, 280, 74, 14};
	private JTextField txtFieldName;
	private JTextField txtFieldColor;
	private JTextField txtFieldLength;
	private JTextField txtFieldWidth;
	private JLabel lblWidthM;
	private JLabel lblLengthM;
	private JLabel lblName;
	private JLabel lblColor;
	private JLabel lblLength;
	private JLabel lblWidth;
	private int[] textFieldsYPos = {127, 177, 227, 277};

	public BoatForm() {
	
		super(minDimension, maxDimension, title, closeOperation, bounds, panelBorders);
		
		JLabel shipLogo = Labels.shipLogo();
		getContentPane().add(shipLogo);
		
		txtFieldName = TextFields.boatFormTextFields(textFieldsYPos[0]);
		getContentPane().add(txtFieldName);
		
		JLabel lblFormTitle = Labels.boatFormTitle();
		getContentPane().add(lblFormTitle);
		
		txtFieldColor = TextFields.boatFormTextFields(textFieldsYPos[1]);
		getContentPane().add(txtFieldColor);
		
		txtFieldLength = TextFields.boatFormTextFields(textFieldsYPos[2]);
		getContentPane().add(txtFieldLength);
		
		txtFieldWidth = TextFields.boatFormTextFields(textFieldsYPos[3]);
		getContentPane().add(txtFieldWidth);
		
		lblWidthM = Labels.boatFormTextFieldsLabels(lblWidthLengthTxt, lblWidthMBounds);
		getContentPane().add(lblWidthM);
		
		lblLengthM = Labels.boatFormTextFieldsLabels(lblWidthLengthTxt, lblLengthMBounds);
		getContentPane().add(lblLengthM);
		
		lblName = Labels.boatFormTextFieldsLabels(lblNameTxt, lblNameBounds);
		getContentPane().add(lblName);
		
		lblColor = Labels.boatFormTextFieldsLabels(lblColorTxt, lblColorBounds);
		getContentPane().add(lblColor);
		
		lblLength = Labels.boatFormTextFieldsLabels(lblLengthTxt, lblLengthBounds);
		getContentPane().add(lblLength);
		
		lblWidth = Labels.boatFormTextFieldsLabels(lblWidthTxt, lblWidthBounds);
		getContentPane().add(lblWidth);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Grabbing the txtFields attributes
				try {
					String name = txtFieldName.getText();
					String color = txtFieldName.getText();
					double length = Double.parseDouble(txtFieldLength.getText());
					double width = Double.parseDouble(txtFieldWidth.getText());
					
					// Vehicle instance for aggrupation of the grabbed data
					Boat boat = new Boat(name, color, length, width);
					System.out.println(boat);

					// Send the data to the excel
					// pass
				} catch (NullPointerException NullPointExc) {
					System.out.println("Pasaron cosas  malas");
					NullPointExc.printStackTrace();
				} finally {
					txtFieldName.setText("");
					txtFieldColor.setText("");
					txtFieldLength.setText("");
					txtFieldWidth.setText("");
				}
			}
		});
		btnSubmit.setBounds(86, 320, 187, 23);
		getContentPane().add(btnSubmit);
		
	}
}
