/*21. Elabore um programa que peça uma nota (0 a 10) ao usuário e exiba uma mensagem
de erro caso o valor esteja fora desse intervalo.*/
import java.util.Scanner;
public class Questao21{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma nota (0 a 10)");
		int nota = scanner.nextInt();
		
		if (nota>=0 && nota<=10){
			System.out.println("Nota Válida");
		} else{
			System.out.println("ERRO: INSIRA UMA NOTA VÁLIDA");
		}
		
		
	}
}