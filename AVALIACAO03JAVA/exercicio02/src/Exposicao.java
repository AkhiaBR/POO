public class Exposicao
{
    protected String dataInicio;
    protected String dataFim;
    protected String local;

    public Exposicao (String dataInicio, String dataFim, String local) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.local = local;
    }

    public void gerenciarExposicoes () {
        System.out.println("-------------------------------------------------");
        System.out.println("Data de início da Exposição: "+this.dataInicio);
        System.out.println("Data do fim da Exposição: "+this.dataFim);
        System.out.println("Local da exposição: "+this.local);
    }
}
