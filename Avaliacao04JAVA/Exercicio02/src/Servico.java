public class Servico
{
    protected int codigo;
    protected String descricao;
    protected String tecnicoResponsavel;

    public Servico(int codigo, String descricao, String tecnicoResponsavel) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tecnicoResponsavel = tecnicoResponsavel;
    }

    public double calcularCustos (double tempoDuracao, double valor) {
        double valorTotal = tempoDuracao*valor;
        return valorTotal;
    }

    public String mostrarCusto (double valorTotal) {
        return "Custo total do Serviço: "+valorTotal;
    }

    public String toString() {
        return "Servico{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", tecnicoResponsavel='" + tecnicoResponsavel + '\'' +
                '}';
    }
}
