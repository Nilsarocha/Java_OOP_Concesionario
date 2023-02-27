package Modules.Orders;

import java.util.Comparator;

import Modules.Concesionario.Clases.Service;

public class car_type_order implements Comparator<Service> {

    public int compare (Service s1, Service s2) {

        if (s1.getcar_type(). compareTo(s2.getcar_type())>0)
            return 1;

        else if (s1.getcar_type(). compareTo(s2.getcar_type())<0)
            return -1;    

        return 0;    
    }

}
