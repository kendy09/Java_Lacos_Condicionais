package lacosDecicao;

import java.util.Scanner;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e 
 * exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do 
 * mesmo; se for �mpar exiba o n�mero elevado ao quadrado. 
 */
public class Exercicio4 {
	public static void main(String args[] ){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		double numero = sc.nextDouble();
		if (numero%2==0) {
			System.out.println("O valor digita � par e a sua raiz quadrada �:"+Math.sqrt(numero));
		}
		else {
			System.out.println("O valor digitado � impar e eleavado ao quadrado "
								+ "� igual a: "+Math.pow(numero, 2));
		}
	}
}
