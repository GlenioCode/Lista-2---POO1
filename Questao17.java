/*Escreva um programa que mostre o menu de opções a seguir, receba a opção do usuário e os dados 
necessários para executar cada operação. 
Menu: 
1. Somar dois números 
2. Multiplicação de dois números 
3. Raiz quadrada de um número 
4. Quadrado de um número 
Digite a opção desejada:*/

import java.util.Scanner;
public class Questao17{
	public static void main (String[]args){
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Menu:");
		System.out.println("1. Somar dois números");
		System.out.println("2. Multiplicação de dois números");
		System.out.println("3. Raiz quadrada de um número");
		System.out.println("4. Quadrado de um número");
		int numero = scanner.nextInt();
		
		if (numero == 1){
			System.out.print("Digite o primeiro número: " );
			int n1 = scanner.nextInt();
			System.out.print("Digite o segundo número: ");
			int n2 = scanner.nextInt();
			
			int soma = n1 + n2;
			
			System.out.println("A Soma dos Dois Números é: " + soma);
		}else if (numero == 2){
			System.out.print("Digite o primeiro número: " );
			int n1 = scanner.nextInt();
			System.out.print("Digite o segundo número: ");
			int n2 = scanner.nextInt();
			
			int soma = n1 * n2;
			
			System.out.println("A Multiplicação dos Dois Números é: " + soma);
		} else if (numero == 3){
			 System.out.print("Digite um número: ");
			 int n1 = scanner.nextInt();
			 System.out.println("Resultado da raiz quadrada: " + Math.sqrt(n1));
		} else if (numero == 4){
			System.out.print("Digite um número: ");
			int n1 = scanner.nextInt();
			System.out.println("Resultado do quadrado: " + (n1 * n1));
		}
		
	}
}