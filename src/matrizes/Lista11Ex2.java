package matrizes;

import java.util.Scanner;

public class Lista11Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] A = new int[4][6];
        int[][] B = new int[4][6];
        int[][] S = new int[4][6];
        int[][] D = new int[4][6];

        // Leitura da matriz A
        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

        // Leitura da matriz B
        System.out.println("\nDigite os valores da matriz B:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }

        // Soma e diferença
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {

                S[i][j] = A[i][j] + B[i][j];
                D[i][j] = A[i][j] - B[i][j];
            }
        }

        // Mostrar matriz A
        System.out.println("\nMatriz A:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%4d", A[i][j]);
            }
            System.out.println();
        }

        // Mostrar matriz B
        System.out.println("\nMatriz B:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%4d", B[i][j]);
            }
            System.out.println();
        }

        // Mostrar matriz S
        System.out.println("\nMatriz Soma (S = A + B):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%4d", S[i][j]);
            }
            System.out.println();
        }

        // Mostrar matriz D
        System.out.println("\nMatriz Diferença (D = A - B):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%4d", D[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
