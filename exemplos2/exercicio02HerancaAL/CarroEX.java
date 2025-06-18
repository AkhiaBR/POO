public class CarroEX extends VeiculoEX
{
    protected int numeroPortas;

    public CarroEX(String marca, String modelo, int ano, int numeroPortas) {
        super (marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String toString () {
        return "Carro: [Marca: " + this.marca + ", Modelo: " + this.modelo + ", Ano: " + this.ano + ", Número de Portas: " + this.numeroPortas + "]";
    }
}
