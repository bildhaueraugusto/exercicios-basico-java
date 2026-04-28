package forwhile;

import java.util.Scanner;

public class uri1072 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, cont = 1, contIn = 0, contOut = 0;

        N = sc.nextInt();

        while (N > 10000) {
            N = sc.nextInt();
        }

        for (cont = 1; cont <= N; cont++) {

            int num = sc.nextInt();

            if (num >= 10 && num <= 20) {
                contIn++;
            }
            else {
                contOut++;
            }
        }

        System.out.println(contIn + " in");
        System.out.println(contOut + " out");
    }
}