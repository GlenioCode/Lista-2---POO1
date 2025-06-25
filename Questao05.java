/*5. Leia um ano e determine se ele é bissexto ou não.
Um ano é bissexto se for divisível por 4 e (não 
divisível por 100 ou divisível por 400).*/ 
import java.util.Scanner;
public class Questao05{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("VAMOS DESCOBRIR SE UM ANO É BISSEXTO!!!");
		
		System.out.println("Digite O Ano: ");
		int ano = scanner.nextInt();
		
		if ((ano % 4 == 0) && ( (ano % 100 != 0) || (ano % 400 == 0) )) {
            System.out.println(ano + " é bissexto.");
        } else {
            System.out.println(ano + " não é bissexto.");
        }
		
	}
}