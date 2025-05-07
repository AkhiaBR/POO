public class Bicicleta extends Veiculo
{
    public int numeroRodas;
    public String tipoCategoria;

    public Bicicleta (int codigo, String marca, String modelo, int ano, String cor, double peso, double tamanho, int numeroRodas, String tipoCategoria) {
        super(codigo, marca, modelo, ano, cor, peso, tamanho);
        this.numeroRodas = numeroRodas;
        this.tipoCategoria = tipoCategoria;
    }
}
