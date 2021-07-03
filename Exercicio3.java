package lacosDecicao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a sua idade");
		int idade = sc.nextInt();
		
		if (idade>=18) {
			System.out.println("Você é adulto");
		}
		else if (idade>=15 &&idade<=17) {
			System.out.println("Você é juvenil");
		}
		else if (idade>=10 && idade<=14) {
			System.out.println("Voce é uma criança");
		}
	}
}
