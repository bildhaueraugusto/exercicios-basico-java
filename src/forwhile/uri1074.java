package forwhile;

import java.util.Scanner;

public class uri1074 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, cont = 1;
        N = sc.nextInt();

        for (cont = 1; cont <= N; cont++) {

            int num = sc.nextInt();

            if (num % 2 == 0 && num > 0) {
                System.out.println("EVEN POSITIVE");
            }
            else if (num % 2 == 0 && num < 0) {
                System.out.println("EVEN NEGATIVE");
            }
            else if (num % 2 != 0 && num > 0) {
                System.out.println("ODD POSITIVE");
            }
            else if (num % 2 != 0 && num < 0) {
                System.out.println("ODD NEGATIVE");
            }
            else {
                System.out.println("NULL");
            }
        }
    }
}