/*Peça ao usuário um número de 1 a 7 e exiba o dia da
semana correspondente usando switch-case.*/

import java.util.Scanner; // Importando a classe Scanner
class Questao07{
	public static void main (String[]args){
	
	// Criando um objeto Scanner
	Scanner scanner = new Scanner(System.in);
	
	//Pedundo para o usuário digitar um número de 1 a 7
	System.out.print("Digite um número de 1 a 7: ");
	int numero = scanner.nextInt();
	
	String dia;
	
	switch (numero){
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Digite um numero de 1 a 7";
			
			
	}
		System.out.println(dia);
	}
}