package ifelse;

import java.util.Scanner;

public class ex13Facul {
    public static void main (String[] args) {

        int n1, n2, n3, aux, auxi, mid;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        n3 = sc.nextInt();

        if (n1 > n2 & n1 > n3) {
            aux = n1;
        } else if (n2 > n1 & n2 > n3) {
            aux = n2;
        } else {
            aux = n3;
        }

        if (n1 < n2 & n1 < n3) {
            auxi = n1;
        } else if (n2 < n1 & n2 < n3) {
            auxi = n2;
        } else {
            auxi = n3;
        }

        if (n1 > auxi & n1 < aux) {
            mid = n1;
        } else if (n2 > auxi & n2 < aux) {
            mid = n2;
        } else {
            mid = n3;
        }

        System.out.println("O maior número é o: " + aux);
        System.out.println("O menor número é o: " + auxi);
        System.out.println("O número do meio é o: " + mid);

        System.out.println("Ordem crescente: " + auxi + " - " + mid + " - " + aux);
    }
}
