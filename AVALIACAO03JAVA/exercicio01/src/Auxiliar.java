public class Auxiliar extends Professor
{
    protected String formacao;

    public Auxiliar (String nome, int matricula, String cidade, String estado, String telefone, double salarioBase, String formacao) {
        super(nome, matricula, cidade, estado, telefone, salarioBase);
        this.formacao = formacao;
    }

    @Override
    public void calcularSalarioFinal () {
        double salarioFinal = this.salarioBase+(this.salarioBase*0.10);
        System.out.println("Salário final do Auxiliar: "+salarioFinal);
    }

    @Override
    public void mostrarInformacoes () {
        System.out.println("------------------------------------------");
        System.out.println("Nome do professor: "+this.nome);
        System.out.println("Matrícula do professor: "+this.matricula);
        System.out.println("Cidade do professor: "+this.cidade);
        System.out.println("Estado do professor: "+this.estado);
        System.out.println("Telefone do professor: "+this.telefone);
        System.out.println("Formação do professor: "+this.formacao);
        System.out.println("Salário base do professor: "+this.salarioBase);
        calcularSalarioFinal();
    }
}
