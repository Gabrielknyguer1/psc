package pratica1;
import java.util.*;
public class Sequencial9 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o valor do primeiro cateto");
        double cateto1 = teclado.nextDouble();
        System.out.println("digite o valor do segundo cateto");
        double cateto2 = teclado.nextDouble();
        System.out.println("A hipotenusa é: " + (cateto1 * cateto1 + cateto2 * cateto2));
        System.exit(0);
    }
}