package matrizes;

import java.util.Random;

public class ExFacul53 {
    public static void main(String[] args) {

        Random random = new Random();

        String[][] matriz = new String[4][4];

        // Preenchendo com números aleatórios de 0 a 9
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                int numero = random.nextInt(10);

                matriz[i][j] = String.valueOf(numero);
            }
        }

        // Exibindo matriz original
        System.out.println("MATRIZ ORIGINAL:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Substituindo zeros por X
        System.out.println("\nMATRIZ COM X NO LUGAR DO ZERO:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (matriz[i][j].equals("0")) {
                    System.out.print("X ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}