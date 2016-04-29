package excepcionesthrows;

/**
 *
 * @author rodoph
 */
import javax.swing.JOptionPane;

public class video25 {

    static int x, y;

    public static void main(String[] args) {

        try {
            sumar();
            dividir(7, 0);
        } catch (ArithmeticException a) {
            System.out.println(a.getMessage());
        } catch (NumberFormatException n) {
            System.out.println(n.getMessage());
        }

    }

    public static void sumar() throws NumberFormatException {

        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa valor para  X: "));
        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Insegrasa valor para Y: "));
        JOptionPane.showMessageDialog(null, "El resultado de " + x + " +" + y + " es:" + (x + y), "Resultado", 1);
    }

    public static void dividir(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Error, no se puede dividir entre cero (0)");
        } else {
            JOptionPane.showMessageDialog(null, "La división de " + x + " / " + y + " es: " + (x / y), "Resultado", 1);
        }
    }
}
