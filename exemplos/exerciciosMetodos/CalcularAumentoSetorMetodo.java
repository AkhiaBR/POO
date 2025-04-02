import javax.swing.*;

public class CalcularAumentoSetorMetodo
{
    public static double aumentoFinanceiro (double salario) { // o metodo aumentoFinanceiro precisou de um parâmetro porque você está injetando uma variável (salario) dentro do metodo para que ele possa usar essa variável em suas operações.
        return salario+(salario*0.05);
    }

    public static double aumentoVendas (double salario) { // o metodo aumentoFinanceiro precisou de um parâmetro porque você está injetando uma variável (salario) dentro do metodo para que ele possa usar essa variável em suas operações.
        return salario+(salario*0.10);
    }

    public static double aumentoProducao (double salario) { // o metodo aumentoFinanceiro precisou de um parâmetro porque você está injetando uma variável (salario) dentro do metodo para que ele possa usar essa variável em suas operações.
        return salario+(salario*0.15);
    }

    public static void main(String[] args) {
        while (true) {
            String nome = JOptionPane.showInputDialog("Digite seu nome: ");
            int setor = Integer.parseInt(JOptionPane.showInputDialog("Qual é seu setor de trabalho?: " +
                    "\n 1- FINANCEIRO" +
                    "\n 2- VENDAS" +
                    "\n 3- PRODUÇÃO"));
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual seu salário mensal atual?: "));

            if (setor==1) {
                JOptionPane.showMessageDialog(null, nome+", seu salário após o aumento será igual a: "+aumentoFinanceiro(salario)+
                                                                                "\n Deseja continuar? SIM (S) ou NÃO (N)?: ");
            }
            else if (setor==2) {
                JOptionPane.showMessageDialog(null, nome+", seu salário após o aumento será igual a: "+aumentoFinanceiro(salario));
            }
            else if (setor==3) {
                JOptionPane.showMessageDialog(null, nome+", seu salário após o aumento será igual a: "+aumentoFinanceiro(salario));
            }
            else {
                JOptionPane.showMessageDialog(null, "ERRO: Valor inserido inválido...");
            }

            String escolha = JOptionPane.showInputDialog("Deseja continuar? SIM (S) ou NÃO (N)?: ");

            if (escolha.equalsIgnoreCase("S")) {
                continue;
            }
            else if (escolha.equalsIgnoreCase("N")) {
                break;
            }
            else {
                JOptionPane.showMessageDialog(null, "ERRO: Valor inserido inválido...");
            }
        }
    }
}
