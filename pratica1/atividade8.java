package pratica1;
import java.util.*;
public class Sequencial8 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o peso da pessoa");
        double pesoAtual = teclado.nextDouble();
        double pesoMais15 = (pesoAtual * 0.15);
        double pesoMais20 = (pesoAtual * 0.20);
        System.out.println("Se engordar 15% o peso sera: " + (pesoAtual + pesoMais15));
        System.out.println("Se engordar 20% o peso sera: " + (pesoAtual + pesoMais20));
        System.exit(0);
    }
}