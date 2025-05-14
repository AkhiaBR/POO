public class Funcionario
{
    public int codigo;
    public String nome_funcionario;
    public String sexo;
    public double numero_horas;
    public double valor_horas;

    public double calcularSalario () {
        return (numero_horas*valor_horas);
    }

    // Construtor
    public Funcionario (int codigo, String nome_funcionario, String sexo, double numero_horas, double valor_horas) {
        this.codigo = codigo;
        this.nome_funcionario = nome_funcionario;
        this.sexo = sexo;
        this.numero_horas = numero_horas;
        this.valor_horas = valor_horas;
    }
}
