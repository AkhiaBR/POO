import javax.swing.JOptionPane;

public class CalcularFolhaPagamento
{
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        double horas = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora trabalhada: "));

        double salario = (horas*valor)-((horas*valor)*0.02);

        JOptionPane.showMessageDialog(null,nome+", seu salário é: "+salario);
        System.exit(0);
    }
}
