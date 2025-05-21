public class Professor
{
    protected String nome;
    protected int matricula;
    protected String cidade;
    protected String estado;
    protected String telefone;
    protected double salarioBase;

    public Professor (String nome, int matricula, String cidade, String estado, String telefone, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.salarioBase = salarioBase;
    }

    public void calcularSalarioFinal () {
        double salarioFinal = this.salarioBase;
        System.out.println("Salário final do professor: "+salarioFinal);
    }

    public void mostrarInformacoes () {
        System.out.println("------------------------------------------");
        System.out.println("Nome do professor: "+this.nome);
        System.out.println("Matrícula do professor: "+this.matricula);
        System.out.println("Cidade do professor: "+this.cidade);
        System.out.println("Estado do professor: "+this.estado);
        System.out.println("Telefone do professor: "+this.telefone);
        System.out.println("Salário base do professor: "+this.salarioBase);
        calcularSalarioFinal();
    }
}
