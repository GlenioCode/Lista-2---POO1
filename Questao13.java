import java.util.Scanner; // Importando a classe Scanner
public class Questao13{
	public static void main (String[]args){
		
		//Criando um objeto Scanner para ler a entrada do usário
		Scanner scanner = new Scanner(System.in);
		
		// Perguntando o mês ao usuário
		System.out.print("Digite o número do mês (1 a 12): ");
		int mes = scanner.nextInt();
		
		// Determinando a estação do ano
		switch (mes){
			case 1:
			case 2:
			case 3:
				System.out.println("Verão");
				break;
			case 4:
			case 5:
			case 6:
		
				System.out.println("Outono");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("Inverno");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("Privamera");
				break;
			default:
				System.out.println("Número inválido! Digite um número de 1 a 12");
				break;
		}
	}
}