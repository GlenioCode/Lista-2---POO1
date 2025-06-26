/*15. Escreva um programa que ajude os funcionários da bilheteria de um cinema.
Ele recebe o nome e a idade de um usuário. Sabendo que crianças de até dez anos pagam
cinco reais, jovens de onze a vinte 
anos pagam dez reais e pessoas acima de vinte anos pagam quinze reais,
o algoritmo deve escrever 
quanto um usuário vai pagar de acordo com a idade que foi fornecida no início.*/

import java.util.Scanner;
public class Questao15{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o nome do cliente: ");
		String nome = scanner.nextLine();
		
		System.out.println("Informe a idade do cliente: ");
		int idade = scanner.nextInt();
		
		if (idade <= 10){
			System.out.println("Bem vindo, "+nome +" sua entrada custa 5R$");
		} else if (idade >=11 && idade<=20){
			System.out.println("Bem vindo, "+nome +" sua entrada custa 10R$");
		} else {
			System.out.println("Bem vindo, "+nome +" sua entrada custa 15R$");
		}
	}
}