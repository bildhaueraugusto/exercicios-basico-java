package forwhile;

import java.util.Scanner;

public class uri1145 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X, Y, cont;

        X = sc.nextInt();

        while (X < 1 || X > 20) {
            X = sc.nextInt();
        }

        Y = sc.nextInt();

        while (Y < X || Y > 100000) {
            Y = sc.nextInt();
        }

        for (cont = 1; cont <= Y; cont++) {

            System.out.print(cont + " ");

            if (cont % X == 0) {
                System.out.println();
            }

        }
    }
}