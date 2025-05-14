import java.util.Scanner;

public class Program02
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo;
        String nome_funcionario;
        String sexo;
        double numero_horas;
        double valor_horas;

        // Cadastro Engenheiro
        System.out.print("CADASTRO ENGENHEIRO: ");
        System.out.print("Código: ");
        codigo = Integer.parseInt(sc.nextLine());
        System.out.print("Nome: ");
        nome_funcionario = sc.nextLine();
        System.out.print("Sexo: ");
        sexo = sc.nextLine();
        System.out.print("Número de horas trabalhadas: ");
        numero_horas = Double.parseDouble(sc.nextLine());
        System.out.print("Valor da hora trabalhada: ");
        valor_horas = Double.parseDouble(sc.nextLine());

        System.out.print("Número do CREA: ");
        int numero_crea = Integer.parseInt(sc.nextLine());
        System.out.print("Especialização: ");
        String especializacao = sc.nextLine();
        Engenheiro engenheiro = new Engenheiro(codigo, nome_funcionario, sexo, numero_horas, valor_horas, numero_crea, especializacao);

        // Cadastro Diretor
        System.out.print("CADASTRO DIRETOR: ");
        System.out.print("Código: ");
        codigo = Integer.parseInt(sc.nextLine());
        System.out.print("Nome: ");
        nome_funcionario = sc.nextLine();
        System.out.print("Sexo: ");
        sexo = sc.nextLine();
        System.out.print("Número de horas trabalhadas: ");
        numero_horas = Double.parseDouble(sc.nextLine());
        System.out.print("Valor da hora trabalhada: ");
        valor_horas = Double.parseDouble(sc.nextLine());

        System.out.print("Área de gestão: ");
        String area_gestao = sc.nextLine();
        Diretor diretor = new Diretor(codigo, nome_funcionario, sexo, numero_horas, valor_horas, area_gestao);

        // Cadastro Secretário
        System.out.print("CADASTRO SECRETÁRIO: ");
        System.out.print("Código: ");
        codigo = Integer.parseInt(sc.nextLine());
        System.out.print("Nome: ");
        nome_funcionario = sc.nextLine();
        System.out.print("Sexo: ");
        sexo = sc.nextLine();
        System.out.print("Número de horas trabalhadas: ");
        numero_horas = Double.parseDouble(sc.nextLine());
        System.out.print("Valor da hora trabalhada: ");
        valor_horas = Double.parseDouble(sc.nextLine());

        System.out.print("Categoria: ");
        String categoria = sc.nextLine();
        System.out.print("Setor: ");
        String setorSecretario = sc.nextLine();
        Secretario secretario = new Secretario(codigo, nome_funcionario, sexo, numero_horas, valor_horas, categoria, setorSecretario);

        // Cadastro Gerente
        System.out.print("CADASTRO GERENTE: ");
        System.out.print("Código: ");
        codigo = Integer.parseInt(sc.nextLine());
        System.out.print("Nome: ");
        nome_funcionario = sc.nextLine();
        System.out.print("Sexo: ");
        sexo = sc.nextLine();
        System.out.print("Número de horas trabalhadas: ");
        numero_horas = Double.parseDouble(sc.nextLine());
        System.out.print("Valor da hora trabalhada: ");
        valor_horas = Double.parseDouble(sc.nextLine());

        System.out.print("Setor: ");
        String setorGerente = sc.nextLine();
        Gerente gerente = new Gerente(codigo, nome_funcionario, sexo, numero_horas, valor_horas, setorGerente);

        System.out.println("----FOLHA DE PAGAMENTO----");
        System.out.println("Engenheiro: "+engenheiro.calcularSalario()); // somente passar parametros se ouver variáveis fora dos objetos
        System.out.println("Diretor: "+diretor.calcularSalario());
        System.out.println("Secretário: "+secretario.calcularSalario());
        System.out.println("Gerente: "+gerente.calcularSalario());
        System.out.println("--------------------------");
    }
}
