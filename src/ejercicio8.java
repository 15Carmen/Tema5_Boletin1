public class ejercicio8 {
    /*
    Define tres arrays de 20 números enteros cada uno, con nombres numeros, cuadrados y cubos. Carga el array numeros
    con valores aleatorios entre 0 y 100. En el array cuadrados se deben almacenar los cuadrados de los valores que
    hay en el array numeros. En el array cubos se deben almacenar los cubos de los valores que hay en numeros. A
    continuación, muestra el contenido de los tres arrays dispuestos en tres columnas.
     */

    public static void main(String[] args) {
        int[] numeros = new int[20];
        int[] cuadrados = new int[20];
        int[] cubos = new int[20];

        for (int i=0; i<numeros.length; i++){
            numeros[i] = (int) (Math.random()*100+1);
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < cuadrados.length; i++) {
            for (int valor:numeros) {
                valor= (int) Math.pow(numeros[i], 2);
                cuadrados[i]=valor;
            }
            System.out.print(cuadrados[i] + " ");

        }

        System.out.println();

        for (int i = 0; i < cubos.length; i++) {
            for (int valor2:numeros) {
                valor2= (int) Math.pow(numeros[i], 3);
                cubos[i]=valor2;
            }
            System.out.print(cubos[i] + " ");

        }

    }
}
