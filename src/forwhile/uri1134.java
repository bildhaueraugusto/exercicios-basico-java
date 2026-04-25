package forwhile;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class uri1134 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, contGasolina = 0, contAlcool = 0, contDiesel = 0;

        num = sc.nextInt();

        while (num != 4) {

            if (num == 1) {
                contAlcool++;
            }
            if (num == 2) {
                contGasolina++;
            }
            if (num == 3) {
                contDiesel++;
            }

            num = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + contAlcool);
        System.out.println("Gasolina: " + contGasolina);
        System.out.println("Diesel: " + contDiesel);
    }
}
