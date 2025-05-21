public class DiretorRE extends FuncionarioRE
{
    protected String areaGestao;

    public DiretorRE (int codigo, String nome, String sexo, double numeroHoras, double valorHoras, String areaGestao) {
        super(codigo, nome, sexo, numeroHoras, valorHoras);
        this.areaGestao = areaGestao;
    }

    @Override
    public void gerarFolhaPagamento () {
        double bonificacao = 0.02;
        double salario = (this.valorHoras*this.numeroHoras)+((this.valorHoras*this.numeroHoras)*bonificacao);
        System.out.println("Salário do Diretor: "+salario);
    }
}
