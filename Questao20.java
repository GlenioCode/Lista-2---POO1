/*Peça ao usuário a quantidade de horas estacionadas e calcule o
 valor a ser pago: 
● Até 2 horas → R$ 5,00 por hora 
● De 3 a 5 horas → R$ 4,00 por hora 
● Mais de 5 horas → R$ 3,00 por hora */

import java.util.Scanner;
public class Questao20{
	public static void main (String[]args){
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("VALOR A SER PAGO NO ESTACIONAMENTO");
		System.out.print("Quantidade de horas estacionadas: ");
		int horas = scanner.nextInt();
		
		if (horas == 2){
			int h1 = horas * 5 ;
			System.out.println("O valor a ser pago é de: " + h1"R$");
		} else if (horas >=3 && horas <=5){
			int h2 = horas * 4;
			System.out.println("O valor a ser pago é de: " + h2 +"R$");
		} else if (horas > 5){}
		int h3 = horas * 3 ;
		System.out.println("O valor a ser pago é de: " + h3 +"R$");
	}
}