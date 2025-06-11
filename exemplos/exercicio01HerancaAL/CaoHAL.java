public class CaoHAL extends AnimalHAL
{
    protected String raca;

    public CaoHAL (String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca () {
        return this.raca;
    }

    @Override
    public String alimentacao() {
        return "-- O cão "+this.nome+" está se alimentando.";
    }

    @Override
    public String toString() {
        return "Cão: [Nome: " + getNome() + ", Idade: " + getIdade() + ", Raça: " + getRaca() +
                "\n"+alimentacao();
    }
}