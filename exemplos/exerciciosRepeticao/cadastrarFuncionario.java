import java.util.Scanner;

public class cadastrarFuncionario
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do indivíduo: ");
        String nome = entrada.nextLine();
        System.out.print("Digite a sigla do seu curso: T (Técnico), E (Engenheiro de Software), A (Analista Sistemas), P (Programador), W (Web-Designer) e G (Gerente Projetos): ");
        String curso = entrada.nextLine();

        if (curso.equalsIgnoreCase("T")) {
            System.out.print(nome+" você é: Técnico");
        }
        else if (curso.equalsIgnoreCase("E")) {
            System.out.print(nome+" você é: Engenheiro de Software");
        }
        else if (curso.equalsIgnoreCase("A")) {
            System.out.print(nome+" você é: Analista de Sistemas");
        }
        else if (curso.equalsIgnoreCase("P")) {
            System.out.print(nome+" você é: Programador");
        }
        else if (curso.equalsIgnoreCase("W")) {
            System.out.print(nome+" você é: Web-desginer");
        }
        else if (curso.equalsIgnoreCase("G")) {
            System.out.print(nome+" você é: Gerente de Projetos");
        }
        else {
            System.out.print("ERRO: Valor inserido errado.");
        }
    }
}
