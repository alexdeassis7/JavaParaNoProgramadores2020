/* 2 )Leer 10 números y obtener su cubo y su cuarta*/
package clase3forejercicio2;

import java.util.Scanner;

public class Clase3Forejercicio2 {

    public static void main(String[] args) {
        //definimos las variables de trabajo 
        int numeroIngresado = 0, cubo = 0, cuarta = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {            
            System.out.println("ingrese el numero " + (i + 1));
            numeroIngresado = teclado.nextInt();
            cubo = numeroIngresado * numeroIngresado * numeroIngresado;
            cuarta = cubo * numeroIngresado;
            
            System.out.println("Cubo de " + numeroIngresado + " = " + cubo);
            System.out.println("Cuarta de " + numeroIngresado + " = " + cuarta);          
        }
    }
}
