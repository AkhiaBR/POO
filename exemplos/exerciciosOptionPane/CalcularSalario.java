import javax.swing.JOptionPane;

public class CalcularSalario
{
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do funcionário: ");
        String cargo = JOptionPane.showInputDialog("Digite o cargo do funcionário: ");
        double salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário bruto do funcionário: "));

        double salarioLiquido = salarioBruto+(salarioBruto*0.05);

        JOptionPane.showMessageDialog(null, "Nome: "+nome+
                "\nCargo: "+cargo+
                "\nSalário: "+salarioLiquido);
        System.exit(0);
    }
}
