import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.println("Selecione o tipo do seu veículo: ");
        System.out.println("1- Bicicleta");
        System.out.println("2- Automóvel");
        System.out.println("3- Caminhao");
        System.out.println("4- Ônibus");
        System.out.println("--------------------");
        int op = Integer.parseInt(sc.nextLine());

        // SUPER:
        System.out.print("Digite o código do veículo: ");
        int codigo = Integer.parseInt(sc.nextLine());
        System.out.print("Digite a marca do veículo: ");
        String marca = sc.nextLine();
        System.out.print("Digite o modelo do veículo: ");
        String modelo = sc.nextLine();
        System.out.print("Digite o ano do veículo: ");
        int ano = Integer.parseInt(sc.nextLine());
        System.out.print("Digite a cor do veículo: ");
        String cor = sc.nextLine();
        System.out.print("Digite o peso do veículo: ");
        Double peso = Double.parseDouble(sc.nextLine());
        System.out.print("Digite o tamanho (comprimento) do veículo: ");
        Double tamanho = Double.parseDouble(sc.nextLine());

        if (op==1) {
            System.out.print("Digite o número de rodas do veículo: ");
            int numeroRodas = Integer.parseInt(sc.nextLine());
            System.out.print("Digite o tipo de categoria do veículo: ");
            String tipoCategoria = sc.nextLine();

            Bicicleta veiculo = new Bicicleta(codigo, marca, modelo, ano, cor, peso, tamanho, numeroRodas, tipoCategoria);

            veiculo.dadosVeiculo();
        }
        else if (op==2) {
            System.out.print("Digite o número de rodas do veículo: ");
            int numeroRodas = Integer.parseInt(sc.nextLine());
            System.out.print("Digite o tipo de categoria do veículo: ");
            String tipoCategoria = sc.nextLine();
            System.out.print("Digite a placa do veículo: ");
            String placa = sc.nextLine();
            System.out.print("Digite o tipo do combustível: ");
            String combustivel = sc.nextLine();

            Automovel veiculo = new Automovel(codigo, marca, modelo, ano, cor, peso, tamanho, numeroRodas, tipoCategoria, placa, combustivel);

            veiculo.dadosVeiculo();
        }
        else if (op==3) {
            System.out.print("Digite o número de rodas do veículo: ");
            int numeroRodas = Integer.parseInt(sc.nextLine());
            System.out.print("Digite o tipo de categoria do veículo: ");
            String tipoCategoria = sc.nextLine();
            System.out.print("Digite a placa do veículo: ");
            String placa = sc.nextLine();
            System.out.print("Digite o tipo do combustível: ");
            String combustivel = sc.nextLine();

            Caminhao veiculo = new Caminhao(codigo, marca, modelo, ano, cor, peso, tamanho, numeroRodas, tipoCategoria, placa, combustivel);

            veiculo.dadosVeiculo();
        }
        else if (op==4) {
            System.out.print("Digite o número de rodas do veículo: ");
            int numeroRodas = Integer.parseInt(sc.nextLine());
            System.out.print("Digite o tipo de categoria do veículo: ");
            String tipoCategoria = sc.nextLine();
            System.out.print("Digite a placa do veículo: ");
            String placa = sc.nextLine();
            System.out.print("Digite o tipo do combustível: ");
            String combustivel = sc.nextLine();

            Onibus veiculo = new Onibus(codigo, marca, modelo, ano, cor, peso, tamanho, numeroRodas, tipoCategoria, placa, combustivel);

            veiculo.dadosVeiculo();
        }
        else {
            System.out.print("ERRO: Valor inserido inválido.");
        }

        Oficina oficina = new Oficina();

        System.out.println("--------------------");
        System.out.println("Serviços para o veículo escolhido: ");
        System.out.println("1- Revisão");
        System.out.println("2- Manutenção");
        System.out.println("3- Limpeza");
        System.out.println("4- Abastecimento");
        System.out.println("--------------------");
        int op2 = Integer.parseInt(sc.nextLine());

        if (op2==1) {
            oficina.fazerRevisao();
        }
        else if (op2==2) {
            oficina.fazerManutencao();
        }
        else if (op2==3) {
            oficina.fazerLimpeza();
        }
        else if (op2==4) {
            oficina.fazerAbastecimento();
        }
    }
}
