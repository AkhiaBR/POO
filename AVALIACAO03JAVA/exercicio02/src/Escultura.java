public class Escultura extends ObrasArte
{
    protected String tipoMaterial;

    public Escultura (int codigo, String tituloObra, String nomeArtista, String anoCriacao, String tipoMaterial) {
        super(codigo, tituloObra, nomeArtista, anoCriacao);
        this.tipoMaterial = tipoMaterial;
    }

    @Override
    public void getDados () {
        System.out.println("------------------------------------------");
        System.out.println("CÓDIGO DA OBRA: "+this.codigo);
        System.out.println("TÍTULO DA OBRA: "+this.tituloObra);
        System.out.println("NOME DO ARTISTA: "+this.nomeArtista);
        System.out.println("ANO DE CRIAÇÃO: "+this.anoCriacao);
        System.out.println("TIPO DE MATERIAL UTILIZADO NA ESCULTURA: "+this.tipoMaterial);
    }
}
