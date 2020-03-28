package clase3forejercicio1;

import java.util.Scanner;

public class Clase3ForEjercicio1 {
//1)Calcular el promedio de un alumno que tiene 7 calificaciones
//en la materia de Diseño Estructurado de Algoritmos.

    public static void main(String[] args) {
        //definimos las variables de trabajo y el acumulador de notas
        float calificacion = 0, promedio = 0, sumaCalificaciones = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("INICIO del FOR");

        for (int contador = 0; contador < 7; contador++) {
            //SOlicitamos las 7 notas al usuario 
            System.out.println("ingrese la calificacion " + (contador + 1));
            calificacion = teclado.nextFloat();
            sumaCalificaciones = sumaCalificaciones + calificacion;
        }
        System.out.println("FIN del FOR");
        //calculamos y mostramos el promedio en la consola
        promedio = sumaCalificaciones / 7;
        System.out.println("el promedio de las 7 notas del alumno es " + promedio);

    }

}
