/* 8 )Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y 
segundos de un día desde las 0:00:00 hasta las 23:59:59*/
package clase4ejersicio8for;

public class Clase4Ejersicio8FOR {

    public static void main(String[] args) {
       
        //BUCLES FOR ANIDADOS 
        for (int hs = 0; hs < 24; hs++) { //mostramos las horas
            for (int min = 0; min < 60 ; min++) {
                for (int seg = 0; seg < 60 ; seg++) {
                       System.out.println(hs + ":" + min + ":" + seg);
                }
            }
        }
    }
}
