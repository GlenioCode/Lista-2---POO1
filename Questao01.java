/*1. Escreva um programa que leia um número inteiro e exiba
se ele é positivo, negativo ou zero.*/
import java.util.Scanner;
public class Questao01{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("VAMOS DESCOBRIR SE UM NÚMERO É POSITIVO, NEGATIVO OU ZERO!!!");
		
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		
		if (numero>0){
			System.out.println(numero + " é positivo");
		} else if (numero<0){
			System.out.println(numero + " é negativo");
		} else {
			System.out.println("O numero é igual a " + numero);
		}
		
		
	}
	
}