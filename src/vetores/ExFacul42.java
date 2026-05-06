package vetores;

public class ExFacul42 {
    public static void main (String[] args)
    {
        int num[] = new int[6];
        int soma = 0;

        for(int cont=0;cont<6;cont++)
        {
            num[cont] = Entrada.leiaInt("Digite o "+(cont+1)+"º número: ");
        }



        int num1[] = new int[6];
        int soma1 = 0;

        for(int cont=0;cont<6;cont++)
        {
            num1[cont] = Entrada.leiaInt("Digite o "+(cont+1)+"º número: ");
        }



        int vetor3[] = new int[6];

        for(int cont=0;cont<6;cont++)
        {
            vetor3[cont] = num[cont] + num1[cont];
        }

        for(int cont=0;cont<6;cont++)
        {
            System.out.println(vetor3[cont]);
        }


    }
}
