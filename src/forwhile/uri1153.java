package forwhile;

import java.util.Scanner;

public class uri1153 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, cont, fat = 1; //precisa começar em 1, pq qlqr numero *0 é 0

        N = sc.nextInt();

        while (N <= 0 || N >= 13) {
            N = sc.nextInt();
        }

        for (cont = N; cont >= 1; cont--) {

            fat *= cont;
        }

        System.out.println(fat);
    }
}
