package vetores;

public class ExFacul41 {
    public static void main (String[] args)
    {
        int num[] = new int[8];
        int contPos = 0, contNeg = 0;

        // Leitura dos valores
        for(int cont = 0; cont < 8; cont++)
        {
            num[cont] = Entrada.leiaInt("Digite um número número: ");

            if (num[cont] >= 0) {
                contPos++;
            }
            else {
                contNeg++;
            }
        }

        System.out.println("Quantidade números negativos: " + contNeg);
        System.out.println("Quantidade números positivos: " + contPos);

    }
}
