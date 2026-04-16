package scanner;

import java.util.Scanner;

public class uri1013 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, C, maiorAB, maior;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        maiorAB = (A + B + Math.abs(A - B)) / 2;
        maior = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

        System.out.println(maior + " eh o maior");

        sc.close();

    }
}
