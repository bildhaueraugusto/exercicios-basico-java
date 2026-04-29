package forwhile;

import java.util.Scanner;

public class uri1132 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X, Y, cont, menor, maior, soma = 0;

        X = sc.nextInt();
        Y = sc.nextInt();

        if(X > Y) {
            maior = X;
            menor = Y;
        }
        else {
            maior = Y;
            menor = X;
        }


        for (cont = menor; cont <= maior; cont++) {

            if (cont % 13 != 0) {
                soma += cont;
            }
        }

        System.out.println(soma);
    }
}