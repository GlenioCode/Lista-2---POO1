/*7. Peça ao usuário um número de 1 a 7 e exiba
o dia da semana correspondente usando switch-case.*/
import java.util.Scanner;
public class Questao07{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um valor de 1 a 7");
		int valor = scanner.nextInt();
		
		switch (valor){
			case 1:
				System.out.print("Segunda-Feira");
				break;
			case 2:
				System.out.println("Terça-Feira");
				break;
			case 3:
				System.out.println("Quarta-Feira");
				break;
			case 4:
				System.out.println("Quinta-Feira");
				break;
			case 5:
				System.out.println("Sexta-Feira");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
				
				
		}
		
		
	}
}