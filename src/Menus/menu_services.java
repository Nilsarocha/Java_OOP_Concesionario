package Menus;

import Modules.functions.CRUD.create_functions;
import Modules.functions.CRUD.delete_functions;
import Modules.functions.CRUD.read_functions;
import Utils.functions_menu;
import javax.swing.JOptionPane;
import Modules.Concesionario.Clases.Sale;
import Modules.Concesionario.Clases.Singleton;
import java.util.ArrayList;

public class menu_services {

	public static void main(String[] args) {


		String[] services = { "Venta", "Alquiler", "Vinilar", "Salir" };
		String[] crud = { "Create", "Read", "Update", "Delete", "Atrás", "Salir" };
		boolean key_menu_services, key_menu_venta, key_menu_alquiler, key_menu_vinilar = false;
		Sale sal = null;
		Singleton.sale = new ArrayList <Sale> ();

		do {


			int option_menu_services = functions_menu.menubuttons(services, "Seleccione un servicio", "Servicios");


			switch (option_menu_services) {

			case 0:{ //Venta
				key_menu_services = true;
				do{
					int option_menu_venta = functions_menu.menubuttons(crud, "Seleccione el tipo de servicio", "Venta");
	
	
					switch (option_menu_venta) {
	
	
					case 0: //create
						
						create_functions.create_Sale(sal);
						key_menu_venta = true;
						break;
	
					case 1: //read
						read_functions.read_sale(sal);
						key_menu_venta = true;
						break;
	
					case 2: //Update
						JOptionPane.showMessageDialog(null, "Update");
						key_menu_venta = true;
						break;
	
					case 3: //Delete
						delete_functions.delete_Sale(sal);
						key_menu_venta = true;
						break;
	
					case 4: //Atrás
						JOptionPane.showMessageDialog(null, "Atrás");
						key_menu_venta = false;
						break;
	
					default: //Salir
						JOptionPane.showMessageDialog(null, "Salir");
						key_menu_venta = false;
						key_menu_services = false;
						break;
	
					}	
				}while(key_menu_venta == true);
				break;
		}

		//----------------------CASE 1----------------------------------------------------	
			
			case 1:{ //Alquiler
				key_menu_services = true;
				do{
					int option_menu_alquiler = functions_menu.menubuttons(crud, "Seleccione el tipo de servicio", "Alquiler");
	
	
					switch (option_menu_alquiler) {
	
	
					case 0: //create
						JOptionPane.showMessageDialog(null, "Create");
						key_menu_alquiler = true;
						break;
	
					case 1: //read
						JOptionPane.showMessageDialog(null, "Read");
						key_menu_alquiler = true;
						break;
	
					case 2: //Update
						JOptionPane.showMessageDialog(null, "Update");
						key_menu_alquiler = true;
						break;
	
					case 3: //Delete
						JOptionPane.showMessageDialog(null, "Delete");
						key_menu_alquiler = true;
						break;
	
					case 4: //Atrás
						JOptionPane.showMessageDialog(null, "Atrás");
						key_menu_alquiler = false;
						break;
	
					default: //Salir
						JOptionPane.showMessageDialog(null, "Salir");
						key_menu_alquiler = false;
						key_menu_services = false;
						break;
	
					}	
				}while(key_menu_alquiler == true);
				break;
		}

				
		////------------ Vinilar-----------------		

			case 2: { //Vinilar
				key_menu_services = true;
				do{
					int option_menu_vinilar = functions_menu.menubuttons(crud, "Seleccione el tipo de servicio", "Vinilar");
	
	
					switch (option_menu_vinilar) {
	
	
					case 0: //create
						JOptionPane.showMessageDialog(null, "Create");
						key_menu_vinilar = true;
						break;
	
					case 1: //read
						JOptionPane.showMessageDialog(null, "Read");
						key_menu_vinilar = true;
						break;
	
					case 2: //Update
						JOptionPane.showMessageDialog(null, "Update");
						key_menu_vinilar = true;
						break;
	
					case 3: //Delete
						JOptionPane.showMessageDialog(null, "Delete");
						key_menu_vinilar = true;
						break;
	
					case 4: //Atrás
						JOptionPane.showMessageDialog(null, "Atrás");
						key_menu_vinilar = false;
						break;
	
					default: //Salir
						JOptionPane.showMessageDialog(null, "Salir");
						key_menu_vinilar = false;
						key_menu_services = false;
						break;
	
					}	
				}while(key_menu_vinilar == true);
				break;
		}
				
		//-------- salir-----------------		

			default: //Salir
				JOptionPane.showMessageDialog(null, "Salir");
				key_menu_services = false;

				break;
			}	

	}while(key_menu_services == true);

}
}