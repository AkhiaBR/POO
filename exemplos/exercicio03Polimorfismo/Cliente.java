public class Cliente
{
    public int codigo;
    public String nomeCliente;
    public String sexo;
    public String dataNascimento;
    public double saldo;

    public Cliente (int codigo, String nomeCliente, String sexo, String dataNascimento, double saldo) {
        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.saldo = saldo;
    }

    public String getDados () {
        String dados = "Código do cliente: " + this.codigo + "\n"
                + "Nome do cliente: " + this.nomeCliente + "\n"
                + "Sexo: " + this.sexo + "\n"
                + "Data de nascimento: " + this.dataNascimento + "\n"
                + "Saldo: " + this.saldo + "\n";
        return dados;
    }
}
