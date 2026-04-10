package forwhile;

//Desenvolva um programa que solicite do usuário vários números e apenas pare de
//pedir números quando ele for divisível por 5.

import java.util.Scanner;

public class ex31Facul {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        int i = 1;
        while (i % 5 != 0) {

            System.out.println("Digite um número: ");
            i = sc.nextInt();

        }

        System.out.println("O número é divisível por 5, programa finalizado.");
    }
}
