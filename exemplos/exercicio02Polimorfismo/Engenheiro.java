public class Engenheiro extends Funcionario
{
    public int numero_crea;
    public String especializacao;

    @Override
    public double calcularSalario () {
        return (numero_horas*valor_horas+(numero_horas*valor_horas)*0.05);
    }

    public Engenheiro (int codigo, String nome_funcionario, String sexo, double numero_horas, double valor_horas, int numero_crea, String especializacao) {
        super(codigo, nome_funcionario, sexo, numero_horas, valor_horas);
        this.numero_crea = numero_crea;
        this.especializacao = especializacao;
    }
}
