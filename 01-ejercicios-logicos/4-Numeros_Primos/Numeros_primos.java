/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

public class Numeros_primos{
    public static void main(String [] agrs){
        int limite_superior = 100;
        int limite_inferior = 2;
        for(int i = limite_inferior; i <= limite_superior; i ++){
            if(calcula_primos(limite_inferior,i)){
                if(limite_inferior < i) System.out.print(",");
                System.out.print(i);
            }
        }
    }
    
    public static boolean calcula_primos(int limite_inferior,int numero_evaluar){
        for (int i = limite_inferior; i <= numero_evaluar; i ++){
            if((numero_evaluar % i == 0)&&(numero_evaluar != i)){
                return false;
            }
        }
        return true;
    }
}