package ifelse;

import java.util.Scanner;

public class uri1036 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        double A, B, C, delta, r1, r2;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        delta = B * B - 4 * A * C;

        if (delta < 0 || A == 0) {
            System.out.println("Impossivel calcular");
        } else {
            r1 = (-B + Math.sqrt(delta)) / (2 * A);
            r2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }

        sc.close();
    }
}