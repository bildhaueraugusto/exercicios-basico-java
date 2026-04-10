package forwhile;

//Desenvolva um programa que receba a idade e a altura de várias pessoas. Calcule e
//imprima a média das alturas das pessoas com mais de 50 anos. Para encerrar a
//entrada de dados, digite idade <= zero.

import java.util.Scanner;

public class ex32Facul {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int altura, idade, mediaAlturas;
        int somaAlturas = 0;
        int contador = 0;

        int i = 1;
        while (i > 0) {

            System.out.println("Digite a altura em cm: ");
            altura = sc.nextInt();

            System.out.println("Digite a idade: ");
            i = sc.nextInt();
            idade = i;

            if (idade > 50) {
                somaAlturas += altura;
                contador++;
            }
        }

        mediaAlturas = somaAlturas / contador;

        System.out.println("A média das alutras das pessoas com mais de 50 anos é de: " + mediaAlturas);

        System.out.println("Idade inválida, programa finalizado.");
    }
}
