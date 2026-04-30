package forwhile;

import java.util.Scanner;

public class uri1142 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, cont, ult;

        N = sc.nextInt();

        ult = N * 4;

        for (cont = 1; cont <= ult; cont++) {

            if (cont % 4 == 0) {
                System.out.println("PUM");
            }
            else {
                System.out.print(cont + " ");
            }

        }
    }
}
