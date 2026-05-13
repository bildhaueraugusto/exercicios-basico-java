package matrizes;

import java.util.Scanner;

public class ExMat1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M, N;

        M = sc.nextInt();
        N = sc.nextInt();

        int mat[][] = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Valores Negativos:");

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] < 0) {
                    System.out.println(mat[i][j]);
                }
            }
        }
    }
}
