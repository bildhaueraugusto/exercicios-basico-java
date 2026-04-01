package scanner;

import java.util.Scanner;

public class notaPeso {
    public static void main (String[] args){

        double A, B, C, media;

        Scanner sc = new Scanner(System.in);

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        media = ((A * 2.0) + (B * 3.0) + (C * 5.0)) / 10;

        System.out.printf("MEDIA = %.1f\n", media);

        sc.close();
    }
}
