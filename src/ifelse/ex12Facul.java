package ifelse;

import java.util.Scanner;

public class ex12Facul {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int ano;

        System.out.println("Digite o ano: ");
        ano = sc.nextInt();

        if (ano % 4 == 0) {
            System.out.println("O ano é bissexto!");
        }
        else {
            System.out.println("O ano não é bissexto!");
        }

    }
}
