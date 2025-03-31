/*Desenvolva um programa que receba a idade e o peso de uma pessoa.
 Com
 base nos seguintes 
critérios, o programa deve determinar e exibir o grupo de risco a
o qual essa pessoa pertence: 
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
O programa deve receber os valores informados pelo usuário e exibi
r o grupo de risco 
correspondente.*/ 



import java.util.Scanner;
public class Questao25{
	public static void main(String[]args){
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.print("Digite seu peso: ");
		double peso = scanner.nextDouble();
		int grupoRisco;
        
        if (idade < 20) {
            if (peso <= 60) {
                grupoRisco = 9;
            } else if (peso <= 90) {
                grupoRisco = 8;
            } else {
                grupoRisco = 7;
            }
        } else if (idade <= 50) {
            if (peso <= 60) {
                grupoRisco = 6;
            } else if (peso <= 90) {
                grupoRisco = 5;
            } else {
                grupoRisco = 4;
            }
        } else {
            if (peso <= 60) {
                grupoRisco = 3;
            } else if (peso <= 90) {
                grupoRisco = 2;
            } else {
                grupoRisco = 1;
            }
        }
        
        System.out.println("Você pertence ao Grupo de Risco " + grupoRisco);
	}
}