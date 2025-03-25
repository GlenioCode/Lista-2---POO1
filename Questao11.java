/*Crie um sistema que peça uma senha ao usuário 
("1234" como senha correta). Se a senha estiver 
errada, exiba "Acesso negado", senão, exiba "Acesso permitido".*/

import java.util.Scanner; // Importando a classe Scanner
public class Questao11{
	public static void main (String[]args){
		
		//Criando um objeto Scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		
		//Perguntando a senha ao usuário
		System.out.print("Digite sua senha: ");
		int senha = scanner.nextInt();
		
		if (senha == 1234){
			System.out.println("Acesso Permitido.");
		} else {
			System.out.println("Acesso Negado.");
		}
	}
}