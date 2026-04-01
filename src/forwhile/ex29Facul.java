package forwhile;

//FUP que solicite dois números inteiros. Escreva os números que estão entre eles.

import java.util.Scanner;


public class ex29Facul {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();


        for(int i = num1+1; i <= num2 - 1; i++) {
            System.out.println(i + " ");
        }

        sc.close();
    }
}