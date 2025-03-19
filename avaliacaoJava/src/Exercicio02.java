// Nome do aluno: Fernando Gonçalves
// Turma: 3190

import javax.swing.*; // importa a biblioteca Swing

public class Exercicio02 // classe pública
{
    public static void main(String[] args) { // inicializa o código:
        int contadorBercario = 0, contadorInfantil = 0, contadorFundamental1 = 0, contadorFundamental2 = 0, contadorMedio = 0; // inicialização de contadores
        String op = ""; // inicialização do operador

        // loop:
        while (true) {
            String nome = JOptionPane.showInputDialog("Digite seu nome: ");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

            // sistema de atribuição das categorias:
            if (idade>0 && idade<=3) {
                contadorBercario++;
                JOptionPane.showMessageDialog(null, nome+", você está no Berçário.");
                op = JOptionPane.showInputDialog("Deseja continuar? Sim (S), não (N): ");
            }
            else if (idade>4 && idade<=7) {
                contadorInfantil++;
                JOptionPane.showMessageDialog(null, nome+", você está no Infatil.");
                op = JOptionPane.showInputDialog("Deseja continuar? Sim (S), não (N): ");
            }
            else if (idade>8 && idade<=10) {
                contadorFundamental1++;
                JOptionPane.showMessageDialog(null, nome+", você está no Fundamental I.");
                op = JOptionPane.showInputDialog("Deseja continuar? Sim (S), não (N): ");
            }
            else if (idade>11 && idade<=14) {
                contadorFundamental2++;
                JOptionPane.showMessageDialog(null, nome+", você está no Fundamental II.");
                op = JOptionPane.showInputDialog("Deseja continuar? Sim (S), não (N): ");
            }
            else if (idade>15) {
                contadorMedio++;
                JOptionPane.showMessageDialog(null, nome+", você está no Ensino Médio.");
                op = JOptionPane.showInputDialog("Deseja continuar? Sim (S), não (N): ");
            }
            else {
                JOptionPane.showMessageDialog(null, "ERRO: Valor inserido inválido.");
            }

            // condicional para quebra de laço:
            if (op.equalsIgnoreCase("S")) {
                continue;
            }
            else if (op.equalsIgnoreCase("N")) {
                break;
            }
            else {
                JOptionPane.showMessageDialog(null, "ERRO: Valor inserido inválido. ");
            }
        }

        // print final:
        JOptionPane.showMessageDialog(null, "Total de alunos no Berçário: "+contadorBercario+
                "\n Total de alunos no Infantil: "+contadorInfantil+
                "\n Total de alunos no Fundamenal I: "+contadorFundamental1+
                "\n Total de alunos no Fundamental II: "+contadorFundamental2+
                "\n Total de alunos no Ensino Médio: "+contadorMedio);
        System.exit(0);
    }
}
