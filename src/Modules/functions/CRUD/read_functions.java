package Modules.functions.CRUD;

import javax.swing.JOptionPane;

import Modules.Concesionario.Clases.Sale;
import Modules.Concesionario.Clases.Singleton;
import Modules.utils.data_functions;
import Modules.utils.find_functions;
import Modules.utils.functions_menu;

public class read_functions {

	public static Sale find_sale_id () {

		Singleton.id = data_functions.askid("¿ Cual es el código de la venta ?", "Código de referencia");

		return new Sale (Singleton.id);

	}


	public static void read_Sale(Sale sal ) {
		
	
		String[] menu = {"All", "One to one", "Volver"};
		boolean key_menu_read = false;
		boolean key_volver = false;
		int location = -1;
		String[] atributos = {"id", "client_name", "car_type", "payment_method", "price", "payment_type", "Volver", "Todos"};
		String atributo = "";

		
		if (Singleton.sale.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No existe ninguna venta para poder leer", "Error", JOptionPane.ERROR_MESSAGE);

		}

		else {
			do {
				int option_menu_read = functions_menu.menubuttons(menu, "¿ Cuantos servicios quiere ver ?", "Elija la opción deseada");

				switch (option_menu_read) {


				case 0: 

					for(int i=0; i < Singleton.sale.size(); i++) {
						String cad = "";
						cad = (Singleton.sale.get(i).toString());
						JOptionPane.showMessageDialog(null, cad, "Ventas", JOptionPane.INFORMATION_MESSAGE);
					}

					key_menu_read = true;
					break;

				case 1:
					
					key_menu_read = true;
					
					location = -1;
					sal = find_sale_id();	
					location = find_functions.find_sale(sal);
				
					if (location != -1) {
						sal = Singleton.sale.get(location);
						
						int option_menu_venta_caracteristicas = functions_menu.menubuttons(atributos, "¿ Qué operación desea realizar ?", "Elija la opción deseada");

						do {

							switch (option_menu_venta_caracteristicas) {

							case 0: 
								
								atributo = ("Identificador: " + sal.getid());
								break;
			
							case 1: 
								atributo = ("Nombre del cliente: " + sal.getclient_name());
								break;
			
							case 2: 
								atributo = ("Tipo de vehículo: " + sal.getcar_type());
								break;
			
							case 3: 
								atributo = ("Método de pago: " + sal.getpayment_method());
								break;
			
							case 4: 
								atributo = ("Precio: " + sal.getprice());
								break;
								
							case 5: 
								atributo = ("Tipo de pago: " + sal.getpayment_type());
								break;

							case 6:	
								atributo = ("Volver");
								key_volver = false;
								break;
								
							case 7: 
								atributo = (sal.toString());

			
							default: 
								key_menu_read = false;
								JOptionPane.showMessageDialog(null, "Salir");

								break;
							}	
							JOptionPane.showMessageDialog(null, atributo, "atributo", JOptionPane.INFORMATION_MESSAGE);
						
					}while (key_volver != false);

					}else {
						JOptionPane.showMessageDialog(null, "No existe el producto", "No existe", JOptionPane.ERROR_MESSAGE);

					}

					break;
					
				default:
					key_menu_read = false;
					break;
					
				}

			}while(key_menu_read == true);

		}		
	}
}