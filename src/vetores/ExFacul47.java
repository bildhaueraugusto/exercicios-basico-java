package vetores;

import java.util.Scanner;

public class ExFacul47 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int N;
        System.out.println("Quantas pessoas deseja cadastrar?");
        N = sc.nextInt();

        String[] nome = new String[N];
        int[] idade = new int[N];
        int[] altura = new int[N];

        for (int i = 0; i < N; i++) {

            System.out.println("Nome: ");
            nome[i] = sc.next();
            System.out.println("Idade: ");
            idade[i] = sc.nextInt();
            System.out.println("Altura: ");
            altura[i] = sc.nextInt();

        }

        for (int i = 0; i < N; i++) {

            System.out.println(nome[i] + " tem " + idade[i] + " anos e mede " + altura[i] + " cm.");
        }
    }
}
