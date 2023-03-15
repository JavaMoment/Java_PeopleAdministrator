package main.com.java.interfaces;

import javax.swing.LookAndFeel;

import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.jtattoo.plaf.mint.MintLookAndFeel;

public interface Themes {
	/* This interface contains the Look and Feel themes used by the program */
	
	public static final LookAndFeel hiFiTheme = new HiFiLookAndFeel();
	
	public static final LookAndFeel mintTheme = new MintLookAndFeel();
	
}
