public class CalibracaoPneu extends Servico
{
    protected String formato;
    protected double tempoDuracao;
    protected double valor;

    public CalibracaoPneu(int codigo, String descricao, String tecnicoResponsavel, String formato, double tempoDuracao, double valor) {
        super(codigo, descricao, tecnicoResponsavel);
        this.formato = formato;
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
        return "Custo total da Calibração de Pneu: "+valorTotal;
    }

    @Override
    public String toString() {
        return "CalibracaoPneu{" +
                "formato='" + formato + '\'' +
                ", tempoDuracao=" + tempoDuracao +
                ", valor=" + valor +
                ", codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", tecnicoResponsavel='" + tecnicoResponsavel + '\'' +
                '}';
    }
}
