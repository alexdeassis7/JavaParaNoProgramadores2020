package clase3operadorternario;

import java.util.Scanner;

public class Clase3OperadorTernario {
    
    public static void main(String[] args) {
     int numero1 =0;
     int numero2 =0;
     
     Scanner teclado = new Scanner(System.in);
        
     System.out.println("ingrese el primer numero ");
     numero1 = teclado.nextInt();
     
     System.out.println("ingrese el segundo numero ");
     numero2 = teclado.nextInt();
     /** OPERDAOR TERNARIO */
//     resultado = (condicion) ? valor1 : valor2 ;
//       int mayor = (numero1 > numero2) ? numero1 : numero2; 
//        System.out.println("el mayor es " + mayor);

        System.out.println("el mayor es " + ( (numero1 > numero2) ? numero1 : numero2) ) ;
               
//     if (numero1 > numero2){
//         System.out.println("el mayor es " + numero1 );
//     }else{
//         System.out.println("el mayor es " + numero2 );
//     }
     
     
     
     
     
     
     
    }
    
}
