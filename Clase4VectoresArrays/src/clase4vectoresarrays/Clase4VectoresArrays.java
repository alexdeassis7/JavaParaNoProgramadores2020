package clase4vectoresarrays;
import java.util.Scanner;

public class Clase4VectoresArrays {

    public static void main(String[] args) {
//        agosto 31 dias 
        float temperaturaDelDia = 0 ;

        float SumaTemperaturas = 0;    
        Scanner teclado = new Scanner(System.in);
        
        for(int dia = 1 ; dia <= 31 ; dia ++ ){
            System.out.println("Ingrese la Temperatura del dia " + dia);
            temperaturaDelDia = teclado.nextFloat();
            //acumulamos las temperaturas diarias
            SumaTemperaturas +=  temperaturaDelDia;       
        }
        float mediaTempAgosto = SumaTemperaturas / 31;
        System.out.println("Suma de temperaturas = " + SumaTemperaturas);
        System.out.println("Temperatura Media De Agosto = " + mediaTempAgosto);
        
    }
    
}
