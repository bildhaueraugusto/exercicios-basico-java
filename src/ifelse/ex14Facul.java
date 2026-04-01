package ifelse;

import java.util.Scanner;

public class ex14Facul {
    public static void main (String[] args) {

        int num, A, B;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = sc.nextInt();

        if (num > 0) {
            A = num;
            System.out.println("O número " + A + " é positivo.");
        } else if (num < 0) {
            B = num;
            System.out.println("O número " + B + " é negativo.");
        } else {
            System.out.println("O número é 0.");
        }
    }
}
