/* Peça ao usuário seu peso e altura e calcule o IMC, classificando-o conforme a tabela: 
● Abaixo do peso: IMC < 18.5 
● Peso normal: 18.5 ≤ IMC < 25 
● Sobrepeso: 25 ≤ IMC < 30 
● Obesidade: IMC ≥ 30 */
import java.util.Scanner;
public class Questao09{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cálcule seu IMC!!!");
		
		System.out.println("Digite seu peso: ");
		double peso = scanner.nextDouble();
		
		System.out.println("Digite sua altura: ");
		double altura = scanner.nextDouble();
		
		//Cálculo do IMC
		double imc = peso / (altura * altura);
		
		/*● Peso normal: 18.5 ≤ IMC < 25 
		● Sobrepeso: 25 ≤ IMC < 30 
		● Obesidade: IMC ≥ 30*/
		System.out.println("Seu IMC é: "+ imc);
		if (imc <=18.5 && imc <25){
			System.out.println("Peso normal.");
		} else if (imc <=25 && imc <30){
			System.out.println("Sobrepeso.");
		} else {
			System.out.println("Obesidade");
		}
	}
}
