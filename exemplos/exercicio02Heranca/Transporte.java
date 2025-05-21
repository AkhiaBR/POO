public class Transporte
{
    protected String descricao;
    protected double tamanho;
    protected double peso;

    public Transporte (String descricao, double tamanho, double peso) {
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public void getDados() {
        System.out.println("DADOS DO TRANSPORTE:");
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Tamanho: " + this.tamanho + " metros");
        System.out.println("Peso: " + this.peso + " kg");
    }
}
