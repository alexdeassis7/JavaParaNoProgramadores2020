/* Llenar dos vectores A y B de 45 elementos cada uno, sumar el elemento uno del 
vector A con el elemento uno del vector B y así sucesivamente hasta 45,
almacenar el resultado en un vector C, e imprimir el vector resultante por pantalla. */
package clase5repasovectores;
public class Clase5RepasoVectores {  
    public static void main(String[] args) {
        int tamano = 45;
       //definimos los arrays 
        int[] arrayA = new int[tamano];
        int[] arrayB = new int[tamano];
        int[] arrayC = new int[tamano];
        //carga los arrays A y B
        for (int i = 0; i < tamano; i++) {
            arrayA[i] = i*2;
            arrayB[i] = i*3;             
        }         
        //realizamos la suma de ArrayA y ArrayB en el ArrayC
         for (int i = 0; i < tamano; i++) {
                arrayC[i] = arrayA[i] + arrayB[i];
        }    
        //muestra los datos de los  arrays cargados
        for (int i = 0; i < tamano; i++) {
            System.out.println( arrayA[i]+" + " + arrayB[i] + " = " + arrayC[i] );  
            //System.out.println("  |||  arrayB["+ i +"]="+arrayB[i] );  
        }
        
    }
    
}
