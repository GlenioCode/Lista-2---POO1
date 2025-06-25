/*4. Peça três números e identifique qual é o maior entre eles.*/
import java.util.Scanner;
public class Questao04{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("VAMOS COMPARAR TRÊS NÚMEROS!!!");
		
		System.out.println("Digite O Primeiro Número: ");
		int numero1 = scanner.nextInt();
		
		System.out.println("Digite O Segundo Número: ");
		int numero2 = scanner.nextInt();
		
		System.out.println("Digite O Terceiro Número: ");
		int numero3 = scanner.nextInt();
		
		if (numero1>=numero2 && numero1>=numero3){
			System.out.println("O maior número é: " + numero1);
			
		} else if(numero2>=numero1 && numero2>=numero3){
			System.out.println("O maior número é: " + numero2);
		}else{
			System.out.println("O número é: " + numero3);
		}  
	}
	
}