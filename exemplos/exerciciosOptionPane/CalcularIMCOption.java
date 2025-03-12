import javax.swing.JOptionPane;

public class CalcularIMCOption
{
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite o a sua idade: "));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu altura: "));

        double imc = peso/(altura*altura);

        JOptionPane.showMessageDialog(null,nome+", seu IMC é: "+imc);
        System.exit(0);
    }
}
