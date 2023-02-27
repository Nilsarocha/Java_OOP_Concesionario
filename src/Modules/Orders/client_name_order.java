package Modules.Orders;

import java.util.Comparator;

import Modules.Concesionario.Clases.Service;

public class client_name_order implements Comparator<Service>   {

        public int compare (Service s1, Service s2) {
    
            if (s1.getclient_name(). compareTo(s2.getclient_name())>0)
                return 1;
    
            else if (s1.getclient_name(). compareTo(s2.getclient_name())<0)
                return -1;    
    
            return 0;    
        }
    
    
}
