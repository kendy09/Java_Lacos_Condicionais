package lacosDecicao;

import java.util.Scanner;

//Faça um programa que entre com três números e coloque em ordem crescente.

public class Exercicio2 {
	
	public static void main(String[]args) {
		
		int intermediario = 0,maior = 0 ,menor = 0; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 numeros");
		System.out.println("Numero #1");
		
		int numero1 = sc.nextInt();
		maior = numero1;
		
		
		System.out.println("Numero #2");
		int numero2 = sc.nextInt();
		if (numero2>maior) {
			maior = numero2;
			intermediario = numero1 ; 
		}
		else {
			intermediario = numero2;
		}
	
		System.out.println("Numero #3");
		int numero3 = sc.nextInt();
		if (numero3>maior) {
			menor = intermediario;
			intermediario = maior;
			maior = numero3;
		}
		else if (numero3<maior && numero3>=intermediario) {
			menor = intermediario;
			intermediario = numero3;
		}
		else {
			numero3 = menor;
		}
		System.out.print("A ordem crescente dos numeros são "+maior+" - "+intermediario+" - " + menor);
		sc.close();
	}
}
