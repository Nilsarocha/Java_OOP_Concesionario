package Modules.functions.CRUD;

import javax.swing.JOptionPane;

import Modules.Concesionario.Clases.Rent;
import Modules.Concesionario.Clases.Sale;
import Modules.Concesionario.Clases.Singleton;
import Modules.utils.find_functions;

public class update_functions {

    public static void update_Sale(Sale sal){

        int location = -1;

        if (Singleton.sale.isEmpty()){

            JOptionPane.showMessageDialog(null, "No existe este servicio para poder cambiar sus características", "Error", JOptionPane.ERROR_MESSAGE);

        }else{

            location = -1;

            sal = functions_services.ask_sale_id("Cual es el identificador del producto que quieres modificar ?");

            location = find_functions.find_sale(sal);

            if (location != -1) { 

                sal = Singleton.sale.get(location);

                functions_services.update(sal);

                Singleton.sale.set(location, sal);

            }else {

                JOptionPane.showMessageDialog(null, "No existe ninguna venta con este código para poder cambiarlo", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }

    }    

    //////////// alquiler //////////////////////

    public static void update_Rent(Rent ren){

        int location = -1;

        if (Singleton.Rent.isEmpty()){

            JOptionPane.showMessageDialog(null, "No existe este servicio para poder cambiar sus características", "Error", JOptionPane.ERROR_MESSAGE);

        }else{

            location = -1;

            ren = functions_services.ask_rent_id("¿ Cuál es el identificador del producto que quieres modificar ?");

            location = find_functions.find_rent(ren);

            if (location != -1) { 

                ren = Singleton.Rent.get(location);

                functions_services.update_Rent(ren);

                Singleton.Rent.set(location, ren);

            }else {

                JOptionPane.showMessageDialog(null, "No existe ningún alquiler con este código para poder cambiarlo", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }

    }    

}  