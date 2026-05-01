package vetores;

import java.util.Scanner;

public class Ex3Nelio {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int N;
        N = sc.nextInt();

        int[] numeros = new int[N];
        int[] numeros1 = new int[N];

        for (int i = 0; i < N; i++) {

            numeros[i] = sc.nextInt();
            numeros1[i] = sc.nextInt();

        }

        for (int i = 0; i < N; i++) {

            System.out.println(numeros1[i] + numeros[i]);
        }
    }
}
