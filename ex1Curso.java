package scanner;

import java.util.Locale;
import java.util.Scanner;

public class ex1Curso {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double x, y, area, preco;

        System.out.println("Qual a largura do terreno em metros?");
        x = sc.nextDouble();
        System.out.println("A largura do terreno é de " + x + " metros.");

        System.out.println();

        System.out.println("Qual o comprimento do terreno em metros?");
        y = sc.nextDouble();
        System.out.println("O comprimento do terreno é de " + y + " metros.");

        area = y * x;

        System.out.println();
        System.out.printf("A área do terreno é de: %.2f m².", area); //para ficar com duas casas dps da virgula

        System.out.println();
        System.out.println("O preço do metro quadrado é de 200 reais.");

        preco = 200 * area;

        System.out.printf("O valor do terreno é de %.2f reais.", preco);


        sc.close();
    }
}