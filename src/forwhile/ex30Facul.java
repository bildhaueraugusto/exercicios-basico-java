package forwhile;

//FUP que receba o nome e a idade de 6 pessoas. Depois diga qual dessas pessoas é a
//mais nova e qual é a mais velha.

import java.util.Scanner;

public class ex30Facul {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, idade, idadeMenor = 1000, idadeMaior = 0;
        String nome, nomeMaior = " ", nomeMenor = " ";

        for (i = 0; i <= 5; i++) {

            System.out.println ("Escreva o nome: ");
            nome = sc.next();
            System.out.println ("Escreva a idade: ");
            idade = sc.nextInt();

            if (idadeMaior < idade) {
                idadeMaior = idade;
                nomeMaior = nome;
            }
            if (idadeMenor > idade) {
                idadeMenor = idade;
                nomeMenor = nome;
            }

        }

        System.out.println("O mais velho é o " + nomeMaior + " e tem " + idadeMaior + " anos.");
        System.out.println("O mais novo é o " + nomeMenor + " e tem " + idadeMenor + " anos.");

    }
}
