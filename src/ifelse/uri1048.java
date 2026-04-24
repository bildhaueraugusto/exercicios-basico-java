package ifelse;

import java.util.Scanner;

public class uri1048 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario, reajuste, reajusteGanho, novoSalario;

        salario = sc.nextDouble();

        if (salario >= 0 && salario <= 400) {
            reajuste = 0.15;
            reajusteGanho = salario * reajuste;
            novoSalario = salario + reajusteGanho;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
            System.out.println("Em percentual 15 %");
        }
        else if (salario >= 400.01 && salario <= 800) {
            reajuste = 0.12;
            reajusteGanho = salario * reajuste;
            novoSalario = salario + reajusteGanho;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
            System.out.println("Em percentual: 12 %");
        }
        else if (salario >= 800.01 && salario <= 1200) {
            reajuste = 0.10;
            reajusteGanho = salario * reajuste;
            novoSalario = salario + reajusteGanho;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
            System.out.println("Em percentual: 10 %");
        }
        else if (salario >= 1200.01 && salario <= 2000) {
            reajuste = 0.07;
            reajusteGanho = salario * reajuste;
            novoSalario = salario + reajusteGanho;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
            System.out.println("Em percentual: 7 %");
        }
        else {
            reajuste = 0.04;
            reajusteGanho = salario * reajuste;
            novoSalario = salario + reajusteGanho;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
            System.out.println("Em percentual: 4 %");
        }
    }
}
