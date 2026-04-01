package scanner;

import java.util.Scanner;

public class salarioHora {
    public static void main (String[] args){

        int numFun, hora;
        double valorHora, salario;

        Scanner sc = new Scanner(System.in);

        numFun = sc.nextInt();
        hora = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = hora * valorHora;

        System.out.println("NUMBER = " + numFun);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        sc.close();
    }
}