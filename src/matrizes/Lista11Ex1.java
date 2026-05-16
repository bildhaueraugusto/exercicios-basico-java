    package matrizes;

    import java.util.Scanner;

    public class Lista11Ex1 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int mat[][] = new int[5][5];
            int somal3 = 0, somac2 = 0, diagonalPrincipal = 0, diagonalSecundaria = 0, somaTotal = 0;

            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                    System.out.println("Posição: [" + i + "] [" + j + "]");
                    mat[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                    if (i == 3) {
                        somal3 += mat[i][j];
                    }
                }
            }

            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                    if (j == 2) {
                        somac2 += mat[i][j];
                    }
                }
            }

            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                    if (j == i) {
                        diagonalPrincipal += mat[i][j];
                    }
                }
            }

            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                    if (j + i == 4) {
                        diagonalSecundaria += mat[i][j];
                    }
                }
            }

            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                    somaTotal += mat[i][j];
                }
            }

            System.out.println();

            System.out.println("Soma da 3° linha = " + somal3);
            System.out.println("Soma da 2° coluna = " + somac2);
            System.out.println("Soma da diagonal principal = " + diagonalPrincipal);
            System.out.println("Soma da diagonal secundária = " + diagonalSecundaria);
            System.out.println("Soma total = " + somaTotal);

    }
}
