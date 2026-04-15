package forwhile;
//Desenvolva um programa para calcular N! (fatorial de N), sendo que o valor inteiro de
//N é fornecido pelo usuário.
//* Sabe-se que N! = 1 * 2 * 3 * ... * (N-1)* N
//* 0! = 1, por definição

import java.util.Scanner;

public class ex36Facul {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, fatorial = 1;

        System.out.println("Digite um número inteiro: ");
        N = sc.nextInt();

        while (N >=1) {

            fatorial *= N;
            N--;
        }

        System.out.println("O fatorial de " + N + " é " + fatorial);


        sc.close();
    }
}