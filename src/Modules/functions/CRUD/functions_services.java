package Modules.functions.CRUD;


import javax.swing.JOptionPane;

import Modules.Concesionario.Clases.Sale;
import Modules.Concesionario.Clases.Singleton;
import Modules.utils.data_functions;
import Modules.utils.find_functions;
import Modules.utils.functions_menu;
import utils.validates;
import Modules.Concesionario.Clases.Service;

public class functions_services {

	public static Sale create_sale () {
		
		String id = Singleton.id;
		
		String client_name = data_functions.askclient_name("Escriba su nombre", "Nombre");
		
		String[] option_car_type = { "Familiar", "Alta gama", "Clásico" };
		String car_type = validates.combo(option_car_type, "Seleccione el tipo de vehículo desea", "Tipo de vehículo");
		
		String[] option_payment_method = { "Efectivo", "Tarjeta", "Transferencia" };
		String payment_method = validates.combo(option_payment_method, "Seleccione el método de pago que desea", "Método de pago");
				
		int price = validates.price("Este es su precio", "Precio");
		
		String[] option_payment_type = { "Contado", "Financiado" };
		String payment_type = validates.combo(option_payment_type, "Seleccione el tipo de pago", "Tipo de pago");
		
		return new Sale(id, client_name, car_type, payment_method, price, payment_type); 

	}	

	public static Sale create_sale_id () {
		
		Singleton.id = data_functions.askid("¿Qué identificador va a asignar al servicio?", "Id");

		return new Sale (Singleton.id);

	}


/////////// UPDATE //////////	

public static void update_Sale_id(Sale sal, Service ser) {

	int location = -1;

	sal = functions_services.create_sale_id();

	location = find_functions.find_sale(sal);

	if (location != -1) {

		JOptionPane.showMessageDialog(null, "Ya existe este identificador", "Error", JOptionPane.ERROR_MESSAGE);

	}else {

		ser.setid(Singleton.id);

	}

}

	public static void update(Service ser) {

		if (ser instanceof Sale) {

			String[] menu = { "id", "client_name", "car_type", "payment_method", "price", "payment_type"};
			int option_menu = 0;
			boolean key = false;
			Sale sal = null;

			do {

				option_menu = functions_menu.menubuttons(menu, "¿ Qué operación desea cambiar ?", "Elija la opción deseada");

				switch (option_menu) {

				case 0: 

					functions_services.update_Sale_id(sal, ser);
					key = true;
					break;
				
				case 1:

					String owner_name = data_functions.askclient_name("¿A qué nombre quiere que esté el servicio?", "Nombre");
					ser.setclient_name(owner_name);
					key = true;
					break;

				case 2: 

					String[] option_car_type = { "Familiar", "Alta gama", "Clásico" };
					ser.setcar_type(validates.combo(option_car_type, "¿A qué tipo de vehículo desea cambiar?", "Tipo de coche"));
					key = true;
					break;

				case 3:

				String[] option_payment_method = { "Efectivo", "Tarjeta", "Transferencia" };
					ser.setpayment_method(validates.combo(option_payment_method, "¿A qué método de pago desea cambiar?", "Método de pago"));
					key = true;
					break;

				case 4: 

					int price = validates.price("¿Qué precio tenía el servicio?", "Precio");
					ser.setPrice(price);
					key = true;
					break;

				case 5:

				String[] option_payment_type = { "Contado", "Financiado" };
					String payment_type = validates.combo(option_payment_type, "¿A qué tipo de pago quiere cambiar?", "Tipo de pago");
					((Sale) ser).setpayment_type(payment_type);
					key = true;
					break;

				default:
					
					key = true;
					break;

				}

			}while (key != true);
			
		}

	}

}