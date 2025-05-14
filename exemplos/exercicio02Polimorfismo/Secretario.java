public class Secretario extends Funcionario
{
    public String categoria;
    public String setorSecretario;

    @Override
    public double calcularSalario () {
        return (numero_horas*valor_horas+(numero_horas*valor_horas)*0.05);
    }

    public Secretario (int codigo, String nome_funcionario, String sexo, double numero_horas, double valor_horas, String categoria, String setorSecretario) {
        super(codigo, nome_funcionario, sexo, numero_horas, valor_horas);
        this.categoria = categoria;
        this.setorSecretario = setorSecretario;
    }
}