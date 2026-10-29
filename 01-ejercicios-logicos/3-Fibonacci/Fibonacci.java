/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
import java.util.HashMap;
import java.util.Map;

public class Fibonacci{
    private static final Map<Long, Long> memoria = new HashMap<>();
    public static void main(String[] agrs){
        for(int i = 0; i <= 50; i++){
            System.out.println(fibonacci(i));
        }
    }

    public static long fibonacci(long f){
        if(f == 0|| f == 1){
            return f;
        }else if (memoria.containsKey(f)) {
            return memoria.get(f);
        }else{
            long resultado = fibonacci(f-2) + fibonacci(f-1);
            memoria.put(f,resultado);

            return resultado;
        }
    }
}

