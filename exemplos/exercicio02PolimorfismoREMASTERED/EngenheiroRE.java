public class EngenheiroRE extends FuncionarioRE
{
    protected int numeroCREA;
    protected String especializacao;

    public EngenheiroRE (int codigo, String nome, String sexo, double numeroHoras, double valorHoras, int numeroCREA, String especializacao) {
        super(codigo, nome, sexo, numeroHoras, valorHoras);
        this.numeroCREA = numeroCREA;
        this.especializacao = especializacao;
    }
    @Override
    public void gerarFolhaPagamento () {
        double bonificacao = 0.05;
        double salario = (this.valorHoras*this.numeroHoras)+((this.valorHoras*this.numeroHoras)*bonificacao);
        System.out.println("Salário do Engenheiro: "+salario);
    }
}
