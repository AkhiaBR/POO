import javax.swing.JOptionPane;

public class CalcularAreaTriangulo
{
    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base da pirâmide: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de altura da pirâmide: "));

        double area = (base*altura)/2;

        JOptionPane.showMessageDialog(null,"Área da pirâmide: "+area);
        System.exit(0);
    }
}
