package vetores;

import java.util.Scanner;

public class Ex5Nelio {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, media, soma = 0, numeros = 0;
        N = sc.nextInt();

        int[] vet = new int[N];

        for (int i = 0; i < N; i++) {

            vet[i] = sc.nextInt();
            if (vet[i] % 2 == 0) {
                soma += vet[i];
                numeros++;
            }
        }

        media = soma / numeros;

        System.out.println(media);
    }
}
