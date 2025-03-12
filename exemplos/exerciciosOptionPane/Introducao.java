import javax.swing.JOptionPane; // importa framework swing

public class Introducao {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome: "); // String não precisa de conversão
        double cel = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius: ")); // uma variável double precisa ser convertida (prase)
        double fah = (9.0/5.0)*(cel)+32;

        JOptionPane.showMessageDialog(null,nome+", a temperatura em Fahrenheit é: "+fah); // printa utilizando OptionPane
        System.exit(0);
    }
}
