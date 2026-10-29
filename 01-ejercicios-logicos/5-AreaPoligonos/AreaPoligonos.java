/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
import java.util.Scanner;

public class AreaPoligonos{
    public static void main(String [] agrs){
        try (Scanner sc = new Scanner(System.in)) {
            int opcion;
            do{
                System.out.println("Elija el poligono a calcular el area.");
                System.out.println("(1) Triangulo.");
                System.out.println("(2) Cuadrado.");
                System.out.println("(3) Rectangulo.");
                System.out.println("(4) Salir.");
                opcion = sc.nextInt();
                switch(opcion){
                    case 1 -> {
                        System.out.println("Introduce la base.");
                        int base = sc.nextInt();
                        System.out.println("Introduce la altura.");
                        int altura = sc.nextInt();
                        System.out.println("El area es: " + calcula_area(base,altura,opcion)/2);
                    }
                    case 2 -> {
                        System.out.println("Introduce cualquiera de los lados.");
                        int lado = sc.nextInt();
                        System.out.println("El area es: " + calcula_area(lado,4,opcion));
                    }
                    case 3 -> {
                        System.out.println("Introduce la base");
                        int base = sc.nextInt();
                        System.out.println("Introduce la altura");
                        int altura = sc.nextInt();
                        System.out.println("El area es: " + calcula_area(base,altura,opcion));
                    }
                }
            }while(opcion != 4);
        }
    }

    public static int calcula_area(int base, int altura,int opcion){
        return base*altura;
    }
}