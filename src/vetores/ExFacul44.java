package vetores;

public class ExFacul44 {
    public static void main (String[] args)
    {
        int num[] = new int[10];
        int soma = 0;



        for(int cont=0;cont<10;cont++)
        {
            soma += num[cont];
        }

        System.out.print("Soma: " + soma);
    }
}
