package clase5funcionesyprocedimientos;

import java.util.Scanner;

public class Clase5FuncionesYprocedimientos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("ingreses el valor por favor");
        int valorIngresado = teclado.nextInt();
        //invocamos a la funcion IVA
        double ivaCalculado = iva(valorIngresado);
        System.out.println("el iva es " + ivaCalculado);
        //invocamos a la funcion pow
        System.out.println("Resultado :" + pow(5, 4));

//Invocamos al procedimiento Ejecutar()
        mostrarMensaje("alex", "DeAssis");

    }

    //mi primer procedimiento, muestra los numeros del 0 al 9 
    public static void mostrarMensaje(String nombre, String apellido) {
        System.out.println("entre al procedimiento ");
        System.out.println(nombre + apellido);
        System.out.println("saliendo del  procedimiento ");

    }

    //FUNCION POW (retorna un valor)
    public static double pow(int numero1, int numero2) {
        double resultado = numero1;
        for (int i = 0; i < numero2 - 1; i++) { //itera 3 veces
            resultado = resultado * numero1;
        }
        return resultado;
    }

    //funcion para calcular el IVA (Retorna un valor )
    public static double iva(int valor) {//cuerpo de la funcion
        double porcentaje = 0.21;
        double resultado = valor * porcentaje;
        return resultado;
    }
}
