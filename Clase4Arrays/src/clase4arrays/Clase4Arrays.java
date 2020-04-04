package clase4arrays;

import java.util.Scanner;

public class Clase4Arrays {

    public static void main(String[] args) {
        int dias =31;
        float[] temperaturasAgosto = new float[dias];
        float sumaDeTemperaturas = 0;        
        Scanner teclado = new Scanner(System.in);
//            recorremos el array para cargarlo con datos
        for (int subIndice = 0; subIndice < dias; subIndice++) {
        
            System.out.println("por favor ingrese la temperatura del dia " + (subIndice + 1));
            temperaturasAgosto[subIndice] = teclado.nextFloat();
            sumaDeTemperaturas += temperaturasAgosto[subIndice];
       
        }        
        System.out.println("suma de temperaturas es igual a :" +sumaDeTemperaturas);
        float mediaTempAgosto = sumaDeTemperaturas / dias;
        System.out.println("la tempreatura media es : " + mediaTempAgosto);
        
        System.out.println("***************************MOPSTRAMOS EL ARRAY ****************************");
        for (int i = 0; i < dias; i++) {
            System.out.print(temperaturasAgosto[i] + " - ");
        }
        
        
        
        
        
        
    }

}
