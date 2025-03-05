import java.util.Scanner;

public class cadastrarAlunoCurso
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();
        System.out.print("Digite a sigla do seu curso ADM (Administração), DIR (Direito) e CEX (Comércio Exterior): ");
        String curso = entrada.nextLine();

        if (curso.equalsIgnoreCase("ADM")) {
            System.out.print(nome+" seu curso é: Administração");
        }
        else if (curso.equalsIgnoreCase("DIR")) {
            System.out.print(nome+" seu curso é: Direito");
        }
        else if (curso.equalsIgnoreCase("CEX")) {
            System.out.print(nome+" seu curso é: Comércio Exterior");
        }
        else {
            System.out.print("ERRO: Valor inserido errado.");
        }
    }
}
