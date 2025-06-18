public class Tecnico extends Funcionario
{
    protected String tipo;

    public Tecnico(int matricula, String nome, String sexo, int idade, double salarioBase, String tipo) {
        super(matricula, nome, sexo, idade, salarioBase);
        this.tipo = tipo;
    }

    @Override
    public double calcularSalario() {
        double aumento = 0.1;
        double salarioFinal = this.salarioBase+(this.salarioBase*aumento);
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "tipo='" + tipo + '\'' +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
