package ifelse;

import java.util.Scanner;

public class ex16Facul {
    public static void main (String[] args) {

        int ano, idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva a idade: ");
        idade = sc.nextInt();
        System.out.println("Escreva o ano em que nasceu?");
        ano = sc.nextInt();

        if (2026 - ano == idade) {
            System.out.println("Idade confere!");
        } else {
            System.out.println("Idade não confere!");
        }

    }
}