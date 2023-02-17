package  Utils;

import Modules.Concesionario.Clases.Singleton;
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
	
	
	
	
}