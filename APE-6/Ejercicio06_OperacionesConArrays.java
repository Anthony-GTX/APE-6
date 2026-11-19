import java.util.Arrays;

public class Ejercicio06_OperacionesConArrays {
    public static void main(String[] args) {
        int[] datos = {14, 7, 25, 3, 18};
        int[] copia = Arrays.copyOf(datos, datos.length);
        Arrays.sort(copia);

        System.out.println("Arreglo original: " + Arrays.toString(datos));
        System.out.println("Copia ordenada: " + Arrays.toString(copia));

        int segundoMayor = copia[copia.length - 2];
        int posicion14 = Arrays.binarySearch(copia, 14);
        System.out.println("Segundo numero mayor: " + segundoMayor);
        System.out.println("Posicion del 14 en la copia ordenada: " + posicion14);
    }
}
