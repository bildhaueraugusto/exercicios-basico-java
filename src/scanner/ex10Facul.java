package scanner;

import java.util.Scanner;

public class ex10Facul {
    public static void main (String[] args){

        int num1, num2, num3;
        double media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        num3 = sc.nextInt();

        media = (num1 + num2 + num3) / 3;

        System.out.println("A média dos números é: " + media);

        sc.close();
    }
}
