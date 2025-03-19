// Nome do aluno: Fernando Gonçalves
// Turma: 3190

import javax.swing.*; // importa a biblioteca Swing

public class Exercicio03 // classe pública
{
    public static void main(String[] args) { // inicializa o código:
        double valorCredito = 0, desconto = 0, total = 0;
        String op = ""; // inicialização do operador

        // loop:
        while (true) {
            String nome = JOptionPane.showInputDialog("Digite seu nome: ");
            int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua conta bancária: "));
            double saldoMedio = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu saldo médio: "));

            // sistema de atribuição de descontos
            if (saldoMedio>0 && saldoMedio<=2000) {
                JOptionPane.showMessageDialog(null, nome+", você não tem saldo para crédito.");
                op = JOptionPane.showInputDialog("Deseja continuar? Sim (S), não (N): ");
            }
            else if (saldoMedio>2001 && saldoMedio<=4000) {
                desconto = 0.05;
                total = saldoMedio*desconto;
                JOptionPane.showMessageDialog(null, nome+", você tem 5% do saldo médio, ou seja: "+total+" de créditos especiais. ");
                op = JOptionPane.showInputDialog("Deseja continuar? Sim (S), não (N): ");
            }
            else if (saldoMedio>4001 && saldoMedio<=6000) {
                desconto = 0.10;
                total = saldoMedio*desconto;
                JOptionPane.showMessageDialog(null, nome+", você tem 10% do saldo médio, ou seja: "+total+" de créditos especiais. ");
                op = JOptionPane.showInputDialog("Deseja continuar? Sim (S), não (N): ");
            }
            else if (saldoMedio>6000) {
                desconto = 0.15;
                total = saldoMedio*desconto;
                JOptionPane.showMessageDialog(null, nome+", você tem 15% do saldo médio, ou seja: "+total+" de créditos especiais. ");
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
        System.exit(0);
    }
}
