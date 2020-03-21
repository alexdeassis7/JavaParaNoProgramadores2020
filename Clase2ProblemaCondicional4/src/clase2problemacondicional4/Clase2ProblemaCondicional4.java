/*  4) realizar un algoritmo que lea dos numeros y los inprima de forma ascendente
 */
package clase2problemacondicional4;
import java.util.Scanner;
public class Clase2ProblemaCondicional4 {

    public static void main(String[] args) {

        int numeroUno = 0, numeroDos = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese el primer numero ");
        numeroUno = teclado.nextInt();

        System.out.println("ingrese el segundo numero ");
        numeroDos = teclado.nextInt();

        if (numeroUno < numeroDos) {
            System.out.println(numeroUno + " " + numeroDos);
        } else {
            System.out.println(numeroDos + " " + numeroUno);
        }
    }

}
