/*Leer dos números: si son iguales que los multiplique, si el primero es mayor que el segundo que los reste
y si no que los sume.
 */
package clase2selectivoscompuestos1;

import java.util.Scanner;

public class Clase2SelectivosCompuestos1 {

    public static void main(String[] args) {
        int numeroUno = 0, numeroDos = 0, resultado = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el primer numero ");
        numeroUno = teclado.nextInt();

        System.out.println("ingrese el segundo numero ");
        numeroDos = teclado.nextInt();

        if (numeroUno == numeroDos) {
            //son iguales que los multiplique,
            resultado = numeroUno * numeroDos;            
        } else if (numeroUno > numeroDos) {
//            el primero es mayor que el segundo que los reste
            resultado = numeroUno - numeroDos;
        } else {
            resultado = numeroUno + numeroDos;
        }
        System.out.println("El Resultado es : " + resultado);
    }
}
