package forwhile;

import java.util.Scanner;

public class uri1079 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, cont;

        N = sc.nextInt();

        for (cont = 1; cont <= N; cont++) {

            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();
            double media = (((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10);

            System.out.printf("%.1f%n", media);
        }
    }
}
