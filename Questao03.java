/*3. Solicite dois números ao usuário e determine qual é o maior.*/
import java.util.Scanner;
public class Questao03{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("VAMOS COMPARAR DOIS NÚMEROS!!!");
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero2= scanner.nextInt();
		
		//Comparando os números
		if (numero1>numero2){
			System.out.println("O "+numero1+ " é maior que " + numero2);
		} else if (numero2<numero1){
			System.out.println("O "+numero2 + " é maior que " + numero1);
			
		} else{
			System.out.println("Os números são iguais");
		}
	
	}
}