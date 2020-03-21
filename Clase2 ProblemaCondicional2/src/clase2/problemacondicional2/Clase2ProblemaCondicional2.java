package clase2.problemacondicional2;
//2) En un alamacen se hace un 20% de descuento a los clientes cuya compra supere los $1000
//,Cual sera la cantidad que pagara una persona por su compra?

import java.util.Scanner;

public class Clase2ProblemaCondicional2 {

    public static void main(String[] args) {        
        float compra = 0, descuento = 0, totalApagar = 0;
        Scanner teclado = new Scanner(System.in);        
        System.out.println("Ingrese el total de la compra");
        compra = teclado.nextFloat();

        if (compra > 1000) {
            descuento = compra * 0.20f;
            System.out.println("Usted tiene un 20% de descuento por superar los 1000$");
        }

        totalApagar = compra - descuento;

        System.out.println("El total que debera abonar por su compra es de " + totalApagar);
    }

}
