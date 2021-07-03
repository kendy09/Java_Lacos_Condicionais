package lacosDecicao;

import java.util.Scanner;

//Faça um programa que receba três inteiros e diga qual deles é o maior.
public class Exercicio1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 numeros");
		
		System.out.println("Digite um numero para: A");
		int a = sc.nextInt();
		int maior = a;
		
		System.out.println("Digite um numero para: B");
		int b = sc.nextInt();
		
		if (b>maior) {
			
			maior = b;
		}
		
		System.out.println("Digite um numero para c");
		int c = sc.nextInt();
		if (c>maior) {
			
			maior = c;
		}
		System.out.println("O maior numero digitado foi :"+maior);
		sc.close();
	}
}
