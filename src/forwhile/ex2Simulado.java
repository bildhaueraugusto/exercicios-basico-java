//Faça um programa que leia o valor inicial da contagem, o valor final e o incremento,
//mostrando em seguida todos os valores no intervalo.

package forwhile;

import java.util.Scanner;

public class ex2Simulado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numInicial, numFinal, incremento;

        System.out.println("Digite o valor inicial: ");
        numInicial = sc.nextInt();
        System.out.println("Digite o valor final: ");
        numFinal = sc.nextInt();
        System.out.println("Digite o valor do incremento: ");
        incremento = sc.nextInt();

        System.out.println("Contagem: ");
        for (int i = numInicial; i <= numFinal; i += incremento) {
            System.out.println(i + " ");
        }
    }
}
