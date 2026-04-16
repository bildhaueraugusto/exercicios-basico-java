package scanner;

import java.util.Scanner;

public class uri1011 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio, pi = 3.14159, volume;

        raio = sc.nextDouble();

        volume = (4/3.0) * pi * (raio * raio * raio);

        System.out.printf("VOLUME = %.3f%n", volume);
    }
}
