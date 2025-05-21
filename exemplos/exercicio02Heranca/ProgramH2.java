import java.util.Scanner;

public class ProgramH2
{
    public static void menu() {
        System.out.print("""
            -------------------
             MENU DE CADASTRO
            -------------------
            1 - Cadastrar Transporte Aquático
            2 - Cadastrar Transporte Terrestre
            3 - Cadastrar Transporte Aéreo
            Escolha uma opção: 
            """);
    }

    public static Transporte cadastrarTransporte() { // "Esse metodo vai retornar (entregar) um objeto do tipo Transporte."
        Scanner sc = new Scanner(System.in);

        System.out.print("Faça uma descrição do transporte a ser utilizado: ");
        String descricao = sc.nextLine();
        System.out.print("Qual o tamanho (comprimento) do transporte?: ");
        double tamanho = Double.parseDouble(sc.nextLine());
        System.out.print("Qual o peso do transporte?: ");
        double peso = Double.parseDouble(sc.nextLine());

        return new Transporte(descricao, tamanho, peso); // Construtor dentro do metodo
    }

    public static void cadastrarAquatico(Transporte transporte) { // Para utilizar o objeto de outro metodo, é preciso passá-lo como parametro desse metodo
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a altura máxima que o transporte aquático pode atingir?: ");
        double alturaMax = Double.parseDouble(sc.nextLine());

        Aquatico aquatico = new Aquatico(transporte.descricao, transporte.tamanho, transporte.peso, alturaMax);

        aquatico.getDados();
    }

    public static void cadastrarTerrestre(Transporte transporte) { // Para utilizar o objeto de outro metodo, é preciso passá-lo como parametro desse metodo
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o número de rodas do transporte terrestre?: ");
        int numeroRodas = Integer.parseInt(sc.nextLine());

        Terrestre terrestre = new Terrestre(transporte.descricao, transporte.tamanho, transporte.peso, numeroRodas);

        terrestre.getDados();
    }

    public static void cadastrarAereo(Transporte transporte) { // Para utilizar o objeto de outro metodo, é preciso passá-lo como parametro desse metodo
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o número de passageiros do transporte aéreo?: ");
        int numeroPassageiros = Integer.parseInt(sc.nextLine());

        Aereo aereo = new Aereo(transporte.descricao, transporte.tamanho, transporte.peso, numeroPassageiros);

        aereo.getDados();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        menu();

        int op = Integer.parseInt(sc.nextLine());

        if(op==1) {
            Transporte transporte = cadastrarTransporte(); // Cria o objeto (o construtor se dá dentro do metodo chamado)
            cadastrarAquatico(transporte);
        }
        else if (op==2) {
            Transporte transporte = cadastrarTransporte(); // Cria o objeto (o construtor se dá dentro do metodo chamado)
            cadastrarTerrestre(transporte);
        }
        else if (op==3) {
            Transporte transporte = cadastrarTransporte(); // Cria o objeto (o construtor se dá dentro do metodo chamado)
            cadastrarAereo(transporte);
        }
        else {
            System.out.println("ERRO: Valor inserido do cadastro inválido");
        }
    }
}
