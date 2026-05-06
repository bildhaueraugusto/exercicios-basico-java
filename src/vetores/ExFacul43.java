package vetores;

import java.util.Scanner;

public class ExFacul43 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int num[] = new int[5];
        int maior = 0;

        for (int cont = 0; cont < 5; cont++) {

            System.out.println("Digite o " + (cont+1) + "° número: ");
            num[cont] = sc.nextInt();

            if (num[cont] > maior) {
                maior = num[cont];
            }

            System.out.println (num[cont] + " ");
        }

        System.out.println ("O maior número é: " + maior);
    }
}
