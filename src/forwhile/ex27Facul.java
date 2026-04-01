package forwhile;

//FUP que receba a idade de 5 pessoas, calcule e imprima a quantidade de pessoas
//maiores de idade (idade >= 18 anos).

import java.util.Scanner;


public class ex27Facul {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int idade;
        int contMaior = 0;
        int contMenor = 0;

        for(int i = 1; i <= 5; i++) {

            System.out.println("Digite uma idade: ");
            idade = sc.nextInt();

            if (idade >= 18) {
                contMaior++;
            }
            else {
                contMenor++;
            }

        }

        System.out.println("Maiores de idade: " + contMaior);
        System.out.println("Menores de idade: " + contMenor);

        sc.close();
    }
}
