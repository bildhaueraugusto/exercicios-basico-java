package scanner;

import java.util.Scanner;

public class entradaDados2 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;
        int x;

        x = sc.nextInt();
        sc.nextLine(); // precisa ser criada após next int, double, char: para deixar armanazenada a quebra de linha e não ocupar o espaço de s1
        s1 = sc.nextLine(); // se usar somente net, ele vai ler somente primeira palavra
        s2 = sc.nextLine(); // para ler a linha toda, acrescentar o Line
        s3 = sc.nextLine();

        System.out.println ("Dados Digitados:");
        System.out.println (x);
        System.out.println (s1);
        System.out.println (s2);
        System.out.println (s3);

    }
}
