package pratica1;
import javax.swing.JOptionPane;
public class Sequencial9P {
	public static void main(String[] args) {
      String Cat1, Cat2;
      Cat1=JOptionPane.showInputDialog("Informe o primeiro Cateto: ");
      Cat2=JOptionPane.showInputDialog("Informe o segundo Cateto: ");
      
      double cate1=Double.parseDouble(Cat1);
      double cate2=Double.parseDouble(Cat2);
      
      double hipo=Math.sqrt((cate1*cate1)+(cate2*cate2));
      JOptionPane.showMessageDialog(null,"O valor da Hipotenusa é: "+hipo);
      
	}
}