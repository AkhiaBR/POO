public class Pintura extends ObrasArte
{
    protected String tipoTecnica;

    public Pintura (int codigo, String tituloObra, String nomeArtista, String anoCriacao, String tipoTecnica) {
        super(codigo, tituloObra, nomeArtista, anoCriacao);
        this.tipoTecnica = tipoTecnica;
    }

    @Override
    public void getDados () {
        System.out.println("------------------------------------------");
        System.out.println("CÓDIGO DA OBRA: "+this.codigo);
        System.out.println("TÍTULO DA OBRA: "+this.tituloObra);
        System.out.println("NOME DO ARTISTA: "+this.nomeArtista);
        System.out.println("ANO DE CRIAÇÃO: "+this.anoCriacao);
        System.out.println("TÉCNICA UTILIZADA PARA A PINTURA: "+this.tipoTecnica);
    }
}
