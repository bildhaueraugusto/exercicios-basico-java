package vetores;

import java.util.Scanner;

public class ExFacul46 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = 5;

        int[] vet = new int[N];
        int[] vet1 = new int[N];

        for (int i = 0; i < N; i++) {

            vet[i] = sc.nextInt();
            vet1[i] = sc.nextInt();

        }

        for (int i = 0; i < N; i++) {

            System.out.println(vet[i] + " " + vet1[i]);
        }
    }
}
