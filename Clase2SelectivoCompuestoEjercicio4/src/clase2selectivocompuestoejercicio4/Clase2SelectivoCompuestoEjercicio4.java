/*  4) Calcular la utilidad que un trabajador recibe en el reparto anual de utilidades 
    si este se le asigna como un porcentaje de su salario mensual que depende de su antigüedad 
    en la empresa de acuerdo con la siguiente tabla  */
package clase2selectivocompuestoejercicio4;

import java.util.Scanner;

public class Clase2SelectivoCompuestoEjercicio4 {

    public static void main(String[] args) {
        //definimos las variables de trabajo 
        float sm = 0, antiguedad = 0, utilidad = 0;
        Scanner teclado = new Scanner(System.in);

        //solicitamos los datos al usuario
        System.out.println("Por favor ingrese su salario mensual ");
        sm = teclado.nextFloat();
        System.out.println("Por favor ingrese su antiguedad dentro de la empresa ");
        antiguedad = teclado.nextFloat();

        if (antiguedad < 1) {
//            Menos de 1 año	5% del salario
            utilidad = sm * 0.05f;
        } else if ((antiguedad >= 1) && (antiguedad < 2)) {
//        1 año o más y menos de 2 años 	7% del salario
            utilidad = sm * 0.07f;
        } else if ((antiguedad >= 2) && (antiguedad < 5)) {
//        2 años o más y menos de 5 años	10% del salario
            utilidad = sm * 0.10f;
        } else if ((antiguedad >= 5) && (antiguedad < 10)) {
            //5 años o más y menos de 10 años	15% del salario
            utilidad = sm * 0.15f;
        } else {
//            10 años o mas 	20% del salario
            utilidad = sm * 0.20f;
        }
        System.out.println("su bono anual sera de :" + utilidad);
    }

}
