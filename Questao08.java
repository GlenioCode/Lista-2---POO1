/*8. Solicite a idade do usuário e informe se ele pode votar ou não: 
● Menor que 16 → Não pode votar 
● Entre 16 e 17 ou acima de 70 → Voto opcional 
● Entre 18 e 69 → Voto obrigatório*/
import java.util.Scanner;
public class Questao08{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		//Pergunta a idade
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		if (idade<16){
			System.out.println("Não pode votar.");
			
		} else if (idade>=16 && idade <=17 || idade > 70){
			System.out.println("Voto Opcional.");
		} else {
			System.out.println("Voto obrigatório.");
		}
		
		
		
	}
}