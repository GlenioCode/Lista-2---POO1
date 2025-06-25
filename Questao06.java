/*6. Peça ao usuário uma nota (0 a 100) e exiba o conceito correspondente usando if-else: 
● A (90-100) 
● B (80-89) 
● C (70-79) 
● D (60-69) 
● F (abaixo de 60)*/
import java.util.Scanner;
public class Questao06{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite Uma Nota: ");
		int nota = scanner.nextInt();
		
		if (nota >=90 && nota<=100){
			System.out.println("CONCEITO A");
		} else if (nota>=80 && nota<90){
			System.out.println("CONCEITO B");
		} else if (nota>=70 && nota<80){
			System.out.println("CONCEITO C");
		} else if (nota>=60 && nota<70){
			System.out.println("CONCEITO D");
		} else {
			System.out.println("CONCEITO F");
		}
		
		
	}
}
