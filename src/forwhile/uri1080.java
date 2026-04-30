package forwhile;

import java.util.Scanner;

public class uri1080 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, cont, maior = 0, posMaior = 0;

        for (cont = 1; cont <= 100; cont++) {

            N = sc.nextInt();

            if (N > maior) {
                maior = N;
                posMaior = cont;
            }

        }

        System.out.println(maior);
        System.out.println(posMaior);
    }
}
