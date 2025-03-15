/*Peça ao usuário um número e utilize o operador ternário
 para verificar se ele é par ou ímpar.*/
 import java.util.Scanner; //  Importando a classe Scanner
 class Questao02{
 public static void main (String[]args){
	 
	 // Criando um objeto Scanner para Ler a entrada do usuário
	 Scanner scanner = new Scanner(System.in);
	 
	 //Perguntando o número ao usuário
	 System.out.print("Digite um número para saber se ele é impar ou par: ");
	 int numero = scanner.nextInt();
	 
	 // Operador ternário para verificar se é par ou ímpar
	 String resultado = (numero % 2== 0) ? "par" : "ímpar";
	 
	 System.out.println("O número " + numero + " é " + resultado + " . "); 
	}
 }