public class ObrasArte
{
    protected int codigo;
    protected String tituloObra;
    protected String nomeArtista;
    protected String anoCriacao;

    public ObrasArte (int codigo, String tituloObra, String nomeArtista, String anoCriacao) {
        this.codigo = codigo;
        this.tituloObra = tituloObra;
        this.nomeArtista = nomeArtista;
        this.anoCriacao = anoCriacao;
    }

    public void getDados () {
        System.out.println("------------------------------------------");
        System.out.println("CÓDIGO DA OBRA: "+this.codigo);
        System.out.println("TÍTULO DA OBRA: "+this.tituloObra);
        System.out.println("NOME DO ARTISTA: "+this.nomeArtista);
        System.out.println("ANO DE CRIAÇÃO: "+this.anoCriacao);
    }
}
