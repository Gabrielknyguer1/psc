package pratica1;
import java.util.*;
public class Sequencial6 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite a temperatura em Celsius");
        double celsius = teclado.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("A temperatura em fahrenheit é: " + fahrenheit);
        System.exit(0);
    }
}