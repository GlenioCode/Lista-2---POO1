/* Escreva um programa que leia um número inteiro e exiba 
se ele é positivo,negativo ou zero*/ 
import java.util.Scanner; // Importando a classe Scanner
class Questao01{
	public static void main (String[] args){
		
		//Cruabdi um objeto Scanner para er a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		
		// Perguntando o número ao usuário
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
		
		if (numero > 0){
			System.out.println("O número é positivo");
		}
		
		if (numero < 0){
			System.out.println("O número é negativo");
		}
		
		if (numero == 0 ) {
			System.out.println("O número é igual a zero");
		}
		
		System.out.println("FIM DO PROGRAMA!");
	}
}