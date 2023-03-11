package main.com.java.windows.forms;

import javax.swing.JFrame;

import main.com.java.windows.AbstractWindows;

@SuppressWarnings("serial")
public class BoatForm extends AbstractWindows {

	private static int[] minDimension = {1024, 768};
	private static int[] maxDimension = {1024, 768};
	private static String title = "Boat Form";
	private static int closeOperation = JFrame.DISPOSE_ON_CLOSE;
	private static int[] bounds = {100, 100, 622, 429};
	private static int[] panelBorders = {5, 5, 5, 5};


	public BoatForm() {
	
		super(minDimension, maxDimension, title, closeOperation, bounds, panelBorders);
		
	}
	
}
