import java.util.Scanner;

public class CalculaArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho da base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Digite o tamanho da altura: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        if (base == altura) {
            System.out.printf("O quadrado com base %.2f e altura %.2f tem área: %.2f\n", base, altura, area);
        } else {
            System.out.printf("O retângulo com base %.2f e altura %.2f tem área: %.2f\n", base, altura, area);
        }

        scanner.close();
    }
}
