package ejerclase5funcionesyprocedimientos;

public class EjerClase5FuncionesYprocedimientos {

    public static void main(String[] args) {
        //invocamos a la funcion suma()
        System.out.println("Suma :" + suma(5, 85));
        System.out.println("invocamos al procedimiento 5 veces");
        for (int i = 0; i < 5; i++) {
            mensaje();
        }
        mensaje2("esta");
        mensaje2("es");
        mensaje2("la");
        mensaje2("ultima");
        mensaje2("clase de java");    
    }
    //4) Escribir un programa que tenga un procedimiento llamado mensaje, que reciba un parámetro de tipo String 
    // que es impreso por consola,invocar ese procedimiento 5 veces.
    public static void mensaje2(String parametro) {
        System.out.print(parametro + " ");        
    }

    //3)Escribir un programa que tenga un procedimiento llamado mensaje,
    //que imprima una palabra e invocar ese procedimiento 5 veces.
    public static void mensaje() {
        System.out.println("Hola mundo");
    }
//    1)Crear un función suma, que reciba dos parámetros de tipo entero y 
//    retorne la suma de los mismos.

    public static int suma(int parametro1, int parametro2) {
        int resultado = parametro1 + parametro2;
        return resultado;
    }

}
