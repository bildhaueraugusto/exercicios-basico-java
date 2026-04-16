package scanner;

import java.util.Scanner;

public class uri1012 {
    public static void main(String[] args) {

        double A, B, C, aTriangulo, aCirculo, aTrapezio, aQuadrado, aRetangulo, pi = 3.14159;

        Scanner sc = new Scanner(System.in);

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        aTriangulo = (A * C) / 2;
        aCirculo = pi * (C * C);
        aTrapezio = ((A + B) * C) / 2;
        aQuadrado = B * B;
        aRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", aTriangulo);
        System.out.printf("CIRCULO: %.3f%n", aCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", aTrapezio);
        System.out.printf("QUADRADO: %.3f%n", aQuadrado);
        System.out.printf("RETANGULO: %.3f%n", aRetangulo);

    }
}
