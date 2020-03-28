/* 4 ) Leer 20 números e imprimir cuantos son positivos , cuantos negativos y cuantos neutros*/
package clase3ejercicio4for;

import java.util.Scanner;

public class Clase3ejercicio4For {

    public static void main(String[] args) {
        int numeroIngresado = 0, contadorNegativos = 0, contadorPositivos = 0, contadorNeutros = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {

            System.out.println("ingrese el numero " + (i + 1));
            numeroIngresado = teclado.nextInt();

            if (numeroIngresado > 0) {
                contadorPositivos++;
            } else if (numeroIngresado < 0) {
                contadorNegativos++;
            } else {
                contadorNeutros++;
            }
        }
        System.out.println("Cantidad de positivo :" + contadorPositivos);
        System.out.println("Cantidad de negativos :" + contadorNegativos);
        System.out.println("Cantidad de neutros:" + contadorNeutros);

    }

}
