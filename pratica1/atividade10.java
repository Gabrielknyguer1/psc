package pratica1;
import java.util.*;
public class Sequencial10 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o valor do raio");
        double raio = teclado.nextDouble();
        final double PI = Math.PI;
        double comprimento = 2 * PI * raio;
        double area = PI * raio * raio;
        double volume = (4.0 / 3.0) * PI * raio * raio * raio;
        System.out.println("Comprimento da esfera: " + comprimento);
        System.out.println("Area da esfera: " + area);
        System.out.println("Volume da esfera: " + volume);
        System.exit(0);
    }
}