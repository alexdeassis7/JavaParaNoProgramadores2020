package clase2.problemascondicionales;

import java.util.Scanner;

/**
 * Determinar si un alumno aprueba o reprueba un curso , sabiendo que aprobara
 * si su promedio de tres calificaciones es mayor o igual a 7 ,caso contrario
 * reprueba
 */
public class Clase2ProblemasCondicionales {

    public static void main(String[] args) {
        float nota1 = 0, nota2 = 0, nota3 = 0;
        float promedio = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Welcome to app");
        //solicitamos al usuario los datos 
        System.out.println("Ingrese por favor la nota 1");
        nota1 = teclado.nextFloat();

        System.out.println("Ingrese por favor la nota 2");
        nota2 = teclado.nextFloat();

        System.out.println("Ingrese por favor la nota 3");
        nota3 = teclado.nextFloat();
        //calculamos el promedio 
        promedio = (nota1 + nota2 + nota3) / 3;
      
        if (promedio >= 7) 
        {
            //cuerpo del if
            System.out.println("El Alumno esta aprobado ");
        } else {
            System.out.println("El alumno no esta aprobado");
        }
        System.out.println("Fin del programa");
    }

}
