package forwhile;

import java.util.Scanner;

public class uri1159 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, soma;

        num = sc.nextInt();

        while (num != 0) {

            if (num % 2 == 0) {
                soma = num + (num + 2) + (num + 4) + (num + 6) + (num + 8);
            }
            else {
                soma = (num + 1) + (num + 3) + (num + 5) + (num + 7) + (num + 9);
            }

            System.out.println(soma);

            num = sc.nextInt();
        }
    }
}
