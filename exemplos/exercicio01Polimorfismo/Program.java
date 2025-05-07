import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("--------------------");
        System.out.print("Selecione o tipo do seu veículo: ");
        System.out.print("1- Bicicleta");
        System.out.print("2- Automóvel");
        System.out.print("3- Caminhao");
        System.out.print("4- Ônibus");
        System.out.print("--------------------");
        int op = sc.nextInt();

        // SUPER:
        System.out.print("Digite o código do veículo: ");
        int codigo = sc.nextInt();
        System.out.print("Digite a marca do veículo: ");
        String marca = sc.nextLine();
        System.out.print("Digite o modelo do veículo: ");
        String modelo = sc.nextLine();
        System.out.print("Digite o ano do veículo: ");
        int ano = sc.nextInt();
        System.out.print("Digite a cor do veículo: ");
        String cor = sc.nextLine();
        System.out.print("Digite o peso do veículo: ");
        Double peso = sc.nextDouble();
        System.out.print("Digite o tamanho (comprimento) do veículo: ");
        Double tamanho = sc.nextDouble();

        if (op==1) {
            System.out.print("Digite o número de rodas do veículo: ");
            int numeroRodas = sc.nextInt();
            System.out.print("Digite o tipo de categoria do veículo: ");
            String tipoCategoria = sc.nextLine();

            Bicicleta veiculo = new Bicicleta(codigo, marca, modelo, ano, cor, peso, tamanho, numeroRodas, tipoCategoria);

            veiculo.dadosVeiculo();
        }
        else if (op==2) {
            System.out.print("Digite o número de rodas do veículo: ");
            int numeroRodas = sc.nextInt();
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
            int numeroRodas = sc.nextInt();
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
            int numeroRodas = sc.nextInt();
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

        System.out.print("--------------------");
        System.out.print("Serviços para o veículo escolhido: ");
        System.out.print("1- Revisão");
        System.out.print("2- Manutenção");
        System.out.print("3- Limpeza");
        System.out.print("4- Abastecimento");
        System.out.print("--------------------");
        int op2 = sc.nextInt();
    }
}
