package matrizes;

import java.util.Random;

public class ExFacul52 {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] matriz = new int[5][5];

        // Preenchendo a matriz com números aleatórios
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        // a) Exibir matriz completa
        System.out.println("MATRIZ COMPLETA:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%3d ", matriz[i][j]);
            }
            System.out.println();
        }

        // b) Diagonal principal
        System.out.println("\nDIAGONAL PRINCIPAL:");
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        // c) Diagonal secundária
        System.out.println("\n\nDIAGONAL SECUNDÁRIA:");
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][4 - i] + " ");
        }

        // d) Triângulo superior
        System.out.println("\n\nTRIÂNGULO SUPERIOR:");
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

        // e) Triângulo inferior
        System.out.println("\n\nTRIÂNGULO INFERIOR:");
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
