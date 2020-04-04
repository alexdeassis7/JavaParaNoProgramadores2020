/*7) Calcular e imprimir la tabla de multiplicar de un número cualquiera.
Imprimir el multiplicando , el multiplicador y el producto */
package clase4ejercicio7for;

import java.util.Scanner;

public class Clase4Ejercicio7FOR {

    public static void main(String[] args) {
        int numeroIngresado = 0;
        Scanner teclado = new Scanner(System.in);
        //solicitamos el numero a l usuario 
        System.out.println("que tabla de multiplicar deseas conocer?");
        numeroIngresado = teclado.nextInt();//capturo el dato 
        for (int contador = 1; contador <= 10; contador++) {
            int resultado = numeroIngresado * contador;//realizamos la cuenta
            //mostramos la tabla de multiplicar 
            System.out.println(contador + " x " + numeroIngresado + " = " + resultado);
        }

    }
}
