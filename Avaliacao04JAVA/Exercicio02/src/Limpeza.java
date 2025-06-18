public class Limpeza extends Servico
{
    protected String tipo;
    protected double tempoDuracao;
    protected double valor;

    public Limpeza(int codigo, String descricao, String tecnicoResponsavel, String tipo, double tempoDuracao, double valor) {
        super(codigo, descricao, tecnicoResponsavel);
        this.tipo = tipo;
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
        return "Custo total da Limpeza: "+valorTotal;
    }

    @Override
    public String toString() {
        return "Limpeza{" +
                "tipo='" + tipo + '\'' +
                ", tempoDuracao=" + tempoDuracao +
                ", valor=" + valor +
                ", codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", tecnicoResponsavel='" + tecnicoResponsavel + '\'' +
                '}';
    }
}
