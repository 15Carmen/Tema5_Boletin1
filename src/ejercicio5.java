import java.util.Scanner;

public class ejercicio5 {
    /*
    Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego lo recorra para
    averiguar el máximo y mínimo y mostrarlos por pantalla.
     */

    public static void main(String[] args) {
        double[] tabla = new double[10];
        double max, min;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 10 numeros en el array: ");

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = sc.nextDouble();
        }

        max = tabla[0];

        for (double valor : tabla) {
            if (valor > max) {
                max = valor;
            }
        }

        System.out.println("El numero maximo del array es: " + max);

        min = tabla[0];
        for (double valor : tabla){
            if (valor < min){
                min=valor;
            }
        }

        System.out.println("El numero minimo del array es: " + min);
    }
}
