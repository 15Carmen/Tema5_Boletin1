import java.util.Scanner;

public class ejercicio7 {
    /*
    Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es decir, el primero
    que se introduce es el último en mostrarse.
     */

    public static void main(String[] args) {
        double[] tabla = new double[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 10 numeros en el array: ");

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = sc.nextDouble();
        }

        for (int i = tabla.length-1; i >= 0; i--) {
            System.out.print(tabla[i] + " || ");
        }
    }
}
