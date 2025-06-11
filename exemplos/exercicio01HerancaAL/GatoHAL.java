public class GatoHAL extends AnimalHAL
{
    protected String raca;

    public GatoHAL (String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca () {
        return this.raca;
    }

    @Override
    public String alimentacao() {
        return "-- O gato "+this.nome+" está se alimentando.";
    }

    @Override
    public String toString() {
        return "Gato: [Nome: " + getNome() + ", Idade: " + getIdade() + ", Raça: " + getRaca() + "]" +
                "\n"+alimentacao();
    }
}