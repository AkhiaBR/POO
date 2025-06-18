import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void menu () { // metodo para o print do menu principal:
        System.out.println("---MENU-DE-CADASTROS---");
        System.out.println("1- Limpeza");
        System.out.println("2- Calibração de Pneus");
        System.out.println("3- Troca de Óleo");
        System.out.println("4- Sair");
        System.out.println("-----------------------");
    }

    public static Servico cadastrarServico () { // metodo para cadastrar servicos
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do serviço: ");
        int codigo = Integer.parseInt(sc.nextLine());
        System.out.println("Digite a descrição do serviço: ");
        String descricao = sc.nextLine();
        System.out.println("Digite o nome do técnico responsável: ");
        String tecnicoResponsavel = sc.nextLine();

        return new Servico(codigo, descricao, tecnicoResponsavel); // a metodo funciona como um construtor, retornando o mesmo para a variável que a chamou
    }

    public static Limpeza cadastrarLimpeza (Servico servico) { // metodo para cadastrar supervisor (recebe o objeto servico para continuar o cadastro
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo da limpeza: ");
        String tipo = sc.nextLine();
        System.out.println("Digite o tempo de duração da Limpeza: ");
        double tempoDuracao = Double.parseDouble(sc.nextLine());
        System.out.println("Digite o valor da limpeza: ");
        double valor = Double.parseDouble(sc.nextLine());

        return new Limpeza(servico.codigo, servico.descricao, servico.tecnicoResponsavel, tipo, tempoDuracao, valor); // a metodo funciona como um construtor, retornando o mesmo para a variável que a chamou
    }

    public static CalibracaoPneu cadastrarCalibracaoPneu (Servico servico) { // metodo para cadastrar supervisor (recebe o objeto servico para continuar o cadastro
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o formato da Pneu: ");
        String formato = sc.nextLine();
        System.out.println("Digite o tempo de duração do Pneu: ");
        double tempoDuracao = Double.parseDouble(sc.nextLine());
        System.out.println("Digite o valor do Pneu: ");
        double valor = Double.parseDouble(sc.nextLine());

        return new CalibracaoPneu(servico.codigo, servico.descricao, servico.tecnicoResponsavel, formato, tempoDuracao, valor); // a metodo funciona como um construtor, retornando o mesmo para a variável que a chamou
    }

    public static TrocaOleo cadastrarTrocaOleo (Servico servico) { // metodo para cadastrar supervisor (recebe o objeto servico para continuar o cadastro
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a marca do óleo: ");
        String marca = sc.nextLine();
        System.out.println("Digite o tempo de duração do Pneu: ");
        double tempoDuracao = Double.parseDouble(sc.nextLine());
        System.out.println("Digite o valor do Pneu: ");
        double valor = Double.parseDouble(sc.nextLine());

        return new TrocaOleo(servico.codigo, servico.descricao, servico.tecnicoResponsavel, marca, tempoDuracao, valor); // a metodo funciona como um construtor, retornando o mesmo para a variável que a chamou
    }

    public static void mostrarInformacoes (Servico servico) { // metodo para mostrar as informacoes de cada servico no array
        System.out.println(servico.toString());
    }

    public static void main(String[] args) {
        ArrayList<Servico> servicos = new ArrayList<>();
        ArrayList<Limpeza> limpezas = new ArrayList<>();
        ArrayList<CalibracaoPneu> calibracaoPneus = new ArrayList<>();
        ArrayList<TrocaOleo> trocaOleos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();

            int op = Integer.parseInt(sc.nextLine());

            if (op == 1) {
                Servico servico = cadastrarServico(); // o construtor do objeto servico é passado pelo metodo cadastrarServico
                Limpeza limpeza = cadastrarLimpeza(servico); // para continuar o cadastro do funcionar com a classe especifica (filha), o objeto servico é passado como parâmetro no construtor de supervisor

                servicos.add(limpeza); // adiciona o servico ao ArrayList de servicos
                limpezas.add(limpeza);
            }
            else if (op == 2) {
                Servico servico = cadastrarServico(); // o construtor do objeto servico é passado pelo metodo cadastrarServico
                CalibracaoPneu calibracaoPneu = cadastrarCalibracaoPneu(servico); // para continuar o cadastro do funcionar com a classe especifica (filha), o objeto servico é passado como parâmetro no construtor de supervisor

                servicos.add(calibracaoPneu); // adiciona o servico ao ArrayList de servicos
                calibracaoPneus.add(calibracaoPneu);
            }
            else if (op == 3) {
                Servico servico = cadastrarServico(); // o construtor do objeto servico é passado pelo metodo cadastrarServico
                TrocaOleo trocaOleo = cadastrarTrocaOleo(servico); // para continuar o cadastro do funcionar com a classe especifica (filha), o objeto servico é passado como parâmetro no construtor de supervisor

                servicos.add(trocaOleo); // adiciona o servico ao ArrayList de servicos
                trocaOleos.add(trocaOleo);
            }
            else if (op == 4) {
                break;
            }
            else {
                System.out.println("ERRO: Valor inserido inválido.");
            }
        }

        System.out.println("Serviços de limpeza cadastrados: ");

        for (Limpeza limpeza : limpezas) {
            if (limpezas.size()<0) {
                System.out.println("ArrayList limpezas está vazio");
            }
            else {
                double valorTotal = limpeza.calcularCustos(limpeza.tempoDuracao, limpeza.valor);
                System.out.println("Valor total da limpeza "+limpeza+": "+valorTotal);
            }
        }

        System.out.println("Serviços das calibrações de pneus cadastrados: ");

        for (CalibracaoPneu calibracaoPneu : calibracaoPneus) {
            if (calibracaoPneus.size()<0) {
                System.out.println("ArrayList calibracaoPneus está vazio");
            }
            else {
                double valorTotal = calibracaoPneu.calcularCustos(calibracaoPneu.tempoDuracao, calibracaoPneu.valor);
                System.out.println("Valor total da calibracaoPneu "+calibracaoPneu+": "+valorTotal);
            }
        }

        System.out.println("Serviços de trocas de óleo cadastrados: ");

        for (TrocaOleo trocaOleo : trocaOleos) {
            if (trocaOleos.size()<0) {
                System.out.println("ArrayList trocaOleos está vazio");
            }
            else {
                double valorTotal = trocaOleo.calcularCustos(trocaOleo.tempoDuracao, trocaOleo.valor);
                System.out.println("Valor total da troca de óleo "+trocaOleo+": "+valorTotal);
            }
        }

        System.out.println("Servicos Gerais cadastrados no ArrayList: ");

        for (Servico servico : servicos) { // percorre o ArrayList de servicos, agregando cada iteracao a variavel servico
            if (servicos.size()<0) {
                System.out.println("ArrayList servicos está vazio");
            }
            else {
                System.out.println("--------------------------------------------------");
                mostrarInformacoes(servico); // passa como parametro o servico
            }
        }
    }
}