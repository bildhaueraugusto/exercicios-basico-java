//Crie um jogo de JoKenPo (Pedra-Papel-Tesoura). O usuário digita a opção que quer
//jogar e o algoritmo gera automaticamente a outra opção. Mostrar a mensagem informando
//o que cada um jogou e quem ganhou. Ao final deve ser perguntado ao usuário se ele quer
//jogar novamente ou não.

package ifelse;

import java.util.Scanner;
import java.util.Random;


public class ex1Simulado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random aleat = new Random();

        int usuario, computador;

        System.out.println("1 - Papel");
        System.out.println("2 - Pedra");
        System.out.println("3 - Tesoura");
        usuario = sc.nextInt();

        computador = aleat.nextInt(3) + 1; //se colocar somente o 3, os numeros vao de 0 a 2, por isso o +1
        System.out.println(computador);

        if (usuario != 1 && usuario != 2 && usuario != 3) {
            System.out.println("Número inválido!");
        }
        else if (usuario == 1 && computador == 2) {
            System.out.println("Ganhou!");
        }
        else if (usuario == 1 && computador == 3) {
            System.out.println("Perdeu!");
        }
        else if (usuario == 2 && computador == 1) {
            System.out.println("Perdeu!");
        }
        else if (usuario == 2 && computador == 3) {
            System.out.println("Ganhou!");
        }
        else if (usuario == 3 && computador == 1) {
            System.out.println("Ganhou!");
        }
        else if (usuario == 3 && computador == 2) {
            System.out.println("Perdeu!");
        }
        else {
            System.out.println("Empate!");
        }

        sc.close();
    }
}
