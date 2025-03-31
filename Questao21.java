/*21. Elabore um programa que peça 
uma nota (0 a 10) ao usuário e exiba uma mensagem de erro caso o 
valor esteja fora desse intervalo.*/

import java.util.Scanner;
public class Questao21{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma nota entre 0 e 10: ");
		int nota = scanner.nextInt();
		
		switch (nota){
			case 0: case 1: case 2: case 3: case 4:
			case 5: case 6: case 7: case 8: case 9: case 10:
			System.out.println("Nota válida: " + nota);
			break;
		default:
			System.out.println("Nota inválida - digite uma nota de 0 a 10");
		}
	}
}