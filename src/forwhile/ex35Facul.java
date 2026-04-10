package forwhile;

import java.util.Scanner;

public class ex35Facul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        String nome = scanner.nextLine();

        nome = nome.toLowerCase(); // tudo minúsculo
        String resultado = "";

        for (int i = 0; i < nome.length(); i++) {
            char letra = nome.charAt(i);

            // Se for a primeira letra OU se a anterior for espaço
            if (i == 0 || nome.charAt(i - 1) == ' ') {
                resultado += Character.toUpperCase(letra);
            } else {
                resultado += letra;
            }
        }

        System.out.println("Nome formatado: " + resultado);

        scanner.close();
    }
}
