public class Engenheiro extends Funcionario
{
    protected String areaAtuacao;

    public Engenheiro(int matricula, String nome, String sexo, int idade, double salarioBase, String areaAtuacao) {
        super(matricula, nome, sexo, idade, salarioBase);
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public double calcularSalario() {
        double aumento = 0.15;
        double salarioFinal = this.salarioBase+(this.salarioBase*aumento);
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Engenheiro{" +
                "areaAtuacao='" + areaAtuacao + '\'' +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
