package vetores;

import java.util.Scanner;

public class Ex4Nelio {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, media, soma = 0;
        N = sc.nextInt();

        double[] vet = new double[N];

        for (int i = 0; i < N; i++) {

            vet[i] = sc.nextDouble();
            soma += vet[i];
        }

        media = soma / N;

        for (int i = 0; i < N; i++) {

            if(vet[i] < media) {
                System.out.println(vet[i]);
            }
        }
    }
}
