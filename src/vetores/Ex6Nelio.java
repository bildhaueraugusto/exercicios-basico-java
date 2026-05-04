package vetores;

import java.util.Scanner;

public class Ex6Nelio {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomeM = " ";
        int N, maior = 0;
        N = sc.nextInt();

        String[] nome = new String[N];
        int[] idade = new int[N];

        for (int i = 0; i < N; i++) {

            System.out.println("Nome: ");
            nome[i] = sc.next();
            System.out.println("Idade: ");
            idade[i] = sc.nextInt();

            if (maior < idade[i]) {
                maior = idade[i];
                nomeM = nome[i];
            }

        }

        System.out.println("Peesoa mais velha: " + nomeM);
    }
}