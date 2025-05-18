import java.util.Scanner;

public class Program03
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---SELECIONE O SEU TIPO DE CONTA---");
        System.out.println("1 - Conta Normal");
        System.out.println("2 - Conta Poupança");
        System.out.println("3 - Conta Especial");
        System.out.println("-----------------------------------");
        int tipoConta = Integer.parseInt(sc.nextLine());

        // Classe Pai:
        System.out.println("Digite o código do cliente: ");
        int codigo  = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Digite o sexo do cliente: ");
        String sexo = sc.nextLine();
        System.out.println("Digite a data de nascimento: ");
        String dataNascimento = sc.nextLine();
        System.out.println("Digite o salário do cliente: ");
        double saldo = Double.parseDouble(sc.nextLine());

        System.out.println("---SELECIONE O TIPO DE MOVIMENTAÇÃO---");
        System.out.println("1 - Saque");
        System.out.println("2 - Deposito");
        System.out.println("-----------------------------------");
        int tipoMovimentacao = Integer.parseInt(sc.nextLine());
        System.out.println("Qual a quantia da movimentação?: ");
        double valorMovimentacao = Double.parseDouble(sc.nextLine());
        System.out.println("Digite a data de hoje (DD/MM/YYYY): ");
        String data = sc.nextLine();

        if (tipoConta == 1) {
            ContaNormal contaNormal = new ContaNormal(codigo, nomeCliente, sexo, dataNascimento, saldo, tipoMovimentacao, valorMovimentacao, data);
            if (tipoMovimentacao == 1) {
                contaNormal.efetuarMovimentacao();
                System.out.println(contaNormal.getDados());
            }
            else if (tipoMovimentacao == 2) {
                contaNormal.efetuarMovimentacao();
                System.out.println(contaNormal.getDados());
            }
            else {
                System.out.println("ERRO: tipo de conta invalido");
            }
        }
        else if (tipoConta == 2) {
            ContaPoupanca contaPoupanca = new ContaPoupanca(codigo, nomeCliente, sexo, dataNascimento, saldo, tipoMovimentacao, valorMovimentacao, data);
            if (tipoMovimentacao == 1) {
                contaPoupanca.efetuarMovimentacao();
                System.out.println(contaPoupanca.getDados());
            }
            else if (tipoMovimentacao == 2) {
                contaPoupanca.efetuarMovimentacao();
                System.out.println(contaPoupanca.getDados());
            }
            else {
                System.out.println("ERRO: tipo de conta invalido");
            }
        }
        else if (tipoConta == 3) {
            ContaSpecial contaSpecial = new ContaSpecial(codigo, nomeCliente, sexo, dataNascimento, saldo, tipoMovimentacao, valorMovimentacao, data);
            if (tipoMovimentacao == 1) {
                contaSpecial.efetuarMovimentacao();
                System.out.println(contaSpecial.getDados());
            }
            else if (tipoMovimentacao == 2) {
                contaSpecial.efetuarMovimentacao();
                System.out.println(contaSpecial.getDados());
            }
            else {
                System.out.println("ERRO: tipo de conta invalido");
            }
        }
    }
}
