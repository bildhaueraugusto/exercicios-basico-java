package vetores;

import java.util.Scanner;

public class ExFacul45 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int N;
        System.out.println("Quantas notas deseja digitar?");
        N = sc.nextInt();

        double[] vet = new double[N];

        for (int i = 0; i < N; i++) {

            vet[i] = sc.nextDouble();

            while (vet[i] < 0 || vet[i] > 10) {
                vet[i] = sc.nextDouble();
            }
        }

        for (int i = 0; i < N; i++) {

            System.out.println(vet[i]);
        }
    }
}
