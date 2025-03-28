/*Desenvolva um programa que peça o salário bruto de
um funcionário e calcule o salário líquido após 
o desconto do INSS: 
● Salário ≤ R$ 1.320,00 → Desconto de 7.5% 
● Entre R$ 1.320,01 e R$ 2.571,29 → Desconto de 9% 
● Entre R$ 2.571,30 e R$ 3.856,94 → Desconto de 12% 
● Acima de R$ 3.856,95 → Desconto de 14% */

import java.util.Scanner;
public class Questao16{
	public static void main (String[]args){
		Scanner scanner = new Scanner (System.in);
		System.out.println("VAMOS CALCULAR SEU SALÁRIO LÍQUIDO! ! !");
		
		System.out.print("Digite seu salário bruto: ");
		double salario = scanner.nextDouble();
		
		if (salario <= 1320){
			double desconto1 = salario * 0.075;
			double salario1 = salario - desconto1 ;
			System.out.println("Seu salário líquido é de: " + salario1 );
		} else if(salario >= 1321 && salario <= 2572){
			double desconto2 = salario * 0.09;
			double salario2 = salario - desconto2;
			System.out.println("Seu salário líquido é de: " + salario2);
			
		} else if (salario > 3857){
			double desconto3 = salario * 0.12;
			double salario3 = salario - desconto3;
			System.out.println("Seu salário líquido é de: " + salario3);
		} 
		
	}
}