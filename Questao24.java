/*24. Elabore um programa que gere um número aleatório entre 0 e 9 e leia um
número do usuário. Se o número digitado for igual ao número gerado,
o programa imprime “Acertou”. Caso contrário, ele imprime 
“Errou. Tente outra vez.” 

/*import java.util.Random;

public class ExemploRandom {
    public static void main(String[] args) {
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100); // número entre 0 e 99
        System.out.println("Número aleatório: " + numeroAleatorio);
    }
}*/ //COMO GERAR NUMERO ALEATORIO

import java.util.Random;
import java.util.Scanner;
public class Questao24{
	public static void main(String[]args){
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número (0 a 9)");
		int numero = scanner.nextInt();
		
		int numeroAleatorio = random.nextInt(9);
		
		if (numero == numeroAleatorio){
			System.out.println("Você Acertou!!");
			System.out.println("O número é: " +numeroAleatorio);
		} else {
			System.out.println("Você Errou :(");
			System.out.println("O número certo é : " +numeroAleatorio);
		}
		
	}
}