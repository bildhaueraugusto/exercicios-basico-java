package forwhile;

import java.util.Scanner;

public class uri1143 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, cont;

        N = sc.nextInt();

        while (N < 1 || N > 1000) {
            N = sc.nextInt();
        }

        for (cont = 1; cont <= N; cont++) {

            System.out.println(cont + " " + (cont * cont) + " " + (cont * cont * cont));
        }
    }
}
