public class ejercicio4 {
    /*
    Define un array de 12 números enteros con nombre num y asigna los valores según la tabla que se muestra a
    continuación. Muestra el contenido de todos los elementos del array por consola. ¿Qué sucede con los valores de
    los elementos que no han sido inicializados?

    Lo que sucede con los elementos no inicializados es que estos son iguales a 0
     */

    public static void main(String[] args) {
        int[] num = new int[12];
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[8] = 5;
        num[9] = 120;

        for (int valor:num) {
            System.out.print(valor + " || ");
        }
    }
}
