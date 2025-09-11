import java.util.Scanner;

public class tresinteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos números
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = scanner.nextInt();

        // Cálculo do produto
        int produto = num1 * num2 * num3;

        // Saída do resultado
        System.out.println("O produto dos três números é: " + produto);

        scanner.close();
    }
}
