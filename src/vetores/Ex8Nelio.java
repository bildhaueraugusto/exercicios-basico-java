package vetores;

import java.util.Scanner;

public class Ex8Nelio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, homens = 0, mulheres = 0;
        N = sc.nextInt();

        double maior = 0, menor = 100000, somaM = 0, mediaM;

        char[] sexo = new char[N];
        double[] alt = new double[N];

        for (int i = 0; i < N; i++) {

            alt[i] = sc.nextDouble();

            System.out.println("Sexo M ou F");
            sexo[i] = sc.next().charAt(0);

            if (sexo[i] == 'M') {
                homens++;
            }

            if (sexo[i] == 'F') {
                mulheres++;
                somaM += alt[i];
            }

            if (alt[i] > maior) {
                maior = alt[i];
            }

            if (alt[i] < menor) {
                menor = alt[i];
            }
        }

        System.out.println("Menor altura = " + menor);
        System.out.println("Maior altura = " + maior);

        mediaM = somaM / mulheres;

        System.out.println("Media altura mulheres = " + mediaM);
        System.out.println("Numero homens = " + homens);

        sc.close();
    }
}
