/*25. Desenvolva um programa que receba a idade e o peso de uma pessoa.
Com base nos seguintes critérios, o programa deve determinar e exibir o grupo de risco
ao qual essa pessoa pertence: 
● Se a pessoa tem menos de 20 anos: 
○ Peso até 60 kg → Grupo de risco 9 
○ Peso entre 60 e 90 kg → Grupo de risco 8 
○ Peso acima de 90 kg → Grupo de risco 7 

● Se a pessoa tem entre 20 e 50 anos: 
○ Peso até 60 kg → Grupo de risco 6 
○ Peso entre 60 e 90 kg → Grupo de risco 5 
○ Peso acima de 90 kg → Grupo de risco 4 

● Se a pessoa tem mais de 50 anos: 
○ Peso até 60 kg → Grupo de risco 3 
○ Peso entre 60 e 90 kg → Grupo de risco 2 
○ Peso acima de 90 kg → Grupo de risco 1 
O programa deve receber os valores informados pelo usuário e exibir o grupo de risco 
correspondente.*/
import java.util.Scanner;
public class Questao25{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.println("Digite seu peso: ");
		double peso = scanner.nextDouble();
		
		/*● Se a pessoa tem menos de 20 anos: 
		○ Peso até 60 kg → Grupo de risco 9 
		○Peso entre 60 e 90 kg → Grupo de risco 8 
		○Peso acima de 90 kg → Grupo de risco 7*/ 
		
		if(idade <20 && peso<60){
			System.out.println("Grupo de risco 9");
		} else if (idade <20 && peso >=60 &&  peso<90){
			System.out.println("Grupo de risco 8");
			
		} else if (idade <20 && peso>90){
			System.out.println("Grupo de risco 7");
		}
		
		/*● Se a pessoa tem entre 20 e 50 anos: 
		○ Peso até 60 kg → Grupo de risco 6 
		○ Peso entre 60 e 90 kg → Grupo de risco 5 
		○ Peso acima de 90 kg → Grupo de risco 4 */
		
		if(idade>=20 && idade <50 && peso<60){
			System.out.println("Grupo de risco 6");
		} else if (idade <20 && idade <50  && idade <50  && peso >=60 &&  peso<90){
			System.out.println("Grupo de risco 5");
			
		} else if (idade <20 && idade <50  && peso>90){
			System.out.println("Grupo de risco 4");
		}
		
		/*● Se a pessoa tem mais de 50 anos: 
		○ Peso até 60 kg → Grupo de risco 3 
		○ Peso entre 60 e 90 kg → Grupo de risco 2 
		○ Peso acima de 90 kg → Grupo de risco 1*/ 
			
		if(idade>50 && peso<60){
			System.out.println("Grupo de risco 3");
		} else if (idade >50  && idade <50  && peso >=60 &&  peso<90){
			System.out.println("Grupo de risco 2");
			
		} else if (idade  >50  && peso>90){
			System.out.println("Grupo de risco 1");
		}
		
	}
}