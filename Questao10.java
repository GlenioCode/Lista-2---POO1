/*Peça ao usuário um número de 0 a 5 e exiba seu nome
por extenso (zero, um, dois, três, quatro, cinco) 
usando switch-case.*/

import java.util.Scanner; // Importando a classe Scanner
public class Questao10{
public static void main (String[]args){
	
	// Criando um objeto Scanner para Ler a entrada do usuário
	Scanner scanner = new Scanner (System.in);
	
	//Pedindo para o usuário digitar um numero de 0 a 5
	System.out.print("Digite um número de 0 a 5: ");
	int numero = scanner.nextInt();
	
	switch (numero){
		case 0:
		System.out.println("Zero");
		break;
		case 1:
		System.out.println("Um");
		break;
		case 2:
		System.out.println("Dois");
		break;
		case 3:
		System.out.println("Três");
		break;
		case 4:
		System.out.println("Quatro");
		break;
		case 5:
		System.out.println("Cinco");
		break;
		
		default:
			System.out.println("Número inválido!!");
	}
	
	}
}	