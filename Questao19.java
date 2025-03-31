/*Desenvolva um programa que permita ao usuário
 escolher entre duas possibilidades para conversão 
de temperaturas. O algoritmo deve mostrar o
 menu abaixo, ler a opção de conversão e realizar o 
respectivo cálculo de conversão. Observe as informações abaixo. 
Menu de Conversão de Temperaturas 
1. Conversão Celsius/Fahrenheit: F = 9/5 * C+32. 
2. Conversão Fahrenheit/Celsius: C = 5/9 * (F-32).*/

import java.util.Scanner;
public class Questao19{
	public static void main (String[]args){
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Menu de Conversão de Temperaturas");
		System.out.println("1. Conversão Celsius/Fahrenheit");
		System.out.println("2. Conversão Fahrenheit/Celsius");
		System.out.println("Digite a opção desejada: ");
		int n1 = scanner.nextInt();
		
		
		
		
		if (n1 == 1){
			// Formula
			// (C × 9/5) + 32 = °F
			System.out.println("CONVERSÃO CELSIUS / FAHRENHEIT");
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = scanner.nextDouble();
			double f = (celsius * 9/5) + 32;
			System.out.println("A temperatura é: " + f +"°F");
		} else if (n1 == 2){
			// Formula 
			// (°F − 32) × 5/9 = °C
			
			System.out.println("CONVERSÃO FAHRENHEIT / CELSIUS");
			System.out.print("Digite a temperatura em Fahrenheit: ");
			double fah = scanner.nextDouble();
			double c = (fah - 32) * 5/9;
			
			System.out.println("A temperatura é: " + c+"°C");
		}
		
		
	}
}