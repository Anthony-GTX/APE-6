import java.util.Scanner;

public class Ejercicio02_ProduccionPorTurno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] produccion = new int[10];
        int sumaIndicesPares = 0, turnosImparesMayores15 = 0, sumaTotal = 0;

        for (int i = 0; i < produccion.length; i++) {
            System.out.print("Piezas fabricadas en el turno " + (i + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.print("Ingrese un numero entero valido: ");
                sc.next();
            }
            produccion[i] = sc.nextInt();
            while (produccion[i] < 0) {
                System.out.print("La cantidad no puede ser negativa: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Ingrese un numero entero valido: ");
                    sc.next();
                }
                produccion[i] = sc.nextInt();
            }
            sumaTotal += produccion[i];
            if (i % 2 == 0) sumaIndicesPares += produccion[i];
            if (produccion[i] % 2 != 0 && produccion[i] > 15) turnosImparesMayores15++;
        }

        double promedio = (double) sumaTotal / produccion.length;
        System.out.println("Suma en indices pares: " + sumaIndicesPares);
        System.out.println("Turnos con produccion impar y mayor a 15: " + turnosImparesMayores15);
        System.out.printf("Promedio general de produccion: %.2f%n", promedio);
        sc.close();
    }
}
