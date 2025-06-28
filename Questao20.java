/*20. Peça ao usuário a quantidade de horas estacionadas e calcule o valor a ser pago: 
● Até 2 horas → R$ 5,00 por hora 
● De 3 a 5 horas → R$ 4,00 por hora 
● Mais de 5 horas → R$ 3,00 por hora*/
import java.util.Scanner;
public class Questao20{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira a Quantidade de Horas Estacionadas: ");
		double horas = scanner.nextDouble();
		
		//até 2 horas > 5R$ por hora
		double valorUmaHora = 2.50;
		double valorPagar = horas * valorUmaHora;
		double valorDuasHoras = 4;
		double valorPagar1 = horas * valorDuasHoras;	
		double valorTresHoras = 3;
		double valorPagar2 = horas * valorTresHoras;
		if(horas<=2){
			System.out.println("Valor a ser pago " + valorPagar );
		}
		// de 3 a 5 horas > 4R$ por hora
		
		if(horas>=3 && horas <=5){
			System.out.println("Valor a ser pago " + valorPagar1 );
		// mais de 5 horas > 3R$ por hora
		if(horas>=6){
			System.out.println("Valor a ser pago " + valorPagar2 );
		}
	}
}
}