package clase3whilevsdowhile;
// crear un programa que muestre por consola todos los 
//numeros pares comprendidos entre el cero y mil

public class Clase3WhileVSDoWhile {

    public static void main(String[] args) {

        int contador = 0;
        System.out.println("inicio del WHILE");
        while (contador <= 1000) {

            System.out.println(contador);
//            contador = contador + 2;
            contador += 2;
        }

        System.out.println("inicio del DO WHILE");

        contador = 0;
        do {
            System.out.println(contador);
            contador += 2;

        } while (contador <= 1000);

    }

}
