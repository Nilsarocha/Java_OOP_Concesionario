package Modules.functions.CRUD;


import Modules.Concesionario.Clases.Sale;
import Modules.Concesionario.Clases.Singleton;
import Modules.utils.data_functions;
import utils.validates;

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

}








