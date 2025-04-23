public class Peixe extends Animal {
    private String caracteristica;

    // Construtor
    public Peixe(String nome, float comprimento, String cor, String ambiente, float velocidadeMedia, String caracteristica) {
        super(nome, comprimento, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    // Metodo para exibir dados do peixe
    public void dadosPeixe() {
        super.dados(); // ENVIA OS INPUTS PARA A CLASSE ANIMAL
        System.out.println("Caracter�stica: " + caracteristica);
    }
}