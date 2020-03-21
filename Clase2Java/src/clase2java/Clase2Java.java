package clase2java;
//3) Un maestro desea saber que porcentaje de hombres y que porcentaje de mujeres 
//  tiene en un grupo de estudiantes

import java.util.Scanner;

public class Clase2Java {

    public static void main(String[] args) {

        int cantMujeres = 0, cantHombres = 0, totalDeAlumnos = 0;
        float porcentajeHombres = 0, porcentajeMujeres = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos");
        cantHombres = teclado.nextInt();

        System.out.println("Ingrese la cantidad de alumnas");
        cantMujeres = teclado.nextInt();
        totalDeAlumnos = cantHombres + cantMujeres;
        //CALCULAMOS LOS PORCENTAJES 
        porcentajeHombres = cantHombres * 100 / totalDeAlumnos;
        porcentajeMujeres = cantMujeres * 100 / totalDeAlumnos;
        //MOSTRAMOS LOS RESULTADOS POR CONSOLA
        System.out.println("Porcetaje de Mujeres :" + porcentajeMujeres);
        System.out.println("Porcetaje de Hombres :" + porcentajeHombres);
    }
}
