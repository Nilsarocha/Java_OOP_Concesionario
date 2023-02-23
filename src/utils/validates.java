package utils;

import javax.swing.JOptionPane;

public class validates {

    ///////// VALIDAR STRINGS /////////////////
    

    public static String cad (String message, String title){
        String cad = "";
        boolean correcto = false;

        do {
            try{  

                cad = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
                correcto = true;

                if (cad.equals("")){
                    JOptionPane.showMessageDialog(null, "Error en la instroducción de datos", "Error", JOptionPane.ERROR_MESSAGE);
                    correcto = false;
                }

            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error en la instroducción de datos", "Error", JOptionPane.ERROR_MESSAGE);
                correcto = false;

                
            }    

        }while (correcto == false);

        return cad;
    }      
    
    ///////////// VALIDAR INT //////////////////

    public static int price (String message, String title){

        int price = 0;
        String cad = "";
        boolean correct = false;

        do {
            try {

                cad = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
                if (cad == null) {
                    JOptionPane.showMessageDialog(null, "Saliendo de la aplición", "Saliendo", JOptionPane.INFORMATION_MESSAGE);    
                    System.exit(0); // al usuario cancelar o cerrar la ventana del showinputdialog, acaba la ejecución      

                }else {
                    price = Integer.parseInt(cad);
                    correct = true;

                }



            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No has introducido un número", "Error", JOptionPane.ERROR_MESSAGE);
                correct = false;
            }

        }while (correct == false);
        System.out.println(price);

        return price;


    }

    //////////////// VALIDAR VARIAS OPCIONES ( COMBO ) ////////////////

    public static String combo (String[] options, String message, String title) {
        Object selection = null;

        do {

            selection = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, options, null);

        }while (selection == null);  
        
        return (String) selection;

    }

}
