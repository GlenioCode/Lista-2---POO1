/* Elabore um programa que peça ao usuário o 
salário atual e calcule o novo salário com base na 
seguinte regra: 
● Se o salário for até R$ 1.500,00, aumento de 15%. 
● Se estiver entre R$ 1.500,01 e R$ 3.000,00, aumento de 10%. 
● Acima de R$ 3.000,00, aumento de 5%.*/

import java.util.Scanner; // Importando a classe Scanner
public class Questao14{
	public static void main (String[]args){
		
		// Criando um objeto Scanner para ler a entrada do usuário
		Scanner scanner = new Scanner (System.in);
		
		// Perguntando o salário do usuário
		System.out.println("VAMOS CALCULAR SEU NOVO SALÁRIO ! ! !");
		
		System.out.print("Digite seu salário atual: ");
		double salario = scanner.nextDouble();
		
		if(salario <= 1500){
			double aumento = salario * 0.15; 
			double salario1 = salario + aumento;
			System.out.println(salario1);
		} else if ( salario >=1500.1 && salario <= 3000){
			double aumento2 = salario * 0.10;
			double salario2 = salario + aumento2;
				System.out.println("Seu novo salario é: " + salario2);
	
		} else if (salario > 3000){
			double aumento3 = salario * 0.05;
			double salario3 = salario + aumento3;
				System.out.println("Seu novo salário é: " + salario3);
		}
		
	
}
}