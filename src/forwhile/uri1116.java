package forwhile;

import java.util.Scanner;

public class uri1116 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, cont;

        N = sc.nextInt();

        for (cont = 1; cont <= N; cont++) {

            int X = sc.nextInt();
            int Y = sc.nextInt();
            double div;

            div = (double) X / Y;

            if (Y == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                System.out.println(div);
            }
        }
    }
}