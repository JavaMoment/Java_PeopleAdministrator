package main.com.java.windows.forms;

import javax.swing.JFrame;

import main.com.java.windows.AbstractWindows;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblWidthM;
	private JLabel lblLengthM;
	private JLabel lblName;
	private JLabel lblColor;
	private JLabel lblLength;
	private JLabel lblNewLabel_6;


	public BoatForm() {
	
		super(minDimension, maxDimension, title, closeOperation, bounds, panelBorders);
		setIconImage(Toolkit.getDefaultToolkit().getImage(BoatForm.class.getResource("/main/resources/images/logos/uteclogo.png")));
		getContentPane().setLayout(null);
		
		JLabel shipLogo = new JLabel("");
		shipLogo.setHorizontalAlignment(SwingConstants.CENTER);
		shipLogo.setIcon(new ImageIcon(BoatForm.class.getResource("/main/resources/images/logos/ship.png")));
		shipLogo.setBounds(295, 65, 290, 296);
		getContentPane().add(shipLogo);
		
		textField = new JTextField();
		textField.setBounds(86, 127, 187, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblFormTitle = new JLabel("Ship Form");
		lblFormTitle.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 40));
		lblFormTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormTitle.setBounds(31, 11, 280, 61);
		getContentPane().add(lblFormTitle);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(86, 177, 187, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(86, 227, 187, 20);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(86, 277, 187, 20);
		getContentPane().add(textField_3);
		
		lblWidthM = new JLabel("m");
		lblWidthM.setFont(new Font("Verdana", Font.BOLD, 15));
		lblWidthM.setBounds(275, 283, 24, 14);
		getContentPane().add(lblWidthM);
		
		lblLengthM = new JLabel("m");
		lblLengthM.setFont(new Font("Verdana", Font.BOLD, 15));
		lblLengthM.setBounds(275, 233, 24, 14);
		getContentPane().add(lblLengthM);
		
		lblName = new JLabel("Name");
		lblName.setFont(new Font("Verdana", Font.BOLD, 15));
		lblName.setBounds(10, 128, 74, 14);
		getContentPane().add(lblName);
		
		lblColor = new JLabel("Color");
		lblColor.setFont(new Font("Verdana", Font.BOLD, 15));
		lblColor.setBounds(10, 180, 73, 14);
		getContentPane().add(lblColor);
		
		lblLength = new JLabel("Length");
		lblLength.setFont(new Font("Verdana", Font.BOLD, 15));
		lblLength.setBounds(10, 230, 74, 17);
		getContentPane().add(lblLength);
		
		lblNewLabel_6 = new JLabel("Width");
		lblNewLabel_6.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_6.setBounds(10, 280, 74, 14);
		getContentPane().add(lblNewLabel_6);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmit.setBounds(86, 320, 187, 23);
		getContentPane().add(btnSubmit);
		
	}
}
