public class Gerente extends Funcionario
{
    public String setorGerente;

    @Override
    public double calcularSalario () {
        return (numero_horas*valor_horas+(numero_horas*valor_horas)*0.02);
    }

    public Gerente (int codigo, String nome_funcionario, String sexo, double numero_horas, double valor_horas, String setorGerente) {
        super(codigo, nome_funcionario, sexo, numero_horas, valor_horas);
        this.setorGerente = setorGerente;
    }
}