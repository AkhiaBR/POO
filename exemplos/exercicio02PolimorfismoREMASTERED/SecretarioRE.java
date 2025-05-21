public class SecretarioRE extends FuncionarioRE
{
    protected int categoria;
    protected String setor;

    public SecretarioRE (int codigo, String nome, String sexo, double numeroHoras, double valorHoras, int categoria, String setor) {
        super(codigo, nome, sexo, numeroHoras, valorHoras);
        this.categoria = categoria;
        this.setor = setor;
    }

    @Override
    public void gerarFolhaPagamento () {
        double bonificacao = 0.05;
        double salario = (this.valorHoras*this.numeroHoras)+((this.valorHoras*this.numeroHoras)*bonificacao);
        System.out.println("Salário do Secretario: "+salario);
    }
}
