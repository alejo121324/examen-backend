package examen;

import java.util.Scanner;

public class registrodepasos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Número de días
        final int NUM_DIAS = 5;

        // Array para almacenar la cantidad de pasos dados cada día
        int[] pasosPorDia = new int[NUM_DIAS];

        // Registro de datos usando un while
        int i = 0;
        while (i < NUM_DIAS) {
            System.out.print("Ingrese la cantidad de pasos dados en el día " + (i + 1) + ": ");
            pasosPorDia[i] = scanner.nextInt();
            i++;
        }

        // Cálculo del promedio
        double promedioPasos = calcularPromedio(pasosPorDia);

        // Imprimir resultados usando un for
        System.out.println("\nDatos de pasos ingresados:");
        for (int j = 0; j < NUM_DIAS; j++) {
            System.out.println("Día " + (j + 1) + ": " + pasosPorDia[j] + " pasos");
        }

        System.out.println("\nPromedio de pasos durante los 5 días: " + promedioPasos);

        scanner.close();
    }

    // Método para calcular el promedio de pasos
    private static double calcularPromedio(int[] datos) {
        int suma = 0;
        for (int dato : datos) {
            suma += dato;
        }
        return (double) suma / datos.length;
    }
}
