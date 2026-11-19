import java.util.Scanner;

public class Ejercicio01_ControlGastosSemanales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] gastos = new double[7];
        double total = 0;
        int incrementados = 0;

        for (int i = 0; i < gastos.length; i++) {
            System.out.print("Gasto del dia " + (i + 1) + ": ");
            while (!sc.hasNextDouble()) {
                System.out.print("Ingrese un valor numerico valido: ");
                sc.next();
            }
            gastos[i] = sc.nextDouble();
            while (gastos[i] < 0) {
                System.out.print("El gasto no puede ser negativo. Ingrese nuevamente: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Ingrese un valor numerico valido: ");
                    sc.next();
                }
                gastos[i] = sc.nextDouble();
            }
            total += gastos[i];
        }

        double promedio = total / gastos.length;
        System.out.printf("Gasto total: $%.2f%n", total);
        System.out.printf("Promedio diario: $%.2f%n", promedio);

        for (int i = 0; i < gastos.length; i++) {
            if (gastos[i] > promedio) {
                gastos[i] *= 1.10;
                incrementados++;
            }
        }

        System.out.println("Gastos actualizados en orden inverso:");
        for (int i = gastos.length - 1; i >= 0; i--) {
            System.out.printf("Dia %d: $%.2f%n", i + 1, gastos[i]);
        }
        System.out.println("Dias con incremento: " + incrementados);
        sc.close();
    }
}
