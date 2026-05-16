package matrizes;

import java.util.Scanner;

public class ExMat5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] A = new int[M][N];
        int[][] B = new int[M][N];
        int[][] C = new int[M][N];

        // leitura da matriz A
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // leitura da matriz B
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // soma das matrizes
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // impressão da matriz C
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
