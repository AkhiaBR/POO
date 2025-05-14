import java.util.Scanner;

public class Oficina
{
    public void fazerRevisao () {
        System.out.println("Informe a data da revisão: ");
        String dataOficina = new Scanner(System.in).nextLine();
        System.out.println("Informe a descrição do serviço: ");
        String descricaoOficina = new Scanner(System.in).nextLine();
        System.out.println("Informe a o valor do serviço: ");
        double valorServico = new Scanner(System.in).nextDouble();

        System.out.println("Data: "+dataOficina+", Descricao: "+descricaoOficina+", Valor: "+valorServico);
    }

    public void fazerManutencao () {
        System.out.println("Informe a data da manutenção: ");
        String dataOficina = new Scanner(System.in).nextLine();
        System.out.println("Informe a descrição do serviço: ");
        String descricaoOficina = new Scanner(System.in).nextLine();
        System.out.println("Informe a o valor do serviço: ");
        double valorServico = new Scanner(System.in).nextDouble();

        System.out.println("Data: "+dataOficina+", Descricao: "+descricaoOficina+", Valor: "+valorServico);
    }

    public void fazerLimpeza() {
        System.out.println("Informe a data da limpeza: ");
        String dataOficina = new Scanner(System.in).nextLine();
        System.out.println("Informe a descrição do serviço: ");
        String descricaoOficina = new Scanner(System.in).nextLine();
        System.out.println("Informe a o valor do serviço: ");
        double valorServico = new Scanner(System.in).nextDouble();

        System.out.println("Data: "+dataOficina+", Descricao: "+descricaoOficina+", Valor: "+valorServico);
    }

    public void fazerAbastecimento() {
        System.out.println("Informe a data do abastecimento: ");
        String dataOficina = new Scanner(System.in).nextLine();
        System.out.println("Informe a descrição do serviço: ");
        String descricaoOficina = new Scanner(System.in).nextLine();
        System.out.println("Informe a o valor do serviço: ");
        double valorServico = new Scanner(System.in).nextDouble();

        System.out.println("Informe a quantidade de combustível (em litros) abastecido: ");
        double quantidadeCombustivel = new Scanner(System.in).nextDouble();

        System.out.println("Data: "+dataOficina+", Descricao: "+descricaoOficina+", Valor: "+valorServico+", Quantidade: "+quantidadeCombustivel);
    }

}
