/*2. Peça ao usuário um número e utilize o operador ternário para verificar se ele é
 par ou ímpar.*/ 
// Em Java, o operador ternário é uma forma compacta de escrever uma condição if-else.
// A sintaxe é: condição ? valor_se_verdadeiro : valor_se_falso
 import java.util.Scanner;
 public class Questao02{
	 public static void main(String[]args){
		 Scanner scanner = new Scanner(System.in);
		  System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Usa o operador ternário para verificar se é ímpar
        String resultado = (numero % 2 != 0) ? "ímpar" : "par";

        System.out.println("O número é " + resultado + ".");
	 }
 }