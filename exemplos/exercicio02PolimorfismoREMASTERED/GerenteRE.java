public class GerenteRE extends FuncionarioRE
{
    protected String setor;

    public GerenteRE (int codigo, String nome, String sexo, double numeroHoras, double valorHoras, String setor) {
        super(codigo, nome, sexo, numeroHoras, valorHoras);
        this.setor = setor;
    }

    @Override
    public void gerarFolhaPagamento () {
        double bonificacao = 0.02;
        double salario = (this.valorHoras*this.numeroHoras)+((this.valorHoras*this.numeroHoras)*bonificacao);
        System.out.println("Salário do Gerente: "+salario);
    }
}
