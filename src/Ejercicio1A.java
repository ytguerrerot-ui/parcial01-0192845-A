import java.util.Scanner;

public class Ejercicio1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_SECTORES = 10;
        int[] consumo = new int[NUM_SECTORES];

        
        for (int i = 0; i < NUM_SECTORES; i++) {
            int valor;
            boolean valido = false;
            do {
                System.out.print("Ingrese el consumo del sector " + (i + 1) + " (m3): ");
                valor = sc.nextInt();
                if (valor < 0) {
                    System.out.println("Dato invalido. El consumo no puede ser negativo. Intente de nuevo.");
                } else {
                    valido = true;
                }
            } while (!valido);
            consumo[i] = valor;
        }

        
        int total = 0;
        for (int i = 0; i < NUM_SECTORES; i++) {
            total += consumo[i];
        }
        double promedio = (double) total / NUM_SECTORES;

        int indiceMayor = 0;
        for (int i = 1; i < NUM_SECTORES; i++) {
            if (consumo[i] > consumo[indiceMayor]) {
                indiceMayor = i;
            }
        }

        
        int contadorSuperioresPromedio = 0;
        for (int i = 0; i < NUM_SECTORES; i++) {
            if (consumo[i] > promedio) {
                contadorSuperioresPromedio++;
            }
        }

       
        int rachaActual = 0;
        int rachaMax = 0;
        for (int i = 0; i < NUM_SECTORES; i++) {
            if (consumo[i] > promedio) {
                rachaActual++;
                if (rachaActual > rachaMax) {
                    rachaMax = rachaActual;
                }
            } else {
                rachaActual = 0;
            }
        }

       
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Consumo total de los 10 sectores: " + total + " m3");
        System.out.printf("Promedio de consumo: %.2f m3%n", promedio);
        System.out.println("Sector con mayor consumo: Sector " + (indiceMayor + 1)
                + " con " + consumo[indiceMayor] + " m3");
        System.out.println("Cantidad de sectores con consumo superior al promedio: " + contadorSuperioresPromedio);
        System.out.println("Racha mas larga de sectores consecutivos sobre el promedio: " + rachaMax);

        System.out.println("\n===== LISTADO FINAL DE SECTORES =====");
        for (int i = 0; i < NUM_SECTORES; i++) {
            System.out.println("Sector " + (i + 1) + ": " + consumo[i] + " m3");
        }

        sc.close();
    }
}