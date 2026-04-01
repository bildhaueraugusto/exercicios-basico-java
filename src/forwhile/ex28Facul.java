package forwhile;

//FUP que gere um número aleatório (não mostrar na tela este número). Peça para o
//usuário tentar adivinhar o número gerado. O programa encerra quando o usuário
//acertar o número ou com 5 tentativas.
//- Utilizar a classe Random.

import java.util.Random;
import java.util.Scanner;


public class ex28Facul {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int i = 0;
        int aleat, num;

        aleat = random.nextInt(20);

        for(i = 1; i < 6; i++) {
            System.out.println("Digite um número: ");
            num = sc.nextInt();

            if (num == aleat) {
                System.out.println("Você acertou o número aleatório!");
            }
            else {
                System.out.println("Você não acertou o número aleatório!");
            }
        }

        System.out.println("O número sorteado é: " + aleat);

        sc.close();
    }
}
