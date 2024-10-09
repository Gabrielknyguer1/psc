package pratica5;
import java.util.Scanner;
public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base (número inteiro): ");
        int base = scanner.nextInt();
        System.out.print("Digite o expoente (número inteiro): ");
        int expoente = scanner.nextInt();
        int resultado = 1;
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }
        System.out.println("Resultado: " + base + " elevado a " + expoente + " é " + resultado);
        scanner.close();
    }
}