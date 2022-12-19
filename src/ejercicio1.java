public class ejercicio1 {
    /*
    Crea una tabla de enteros de longitud 10 que se inicializará con números aleatorios comprendidos entre 1 y 100.
     */

    public static void main(String[] args) {
        //Declaramos las variables
        int[] tabla = new int[10]; //Variable array de int de tamaño 10

        for (int i = 0; i < tabla.length; i++) {        //Inicializamos el bucle en 0, lo finalizamos en el tamaño del array (10) y lo incrementamos en 1
            tabla[i] = (int) (Math.random() * 100 + 1); //Introducimos dentro del array previamente declarado un numero random comprendido entre 1 y 100
            System.out.print(tabla[i] + " ");           //Mostramos el array por consola
        }

    }
}
