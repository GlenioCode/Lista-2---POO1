 /*Elabore um programa que leia três notas de um aluno e 
calcule a média ponderada dessas notas. Os 
pesos são 2, 3 e 4, respectivamente.
 Se a média for menor ou igual a 4, o algoritmo deve imprimir 
“Reprovado”. Se a média for maior ou igual a 7, o algoritmo deve
 imprimir “Aprovado”. E se a média for 
maior que 4 e menor que 7, o algoritmo imprime “Recuperação”. */

import java.util.Scanner; // Importando a classe Scanner
public class Questao12{
	public static void main(String[]args){
		
		//Criando um objeto Scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos calular a média ponderada das suas notas ! ! !");
		
		// Como calular a Média Ponderada
		//MP = x1 * p1 + x2 * p2 / p1+p2
		
		//Perguntando as notas do usuário
		System.out.print("Digite a 1° nota: ");
		int n1 = scanner.nextInt();
		
		System.out.print("Digite a 2° nota: ");
		int n2 = scanner.nextInt();
		
		System.out.print("Digite a 3° nota: ");
		int n3 = scanner.nextInt();
		
		// Definindo os pesos
		int p1 = 2;
		int p2 = 3;
		int p3 = 4;
		
		// Calculando a média ponderada
		
		int mp = (n1*p1 + n2*p2 + n3*p3) / (p1+p2+p3);
		
		
		/*Se a média for menor ou igual a 4, o algoritmo deve imprimir 
“Reprovado”. Se a média for maior ou igual a 7, o algoritmo deve
 imprimir “Aprovado”. E se a média for 
maior que 4 e menor que 7, o algoritmo imprime “Recuperação”. **/
		
		if( mp <= 4){
			System.out.println("Reprovado");
		} else if (mp >= 7){
			System.out.println("Aprovado");
		} else if (mp > 4 && mp <7){
			System.out.println("Recuperação");
		}
		
	}
}