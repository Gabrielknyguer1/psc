package pratica1;
import java.util.*;
public class Sequencial5 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o valor da diagonal maior");
        double diagonalMaior = teclado.nextDouble();
        System.out.println("digite o valor da diagonal menor");
        double diagonalMenor = teclado.nextDouble();
        System.out.println("area: " + (diagonalMaior * diagonalMenor));
        System.exit(0);
    }
}