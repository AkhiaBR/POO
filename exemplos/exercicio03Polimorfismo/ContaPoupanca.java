public class ContaPoupanca extends Cliente
{
    int tipoMovimentacao;
    double valorMovimentacao;
    String data;

    public ContaPoupanca (int codigo, String nomeCliente, String sexo, String dataNascimento, double saldo, int tipoMovimentacao, double valorMovimentacao, String data) {
        super (codigo, nomeCliente, sexo, dataNascimento, saldo);
        this.tipoMovimentacao = tipoMovimentacao;
        this.valorMovimentacao = valorMovimentacao;
        this.data = data;
    }

    public void efetuarMovimentacao () {
        if (tipoMovimentacao == 1) {
            saldo -= valorMovimentacao;
        }
        else if (tipoMovimentacao == 2) {
            saldo += valorMovimentacao;
        }
        else {
            System.out.println("ERRO: tipo movimentacao invalido");
        }
    }

    @Override
    public String getDados () {
        return "Código do cliente: " + this.codigo + "\n"
                + "Nome do cliente: " + this.nomeCliente + "\n"
                + "Sexo: " + this.sexo + "\n"
                + "Data de nascimento: " + this.dataNascimento + "\n"
                + "Saldo: " + this.saldo + "\n"
                + "Tipo movimentacao: " + this.tipoMovimentacao + "\n"
                + "Valor movimentacao: " + this.valorMovimentacao + "\n";
    }
}
