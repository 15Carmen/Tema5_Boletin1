import java.util.Scanner;

public class ejercicio6 {
    /*
    Realiza un programa que pida 8 números enteros y los almacene en una tabla. A continuación, recorrerá esa tabla
    y mostrará esos números junto con la palabra “par” o “impar” según proceda.
     */

    public static void main(String[] args) {
        int[] tabla = new int[8];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 8 numeros en el array: ");

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = sc.nextInt();
        }

        for (int valor:tabla) {
            if (valor%2==0){
                System.out.println(valor + " par");
            }else {
                System.out.println(valor + " impar");
            }
        }
    }
}
