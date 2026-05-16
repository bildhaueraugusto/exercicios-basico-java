package matrizes;

import java.util.Random;
import java.util.Scanner;

public class Lista11Desafio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Vetor com nomes dos produtos
        String[] produtos = {
                "Arroz", "Feijao", "Macarrao", "Leite", "Cafe",
                "Acucar", "Farinha", "Oleo", "Sabonete", "Shampoo"
        };

        // Vetor de estoque
        int[] estoque = new int[10];

        // Inicializa estoque com valores aleatórios entre 5 e 25
        for (int i = 0; i < estoque.length; i++) {
            estoque[i] = random.nextInt(21) + 5;
        }

        int opcao;

        do {

            System.out.println("\n===== CONTROLE DE ESTOQUE =====");
            System.out.println("1 - Inserir produtos");
            System.out.println("2 - Retirar produtos");
            System.out.println("3 - Relatório de estoque baixo");
            System.out.println("4 - Mostrar estoque completo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    // Inserção
                    System.out.println("\nPRODUTOS:");
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.println(i + " - " + produtos[i] +
                                " (Estoque: " + estoque[i] + ")");
                    }

                    System.out.print("Digite o índice do produto: ");
                    int inserir = sc.nextInt();

                    if (inserir >= 0 && inserir < produtos.length) {

                        System.out.print("Quantidade para adicionar: ");
                        int qtd = sc.nextInt();

                        estoque[inserir] += qtd;

                        System.out.println("Estoque atualizado!");
                    } else {
                        System.out.println("Produto inválido.");
                    }

                    break;

                case 2:

                    // Retirada
                    System.out.println("\nPRODUTOS:");
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.println(i + " - " + produtos[i] +
                                " (Estoque: " + estoque[i] + ")");
                    }

                    System.out.print("Digite o índice do produto: ");
                    int retirar = sc.nextInt();

                    if (retirar >= 0 && retirar < produtos.length) {

                        System.out.print("Quantidade para retirar: ");
                        int qtd = sc.nextInt();

                        if (qtd <= estoque[retirar]) {

                            estoque[retirar] -= qtd;

                            System.out.println("Retirada realizada!");
                        } else {
                            System.out.println("Estoque insuficiente.");
                        }

                    } else {
                        System.out.println("Produto inválido.");
                    }

                    break;

                case 3:

                    // Relatório de estoque baixo
                    System.out.println("\nPRODUTOS COM ESTOQUE INFERIOR A 10:");

                    for (int i = 0; i < produtos.length; i++) {

                        if (estoque[i] < 10) {

                            System.out.println(produtos[i] +
                                    " -> Estoque: " + estoque[i]);
                        }
                    }

                    break;

                case 4:

                    // Mostrar estoque completo
                    System.out.println("\nESTOQUE COMPLETO:");

                    for (int i = 0; i < produtos.length; i++) {

                        System.out.println(produtos[i] +
                                " -> Estoque: " + estoque[i]);
                    }

                    break;

                case 0:

                    System.out.println("Programa encerrado.");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}