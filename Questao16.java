/*16. Elabore um programa que classifica um nadador de acordo com sua idade em uma
das categorias 
abaixo: 
● Infantil A: 5 a 7 anos 
● Infantil B: 8 a 10 anos 
● Juvenil A: 11 a 13 anos 
● Juvenil B: 14 a 17 anos 
● Adulto: a partir de 18 anos*/

import java.util.Scanner;
public class Questao16{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		int idade = scanner.nextInt();
		
		if (idade>=5 && idade<=7){
			System.out.println("Categoria Infantil A");
		}else if (idade >=8 && idade <=10){
			System.out.println("Categoria Infantil B");
		} else if (idade >=11 && idade <=13){
			System.out.println("Categoria Juvenil A");
		} else if (idade >= 14 && idade <=17){
			System.out.println("Categoria Juvenil B");
		} else {
			System.out.println("Categoria Adulto");
		}
	}
}