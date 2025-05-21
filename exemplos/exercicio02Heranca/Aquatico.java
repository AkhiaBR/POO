public class Aquatico extends Transporte
{
    protected double alturaMax;

    public Aquatico(String descricao, double tamanho, double peso, double alturaMax) {
        super (descricao, tamanho, peso);
        this.alturaMax = alturaMax;
    }

    @Override
    public void getDados() {
        System.out.println("DADOS DO TRANSPORTE:");
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Tamanho: " + this.tamanho + " metros");
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("Altura máxima: " + this.alturaMax + " metros");
    }
}
