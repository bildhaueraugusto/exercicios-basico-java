package forwhile;

import java.util.Scanner;

public class uri1157 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, cont;

        N = sc.nextInt();

        for (cont = 1; cont <= N; cont++) {

            if (N % cont == 0) {
                System.out.println(cont);
            }

        }
    }
}
