import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite o salário do funcionário: ");
        double salario = entrada.nextDouble();
        
        System.out.println("Digite o percentual do aumento: ");
        double percentual = entrada.nextDouble();
        
        double aumento = salario * (percentual / 100);
        double novoSalario = salario + aumento;
        double desconto = novoSalario * 0.14;
        double salarioliquido = novoSalario - desconto;
        System.out.println("\n**** Cálculo de Reajuste Salarial*****");
        System.out.printf("\nSeu salário anterior: %.1f", salario);
        System.out.printf("\nPercentual de aumento: %.1f%%", percentual);
        System.out.printf("\nSeu novo Salário: %.1f", novoSalario);
        System.out.printf("\nDesconto do INSS: %.1f", desconto);
        System.out.printf("\nSalário Líquido: %.1f", salarioliquido);
    }
    
}