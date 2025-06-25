/*10. Peça ao usuário um número de 0 a 5 e exiba seu nome por extenso
(zero, um, dois, três, quatro, cinco) 
usando switch-case. */

import java.util.Scanner;
public class Questao10{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número de 0 a 5");
		int numero = scanner.nextInt();
		
		switch (numero){
			case 0:
			System.out.println("zero");
			break;
			case 1:
			System.out.println("um");
			break;
			case 2:
			System.out.println("dois");
			break;
			case 3:
			System.out.println("três");
			break;
			case 4:
			System.out.println("quatro");
			break;
			case 5:
			System.out.println("cinco");
			break;
			
		}
	}
}