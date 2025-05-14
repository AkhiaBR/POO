public class Diretor extends Funcionario
{
    public String area_gestao;

    @Override
    public double calcularSalario () {
        return (numero_horas*valor_horas+(numero_horas*valor_horas)*0.02);
    }

    public Diretor (int codigo, String nome_funcionario, String sexo, double numero_horas, double valor_horas, String area_gestao) {
        super(codigo, nome_funcionario, sexo, numero_horas, valor_horas);
        this.area_gestao = area_gestao;
    }
}