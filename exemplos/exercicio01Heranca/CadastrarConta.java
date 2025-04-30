import javax.swing.*;

public class CadastrarConta
{
    public static void main(String[] args) {
        Conta conta = null; // cria uma variavel com a classe Conta (TEM QUE ESTAR DENTRO DA MAIN)

        int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de conta: "+
                                                            "\n 1- CONTA NORMAL"+
                                                            "\n 2- CONTA ESPECIAL"));

        if (op==1) {
            conta = new Conta(0); // parametros para o construtor (saldoInicial)
            JOptionPane.showMessageDialog(null, "TIPO DE CONTA SELECIONADA: NORMAL");
        }
        else if (op==2) {
            conta = new ContaEspecial(0); // parametros para o construtor (saldoInicial)
            JOptionPane.showMessageDialog(null, "TIPO DE CONTA SELECIONADA: ESPECIAL");
        }
        else {
            JOptionPane.showMessageDialog(null, "ERRO: Valor inserido inválido.");
        }

        while (true) {
            int op2 = Integer.parseInt(JOptionPane.showInputDialog("----------------------------"+
                    "\n 1- DEPOSITAR"+
                    "\n 2- SACAR"+
                    "\n 3- VER SALDO"+
                    "\n 4- SAIR"));

            if (op2==1) {
                double deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantia a ser depositada: "));
                conta.depositar(deposito);
                JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
            }
            else if (op2==2) {
                double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque: "));
                if (conta.sacar(saque)) {
                    JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
                }
                else {
                    JOptionPane.showMessageDialog(null, "ERRO: Saldo insuficiente.");
                }
            }
            else if (op2==3) {
                double saldo = conta.getSaldo();
                JOptionPane.showMessageDialog(null, "Saldo atual: "+saldo);
            }
            else if (op2==4) {
                break;
            }
            else {
                JOptionPane.showMessageDialog(null, "ERRO: Valor inserido inválido.");
            }
        }
    }
}
