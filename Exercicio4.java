package lacosDecicao;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer e 
 * exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do 
 * mesmo; se for ímpar exiba o número elevado ao quadrado. 
 */
public class Exercicio4 {
	public static void main(String args[] ){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		double numero = sc.nextDouble();
		if (numero%2==0) {
			System.out.println("O valor digita é par e a sua raiz quadrada é:"+Math.sqrt(numero));
		}
		else {
			System.out.println("O valor digitado é impar e eleavado ao quadrado "
								+ "é igual a: "+Math.pow(numero, 2));
		}
	}
}
