package forwhile;

import java.util.Scanner;

public class uri1117 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n1, n2, media;

        n1 = sc.nextDouble();
        while (n1 < 0 || n1 > 10) {
            System.out.println("nota invalida");
            n1 = sc.nextDouble();
        }

        n2 = sc.nextDouble();
        while (n2 < 0 || n2 > 10) {
            System.out.println("nota invalida");
            n2 = sc.nextDouble();
        }

        media = (n1 + n2) / 2;
        System.out.printf ("media = %.2f%n", media);
    }
}
