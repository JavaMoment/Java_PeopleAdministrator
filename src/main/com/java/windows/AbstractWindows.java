package main.com.java.windows;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import main.com.java.buttons.Buttons;
import main.com.java.interfaces.Themes;

@SuppressWarnings("serial")
public class AbstractWindows extends JFrame implements Themes {

	public static JToggleButton tglbtnTheme = Buttons.themeButton();
	public static JFrame frame = new JFrame();
	public static JPanel contentPane;
	
	public AbstractWindows(int[] minDim, int[] maxDim,
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
		
		tglbtnTheme.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				/* Logic for the selection of program themes between light and dark depending on the tglbtnTheme */
				if(tglbtnTheme.isSelected()) {
					changeToDarkTheme();
				} else {
					changeToLightTheme();
				}
			}
		});

	}
	
	private void changeTheme(String theme, LookAndFeel look) {
		tglbtnTheme.setText(theme);
		try {
			UIManager.setLookAndFeel(look);
			SwingUtilities.updateComponentTreeUI(frame);
			frame.pack();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void changeToLightTheme() {
		/**
		 * This method will change the UI to the light theme 
		 * */
		changeTheme("Dark Theme", mintTheme);
	}
	
	public void changeToDarkTheme() {
		/* This method will change the UI to the dark theme */
		changeTheme("Light Theme", hiFiTheme);
	}
	
}
