package matrizes;

import java.util.Scanner;

public class ExFacul50 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int TOTAL_CADEIRAS = 20;
        String[] clientes = new String[TOTAL_CADEIRAS];

        int ingressosVendidos = 0;
        double valorIngresso;
        double valorTotal = 0;

        // a) Solicita o valor do ingresso
        System.out.print("Digite o valor do ingresso: R$ ");
        valorIngresso = sc.nextDouble();

        // Loop de vendas
        while (ingressosVendidos < TOTAL_CADEIRAS) {

            System.out.println("\nIngressos disponíveis: "
                    + (TOTAL_CADEIRAS - ingressosVendidos));

            System.out.print("Digite o nome do cliente: ");
            sc.nextLine(); // limpa buffer
            String nome = sc.nextLine();

            System.out.print("Quantos ingressos deseja comprar? ");
            int quantidade = sc.nextInt();

            // Verifica disponibilidade
            if (quantidade > (TOTAL_CADEIRAS - ingressosVendidos)) {
                System.out.println("Quantidade indisponível!");
                continue;
            }

            // b) Valor da venda
            double valorVenda = quantidade * valorIngresso;
            System.out.println("Valor da venda: R$ " + valorVenda);

            // c) Salvar nomes no vetor conforme quantidade de ingressos
            for (int i = 0; i < quantidade; i++) {
                clientes[ingressosVendidos] = nome;
                ingressosVendidos++;
            }

            valorTotal += valorVenda;

            // Pergunta se deseja continuar
            if (ingressosVendidos < TOTAL_CADEIRAS) {
                System.out.print("Deseja realizar outra venda? (S/N): ");
                sc.nextLine(); // limpa buffer
                String opcao = sc.nextLine();

                if (opcao.equalsIgnoreCase("N")) {
                    break;
                }
            }
        }

        // d) Relatório final
        System.out.println("\n===== RELATÓRIO FINAL =====");
        System.out.println("Total de ingressos vendidos: " + ingressosVendidos);
        System.out.println("Valor total arrecadado: R$ " + valorTotal);

        System.out.println("\nClientes:");
        for (int i = 0; i < ingressosVendidos; i++) {
            System.out.println((i + 1) + " - " + clientes[i]);
        }

        sc.close();
    }
}
