import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        double num1, num2, media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = sc.nextDouble();

        media = ((num1 * 3.5) + (num2 * 7.5 )) / 11;

        System.out.printf("MEDIA = %.5f\n", media);

        sc.close();
    }
}