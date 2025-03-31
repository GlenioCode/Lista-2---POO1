/* Elabore um programa que gere um número aleatório entre 0 e 9
e leia um número do usuário. Se o 
número digitado for igual ao número gerado,
o programa imprime “Acertou”. Caso contrário, ele imprime 
“Errou. Tente outra vez.” */
import java.util.Scanner;
import java.util.Random;

public class Questao24{
	public static void main (String[]args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int numeroAleatorio = random.nextInt(10);
		
		System.out.print("Digite um número entre 0 e 9: ");
		int numero = scanner.nextInt();
		
		if (numero == numeroAleatorio){
			System.out.print("Acertou mizeravi");
		} else {
			System.out.println("Errou, tente de novo");
		}  System.out.println("O número gerado foi: " + numeroAleatorio);

	}
}