//Autor: Pamela//
import java.util.Scanner;

public class atividade4 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor do primeiro número: ");
		int numero1= entrada.nextInt();
		System.out.println("Digite o valor do segundo número: ");
		int numero2 = entrada.nextInt();
		int resultado = numero1 + numero2;
		
		System.out.println("A soma de " + numero1 + " com " + numero2+ " resulta em " +resultado );
		
	}
}

