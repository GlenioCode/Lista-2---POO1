/*18. Escreva um programa que mostre o menu de opções a seguir, receba a opção do usuário
e os dadosnecessários para executar cada operação. 
Menu: 
1. Somar dois números 
2. Multiplicação de dois números 
3. Raiz quadrada de um número 
4. Quadrado de um número 
Digite a opção desejada:*/

import java.util.Scanner;
public class Questao18{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Menu\n\n");
		System.out.println("1. Somar dois números\n");
		System.out.println("2. Multiplicação de dois números\n");
		System.out.println("3. Raiz quadrada de um número\n");
		System.out.println("4. Quadrado de um número\n");
		
		System.out.println("Digite a opção");
		int opcao = scanner.nextInt();
		
		if (opcao == 1){
			System.out.println("Digite o primeiro número: ");
			int n1 = scanner.nextInt();
			
			System.out.println("Digite o segundo número: ");
			int n2 = scanner.nextInt();
			
			int soma = n1 + n2;
			
			System.out.println("A Soma dos Dois números é: "+soma);
		}
		if (opcao==2){
		System.out.println("Digite o primeiro número: ");
			int n1 = scanner.nextInt();
			
			System.out.println("Digite o segundo número: ");
			int n2 = scanner.nextInt();
			
			int multiplicacao = n1 * n2;	

			System.out.println("A Multiplicação dos Dois números é: " + multiplicacao );
			}

		if (opcao==3){
			System.out.println("Digite um número: ");
			int numero = scanner.nextInt();
			double raiz = Math.sqrt(numero);
			
			System.out.println("A Raiz Quadrada do Número é: " + raiz);
		}

		if (opcao==4){
			System.out.println("Digite um número: ");
			int numero = scanner.nextInt();
			
			int quadrado = numero * numero;
			
			System.out.println("O Quadrado Do Número é: " + quadrado );
			
			
		}	
	
	
	
	
	
	
	
	
	
	}
}