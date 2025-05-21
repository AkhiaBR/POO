import java.util.Scanner;

public class ProgramPOLRE
{
    public static void menu () {
        System.out.print("""
            ------------------
             MENU DE CADASTRO
            ------------------
            1 - Cadastrar Engenheiro
            2 - Cadastrar Diretor
            3 - Cadastrar Secretário
            4 - Cadastrar Gerente
            5 - Parar Cadastro
            Escolha uma opção:
            """);
    }

    public static FuncionarioRE cadastrarFuncionarioRE () {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do funcionário: ");
        int codigo = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.print("Digite o sexo do funcionário: ");
        String sexo = sc.nextLine();
        System.out.print("Digite o número de horas trabalhadas do funcionário: ");
        double numeroHoras = Double.parseDouble(sc.nextLine());
        System.out.print("Digite o valor por hora trabalhada do funcionário: ");
        double valorHoras = Double.parseDouble(sc.nextLine());

        return new FuncionarioRE(codigo, nome, sexo, numeroHoras, valorHoras);
    }

    public static void cadastrarEngenheiroRE (FuncionarioRE funcionarioRE) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número CREA do engenheiro: ");
        int numeroCREA = Integer.parseInt(sc.nextLine());
        System.out.print("Digite a especialização do engenheiro: ");
        String especializacao = sc.nextLine();

        EngenheiroRE engenheiroRE = new EngenheiroRE(funcionarioRE.codigo, funcionarioRE.nome, funcionarioRE.sexo, funcionarioRE.numeroHoras, funcionarioRE.valorHoras, numeroCREA, especializacao);
        engenheiroRE.gerarFolhaPagamento();
    }

    public static void cadastrarDiretorRE (FuncionarioRE funcionarioRE) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a área de gestão do Diretor: ");
        String areaGestao = sc.nextLine();

        DiretorRE diretorRE = new DiretorRE(funcionarioRE.codigo, funcionarioRE.nome, funcionarioRE.sexo, funcionarioRE.numeroHoras, funcionarioRE.valorHoras, areaGestao);
        diretorRE.gerarFolhaPagamento();
    }

    public static void cadastrarSecretarioRE (FuncionarioRE funcionarioRE) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a categoria do secretário: ");
        int categoria = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o setor do secretário: ");
        String setor = sc.nextLine();

        SecretarioRE secretarioRE = new SecretarioRE(funcionarioRE.codigo, funcionarioRE.nome, funcionarioRE.sexo, funcionarioRE.numeroHoras, funcionarioRE.valorHoras, categoria, setor);
        secretarioRE.gerarFolhaPagamento();
    }

    public static void cadastrarGerenteRE (FuncionarioRE funcionarioRE) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o setor do secretário: ");
        String setor = sc.nextLine();

        GerenteRE gerenteRE = new GerenteRE(funcionarioRE.codigo, funcionarioRE.nome, funcionarioRE.sexo, funcionarioRE.numeroHoras, funcionarioRE.valorHoras, setor);
        gerenteRE.gerarFolhaPagamento();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            menu ();

            int op = Integer.parseInt(sc.nextLine());

            if (op==1) {
                FuncionarioRE funcionarioRE = cadastrarFuncionarioRE();
                cadastrarEngenheiroRE(funcionarioRE);
            }
            else if (op==2) {
                FuncionarioRE funcionarioRE = cadastrarFuncionarioRE();
                cadastrarDiretorRE(funcionarioRE);
            }
            else if (op==3) {
                FuncionarioRE funcionarioRE = cadastrarFuncionarioRE();
                cadastrarSecretarioRE(funcionarioRE);
            }
            else if (op==4) {
                FuncionarioRE funcionarioRE = cadastrarFuncionarioRE();
                cadastrarGerenteRE(funcionarioRE);
            }
            else if (op==5) {
                break;
            }
            else {
                System.out.println("ERRO: Valor inserido do menu inválido");
            }
        }
    }
}
