// Avaliação 03 de JAVA - Herança e Polimorfismo
// Aluno: Fernando Gonçalves - 3190

import java.util.Scanner;

public class Main {
    public static void menu() { // Metodo para printar o menu do programa
        // Utiliza um print com um comentário de multiplas linhas
        System.out.println(""" 
                -----------------
                MENU DE CADASTROS
                -----------------
                1- Auxiliar
                2- Temporário
                3- Efetivo
                4- Sair de Cadastros
                -----------------
                """);
    }

    public static Professor cadastrarProfessor () { // O metodo cadastrarProfessor() retorna um objeto da classe 'Professor', por isso deve-se utilizar o 'Professor' antes do metodo
        Scanner sc = new Scanner(System.in);

        // Input básico:
        System.out.print("Digite o nome do professor: ");
        String nome = sc.nextLine();
        System.out.print("Digite o número da matrícula do professor: ");
        int matricula = Integer.parseInt(sc.nextLine());
        System.out.print("Digite a cidade do professor: ");
        String cidade = sc.nextLine();
        System.out.print("Digite o estado do professor: ");
        String estado = sc.nextLine();
        System.out.print("Digite o telefone do professor: ");
        String telefone = sc.nextLine();
        System.out.print("Digite o salário base do professor: ");
        double salarioBase = Double.parseDouble(sc.nextLine());

        return new Professor(nome, matricula, cidade, estado, telefone, salarioBase); // O metodo ja retorna o construtor do objeto professor para ser utilizado em outro metodo de classes filhas
    }

    public static void cadastrarAuxiliar (Professor professor) { // O metodo precisa receber como parametro o objeto da classe pai para realizar o cadastro do objeto da classe filha
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a formação do Auxiliar: ");
        String formacao = sc.nextLine();

        Auxiliar auxiliar = new Auxiliar(professor.nome, professor.matricula, professor.cidade, professor.estado, professor.telefone, professor.salarioBase, formacao); // cria o objeto da classe filha utilizando como base os objetos da classe pai que foram passadas como parâmetro

        auxiliar.mostrarInformacoes();
    }

    public static void cadastrarTemporario (Professor professor) { // O metodo precisa receber como parametro o objeto da classe pai para realizar o cadastro do objeto da classe filha
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a data de início de contrato do Professor Temporário: ");
        String dataInicio = sc.nextLine();
        System.out.print("Digite a data do fim do contrato do Professor Temporário: ");
        String dataFim = sc.nextLine();

        Temporario temporario = new Temporario(professor.nome, professor.matricula, professor.cidade, professor.estado, professor.telefone, professor.salarioBase, dataInicio, dataFim); // cria o objeto da classe filha utilizando como base os objetos da classe pai que foram passadas como parâmetro

        temporario.mostrarInformacoes();
    }

    public static void cadastrarEfetivo (Professor professor) { // O metodo precisa receber como parametro o objeto da classe pai para realizar o cadastro do objeto da classe filha
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a disciplina de formação do Professor Efetivo: ");
        String disciplina = sc.nextLine();
        System.out.print("Digite o número de horas diárias do Professor Efetivo: ");
        double numeroHoras = Double.parseDouble(sc.nextLine());

        Efetivo efetivo = new Efetivo(professor.nome, professor.matricula, professor.cidade, professor.estado, professor.telefone, professor.salarioBase, disciplina, numeroHoras); // cria o objeto da classe filha utilizando como base os objetos da classe pai que foram passadas como parâmetro

        efetivo.mostrarInformacoes();
    }

    public static void main(String[] args) { // Programa Principal
        Scanner sc = new Scanner(System.in);

        while (true) {
            menu(); // exibe o menu

            int op = Integer.parseInt(sc.nextLine());

            if (op==1) {
                Professor professor = cadastrarProfessor(); // O construtor do objeto professor está dentro do metodo cadastrarProfessor()
                cadastrarAuxiliar(professor); // passa como parâmetro o objeto professor para poder realizar o cadastro do objeto da classe filha
                System.out.println("SISTEMA: Cadastro do professor realizado com êxito.");
            }
            else if (op==2) {
                Professor professor = cadastrarProfessor(); // O construtor do objeto professor está dentro do metodo cadastrarProfessor()
                cadastrarTemporario(professor); // passa como parâmetro o objeto professor para poder realizar o cadastro do objeto da classe filha
                System.out.println("SISTEMA: Cadastro do professor realizado com êxito.");
            }
            else if (op==3) {
                Professor professor = cadastrarProfessor(); // O construtor do objeto professor está dentro do metodo cadastrarProfessor()
                cadastrarEfetivo(professor); // passa como parâmetro o objeto professor para poder realizar o cadastro do objeto da classe filha
                System.out.println("SISTEMA: Cadastro do professor realizado com êxito.");
            }
            else if (op==4) {
                System.out.println("SISTEMA: Encerrando o programa...");
                break; // Quebra o laço, encerrando o programa
            }
            else {
                System.out.println("ERRO: Valor inserido inválido no menu de cadastros");
            }
        }
    }
}