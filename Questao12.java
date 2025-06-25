/*12. Elabore um programa que leia três notas de um aluno e calcule a média ponderada
dessas notas. Os pesos são 2, 3 e 4, respectivamente. Se a média for menor ou igual a 4,
o algoritmo deve imprimir “Reprovado”. Se a média for maior ou igual a 7, o algoritmo
deve imprimir “Aprovado”. E se a média for 
maior que 4 e menor que 7, o algoritmo imprime “Recuperação”.*/
import java.util.Scanner;
public class Questao12{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("CALCULADORA DE MÉDIA");
		System.out.println("======================");
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = scanner.nextDouble();
		System.out.println("Digite a terceira nota: ");
		double nota3 = scanner.nextDouble();
		
		//Pesos
		int peso1 = 2;
		int peso2 = 3;
		int peso3 = 4;
		
		//Calculando a média ponderada
		double media =(nota1 * peso1)+(nota2 * peso2)+(nota3 * peso3);
		double pesos = peso1+peso2+peso3;
		double mediaPonderada = media/pesos;
		
		System.out.println(mediaPonderada);
		
		/*Se a média for menor ou igual a 4,
		o algoritmo deve imprimir “Reprovado”. Se a média for maior ou igual a 7, o algoritmo
		deve imprimir “Aprovado”. E se a média for 
		maior que 4 e menor que 7, o algoritmo imprime “Recuperação”.*/
		
		if (mediaPonderada <= 4){
			System.out.println("Reprovado.");
		} else if (mediaPonderada >=7 ){
			System.out.println("Aprovado.");
		} else if(mediaPonderada>4 && mediaPonderada<7 ){
			System.out.println("Recuperação");
		}
		
		
		
		
	}
}