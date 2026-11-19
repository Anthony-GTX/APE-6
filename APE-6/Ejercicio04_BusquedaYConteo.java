import java.util.Scanner;

public class Ejercicio04_BusquedaYConteo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {14, 7, 25, 3, 18, 7, 30};
        int contador = 0, posicion = -1;

        System.out.print("Ingrese el numero que desea buscar: ");
        while (!sc.hasNextInt()) {
            System.out.print("Ingrese un numero entero valido: ");
            sc.next();
        }
        int buscado = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                contador++;
                if (posicion == -1) posicion = i;
            }
        }

        if (posicion == -1) System.out.println("No existe");
        else {
            System.out.println("El numero aparece " + contador + " vez/veces.");
            System.out.println("Primera posicion (indice): " + posicion);
        }
        sc.close();
    }
}
