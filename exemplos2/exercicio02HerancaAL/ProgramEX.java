import java.util.ArrayList;
import java.util.Scanner;

public class ProgramEX
{
    public static void menu () {
        System.out.println("--- MENU DE CADASTRO DE CARRO ---");
        System.out.println("1. Cadastrar Carro");
        System.out.println("2. Sair");
        System.out.println("---------------------------------");
        System.out.print("Escolha uma opção: ");
    }

    public static VeiculoEX cadastrarVeiculoEX () {
        Scanner sc = new Scanner(System.in);

        System.out.print("Marca do veículo: ");
        String marca = sc.nextLine();
        System.out.print("Modelo do veículo: ");
        String modelo = sc.nextLine();
        System.out.print("Ano do veículo: ");
        int ano = Integer.parseInt(sc.nextLine());

        return new VeiculoEX(marca, modelo, ano);
    }

    public static CarroEX cadastrarCarroEX (VeiculoEX veiculo) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de portas do carro: ");
        int numeroPortas = Integer.parseInt(sc.nextLine());

        return new CarroEX(veiculo.marca, veiculo.modelo, veiculo.ano, numeroPortas);
    }

    public static void main(String[] args) {
        ArrayList<VeiculoEX> veiculos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            menu ();

            int op = Integer.parseInt(sc.nextLine());

            if (op == 1) {
                VeiculoEX veiculo = cadastrarVeiculoEX();
                CarroEX carro = cadastrarCarroEX(veiculo);
                veiculos.add(carro);
            }
            else if (op == 2) {
                System.out.println("Saindo do programa...");
                break;
            }
            else {
                System.out.println("ERRO: Valor inserido inválido.");
            }
        }

        System.out.println("---------------------------------");
        System.out.println("Veículos cadastrados: ");

        for (VeiculoEX veiculo : veiculos) {
            System.out.println(veiculo.toString());
        }
    }
}
