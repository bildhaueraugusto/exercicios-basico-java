package forwhile;

//FUP que leia 3 notas de um aluno, calcule a média das notas e imprima. Entretanto, o
//programa não pode aceitar notas menores que 0,0 ou maiores que 10,0. Se o usuário
//digitar alguma nota errada, deve conseguir digitar novamente.

import java.util.Scanner;

public class ex33Facul {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n1 = -1.0, n2 = -1.0, n3 = -1.0, media;

        while (n1 < 0.0 || n1 > 10.0)
        {
            System.out.println("Digite a primeira nota: ");
            n1 = sc.nextInt();

            if (n1 < 0.0 || n1 > 10.0) {

                System.out.println("Nota inválida, digite novamente!");

            }

        }
        while (n2 < 0.0 || n2 > 10.0)
        {
            System.out.println("Digite a segunda nota: ");
            n2 = sc.nextInt();

            if (n2 < 0.0 || n2 > 10.0) {

                System.out.println("Nota inválida, digite novamente!");

            }

        }
        while (n3 < 0.0 || n3 > 10.0)
        {
            System.out.println("Digite a terceira nota: ");
            n3 = sc.nextInt();

            if (n3 < 0.0 || n3 > 10.0) {

                System.out.println("Nota inválida, digite novamente!");

            }

        }

        media = (n1 + n2 + n3) / 3;
        System.out.println("A média final é: " + media);


    }
}

