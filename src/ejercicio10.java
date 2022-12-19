import java.util.Arrays;
import java.util.Scanner;

public class ejercicio10 {
    /*
    Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros aleatorios entre 1 y
    10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y mostrará en qué posiciones del array aparece N.
     */

    public static void main(String[] args) {
        int[] tabla = new int[100];
        int posicion = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * 10 + 1);
            System.out.print(tabla[i] + " ");
        }

        System.out.println();
        while (posicion != 101) {
            System.out.println("Introduzca que posicion del array desea ver: ");
            posicion = sc.nextInt();

            System.out.println(Arrays.toString(new int[]{tabla[posicion]}));
        }
    }
}
