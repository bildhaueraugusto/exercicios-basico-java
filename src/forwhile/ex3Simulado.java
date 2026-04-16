//Faça um programa que leia uma quantidade indeterminada de números positivos e
//conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100].

package forwhile;

import java.util.Scanner;

public class ex3Simulado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, cont025 = 0, cont2650 = 0, cont5175 = 0, cont76100 = 0, outros = 0;

        num = 101;

        while (num >= 0) {
            System.out.println("Digite um número: ");
            num = sc.nextInt();

            if (num >= 0 && num <= 25) {
                cont025++;
            }
            else if (num >= 26 && num <= 50) {
                cont2650++;
            }
            else if (num >= 51 && num <= 75) {
                cont5175++;
            }
            else if (num >= 76 && num <= 100) {
                cont76100++;
            }
            else {
                outros++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 25: " + cont025);
        System.out.println("Quantidade de números entre 26 e 50: " + cont2650);
        System.out.println("Quantidade de números entre 51 e 75: " + cont5175);
        System.out.println("Quantidade de números entre 76 e 100: " + cont76100);
    }
}
