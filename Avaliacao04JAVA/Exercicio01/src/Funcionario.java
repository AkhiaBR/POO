public class Funcionario
{
    protected int matricula;
    protected String nome;
    protected String sexo;
    protected int idade;
    protected double salarioBase;

    public Funcionario(int matricula, String nome, String sexo, int idade, double salarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        double aumento = 0;
        double salarioFinal = this.salarioBase+(this.salarioBase*aumento);
        return salarioFinal;
    }

    public String toString() {
        return "Funcionario{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
