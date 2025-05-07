public class Caminhao extends Veiculo
{
    public int numeroRodas;
    public String tipoCategoria;
    public String placa;
    public String combustivel;

    public Caminhao (int codigo, String marca, String modelo, int ano, String cor, double peso, double tamanho, int numeroRodas, String tipoCategoria, String placa, String combustivel) {
        super(codigo, marca, modelo, ano, cor, peso, tamanho);
        this.numeroRodas = numeroRodas;
        this.tipoCategoria = tipoCategoria;
        this.placa = placa;
        this.combustivel = combustivel;
    }
}
