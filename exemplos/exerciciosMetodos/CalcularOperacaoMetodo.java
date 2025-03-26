import javax.swing.*;

public class CalcularOperacaoMetodo
{
    public static void calcularOperacao () { // static: somente da classe CalcularOperacaoMetodo, void: não retornará nada, o print final será feito nesse mesmo metodo
        float resultado = 0;
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        String op = JOptionPane.showInputDialog("Qual operação você deseja realizar? Adição (A), Subtração (S), Multiplicação (M), ou Divisão (D)?: ");
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

        if (op.equalsIgnoreCase("A")) {
            resultado = valor1+valor2;
        }
        else if (op.equalsIgnoreCase("S")) {
            resultado = valor1-valor2;
        }
        else if (op.equalsIgnoreCase("M")) {
            resultado = valor1*valor2;
        }
        else if (op.equalsIgnoreCase("D")) {
            resultado = valor1/valor2;
        }

        JOptionPane.showMessageDialog(null,"O resultado da operação foi: "+resultado);
    }

    public static void main(String[] args) {
        calcularOperacao();
    }
}
