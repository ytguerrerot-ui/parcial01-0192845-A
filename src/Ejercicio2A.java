import java.util.Scanner;

public class Ejercicio2A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAQUINAS = 4;
        final int DIAS = 5;
        int[][] produccion = new int[MAQUINAS][DIAS];

        
        for (int fila = 0; fila < MAQUINAS; fila++) {
            for (int col = 0; col < DIAS; col++) {
                int valor;
                boolean valido = false;
                do {
                    System.out.print("Produccion de la maquina " + (fila + 1)
                            + " en el dia " + (col + 1) + ": ");
                    valor = sc.nextInt();
                    if (valor < 0) {
                        System.out.println("Dato invalido. No puede ser negativo. Intente de nuevo.");
                    } else {
                        valido = true;
                    }
                } while (!valido);
                produccion[fila][col] = valor;
            }
        }

        
        int[] totalPorMaquina = new int[MAQUINAS];
        for (int fila = 0; fila < MAQUINAS; fila++) {
            int suma = 0;
            for (int col = 0; col < DIAS; col++) {
                suma += produccion[fila][col];
            }
            totalPorMaquina[fila] = suma;
        }

        
        int[] totalPorDia = new int[DIAS];
        for (int col = 0; col < DIAS; col++) {
            int suma = 0;
            for (int fila = 0; fila < MAQUINAS; fila++) {
                suma += produccion[fila][col];
            }
            totalPorDia[col] = suma;
        }

      
        int indiceMaquinaMayor = 0;
        for (int fila = 1; fila < MAQUINAS; fila++) {
            if (totalPorMaquina[fila] > totalPorMaquina[indiceMaquinaMayor]) {
                indiceMaquinaMayor = fila;
            }
        }

        
        int indiceDiaMenor = 0;
        for (int col = 1; col < DIAS; col++) {
            if (totalPorDia[col] < totalPorDia[indiceDiaMenor]) {
                indiceDiaMenor = col;
            }
        }

       
        int contadorMenores20 = 0;
        for (int fila = 0; fila < MAQUINAS; fila++) {
            for (int col = 0; col < DIAS; col++) {
                if (produccion[fila][col] < 20) {
                    contadorMenores20++;
                }
            }
        }

       
        System.out.println("\n===== TOTAL POR MAQUINA =====");
        for (int fila = 0; fila < MAQUINAS; fila++) {
            System.out.println("Maquina " + (fila + 1) + ": " + totalPorMaquina[fila] + " piezas");
        }

        System.out.println("\n===== TOTAL POR DIA =====");
        for (int col = 0; col < DIAS; col++) {
            System.out.println("Dia " + (col + 1) + ": " + totalPorDia[col] + " piezas");
        }

        System.out.println("\n===== RESULTADOS DESTACADOS =====");
        System.out.println("Maquina con mayor produccion acumulada: Maquina " + (indiceMaquinaMayor + 1)
                + " con " + totalPorMaquina[indiceMaquinaMayor] + " piezas");
        System.out.println("Dia con menor produccion total: Dia " + (indiceDiaMenor + 1)
                + " con " + totalPorDia[indiceDiaMenor] + " piezas");
        System.out.println("Registros inferiores a 20 piezas: " + contadorMenores20);

        System.out.println("\n===== MATRIZ COMPLETA (Maquina x Dia) =====");
        System.out.print("        ");
        for (int col = 0; col < DIAS; col++) {
            System.out.printf("Dia%-3d", (col + 1));
        }
        System.out.println();
        for (int fila = 0; fila < MAQUINAS; fila++) {
            System.out.printf("Maq %-3d ", (fila + 1));
            for (int col = 0; col < DIAS; col++) {
                System.out.printf("%-6d", produccion[fila][col]);
            }
            System.out.println();
        }

        sc.close();
    }
}