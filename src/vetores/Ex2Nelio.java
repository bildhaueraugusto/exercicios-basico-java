package vetores;

import java.util.Scanner;

public class Ex2Nelio {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, pares = 0;
        N = sc.nextInt();

        int[] vet = new int[N];

        for (int i = 0; i < N; i++) {

            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {

            if (vet[i] % 2 == 0) {
                System.out.print(vet[i] + " ");
                pares++;
            }
        }
        System.out.println("\n" + pares);
    }
}
