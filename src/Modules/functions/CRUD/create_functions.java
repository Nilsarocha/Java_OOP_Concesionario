package Modules.functions.CRUD;

import javax.swing.JOptionPane;

import Modules.Concesionario.Clases.Sale;
import Modules.Concesionario.Clases.Singleton;
import Modules.utils.find_functions;

public class create_functions {

	public static void create_Sale(Sale sal) {
		int location = -1;

		sal = functions_services.create_sale_id();
		
	
		location = find_functions.find_sale(sal);
		
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "Ya existe este codigo en otro producto", "Error", JOptionPane.ERROR_MESSAGE);
		} else {
			sal = functions_services.create_sale();
			Singleton.sale.add(sal);
		}
	}
}	
