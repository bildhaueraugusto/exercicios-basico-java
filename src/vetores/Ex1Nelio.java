package vetores;

import java.util.Scanner;

public class Ex1Nelio {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, posMaior = 0;
        N = sc.nextInt();

        double maior = 0;
        double[] vet = new double[N];

        for (int i = 0; i < N; i++) {

            vet[i] = sc.nextDouble();

            if (vet[i] > maior) {
                maior = vet[i];
                posMaior = i;
            }
        }
        System.out.println(maior);
        System.out.println(posMaior);
    }
}
