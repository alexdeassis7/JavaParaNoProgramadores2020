package clase3while;

import java.util.Scanner;

public class Clase3While {

    public static void main(String[] args) {
        /*  1.leer el numero que ingresa el usuario 
          2.Efectuar la suma y almacenarla
          3.mostrar el resultado almacenado        **/
        int numero1 = 0, numero2 = 0, resultado = 0;
        Scanner teclado = new Scanner(System.in);
        int contador = 3;
        while ( contador < 3 ) {  
            // LOOP INFINITO 
//             cuerpo del while            
            //sentencias a ejecutar si la condicion es true
            System.out.println("ingrese primer numero");
            numero1 = teclado.nextInt();

            System.out.println("ingrese segundo numero");
            numero2 = teclado.nextInt();

            resultado = numero1 + numero2;
            System.out.println("el resultado de la suma es " + resultado);
            System.out.println("******************************************");
            contador ++;
        }        
        System.out.println("Fin del programa");
    }  
}
