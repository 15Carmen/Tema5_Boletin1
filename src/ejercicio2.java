public class ejercicio2 {
    /*
    Partiendo de la tabla creada en el ejercicio 1, mostrar la suma de todos los números aleatorios que se
    guardan en la tabla. Copia y pega el código del ejercicio anterior.
     */

    public static void main(String[] args) {

        //Declaramos las varaibles
        int[] tabla = new int[10];  //Variable array de int de tamaño 10
        int sumaNumeros = 0;        //Variable donde vamos a guardar el sumatorio de los numeros introducidos en el array

        for (int i = 0; i < tabla.length; i++) {        //Inicializamos el bucle en 0, lo finalizamos en el tamaño del array (10) y lo incrementamos en 1
            tabla[i] = (int) (Math.random() * 100 + 1); //Introducimos dentro del array previamente declarado un numero random comprendido entre 1 y 100
            System.out.print(tabla[i] + " ");           //Mostramos el array por consola
        }

        //Hacemos un salto de linea
        System.out.println();
        //Comenzamos a calcular la suma de los elementos del array
        System.out.print("Suma de los elementos del array: ");

        for (int valor : tabla) {       //Recorremos el array y guardamos los elementos que leemos en la variable valor
            sumaNumeros += valor;       //En cada vuelta del bucle le sumamos a la variable suma la variable valor
        }
        System.out.print(sumaNumeros);  //Imprimimos por consola el sumatorio


    }
}
