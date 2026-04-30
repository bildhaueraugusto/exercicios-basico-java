package forwhile;

import java.util.Scanner;

public class uri1146 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X, cont;

        X = sc.nextInt();

        while (X != 0) {

            for (cont = 1; cont <= X; cont++) {

                if (cont > 1) {
                    System.out.print(" ");
                }

                System.out.print(cont);
            }

            System.out.println();

            X = sc.nextInt();
        }
    }
}
