package matrizes;

import java.util.Scanner;

public class ExMat4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N;
        int soma = 0;

        N = sc.nextInt();

        int mat[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    soma += mat[i][j];
                }
            }
        }
        System.out.println(soma);
    }
}
