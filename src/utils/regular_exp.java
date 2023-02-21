package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regular_exp {
    private static final String Expresion_client_name = "/^([ÁÉÍÓÚñáéíóúa-z]+[ ]?){1,4}$/i";
    private static final String Expresion_id = "^[a-zA-Z_$][a-zA-Z_$0-9]*$";
    

    //////////////// IDENTIFICADOR (VALIDAR) ///////////

    public static boolean id (String id) {
        Pattern pattern = Pattern.compile(Expresion_id);
        Matcher matcher = pattern.matcher(id);

        return matcher.matches();
        
    }

/////////// NOMBRE DE LA PERSONA //////////////////////

    public static boolean client_name(String client_name){
        Pattern pattern = Pattern.compile(Expresion_client_name);
        Matcher matcher = pattern.matcher(client_name);

        return matcher.matches();

    }   











}
