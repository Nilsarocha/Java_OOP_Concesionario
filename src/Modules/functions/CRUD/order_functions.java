package Modules.functions.CRUD;

import java.util.Collections;

import javax.swing.JOptionPane;

import Modules.Concesionario.Clases.Singleton;
import Modules.Orders.car_type_order;
import Modules.Orders.client_name_order;
import Modules.Orders.id_order;
import Modules.utils.functions_menu;

public class order_functions {

    public static void order_Sale(){
        String[] menu = { "id", "cliente_name", "car_type", "salir"};
        int option_menu = 0;
        Boolean key = false;


        if (Singleton.sale.isEmpty()) {

            JOptionPane.showMessageDialog(null, "No existen servicios para poder ordenarlos", "Error", JOptionPane.ERROR_MESSAGE);

        }else if (Singleton.sale.size() == 1){
            JOptionPane.showMessageDialog(null, "Solo existe un servicio y por lo tanto no se puede ordenar", "Error", JOptionPane.ERROR_MESSAGE);

        } else {

            do{ 
               option_menu = functions_menu.menubuttons(menu, "Seleccione el orden que usted desee", "Elija la opción deseada");
               switch (option_menu){
                case 0:
                    Collections.sort(Singleton.sale, new id_order());
                    key = true;
                    break;
                case 1:
                    Collections.sort(Singleton.sale, new client_name_order());
                    key = true;  
                    break;
                case 2:
                    Collections.sort(Singleton.sale, new car_type_order());
                    key = true;
                    break;
                case 3:
                    key = true;
                    break;
                default: 
                    key = true;
                    break;
                    
               }


            } while (key != true);

        }

    }

    ///////////// alquiler ///////////////

    public static void order_Rent(){
        String[] menu = { "id", "cliente_name", "car_type", "salir"};
        int option_menu = 0;
        Boolean key = false;


        if (Singleton.Rent.isEmpty()) {

            JOptionPane.showMessageDialog(null, "No existen servicios para poder ordenarlos", "Error", JOptionPane.ERROR_MESSAGE);

        }else if (Singleton.Rent.size() == 1){
            JOptionPane.showMessageDialog(null, "Solo existe un servicio y por lo tanto no se puede ordenar", "Error", JOptionPane.ERROR_MESSAGE);

        } else {

            do{ 
               option_menu = functions_menu.menubuttons(menu, "Seleccione el orden que usted desee", "Elija la opción deseada");
               switch (option_menu){
                case 0:
                    Collections.sort(Singleton.Rent, new id_order());
                    key = true;
                    break;
                case 1:
                    Collections.sort(Singleton.Rent, new client_name_order());
                    key = true;  
                    break;
                case 2:
                    Collections.sort(Singleton.Rent, new car_type_order());
                    key = true;
                    break;
                case 3:
                    key = true;
                    break;
                default: 
                    key = true;
                    break;
                    
               }


            } while (key != true);

        }

    }

    //////////////// vinilo ////////////

    public static void order_Vinyl(){
        String[] menu = { "id", "cliente_name", "car_type", "salir"};
        int option_menu = 0;
        Boolean key = false;


        if (Singleton.Vinyl.isEmpty()) {

            JOptionPane.showMessageDialog(null, "No existen servicios para poder ordenarlos", "Error", JOptionPane.ERROR_MESSAGE);

        }else if (Singleton.Vinyl.size() == 1){
            JOptionPane.showMessageDialog(null, "Solo existe un servicio y por lo tanto no se puede ordenar", "Error", JOptionPane.ERROR_MESSAGE);

        } else {

            do{ 
               option_menu = functions_menu.menubuttons(menu, "Seleccione el orden que usted desee", "Elija la opción deseada");
               switch (option_menu){
                case 0:
                    Collections.sort(Singleton.Vinyl, new id_order());
                    key = true;
                    break;
                case 1:
                    Collections.sort(Singleton.Vinyl, new client_name_order());
                    key = true;  
                    break;
                case 2:
                    Collections.sort(Singleton.Vinyl, new car_type_order());
                    key = true;
                    break;
                case 3:
                    key = true;
                    break;
                default: 
                    key = true;
                    break;
                    
               }


            } while (key != true);

        }

    }
    
}
