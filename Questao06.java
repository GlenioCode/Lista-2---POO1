/* Peça ao usuário uma nota (0 a 100) e exiba o conceito
correspondente usando if-else:
● A (90-100) 
● B (80-89) 
● C (70-79) 
● D (60-69) 
● F (abaixo de 60) */

import java.util.Scanner; // Imporatando a classe Scanner
class Questao06{
	public static void main (String[]args){
		
		// Criando um objeto Scanner para Ler a entrada do usuário
		Scanner scanner = new Scanner (System.in);
		
		// Perguntando a nota ao usuário
		System.out.print("Digite a sua nota: ");
		int nota = scanner.nextInt();
		
		if (nota >=90 && nota <=100){
			System.out.println("Conceito A");
		} else if  (nota >=80 && nota <90){
			System.out.println("Conceito B");
		} else if (nota >=70 && nota <80){
			System.out.println("Conceito C");
		} else if (nota >= 60 && nota < 70){
			System.out.println("Conceito D");
		} else if (nota < 60){
			System.out.println("Conceito F");
		}
		
	}
}