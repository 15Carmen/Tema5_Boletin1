import java.util.Arrays;
import java.util.Scanner;

public class ejercicio9 {
    /*
    Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado año y que muestre a
    continuación un diagrama de barras horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
    de asteriscos o cualquier otro carácter.
     */

    public static void main(String[] args) {
        int[] diagrama = new int[12];

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la temperatura media de cada mes: ");
        for (int i = 0; i < 12; i++) {
            diagrama[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("--Diagrama de temperaturas--");
        for (int valor : diagrama) {
            for (int i = 0; i < valor; i++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
