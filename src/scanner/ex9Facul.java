package scanner;

import java.util.Scanner;

public class ex9Facul {
	public static void main (String[] args){
		
		int num1, num2, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("A soma dos números é: " + soma);
		
		sc.close();
	}
}
