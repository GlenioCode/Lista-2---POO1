import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Menu:");
        System.out.println("1. Somar dois números");
        System.out.println("2. Multiplicação de dois números");
        System.out.println("3. Raiz quadrada de um número");
        System.out.println("4. Quadrado de um número");
        int numero = scanner.nextInt();
        
        switch (numero) {
            case 1:
                System.out.print("Digite o primeiro número: ");
                int n1 = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                int n2 = scanner.nextInt();
                int soma = n1 + n2;
                System.out.println("A Soma dos Dois Números é: " + soma);
                break;
            
            case 2:
                System.out.print("Digite o primeiro número: ");
                n1 = scanner.nextInt();
                System.out.print("Digite o segundo número: ");
                n2 = scanner.nextInt();
                int multiplicacao = n1 * n2;
                System.out.println("A Multiplicação dos Dois Números é: " + multiplicacao);
                break;
            
            case 3:
                System.out.print("Digite um número: ");
                n1 = scanner.nextInt();
                System.out.println("Resultado da raiz quadrada: " + Math.sqrt(n1));
                break;
            
            case 4:
                System.out.print("Digite um número: ");
                n1 = scanner.nextInt();
                System.out.println("Resultado do quadrado: " + (n1 * n1));
                break;
            
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
