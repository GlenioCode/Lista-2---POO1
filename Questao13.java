/*13. Peça ao usuário um mês (1 a 12) e exiba a estação do ano correspondente (verão, outono, 
inverno, primavera) usando switch-case.*/ 
import java.util.Scanner;
public class Questao13{
	public static void main (String[]args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número correspondente ao mês (1 a 12)");
		int numero = scanner.nextInt();
		
		switch(numero){
			case 1:
			System.out.println("Verão");
			break;
			
			case 2:
			System.out.println("Verão");
			break;
			
			case 3:
			System.out.println("Outono");
			break;
			
			case 4:
			System.out.println("Outono");
			break;
			
			case 5:
			System.out.println("Outono");
			break;
			
			case 6:
			System.out.println("Inverno");
			break;
			
			case 7:
			System.out.println("Inverno");
			break;
			
			case 8:
			System.out.println("Inverno");
			break;
			
			case 9:
			System.out.println("Primavera");
			break;
			
			case 10:
			System.out.println("Primavera");
			break;
			
			case 11:
			System.out.println("Primavera");
			break;
			
			case 12:
			System.out.println("Verão");
			break;
			
			
		}
		
	}
}