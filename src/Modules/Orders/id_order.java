package Modules.Orders;

import java.util.Comparator;

import Modules.Concesionario.Clases.Service;

public class id_order implements Comparator<Service> {

    public int compare (Service s1, Service s2) {

        if (s1.getid(). compareTo(s2.getid())>0)
            return 1;

        else if (s1.getid(). compareTo(s2.getid())<0)
            return -1;    

        return 0;    
    }

    
}
