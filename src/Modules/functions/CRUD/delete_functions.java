package Modules.functions.CRUD;

import javax.swing.JOptionPane;

import Modules.Concesionario.Clases.Rent;
import Modules.Concesionario.Clases.Sale;
import Modules.Concesionario.Clases.Singleton;
import Modules.Concesionario.Clases.Vinyl;
import Modules.utils.find_functions;

public class delete_functions {
 
    public static void delete_Sale(Sale sal){
        int location = -1;

        if (Singleton.sale.isEmpty()){

        JOptionPane.showMessageDialog(null, "No existe este servicio para poder eliminarlo", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            location = -1;

            sal = functions_services.ask_sale_id("Cual es el identificador del producto que quieres borrar ?");

            location = find_functions.find_sale(sal);

            if (location != -1){
                Singleton.sale.remove(location);
                JOptionPane.showMessageDialog(null, "Servicio borrado", "Borrado", JOptionPane.INFORMATION_MESSAGE);

            }else {
                JOptionPane.showMessageDialog(null, "No existe ningún servicio con este identificador", "No existe", JOptionPane.ERROR_MESSAGE);

            }
        }

    }

    //////////// Alquiler////////////

    public static void delete_Rent(Rent ren){
        int location = -1;

        if (Singleton.Rent.isEmpty()){

        JOptionPane.showMessageDialog(null, "No existe este servicio para poder eliminarlo", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            location = -1;

            ren = functions_services.ask_rent_id("Cual es el identificador del producto que quieres borrar ?");

            location = find_functions.find_rent(ren);

            if (location != -1){
                Singleton.Rent.remove(location);
                JOptionPane.showMessageDialog(null, "Servicio borrado", "Borrado", JOptionPane.INFORMATION_MESSAGE);

            }else {
                JOptionPane.showMessageDialog(null, "No existe ningún servicio con este identificador", "No existe", JOptionPane.ERROR_MESSAGE);

            }
        }

    }

    /////// Vinilo /////////

    public static void delete_Vinyl(Vinyl vin){
        int location = -1;

        if (Singleton.Vinyl.isEmpty()){

        JOptionPane.showMessageDialog(null, "No existe este servicio para poder eliminarlo", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            location = -1;

            vin = functions_services.ask_vinyl_id("Cual es el identificador del producto que quieres borrar ?");

            location = find_functions.find_vinyl(vin);

            if (location != -1){
                Singleton.Vinyl.remove(location);
                JOptionPane.showMessageDialog(null, "Servicio borrado", "Borrado", JOptionPane.INFORMATION_MESSAGE);

            }else {
                JOptionPane.showMessageDialog(null, "No existe ningún servicio con este identificador", "No existe", JOptionPane.ERROR_MESSAGE);

            }
        }
    }    


}
