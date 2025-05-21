public class Temporario extends Professor
{
    protected String dataInicio;
    protected String dataFim;

    public Temporario (String nome, int matricula, String cidade, String estado, String telefone, double salarioBase, String dataInicio, String dataFim) {
        super(nome, matricula, cidade, estado, telefone, salarioBase);
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    @Override
    public void calcularSalarioFinal () {
        double salarioFinal = this.salarioBase+(this.salarioBase*0.05);
        System.out.println("Salário final do Professor Temporario: "+salarioFinal);
    }

    @Override
    public void mostrarInformacoes () {
        System.out.println("------------------------------------------");
        System.out.println("Nome do professor: "+this.nome);
        System.out.println("Matrícula do professor: "+this.matricula);
        System.out.println("Cidade do professor: "+this.cidade);
        System.out.println("Estado do professor: "+this.estado);
        System.out.println("Telefone do professor: "+this.telefone);
        System.out.println("Início do contrato: "+this.dataInicio);
        System.out.println("Fim do contrato: "+this.dataFim);
        System.out.println("Salário base do professor: "+this.salarioBase);
        calcularSalarioFinal();
    }
}
