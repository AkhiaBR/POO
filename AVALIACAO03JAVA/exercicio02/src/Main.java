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
                1- PINTURA
                2- ESCULTURA
                3- SAIR DE CADASTROS
                -----------------
                """);
    }

    public static ObrasArte cadastrarObrasArte () { // O metodo cadastrarObrasArte() retorna um objeto da classe 'ObrasArte', por isso deve-se utilizar o 'ObrasArte' antes do metodo
        Scanner sc = new Scanner(System.in);

        // Input básico:
        System.out.print("Digite o código da obra: ");
        int codigo = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o título da obra: ");
        String tituloObra = sc.nextLine();
        System.out.print("Digite o nome do artista: ");
        String nomeArtista = sc.nextLine();
        System.out.print("Digite o ano de criação da obra: ");
        String anoCriacao = sc.nextLine();

        return new ObrasArte(codigo, tituloObra, nomeArtista, anoCriacao); // O metodo ja retorna o construtor do objeto obra para ser utilizado em outro metodo de classes filhas
    }

    public static void cadastrarPintura (ObrasArte obra, Exposicao exposicao) { // O metodo precisa receber como parametro o objeto da classe pai para realizar o cadastro do objeto da classe filha
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tipo de técnica utilizada para a realização da pintura: ");
        String tipoTecnica = sc.nextLine();

        Pintura pintura = new Pintura(obra.codigo, obra.tituloObra, obra.nomeArtista, obra.anoCriacao, tipoTecnica); // cria o objeto da classe filha utilizando como base os objetos da classe pai que foram passadas como parâmetro

        pintura.getDados();
        exposicao.gerenciarExposicoes();
    }

    public static void cadastrarEscultura (ObrasArte obra, Exposicao exposicao) { // O metodo precisa receber como parametro o objeto da classe pai para realizar o cadastro do objeto da classe filha
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tipo de material utilizado para fazer a escultura: ");
        String tipoMaterial = sc.nextLine();

        Escultura escultura = new Escultura(obra.codigo, obra.tituloObra, obra.nomeArtista, obra.anoCriacao, tipoMaterial); // cria o objeto da classe filha utilizando como base os objetos da classe pai que foram passadas como parâmetro

        escultura.getDados();
        exposicao.gerenciarExposicoes();
    }

    public static Exposicao cadastrarExposicao () { // O metodo precisa receber como parametro o objeto da classe pai para realizar o cadastro do objeto da classe filha
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a data de início da exposição: ");
        String dataInicio = sc.nextLine();
        System.out.println("Digite a data do fim da exposição: ");
        String dataFim = sc.nextLine();
        System.out.println("Digite o local da exposição: ");
        String local = sc.nextLine();

        return new Exposicao(dataInicio, dataFim, local);
    }

    public static void main(String[] args) { // Programa Principal
        Scanner sc = new Scanner(System.in);

        while (true) {
            menu(); // exibe o menu

            int op = Integer.parseInt(sc.nextLine());

            if (op==1) {
                ObrasArte obra = cadastrarObrasArte(); // O construtor do objeto obra está dentro do metodo cadastrarObrasArte()
                Exposicao exposicao = cadastrarExposicao(); // O construtor do objeto exposicao está dentro do metodo cadastrarExposicao()
                cadastrarPintura(obra, exposicao); // passa como parâmetro o objeto obra para poder realizar o cadastro do objeto da classe filha
                System.out.println("--------------------------------------------------");
                System.out.println("SISTEMA: Cadastro da obra realizado com êxito.");
            }
            else if (op==2) {
                ObrasArte obra = cadastrarObrasArte(); // O construtor do objeto obra está dentro do metodo cadastrarObrasArte()
                Exposicao exposicao = cadastrarExposicao(); // O construtor do objeto exposicao está dentro do metodo cadastrarExposicao()
                cadastrarEscultura(obra, exposicao); // passa como parâmetro o objeto obra para poder realizar o cadastro do objeto da classe filha
                System.out.println("--------------------------------------------------");
                System.out.println("SISTEMA: Cadastro da obra realizado com êxito.");
            }
            else if (op==3) {
                System.out.println("SISTEMA: Encerrando o programa...");
                break; // Quebra o laço, encerrando o programa
            }
            else {
                System.out.println("ERRO: Valor inserido inválido no menu de cadastros");
            }
        }
    }
}