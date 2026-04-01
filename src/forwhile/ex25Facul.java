package forwhile;

//FUP que solicite ao usuário quantos números inteiros ele quer digitar. Depois, a cada
//número digitado, escreva se é par ou ímpar.

import java.util.Scanner;


public class ex25Facul {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int num, quant;
        int contPar = 0;
        int contImpar = 0;

        System.out.println("Digite quantos números quer digitar: ");
        quant = sc.nextInt();


        for(int i = 1; i <= quant; i++) {

            System.out.println("Digite um número: ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                contPar++;
            }
            else {
                contImpar++;
            }

        }

        System.out.println("Números pares: " + contPar);
        System.out.println("Números ímpares: " + contImpar);

        sc.close();
    }
}
