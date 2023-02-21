package Modules.utils;

import javax.swing.JOptionPane;

public class functions_menu {
	
	//// FIRST MENU //////
	public static int menubuttons(String[] options, String message, String title) {
		
		int option = JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		
		return option;
	}

}