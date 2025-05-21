public class Aereo extends Transporte
{
    protected int numeroPassageiros;

    public Aereo(String descricao, double tamanho, double peso, int numeroPassageiros) {
        super (descricao, tamanho, peso);
        this.numeroPassageiros = numeroPassageiros;
    }

    @Override
    public void getDados() {
        System.out.println("DADOS DO TRANSPORTE:");
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Tamanho: " + this.tamanho + " metros");
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("Número de passageiros: " + this.numeroPassageiros + " passageiros");
    }
}
