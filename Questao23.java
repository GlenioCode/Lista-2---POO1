/*23. Desenvolva um programa que peça um número e verifique: 
● Se é múltiplo de 4 → Exiba "Múltiplo de 4". 
● Se é múltiplo de 6 → Exiba "Múltiplo de 6". 
● Se for múltiplo de ambos → Exiba "Múltiplo de 4 e 6". 
● Se não for múltiplo de nenhum → Exiba "Não é múltiplo de 4 nem de 6".*/
import java.util.Scanner;
public class Questao23{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		
		if( numero % 4 == 0){
			System.out.println("O número é divisível por 4");
		} else{
			System.out.println("O número não é divisível por 4");
		}  if ( numero % 6 == 0){
			System.out.println("O número é divisível por 6");
		} else{
			System.out.println("O número não é divisível por 6");
		}  if (numero % 4 == 0 || numero % 6 == 0){
			System.out.println("O número é divisível por 4 e 6");
		}else if((numero % 6 == 0 || numero % 4 == 0)) {
			System.out.println("O número não é divisível por 4 e 6");
		}
	}
}
