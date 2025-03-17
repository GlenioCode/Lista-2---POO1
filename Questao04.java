/* Peça três números e identifique qual é o maior entre eles. */ 
import java.util.Scanner; // Importando a classe Scanner
class Questao04{
	public static void main (String[]args){
		
		// Criando um objeto scanner para Ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		
		// Perguntando o primeiro número ao usuário
		System.out.print("Digite o primeiro número: ");
		int numero1 = scanner.nextInt();
		
		// Perguntando o segundo número ao usuário
		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();
		
		// Perguntando o terceiro número ao usuário
		System.out.print("Digite o terceiro número: ");
		int numero3 = scanner.nextInt();
		
		// Verificando qual é o maior número
		
		if(numero1 > numero2 && numero1 > numero3){
			System.out.println(numero1 + " é maior do que " + numero2 + " e " + numero3 );
		}
		
		if(numero2 > numero1 && numero2 > numero3){
			System.out.println(numero2 + " é maior do que " + numero1 + " e " + numero3 );
			
		}
		
		if(numero3 > numero1 && numero3 > numero2){
			System.out.println(numero3 + " é maior do que " + numero1 + " e " + numero2);
		}
		
	}
}