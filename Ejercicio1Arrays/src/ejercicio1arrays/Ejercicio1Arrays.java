/*Calcular el promedio de 10 valores almacenados en un Vector. Determinar además cuantos 
son mayores que el promedio, imprimir el promedio, el número de datos mayores que el 
promedio y una lista de valores mayores que el promedio .

 */
package ejercicio1arrays;

import java.util.Scanner;

public class Ejercicio1Arrays {

    public static void main(String[] args) {
        /** definimos las variables de trabajo         */
        int limite = 10 ;
        float promedio = 0, sumatoria = 0;
        int mayores = 0;
        int[] valoresArray = new int[limite];
        int[] mayoresQueElPromedio;
        Scanner teclado = new Scanner(System.in);
	/**solicitamos al usuario ingrese los valores 
	 * y las guardamos en cada indice del array*/
        for (int i = 0; i < limite ; i++) {
            System.out.println("Ingrese el numero " + (i + 1));
            valoresArray[i] = teclado.nextInt();
            sumatoria+=valoresArray[i]; 
        }
          //calculamos el promedio 
          promedio = sumatoria / limite; 
        
          //contamos los valores mayores al promedio 
          for (int i = 0; i < limite; i++) {
            if( valoresArray[i] > promedio){
                mayores ++;
            }
        }
          
          mayoresQueElPromedio = new int[mayores];
          int j = 0 ;
         for (int i = 0; i < limite; i++) {
            
             if(valoresArray[i] > promedio){
                 mayoresQueElPromedio[j] = valoresArray[i];
                 j++;
             }
        }
        //mostramos los datos requerido
          System.out.println("promedio :" + promedio);
          System.out.println("Cantidad Mayores al promedio " +mayores );
          System.out.println("Valores mayores son : ");
          
          for (int i = 0; i < mayores ; i++) {
              System.out.print(mayoresQueElPromedio[i] +" - ");
        }
          System.out.println("Direccion de memoria : " +mayoresQueElPromedio);
          
         
         
        
        
    }

}
