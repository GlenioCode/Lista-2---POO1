/*Solicite a idade do usuário e informe se ele pode votar ou não: 
● Menor que 16 → Não pode votar 
● Entre 16 e 17 ou acima de 70 → Voto opcional 
● Entre 18 e 69 → Voto obrigatório*/

import java.util.Scanner; // Importando a classe Scanner
class Questao08{
	public static void main (String[]args){
		System.out.println("VAMOS DESCOBRIR SE VOCÊ PODE VOTAR ! ! !");
		
		// Criando um objeto Scanner para Ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		
		// Perguntando a idade do usuário
		System.out.print("Digite sua idade:" );
		int idade = scanner.nextInt();
		
		// Descobrindo se o usuário pode votar
		
		if (idade < 16){
			System.out.println("Não pode votar");
		} else if (idade >= 16 && idade <=17){
			System.out.println("Voto Opcional");
		} if (idade >= 70){
			System.out.println("Voto Opcional");
		} else if (idade >= 18 && idade <=69){
			System.out.println("Voto Obrigatório ! !");
		}
		
	}
}