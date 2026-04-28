package forwhile;

import java.util.Scanner;

public class uri1067 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X, cont = 1;
        X = sc.nextInt();

        while (X < 0 || X > 1000) {
            X = sc.nextInt();
        }

        for (cont = 1; cont <= X; cont++) {

            if (cont % 2 != 0) {
                System.out.println(cont);
            }
        }
    }
}
