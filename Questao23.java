/*Desenvolva um programa que peça um número e verifique: 
● Se é múltiplo de 4 → Exiba "Múltiplo de 4". 
● Se é múltiplo de 6 → Exiba "Múltiplo de 6". 
● Se for múltiplo de ambos → Exiba "Múltiplo de 4 e 6". 
● Se não for múltiplo de nenhum → Exiba "Não é múltiplo de 4 nem de 6".*/

import java.util.Scanner; // Importando a classe Scanner
public class Questao23{
	public static void main(String[]args){
		
		//Criando um objeto Scanner para ler a entrada do usuário
		Scanner scanner = new Scanner (System.in);
		
		// Perguntando um número a usuário
		System.out.println("VAMOS DESCOBRIR SE UM NÚMERO É MÚLTIPLO DE 4 OU 6 ! ! !");
		
		System.out.print("Digite um número:" );
		int numero = scanner.nextInt();
		
		
	 if (numero % 4 == 0 && numero % 6 == 0) {
            System.out.println("Múltiplo de 4 e 6");
        } else if (numero % 4 == 0) {
            System.out.println(numero + " é múltiplo de 4.");
        } else if (numero % 6 == 0) {
            System.out.println("Múltiplo de 6");
        } else {
            System.out.println("Não é múltiplo de 4 nem de 6");
        }
	
	}
}