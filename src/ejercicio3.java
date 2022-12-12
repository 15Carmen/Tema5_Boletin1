import java.util.Scanner;

public class ejercicio3 {
    /*
    Diseñar un programa que solicite al usuario 5 números decimales y los almacene en una tabla. Utiliza el mismo
    bucle para solicitar los 5 números así como para almacenarlos en la tabla. A continuación, mostrar por consola
    los números en el mismo orden en el que se han introducido.
     */

    public static void main(String[] args) {
        double[] tabla = new double[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 5 numeros en el array: ");

        for (int i = 0; i < tabla.length; i++) {
           tabla[i] = sc.nextDouble();
        }
        System.out.println();
        System.out.print("El array es: ");
        for (double valor : tabla) {
            System.out.print(valor + " || ");
        }

        sc.close();
    }
}
