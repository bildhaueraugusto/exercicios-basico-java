package scanner;

import java.util.Scanner;

public class entradaDados {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next(); //ler string

        int y;
        y = sc.nextInt(); //ler inteiro, se fosse double nextDouble

        char z;
        z = sc.next().charAt(0); //msm se escrever palavra, vai ler somente a 1° letra

        System.out.println("Você digitou: " + x);
        System.out.println("O número inteiro digitado foi: " + y);
        System.out.println("O caractere digitado foi: " + z);

        sc.close();
    }
}
