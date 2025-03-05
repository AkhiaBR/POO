import java.util.Scanner;

public class verificarEstadoCivil
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do indivíduo: ");
        String nome = entrada.nextLine();
        System.out.print("Digite a sigla do seu estado civil: S (Solteiro), C (Casado), V (Viúvo) e D (Divorciado): ");
        String curso = entrada.nextLine();

        if (curso.equalsIgnoreCase("S")) {
            System.out.print(nome+" você é: Solteiro");
        }
        else if (curso.equalsIgnoreCase("C")) {
            System.out.print(nome+" você é: Casado");
        }
        else if (curso.equalsIgnoreCase("V")) {
            System.out.print(nome+" você é: Viúvo");
        }
        else if (curso.equalsIgnoreCase("D")) {
            System.out.print(nome+" você é: Divorciado");
        }
        else {
            System.out.print("ERRO: Valor inserido errado.");
        }
    }
}
