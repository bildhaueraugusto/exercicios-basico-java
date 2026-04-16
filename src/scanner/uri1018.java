package scanner;

import java.util.Scanner;

public class uri1018 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N, resto, nota100, nota50, nota20, nota10, nota5,nota2, nota1;

        N = sc.nextInt();

        nota100 = N / 100;
        resto = N % 100;
        nota50 = resto / 50;
        resto = resto % 50;
        nota20 = resto / 20;
        resto = resto % 20;
        nota10 = resto / 10;
        resto = resto % 10;
        nota5 = resto / 5;
        resto = resto % 5;
        nota2 = resto / 2;
        resto = resto % 2;
        nota1 = resto;

        System.out.println(N);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");

        sc.close();
    }
}
