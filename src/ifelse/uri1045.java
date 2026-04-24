//se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
//se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
//se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
//se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
//se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
//se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

package ifelse;

import java.util.Scanner;

public class uri1045 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double A, B, C, menor, mid, maior;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        //conferindo o menor
        if (A < B && A < C) {
            menor = A;
        }
        else if (B < A && B < C) {
            menor = B;
        }
        else {
            menor = C;
        }

        //conferindo o maior
        if (A > B && A > C) {
            maior = A;
        }
        else if (B > A && B > C) {
            maior = B;
        }
        else{
            maior = C;
        }


        //conferindo o meio
        if (A != maior && A != menor) {
            mid = A;
        }
        else if (B != maior && B != menor) {
            mid = B;
        }
        else {
            mid = C;
        }


        if (maior >= menor + mid) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (java.lang.Math.pow(maior, 2) == Math.pow(menor, 2) + Math.pow(mid, 2)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (java.lang.Math.pow(maior, 2) > Math.pow(menor, 2) + Math.pow(mid, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (java.lang.Math.pow(maior, 2) < Math.pow(menor, 2) + Math.pow(mid, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && A == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if (A == B && A != C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
            if (B == C && B != A) {
                System.out.println(("TRIANGULO ISOSCELES"));
            }
            if (A == C && A != B) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        sc.close();
    }
}
