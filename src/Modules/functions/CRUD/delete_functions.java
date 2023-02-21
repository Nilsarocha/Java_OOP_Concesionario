package Modules.functions.CRUD;

import javax.swing.JOptionPane;

import Modules.Concesionario.Clases.Sale;
import Modules.Concesionario.Clases.Singleton;
import Modules.utils.find_functions;

public class delete_functions {
 
    public static void delete_Sale(Sale sal){
        int location = -1;

        if (Singleton.sale.isEmpty()){

        JOptionPane.showMessageDialog(null, "No existe este servicio para poder eliminarlo", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            location = -1;

            sal = functions_services.create_sale_id();

            location = find_functions.find_sale(sal);

            if (location != -1){
                Singleton.sale.remove(location);
                JOptionPane.showMessageDialog(null, "Servicio borrado", "Borrado", JOptionPane.INFORMATION_MESSAGE);

            }else {
                JOptionPane.showMessageDialog(null, "No existe ningún servicio con este identificador", "No existe", JOptionPane.ERROR_MESSAGE);

            }
        }

    }

}
