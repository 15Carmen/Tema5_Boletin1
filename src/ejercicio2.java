public class ejercicio2 {
    /*
    Partiendo de la tabla creada en el ejercicio 1, mostrar la suma de todos los números aleatorios que se
    guardan en la tabla. Copia y pega el código del ejercicio anterior.
     */

    public static void main(String[] args) {
        int [] tabla = new int[10];

        for (int i=0; i<tabla.length; i++){
            tabla[i] = (int) (Math.random()*100+1);
            System.out.print(tabla[i] + " ");
        }

        System.out.println();
        System.out.print("Suma de los elementos del array: ");
        int sumaNumeros = 0;

        for (int valor : tabla) {
            sumaNumeros += valor;
        }
        System.out.print(sumaNumeros);



    }
}
