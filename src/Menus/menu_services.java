package Menus;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modules.Concesionario.Clases.Rent;
import Modules.Concesionario.Clases.Sale;
import Modules.Concesionario.Clases.Singleton;
import Modules.Concesionario.Clases.Vinyl;
import Modules.functions.CRUD.create_functions;
import Modules.functions.CRUD.delete_functions;
import Modules.functions.CRUD.order_functions;
import Modules.functions.CRUD.read_functions;
import Modules.functions.CRUD.update_functions;
import Modules.utils.functions_menu;

public class menu_services {

	public static void main(String[] args) {


		String[] services = { "Venta", "Alquiler", "Vinilar", "Salir" };
		String[] crud = { "Create", "Read", "Update", "Delete", "Ordenar", "Atrás", "Salir" };
		boolean key_menu_services = false;
		int option_menu_crud = 0;
		Sale sal = null;
		Rent ren = null;
		Vinyl vin = null;
		Singleton.sale = new ArrayList <Sale> ();
		Singleton.Rent = new ArrayList<Rent>();
		Singleton.Vinyl = new ArrayList<Vinyl>();
		Boolean key_crud = false;

		do {
			key_menu_services = true;

			int option_menu_services = functions_menu.menubuttons(services, "Seleccione un servicio", "Servicios");

			switch (option_menu_services) {

			case 0:{ //Venta
	
				do{
					int option_menu_venta = functions_menu.menubuttons(crud, "Seleccione el tipo de servicio", "Venta");
	
					key_crud = true;
					
					switch (option_menu_venta) {
	
	
					case 0: //create
						
						create_functions.create_Sale(sal);

						break;
	
					case 1: //read
						read_functions.read_Sale(sal);
						break;
	
					case 2: //Update
						update_functions.update_Sale(sal);
						break;
	
					case 3: //Delete
						delete_functions.delete_Sale(sal);
						break;

					case 4: // ordenar	
						System.out.println("option_menu_services= " + option_menu_crud);
						order_functions.order_Sale();
						break;
	
					case 5: //Atrás
						JOptionPane.showMessageDialog(null, "Atrás");
						key_crud = false;
						break;
	
					default: //Salir
						JOptionPane.showMessageDialog(null, "Salir");
						key_crud = false;
						key_menu_services = false;
						break;
	
					}	
				}while(key_crud != false);
				break;
		}

		//----------------------CASE 1----------------------------------------------------	
			
			case 1:{ //Alquiler

				do{
					int option_menu_alquiler = functions_menu.menubuttons(crud, "Seleccione el tipo de servicio", "Alquiler");
	
					key_crud = true;

					switch (option_menu_alquiler) {
	
	
					case 0: //create
						create_functions.create_Rent(ren);
						break;
	
					case 1: //read
						read_functions.read_Rent(ren);
						break;

					case 2: //Update
						update_functions.update_Rent(ren);
						break;
	
					case 3: //Delete
						delete_functions.delete_Rent(ren);
						break;

					case 4: //Ordenar
						order_functions.order_Rent();
						break;
	
					case 5: //Atrás
						JOptionPane.showMessageDialog(null, "Atrás");
						key_crud = false;
						break;
	
					default: //Salir
						JOptionPane.showMessageDialog(null, "Salir");
						key_crud = false;
						key_menu_services = false;
						break;
	
					}	
				}while(key_crud != false);
				break;
		}

				
		////------------ Vinilar-----------------		

			case 2: { //Vinilar

				do{
					int option_menu_vinilar = functions_menu.menubuttons(crud, "Seleccione el tipo de servicio", "Vinilar");
	
					key_crud = true;

					switch (option_menu_vinilar) {
	
	
					case 0: //create
						create_functions.create_vinyl(vin);
						break;
	
					case 1: //read
						read_functions.read_vinyl(vin);
						break;
	
					case 2: //Update
						update_functions.update_Vinyl(vin);
						break;
	
					case 3: //Delete
						delete_functions.delete_Vinyl(vin);
						break;

					case 4: // ordenar
						order_functions.order_Vinyl();
						break;	

					case 5: //Atrás
						JOptionPane.showMessageDialog(null, "Atrás");
						key_crud = false;
						break;
	
					default: //Salir
						JOptionPane.showMessageDialog(null, "Salir");
						key_crud = false;
						key_menu_services = false;
						break;
	
					}	
				}while(key_crud != false);
				break;
			}
				
		//-------- salir-----------------		

			default: //Salir
				JOptionPane.showMessageDialog(null, "Salir");
				key_menu_services = false;

				break;
			}	

		}while(key_menu_services != false);

	}
}