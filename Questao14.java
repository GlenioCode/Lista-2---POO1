/*14. Elabore um programa que peça ao usuário o salário atual e calcule o novo salário com
base na seguinte regra: 
● Se o salário for até R$ 1.500,00, aumento de 15%. 
● Se estiver entre R$ 1.500,01 e R$ 3.000,00, aumento de 10%. 
● Acima de R$ 3.000,00, aumento de 5%.*/
import java.util.Scanner;
public class Questao14{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe Seu Salário: ");
		double salario = scanner.nextDouble();
		
		//Cálculo do novo salário
		
		
		double primeiraPorcentagem = salario + (salario * 15) /100;
		
		double segundaPorcentagem = salario +(salario * 10) / 100;
		
		double terceiraPorcentagem = salario +(salario * 5) /100;
		
		if (salario <= 1500){
			System.out.println("Seu Novo Salário é de: " + primeiraPorcentagem);
		} else if (salario>=1500.01 && salario <=3000){
			System.out.println("Seu Novo Salário é de: " + segundaPorcentagem);
		} else {
			System.out.println("Seu Novo Salário é de: " + terceiraPorcentagem);
		}
		
		
		
		
		
		
		
	}
}