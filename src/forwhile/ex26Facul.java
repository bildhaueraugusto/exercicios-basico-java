package forwhile;

//FUP que imprima uma contagem regressiva de 10 até 0 e, ao final, imprima “FOGO!”.

import java.util.Scanner;


public class ex26Facul {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int i;

        for(i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("FOGO!");

        sc.close();
    }
}
