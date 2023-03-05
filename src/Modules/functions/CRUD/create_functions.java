package Modules.functions.CRUD;

import javax.swing.JOptionPane;

import Modules.Concesionario.Clases.Rent;
import Modules.Concesionario.Clases.Sale;
import Modules.Concesionario.Clases.Singleton;
import Modules.Concesionario.Clases.Vinyl;
import Modules.utils.find_functions;

public class create_functions {

	public static void create_Sale(Sale sal) {
		int location = -1;

		sal = functions_services.ask_sale_id(" Cual es el identificador del producto que quieres crear ?");
		
	
		location = find_functions.find_sale(sal);
		
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "Ya existe este codigo en otro producto", "Error", JOptionPane.ERROR_MESSAGE);
		} else {
			sal = functions_services.create_sale();
			Singleton.sale.add(sal);
		}
	}

// create_rent

	public static void create_Rent(Rent ren) {
		int location = -1;

		ren = functions_services.ask_rent_id(" Cual es el identificador del producto que quieres crear ?");
		
	
		location = find_functions.find_rent(ren);
		
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "Ya existe este codigo en otro producto", "Error", JOptionPane.ERROR_MESSAGE);
		} else {
			ren = functions_services.create_rent();
			Singleton.Rent.add(ren);
		}
	}

	////////// create_vinyl ////////////////

	public static void create_vinyl(Vinyl vin) {
		int location = -1;

		vin = functions_services.ask_vinyl_id(" Cual es el identificador del servicio que quieres crear ?");
		

		location = find_functions.find_vinyl(vin);
		
		if (location != -1) {

			JOptionPane.showMessageDialog(null, "Ya existe este codigo en otro servicio", "Error", JOptionPane.ERROR_MESSAGE);

		} else {

			vin = functions_services.create_vinyl();

			Singleton.Vinyl.add(vin);
		}
	}

}	


