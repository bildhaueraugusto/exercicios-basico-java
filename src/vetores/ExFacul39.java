package vetores;

public class ExFacul39 {
    public static void main (String[] args)
    {
        String nome[] = new String[6];

        // Leitura dos valores
        for(int cont = 0; cont < 6; cont++)
        {
            nome[cont] = Entrada.leiaString("Digite o " + (cont+1) + "º nome: ");
        }

        // Impressão da posição e do valor
        for(int cont = 5; cont >= 0; cont--)
        {
            System.out.println(nome[cont]);
        }
    }
}
