/*17. Desenvolva um programa que peça o salário bruto de um funcionário
 e calcule o salário líquido após o desconto do INSS: 
● Salário ≤ R$ 1.320,00 → Desconto de 7.5% 
● Entre R$ 1.320,01 e R$ 2.571,29 → Desconto de 9% 
● Entre R$ 2.571,30 e R$ 3.856,94 → Desconto de 12% 
● Acima de R$ 3.856,95 → Desconto de 14%*/
import java.util.Scanner;
public class Questao17{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe Seu Salário Bruto: ");
		double salarioBruto = scanner.nextDouble();
		
		//Descontos
		double primeiroDesconto = salarioBruto -( salarioBruto * 7.5 /100);
		double segundoDesconto = salarioBruto - ( salarioBruto * 9 /100);
		double terceiroDesconto = salarioBruto - (salarioBruto * 12 / 100);
		double quartoDesconto = salarioBruto - ( salarioBruto * 14 /100);
		if (salarioBruto <= 1320.00){
			System.out.println("Seu Salário Líquido é de: " + primeiroDesconto);
		}else if (salarioBruto >= 1320.01 && salarioBruto <=2571.29){
			System.out.println("Seu Salário Líquido é de: " + segundoDesconto);
		}else if (salarioBruto>=2571.30 && salarioBruto<=3856.94){
			System.out.println("Seu Salário Líquido é de: " + terceiroDesconto);
		}else {
				System.out.println("Seu Salário Líquido é de: " + quartoDesconto);
 		}
		
		
	}
}