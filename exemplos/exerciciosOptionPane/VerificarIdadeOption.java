import javax.swing.JOptionPane;

public class VerificarIdadeOption
{
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));

        if (idade<=3) {
            JOptionPane.showMessageDialog(null, "Você é um bebê");
            System.exit(0);
        }
        else if (idade>=4 && idade<=11) {
            JOptionPane.showMessageDialog(null, "Você é uma criança");
            System.exit(0);
        }
        else if (idade>=12 && idade<=17) {
            JOptionPane.showMessageDialog(null,"Você é um adolescente");
            System.exit(0);
        }
        else if (idade>=18 && idade<=60) {
            JOptionPane.showMessageDialog(null, "Você é um adulto");
            System.exit(0);
        }
        else if (idade>=61) {
            JOptionPane.showMessageDialog(null, "Você é um idoso");
            System.exit(0);
        }
        else {
            JOptionPane.showMessageDialog(null, "ERRO: Valor inserido errado");
            System.exit(0);
        }
    }
}
