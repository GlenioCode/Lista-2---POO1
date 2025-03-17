/** Solicite dois números ao usuário e determine qual é o maior. **/
import java.util.Scanner; // Imporatando a classe Scanner
class Questao03{
	public static void main (String[]args){
		// Criando um objeto Scanner para Ler a entrada do Usuário
		Scanner scanner = new Scanner (System.in);
		
		// Perguntando o primeiro número ao usuário
		System.out.print("Digite o pirmeiro número: ");
		int numero1 = scanner.nextInt();
		
		// Perguntando o segundo número ao usuário
		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();
		
		// Verificando qual número é o maior
		
		if (numero1 > numero2) {
			System.out.println( numero1 + " é maior do que " + numero2);
		}
		
		
		
		if (numero2 > numero1){
			System.out.println( numero2 + " é mais do que " + numero1);
		}
		
	}
}