package matrizes;

import java.util.Scanner;

public class ExFacul51 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][5];

        // Vetores correspondentes às linhas
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] vetor3 = new int[5];

        // Preenchendo a matriz
        System.out.println("Digite os valores da matriz 3x5:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Salvando cada linha em um vetor
        for (int j = 0; j < 5; j++) {
            vetor1[j] = matriz[0][j];
            vetor2[j] = matriz[1][j];
            vetor3[j] = matriz[2][j];
        }

        // Exibindo vetores
        System.out.println("\nVetor 1:");
        for (int num : vetor1) {
            System.out.print(num + " ");
        }

        System.out.println("\nVetor 2:");
        for (int num : vetor2) {
            System.out.print(num + " ");
        }

        System.out.println("\nVetor 3:");
        for (int num : vetor3) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
