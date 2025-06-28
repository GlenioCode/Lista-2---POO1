/*19. Desenvolva um programa que permita ao usuário escolher entre duas
possibilidades para conversão de temperaturas. O algoritmo deve mostrar o menu abaixo,
 ler a opção de conversão e realizar o 
respectivo cálculo de conversão. Observe as informações abaixo. 
Menu de Conversão de Temperaturas 
1. Conversão Celsius/Fahrenheit: F = 9/5 * C+32. 
2. Conversão Fahrenheit/Celsius: C = 5/9 * (F-32). 
Digite a opção desejada:*/
import java.util.Scanner;
public class Questao19{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Menu de Conversão de Temperaturas\n");
		System.out.println("1. Conversão Celsius/Fahrenheit: \n");
		System.out.println("2. Conversão Fahrenheit/Celsius: \n");
		
		System.out.println("Digite uma opção: ");
		int opcao = scanner.nextInt();
		
		if (opcao == 1){
			System.out.println("Digite a Temperatura em Graus Celsius: ");
			double temperaturaCelsius = scanner.nextDouble();
			//F = 9/5 * C+32.
			double f = (9/5) * (temperaturaCelsius+32);
			System.out.println("A Temperatura em Fahrenheit é: "+ f);
		}
		if (opcao == 2){
		System.out.println("Digite a Temperatura em Graus Fahrenheit: ");
		double temperaturaFahrenheit = scanner.nextDouble();
		// C = 5/9 * (F-32)
		double c = (5/9) * (temperaturaFahrenheit-32);
			System.out.println("A Temperatura em Celsius é: "+ c);
		
		
		
		
	}	
	
	}
}