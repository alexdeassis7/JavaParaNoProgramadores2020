package clase2switch;

import java.util.Scanner;

public class Clase2Switch {

    public static void main(String[] args) {
        float num1 = 0, num2 = 0, resultado = 0;
        int opcionIngresada = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Welcome to calculadora ");
        System.out.println("Que operacion aritmetica desea realizar :");
        System.out.println("1 SUMAR");
        System.out.println("2 RESTAR");
        System.out.println("3 MULTIPLICAR");
        System.out.println("4 DIVIDIR");

        opcionIngresada = teclado.nextInt();
        if (opcionIngresada >= 1 && opcionIngresada <= 4) {
            System.out.println("ingrese numero 1");
            num1 = teclado.nextFloat();

            System.out.println("ingrese numero 2");
            num2 = teclado.nextFloat();
        }
        switch (opcionIngresada) {
            case 1:
                System.out.println("usted escogio la opcion suma");
                resultado = num1 + num2;
                break;
            case 2:
                System.out.println("usted escogio la opcion resta");
                resultado = num1 - num2;
                break;
            case 3:
                System.out.println("usted escogio la opcion multiplicar");
                resultado = num1 * num2;
                break;
            case 4:
                System.out.println("usted escogio la opcion dividir");
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("No es posible dividir por cero en los numeros Reales");
                }
                break;
            default:
                System.out.println("La opcion " + opcionIngresada + " no es valida");
        }
        if (opcionIngresada >= 1 && opcionIngresada <= 4) {
        System.out.println("El resultado es : " + resultado);
        }
        System.out.println("Fin del programa");
    }

}
