package matrizes;

import java.util.Random;

public class ExFacul49
{
    public static void main (String[] args)
    {
        int num[] = new int[20];
        int vetorA[] = new int[20];
        int vetorB[] = new int[20];
        int vetorC[] = new int[20];

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int aleatorio = random.nextInt(100) + 1;
            num[i] = aleatorio;

            if (aleatorio % 2 == 0) {
                vetorA[i] = aleatorio;
            }

            if (aleatorio % 5 == 0) {
                vetorB[i] = aleatorio;
            }

            if (aleatorio > 50) {
                vetorC[i] = aleatorio;
            }
        }

        // Mostrar Vetor A (pares)
        System.out.println("Vetor A (pares):");
        for (int i = 0; i < 20; i++) {
            if (vetorA[i] != 0) {
                System.out.print(vetorA[i] + " ");
            }
        }

        // Mostrar Vetor B (múltiplos de 5)
        System.out.println("\nVetor B (múltiplos de 5):");
        for (int i = 0; i < 20; i++) {
            if (vetorB[i] != 0) {
                System.out.print(vetorB[i] + " ");
            }
        }

        // Mostrar Vetor C (maiores que 50)
        System.out.println("\nVetor C (maiores que 50):");
        for (int i = 0; i < 20; i++) {
            if (vetorC[i] != 0) {
                System.out.print(vetorC[i] + " ");
            }
        }





    }
}