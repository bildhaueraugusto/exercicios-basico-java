package scanner;

import java.util.Scanner;

public class ex11Facul {
    public static void main (String[] args){

        double celsius, fahrenheit;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = celsius * 1.8 + 32;

        System.out.println("Graus Celsius: " + celsius);
        System.out.println("Graus fahrenheit: " + fahrenheit);

        sc.close();
    }
}

