package main.com.java.windows;

import java.awt.Dimension;
import java.awt.EventQueue;
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

public abstract class AbstractFormsWindows extends JFrame implements Themes {

	public static JToggleButton tglbtnTheme = Buttons.themeButton();
	public static JFrame frame = new JFrame();
	public static JPanel contentPane;
	
	public AbstractFormsWindows(int[] minDim, int[] maxDim,
								String title, int closeOp, 
								int[] bounds, int[] panelBorders) {
		
		setMaximumSize(new Dimension(minDim[0], minDim[1]));
		setMinimumSize(new Dimension(maxDim[0], maxDim[1]));
		setTitle(title);
		setDefaultCloseOperation(closeOp);
		setBounds(bounds[0], bounds[1], bounds[2], bounds[3]);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(panelBorders[0], panelBorders[1], panelBorders[2], panelBorders[3]));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//contentPane.add(tglbtnTheme);
	}

}
