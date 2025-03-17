/* Leia um ano e determine se ele é bissexto ou não. Um ano é 
bissexto se for divisível por 4 e não  divisível por
100 ou divisível por 400). */

import java.util.Scanner; // Imporatando a classe Scanner
class Questao05{
	public static void main (String[]args){
		
		//Criando um objeto Scanner para Ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("VAMOS DESCOBRIR SE UM ANO É BISSEXTO OU NÃO ! ! ! ");
		
		// Perguntando o ano ao usuário
		System.out.print("Digite o ano: " );
		int ano = scanner.nextInt();
		
		// Descobrindo se o ano é bissexto ou não
		
		// Se é ele é divido por 4 e não divido por 100 e 400
		
		
		
		if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

		
		
		
	}
}