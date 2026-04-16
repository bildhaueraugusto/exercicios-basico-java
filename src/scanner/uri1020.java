package scanner;

import java.util.Scanner;

public class uri1020 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N, resto, ano, mes, dia;

        N = sc.nextInt();

        ano = N / 365;
        resto = N % 365;
        mes = resto / 30;
        resto = resto % 30;
        dia = resto;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

        sc.close();
    }
}
