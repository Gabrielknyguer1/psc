package pratica5;
import java.util.*;
public class NumeroInteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int totalNumeros = 10;
        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Digite o número " + i + ": ");
            int num = scanner.nextInt();
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("O maior número inteiro é: " + maior);
        System.out.println("O menor número inteiro é: " + menor);
        scanner.close();
    }
}