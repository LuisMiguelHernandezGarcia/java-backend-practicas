/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Anagrama{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introducta la primera palabra");
        String palabra_1 = sc.nextLine();
        System.out.println("Introducta la segunda palabra");
        String palabra_2 = sc.nextLine();

        boolean bandera = anagrama(palabra_1.toUpperCase(),palabra_2.toUpperCase());
        if(bandera == true){
            System.out.println("Las palabras SI son un anagrama");
            sc.close();
        }else{
            System.out.println("Las palabras NO son un anagrama");
            sc.close();
        }
    }

    public static boolean anagrama(String p_1, String p_2){
        char[] pc_1 = p_1.toCharArray();
        char[] pc_2 = p_2.toCharArray();

        Arrays.sort(pc_1);
        Arrays.sort(pc_2);

        String textoOrdenado_p1 = new String(pc_1);
        String textoOrdenado_p2 = new String(pc_2);

        return textoOrdenado_p1.equals(textoOrdenado_p2);
    }
}