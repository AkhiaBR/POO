// Nome do aluno: Fernando Gonçalves
// Turma: 3190

import javax.swing.*; // importa a biblioteca Swing

public class Exercicio04 // classe pública
{
    public static void main(String[] args) { // inicializa o código:
        double valorRaio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio do círculo: ")); // recebe o valor do raio do círculo

        // calculos:
        double perimetro = 2*3.14159*valorRaio;
        double area = 3.14159*(valorRaio*valorRaio);

        // print final:
        JOptionPane.showMessageDialog(null, "Valor do perímetro do círculo: "+perimetro+
                                                                    "\n Valor da área do círculo: "+area);
    }
}
