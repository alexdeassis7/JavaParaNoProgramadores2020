/*3) Un obrero necesita calcular su salario semanal , el cual se obtiene de la siguiente manera:
	-Si trabaja 40 horas o menos se le paga $16 por hora
        -Si trabaja mas de 40hs se le paga $16 por cada una de las primeras 40hs y 20$ por cada hora extra
 */
package clase2problemacondicional3;
import java.util.Scanner;
public class Clase2ProblemaCondicional3 {
    public static void main(String[] args) {
        int horasTrabajadas = 0 ,horasExtras = 0 ,salarioSemanal = 0; 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("por favor ingrese las horas trabajas en esta semana");
        horasTrabajadas = teclado.nextInt();        
        if(horasTrabajadas > 40){
            horasExtras = horasTrabajadas - 40 ;//calculo cuantas hs extras trabajo
            salarioSemanal = ( horasExtras * 20 ) + (40 * 16) ; //calculo salario con hsBase y hsExtras
            System.out.println("Salario con HsExtras ");
        }else{
            //Calculamos el salario Sin hs extras
            salarioSemanal = horasTrabajadas * 16; 
            System.out.println("Salario Base");
        }     
        System.out.println("Su salario esta semana sera de : $" + salarioSemanal);        
    }    
}
