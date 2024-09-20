//Autor: Pamela//
import java.util.Scanner;

public class atividade2 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Como devo te chamar?");
		String nome= entrada.nextLine();
		System.out.println("Quantos anos voce tem?");
		int idade = entrada.nextInt();
		System.out.println("Seu nome "+ nome);
		System.out.println("Voce tem "+ idade + " anos");
		
	}
}

