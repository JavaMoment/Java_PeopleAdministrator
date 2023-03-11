package main.com.java.windows.forms;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import main.com.java.buttons.Buttons;
import main.com.java.interfaces.Themes;
import main.com.java.windows.AbstractFormsWindows;
import main.com.java.windows.Menu;

public class BoatForm extends AbstractFormsWindows {

	private JToggleButton tglbtnTheme = Buttons.themeButton();
	private static BoatForm frame;
	//private static int[] maxDimension;
	private JPanel contentPane;
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
