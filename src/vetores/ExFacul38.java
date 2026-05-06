package vetores;

public class ExFacul38 {
    public static void main (String[] args)
    {
        int num[] = new int[10];

        // Leitura dos valores
        for(int cont = 0; cont < 10; cont++)
        {
            num[cont] = Entrada.leiaInt("Digite o " + (cont+1) + "º número: ");
        }

        // Impressão da posição e do valor
        for(int cont = 0; cont < 10; cont++)
        {
            System.out.println(num[cont]);
        }
    }
}
