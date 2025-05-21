public class Efetivo extends Professor
{
    protected String disciplina;
    protected double numeroHoras;

    public Efetivo (String nome, int matricula, String cidade, String estado, String telefone, double salarioBase, String disciplina, double numeroHoras) {
        super(nome, matricula, cidade, estado, telefone, salarioBase);
        this.disciplina = disciplina;
        this.numeroHoras = numeroHoras;
    }

    @Override
    public void calcularSalarioFinal () {
        double salarioFinal = this.salarioBase+(this.salarioBase*0.20);
        System.out.println("Salário final do Professor Efetivo: "+salarioFinal);
    }

    @Override
    public void mostrarInformacoes () {
        System.out.println("------------------------------------------");
        System.out.println("Nome do professor: "+this.nome);
        System.out.println("Matrícula do professor: "+this.matricula);
        System.out.println("Cidade do professor: "+this.cidade);
        System.out.println("Estado do professor: "+this.estado);
        System.out.println("Telefone do professor: "+this.telefone);
        System.out.println("Disciplina do professor: "+this.disciplina);
        System.out.println("Número de horas diárias: "+this.numeroHoras);
        System.out.println("Salário base do professor: "+this.salarioBase);
        calcularSalarioFinal();
    }
}
