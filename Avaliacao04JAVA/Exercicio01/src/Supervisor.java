public class Supervisor extends Funcionario
{
    protected String setor;

    public Supervisor(int matricula, String nome, String sexo, int idade, double salarioBase, String setor) {
        super(matricula, nome, sexo, idade, salarioBase);
        this.setor = setor;
    }

    @Override
    public double calcularSalario() {
        double aumento = 0.2;
        double salarioFinal = this.salarioBase+(this.salarioBase*aumento);
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "setor='" + setor + '\'' +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
