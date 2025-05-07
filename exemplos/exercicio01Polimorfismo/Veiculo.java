public class Veiculo
{
    public int codigo;
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public double peso;
    public double tamanho;

    // CONSTRUTOR:
    public Veiculo (int codigo, String marca, String modelo, int ano, String cor, double peso, double tamanho) {
        this.codigo = codigo; // (o codigo dessa classe é igual ao codigo importado)
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.peso = peso;
        this.tamanho = tamanho;
    }

    public void dadosVeiculo () {
        System.out.print("--------------------");
        System.out.print("Código: "+codigo);
        System.out.print("Marca: "+marca);
        System.out.print("Modelo: "+modelo);
        System.out.print("Ano: "+ano);
        System.out.print("Cor: "+cor);
        System.out.print("Peso: "+peso);
        System.out.print("Tamanho: "+tamanho);
    }
}
