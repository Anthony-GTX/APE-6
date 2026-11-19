import java.util.Scanner;

public class Ejercicio03_AsistenciaYRendimiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Cantidad de estudiantes: ");
        while (!sc.hasNextInt()) {
            System.out.print("Ingrese una cantidad entera valida: ");
            sc.next();
        }
        n = sc.nextInt();
        while (n <= 0) {
            System.out.print("La cantidad debe ser mayor que cero: ");
            while (!sc.hasNextInt()) {
                System.out.print("Ingrese una cantidad entera valida: ");
                sc.next();
            }
            n = sc.nextInt();
        }

        int[] notas = new int[n];
        int suma = 0, aprobados = 0, reprobados = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nota del estudiante " + (i + 1) + " (0-20): ");
            while (!sc.hasNextInt()) {
                System.out.print("Ingrese una nota entera valida: ");
                sc.next();
            }
            notas[i] = sc.nextInt();
            while (notas[i] < 0 || notas[i] > 20) {
                System.out.print("La nota debe estar entre 0 y 20: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Ingrese una nota entera valida: ");
                    sc.next();
                }
                notas[i] = sc.nextInt();
            }
            suma += notas[i];
            if (notas[i] >= 14) aprobados++;
            else reprobados++;
        }

        double promedio = (double) suma / n;
        System.out.printf("Promedio general: %.2f%n", promedio);
        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes reprobados: " + reprobados);
        System.out.println("Estudiantes con nota por debajo del promedio:");
        boolean hayDebajo = false;
        for (int i = 0; i < n; i++) {
            if (notas[i] < promedio) {
                System.out.println("Estudiante " + (i + 1) + " - Nota: " + notas[i]);
                hayDebajo = true;
            }
        }
        if (!hayDebajo) System.out.println("Ninguno");
        sc.close();
    }
}
