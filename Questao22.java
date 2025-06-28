/*22. Crie um programa que peça a velocidade de um carro e classifique: 
● Abaixo de 40 km/h → "Lento" 
● Entre 40 e 60 km/h → "Velocidade permitida" 
● Acima de 60 km/h → "Acima da velocidade permitida"*/
import java.util.Scanner;
public class Questao22 {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a velocidade do carro: ");
		int velocidade = scanner.nextInt();
		
		if (velocidade <= 40){
			System.out.println("Lento");
		} else if (velocidade >=40 && velocidade <=60){
			System.out.println("Velocidade Permitida");
		} else {
			System.out.println("Acima da velocidade permitida");
		}
	}
}