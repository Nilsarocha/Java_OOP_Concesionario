package Modules.utils;

import javax.swing.JOptionPane;

import utils.regular_exp;
import utils.validates;

public class data_functions {

	public static String askid (String message, String title) {
		boolean result = false;
		String id = "";

		do {
			id = validates.cad(message, title);
			result = regular_exp.id(id);

			if (result == false) {
				JOptionPane.showMessageDialog(null, "No es un codigo de referencia valido", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				result = true;
			}
		} while (result == false);
		return id;
	}
	
	public static String askclient_name(String message, String title ){


		String client_name = ""; 
		boolean result = false;

		do{

			client_name = validates.cad(message, title);
			result = regular_exp.client_name(client_name);

			if ( result == false){
				JOptionPane.showMessageDialog(null, "No es un nombre válido", "Error", JOptionPane.ERROR_MESSAGE);
			}else {
				result = true;	
			}


		}while (result == false);	
		return client_name;

	}



}






