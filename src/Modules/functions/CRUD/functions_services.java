package Modules.functions.CRUD;

import javax.swing.JOptionPane;

import Modules.Concesionario.Clases.Singleton;
import Utils.data_functions;
import Modules.Concesionario.Clases.Sale;

public class functions_services {

	public static Sale create_sale () {
		
		int price = 0;
		String id = Singleton.id;
		
		String client_name = JOptionPane.showInputDialog (null, "Escriba su nombre", "Nombre", JOptionPane.QUESTION_MESSAGE);
		
		String[] option_car_type = { "Familiar", "Alta gama", "Clásico" };
		String car_type = JOptionPane.showInputDialog (null, "Seleccione el tipo de vehículo desea", "Tipo de vehículo", JOptionPane.QUESTION_MESSAGE);
		
		System.out.println("El usuario eligió el tipo de coche: " + option_car_type);
		
		String[] option_payment_method = { "Efectivo", "Tarjeta", "Transferencia" };
		String payment_method = JOptionPane.showInputDialog (null, "Seleccione el método de pago que desea", "Método de pago", JOptionPane.QUESTION_MESSAGE);
		
		System.out.println("El usuario eligió el método de pago: " + option_payment_method);
				
		String price_string = JOptionPane.showInputDialog(null, "Este es su precio", "Precio", JOptionPane.QUESTION_MESSAGE);
    	price = Integer.parseInt(price_string);
		
		String[] option_payment_type = { "Contado", "Financiado" };
		String payment_type = JOptionPane.showInputDialog (null, "Seleccione el tipo de pago", "Tipo de pago", JOptionPane.QUESTION_MESSAGE);
		
		System.out.println("El usuario eligió el tipo de pago: " + option_payment_type);
		
		return new Sale(id, client_name, car_type, payment_method, price, payment_type); 

	}	

	public static Sale create_sale_id () {
		
		Singleton.id = data_functions.askid("¿Qué identificador va a asignar al servicio?", "Id");

		return new Sale (Singleton.id);

	}

}








