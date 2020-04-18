package clase5ejercicio6;

/**
 * Escribir un procedimiento llamado “cierreDelDia” el cual invoca dos veces a
 * la función “iva” (tambien creada por nosotros), para calcular el iva del
 * 10.5% y 21% para el monto 1200. El procedimiento “cierreDelDia” debe ser
 * invocado desde el “main”
 */
public class Clase5Ejercicio6 {

    public static void main(String[] args) {
        System.out.println("inicio del main ");
        cierreDelDia();
        System.out.println("fin del main ");
    }

    public static void cierreDelDia() {
        System.out.println("inicio procedimiento cieereDelDia ");
        System.out.println("iva 10.5% = " + iva(1200, 0.105));
        System.out.println("iva 21% = " + iva(1200, 21));
        System.out.println("fin procedimiento cieereDelDia ");
    }
    //funcion para calcular el IVA (Retorna un valor )

    public static double iva(int valor, double porcentaje) {
        System.out.println("inicio funcion iva ");
        double resultado = valor * porcentaje;
        System.out.println("fin funcion iva ");
        return resultado;

    }

}
