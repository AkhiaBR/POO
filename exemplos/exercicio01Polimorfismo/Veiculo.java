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
        System.out.println("--------------------");
        System.out.println("Código: "+codigo);
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
        System.out.println("Cor: "+cor);
        System.out.println("Peso: "+peso);
        System.out.println("Tamanho: "+tamanho);
    }
}
