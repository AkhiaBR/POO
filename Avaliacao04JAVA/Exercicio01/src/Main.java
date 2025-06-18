import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void menu () { // metodo para o print do menu principal:
        System.out.println("---MENU-DE-CADASTROS---");
        System.out.println("1- Supervisor");
        System.out.println("2- Engenheiro");
        System.out.println("3- Técnico");
        System.out.println("4- Sair");
        System.out.println("-----------------------");
    }

    public static Funcionario cadastrarFuncionario () { // metodo para cadastrar funcionario
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a matrícula do funcionário: ");
        int matricula = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.println("Digite o sexo do funcionário: ");
        String sexo = sc.nextLine();
        System.out.println("Digite a idade do funcionário: ");
        int idade = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o salário base do funcionário: ");
        double salarioBase = Double.parseDouble(sc.nextLine());

        return new Funcionario(matricula, nome, sexo, idade, salarioBase); // a metodo funciona como um construtor, retornando o mesmo para a variável que a chamou
    }

    public static Supervisor cadastrarSupervisor (Funcionario funcionario) { // metodo para cadastrar supervisor (recebe o objeto funcionario para continuar o cadastro
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o setor do Supervisor: ");
        String setor = sc.nextLine();

        return new Supervisor(funcionario.matricula, funcionario.nome, funcionario.sexo, funcionario.idade, funcionario.salarioBase, setor); // a metodo funciona como um construtor, retornando o mesmo para a variável que a chamou
    }

    public static Engenheiro cadastrarEngenheiro (Funcionario funcionario) { // metodo para cadastrar engenheiro (recebe o objeto funcionario para continuar o cadastro
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a área de atuação do Engenheiro: ");
        String areaAtuacao = sc.nextLine();

        return new Engenheiro(funcionario.matricula, funcionario.nome, funcionario.sexo, funcionario.idade, funcionario.salarioBase, areaAtuacao); // a metodo funciona como um construtor, retornando o mesmo para a variável que a chamou
    }

    public static Tecnico cadastrarTecnico (Funcionario funcionario) { // metodo para cadastrar tecnico (recebe o objeto funcionario para continuar o cadastro
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo do Técnico: ");
        String tipo = sc.nextLine();

        return new Tecnico(funcionario.matricula, funcionario.nome, funcionario.sexo, funcionario.idade, funcionario.salarioBase, tipo); // a metodo funciona como um construtor, retornando o mesmo para a variável que a chamou
    }

    public static void mostrarInformacoes (Funcionario funcionario) { // metodo para mostrar as informacoes de cada funcionario no array
        System.out.println(funcionario.toString());
    }

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Supervisor> supervisores = new ArrayList<>();
        ArrayList<Engenheiro> engenheiros = new ArrayList<>();
        ArrayList<Tecnico> tecnicos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int contadorSupervisor = 0, contadorEngenheiro = 0, contadorTecnico = 0;

        while (true) {
            menu();

            int op = Integer.parseInt(sc.nextLine());

            if (op == 1) {
                Funcionario funcionario = cadastrarFuncionario(); // o construtor do objeto funcionario é passado pelo metodo cadastrarFuncionario
                Supervisor supervisor = cadastrarSupervisor(funcionario); // para continuar o cadastro do funcionar com a classe especifica (filha), o objeto funcionario é passado como parâmetro no construtor de supervisor

                funcionarios.add(supervisor); // adiciona o funcionario ao ArrayList de funcionarios
                contadorSupervisor++;
            }
            else if (op == 2) {
                Funcionario funcionario = cadastrarFuncionario(); // o construtor do objeto funcionario é passado pelo metodo cadastrarFuncionario
                Engenheiro engenheiro = cadastrarEngenheiro(funcionario); // para continuar o cadastro do funcionar com a classe especifica (filha), o objeto funcionario é passado como parâmetro no construtor de supervisor

                funcionarios.add(engenheiro); // adiciona o funcionario ao ArrayList de funcionarios
                contadorEngenheiro++;
            }
            else if (op == 3) {
                Funcionario funcionario = cadastrarFuncionario(); // o construtor do objeto funcionario é passado pelo metodo cadastrarFuncionario
                Tecnico tecnico = cadastrarTecnico(funcionario); // para continuar o cadastro do funcionar com a classe especifica (filha), o objeto funcionario é passado como parâmetro no construtor de supervisor

                funcionarios.add(tecnico); // adiciona o funcionario ao ArrayList de funcionarios
                contadorTecnico++;
            }
            else if (op == 4) {
                break;
            }
            else {
                System.out.println("ERRO: Valor inserido inválido.");
            }
        }

        System.out.println("Funcionários cadastrados no ArrayList: ");

        for (Funcionario funcionario : funcionarios) { // percorre o ArrayList de funcionarios, agregando cada iteracao a variavel funcionario
            mostrarInformacoes(funcionario); // passa como parametro o funcionario
        }
    }
}