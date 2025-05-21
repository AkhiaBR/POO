public class Terrestre extends Transporte
{
    protected int numeroRodas;

    public Terrestre(String descricao, double tamanho, double peso, int numeroRodas) {
        super (descricao, tamanho, peso);
        this.numeroRodas = numeroRodas;
    }

    @Override
    public void getDados() {
        System.out.println("DADOS DO TRANSPORTE:");
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Tamanho: " + this.tamanho + " metros");
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("Número de rodas: " + this.numeroRodas + " rodas");
    }
}
