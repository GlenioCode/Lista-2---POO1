/*9. Peça ao usuário seu peso e altura e calcule o IMC,
 classificando-o conforme a tabela: 
 Abaixo do peso: IMC < 18.5 
 Peso normal: 18.5 ≤ IMC < 25 
 Sobrepeso: 25 ≤ IMC < 30 
 Obesidade: IMC ≥ 30 */
 
 import java.util.Scanner; // Importando a classe Scanner
 public class Questao09{
	 public static void main (String[]args){
		 
		 //Criando um objeto Scanner para Ler a entrada do usuário
		 Scanner scanner = new Scanner (System.in);
		 
		 // Perguntando o peso e a altura ao usuário
		 System.out.println("VAMOS CALCUAR SEU IMC ! ! !");
		 
		 System.out.print("Digite o seu peso: ");
		 double peso = scanner.nextDouble();
		 
		 System.out.print("Digite a sua altura: ");
		 double altura = scanner.nextDouble();
		 // Calculando o IMC
		 // IMC = peso(kg) / altura(m)2
		 
		 double imc = peso / (altura * altura);
		 
		 System.out.println("Seu IMC é: " + imc);
		 
		 if (imc < 18.5){
			 System.out.println("Você está abaixo do peso.");
		 } else if ( imc <= 18.5  && imc <25){
			 System.out.println("Seu peso está normal.");
		 } else if( imc <=25 && imc < 30){
			 System.out.println("Você esta sobrepeso.");
		 } else if ( imc >= 30){
			 System.out.println("Você está obeso.");
		 }
	 }
 }