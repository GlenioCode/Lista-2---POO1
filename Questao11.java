/*11. Crie um sistema que peça uma senha ao usuário ("1234" como senha correta).
 Se a senha estiver errada, exiba "Acesso negado", senão, exiba "Acesso permitido".*/
 import java.util.Scanner;
 public class Questao11{
	 public static void main(String[]args){
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("BEM VINDO AO SISTEMA DE GLENIO!!!");
		 System.out.println("==================================");
		 System.out.println("Login :");  
		 String nome = scanner.nextLine();
		 
		 System.out.println("Senha :");
		 int senha = scanner.nextInt();
		 
		 if (senha == 1234){
			 System.out.println("Bem vindo, "+nome+"!");
			 System.out.println("Acesso permitido.");
			 
		 } else {
			 System.out.println("Acesso negado.");
		 }
		 
		
		 
	 }
 }
 