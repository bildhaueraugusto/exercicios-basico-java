package forwhile;

import java.util.Scanner;

public class uri1154 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade, cont = 0, somaIdades = 0;
        double media;

        idade = sc.nextInt();

        while (idade >= 0) {

            cont++;

            somaIdades = somaIdades + idade;

            idade = sc.nextInt();
        }

        media = ((double) somaIdades / cont);

        System.out.printf("%.2f%n", media);
    }
}
