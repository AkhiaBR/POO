public class PeixeHAL extends AnimalHAL
{
    protected String tipo;

    public PeixeHAL (String nome, int idade, String tipo) {
        super(nome, idade);
        this.tipo = tipo;
    }

    public String getTipo () {
        return this.tipo;
    }

    @Override
    public String alimentacao() {
        return "-- O peixe "+this.nome+" está se alimentando.";
    }

    @Override
    public String toString() {
        return "Peixe: [Nome: " + getNome() + ", Idade: " + getIdade() + ", Raça: " + getTipo() + "]" +
                "\n"+alimentacao();
    }
}