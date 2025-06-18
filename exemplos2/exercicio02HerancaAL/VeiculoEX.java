public class VeiculoEX
{
    protected String marca;
    protected String modelo;
    protected int ano;

    public VeiculoEX(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String toString () {
        return "Veículo: [Marca: " + this.marca + ", Modelo: " + this.modelo + ", Ano: " + this.ano + "]";
    }
}
