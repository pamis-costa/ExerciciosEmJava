import java.util.Scanner;
public class MediaNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o nome do aluno: ");
        String nomealuno = entrada.nextLine();
        System.out.print("Insira o nome da Disciplina: ");
        String nomeprofessor = entrada.nextLine();
        System.out.print("Insira o nome da Professor: ");
        String nomedisciplina = entrada.nextLine();
        System.out.print("Insira o valor da primeira nota: ");
        float nota1 = entrada.nextFloat();
        System.out.print("Insira o valor da segunda nota: ");
        float nota2 = entrada.nextFloat();
        float media = (nota1+nota2)/2;
        System.out.println("******Relatorio Final******");
        System.out.println("Nome do Alun(a): " + nomealuno);
        System.out.println("Nome do professor(a): " + nomeprofessor);
        System.out.println("Nome do disciplina: " + nomedisciplina);
        System.out.printf("\nNota A1: %.2f ", nota1);
        System.out.printf("\nNota A2: %.2f ", nota2);
        System.out.printf("\nNota media: %.2f ", media);
        System.out.println("\n******Fim do Relatório******");
    }
}
