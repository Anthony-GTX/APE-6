public class Ejercicio05_MaximoMinimoArreglosParalelos {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Marta", "Pedro"};
        int[] notas = {15, 8, 18, 11};
        int posMax = 0, posMin = 0, suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            if (notas[i] > notas[posMax]) posMax = i;
            if (notas[i] < notas[posMin]) posMin = i;
        }

        double promedio = (double) suma / notas.length;
        System.out.println("Nota mas alta: " + nombres[posMax] + " - " + notas[posMax]);
        System.out.println("Nota mas baja: " + nombres[posMin] + " - " + notas[posMin]);
        System.out.printf("Promedio: %.2f%n", promedio);
    }
}
