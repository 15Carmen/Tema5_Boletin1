import java.util.Scanner;

public class ejercicio3 {
    /*
    Diseñar un programa que solicite al usuario 5 números decimales y los almacene en una tabla. Utiliza el mismo
    bucle para solicitar los 5 números así como para almacenarlos en la tabla. A continuación, mostrar por consola
    los números en el mismo orden en el que se han introducido.
     */

    public static void main(String[] args) {
        //Declaramos las varaibles
        double[] tabla = new double[5];         //Variable array de double de tamaño 5

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca 5 numeros por consola
        System.out.println("Introduzca 5 numeros en el array: ");

        for (int i = 0; i < tabla.length; i++) {    //Inicializamos el bucle en 0, lo finalizamos en el tamaño del array y lo incrementamos en 1
            tabla[i] = sc.nextDouble();             //Guardamos los numeros introducidos en el array
        }
        System.out.println();
        System.out.print("El array es: ");
        for (double valor : tabla) {
            System.out.print(valor + " || ");
        }

        sc.close();
    }
}
