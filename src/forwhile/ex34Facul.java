package forwhile;

//FUP que leia o nome de uma pessoa e escreva:
//- O número de letras do nome.
//- O nome com todas as letras em maiúsculo.
//- O nome ao contrário.

import java.util.Scanner;

public class ex34Facul {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome, nomeM, invertido = " ";
        int quant;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        quant = nome.length();

        System.out.println("Número de letras: " + quant);

        nomeM = nome.toUpperCase();

        System.out.println("Nome em maiúsculo: " + nomeM);

        for (int i = nome.length() - 1; i >= 0; i--) {
            invertido += nome.charAt(i);
        }

        System.out.println("Nome ao contrário:" + invertido);

        sc.close();

    }
}
