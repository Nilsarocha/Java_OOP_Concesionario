package  Modules.utils;

import Modules.Concesionario.Clases.Singleton;
import Modules.Concesionario.Clases.Vinyl;
import Modules.Concesionario.Clases.Rent;
import Modules.Concesionario.Clases.Sale;

public class find_functions {
	
	public static int find_sale(Sale sale) {
	
	
			
		for (int i = 0; i< Singleton.sale.size(); i++) {
	
			
		
			
			if ((Singleton.sale.get(i)).equals(sale)) { 
					
				return i; 
			}
		}
		return -1;
		
	}


	////////////// rent /////////////

	public static int find_rent(Rent rent) {
	
	
			
		for (int i = 0; i< Singleton.Rent.size(); i++) {
	
			
		
			
			if ((Singleton.Rent.get(i)).equals(rent)) { 
					
				return i; 
			}
		}
		return -1;
		
	}
	
	///////////////// vinilar //////////////////////
	
	public static int find_vinyl(Vinyl vinyl) {
	
	
			
		for (int i = 0; i< Singleton.Vinyl.size(); i++) {
	
			
		
			
			if ((Singleton.Vinyl.get(i)).equals(vinyl)) { 
					
				return i; 
			}
		}
		return -1;
		
	}
	
}