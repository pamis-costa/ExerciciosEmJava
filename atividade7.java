import java.util.Scanner;

public class atividade7{
    public static void main(String[] args) {
        System.out.println("Digite o Primeiro Numero: ");
        Scanner entrada = new Scanner(System.in);
        double n1 = entrada.nextDouble();
        System.out.println("Digite o Segundo Numero: ");
        double n2 = entrada.nextDouble();
        double soma = n1 + n2;
        double multiplicacao = n1 * n2;
        double subtracao = n1 - n2;
        double divisao = n1 / n2;
        System.out.printf("\n O resultado da soma de: %.1f + %.1f = %.1f", n1, n2, soma);
        System.out.printf("\n O resultado da subtração de: %.1f - %.1f = %.1f", n1, n2, subtracao);
        System.out.printf("\n O resultado da multiplicação de: %.1f * %.1f = %.1f", n1, n2, multiplicacao);
        System.out.printf("\n O resultado da divisão de: %.1f / %.1f = %.1f", n1, n2, divisao);
        
    }
    
}