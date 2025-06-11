public class AnimalHAL
{
    protected String nome;
    protected int idade;

    public AnimalHAL(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String alimentacao() {
        return "-- O animal "+this.nome+" está se alimentando.";
    }

    public String getNome () {
        return this.nome;
    }

    public int getIdade () {
        return this.idade;
    }

    public String toString() {
        return "Animal: [Nome: " + getNome() + ", Idade: " + getIdade() + "]" +
                "\n"+alimentacao();
    }
}
