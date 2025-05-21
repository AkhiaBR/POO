public class FuncionarioRE
{
    protected int codigo;
    protected String nome;
    protected String sexo;
    protected double numeroHoras;
    protected double valorHoras;

    public FuncionarioRE (int codigo, String nome, String sexo, double numeroHoras, double valorHoras) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.numeroHoras = numeroHoras;
        this.valorHoras = valorHoras;
    }

    public void gerarFolhaPagamento () {
        double salario = (this.valorHoras*this.numeroHoras);
        System.out.println("Salário do Funcionário: "+salario);
    }
}
