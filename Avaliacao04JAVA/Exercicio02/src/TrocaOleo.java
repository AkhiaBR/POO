public class TrocaOleo extends Servico
{
    protected String marca;
    protected double tempoDuracao;
    protected double valor;

    public TrocaOleo(int codigo, String descricao, String tecnicoResponsavel, String marca, double tempoDuracao, double valor) {
        super(codigo, descricao, tecnicoResponsavel);
        this.marca = marca;
        this.tempoDuracao = tempoDuracao;
        this.valor = valor;
    }

    @Override
    public double calcularCustos (double tempoDuracao, double valor) {
        double valorTotal = tempoDuracao*valor;
        return valorTotal;
    }

    @Override
    public String mostrarCusto (double valorTotal) {
        return "Custo total da Troca de Óleo: "+valorTotal;
    }

    @Override
    public String toString() {
        return "TrocaOleo{" +
                "marca='" + marca + '\'' +
                ", tempoDuracao=" + tempoDuracao +
                ", valor=" + valor +
                ", codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", tecnicoResponsavel='" + tecnicoResponsavel + '\'' +
                '}';
    }
}
