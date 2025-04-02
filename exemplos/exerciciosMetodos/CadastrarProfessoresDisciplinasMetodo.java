import java.sql.SQLOutput;
import java.util.Scanner;

public class CadastrarProfessoresDisciplinasMetodo
{
    public static void cadastrarProfessorMetodo () {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Qual o seu cargo?: ");
        String cargo = entrada.nextLine();

        System.out.println("Nome do professor: "+nome+", cargo: "+cargo);
    }

    public static void cadastrarCursoMetodo () {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Qual o seu cargo?: ");
        int quantidade = entrada.nextInt();

        System.out.println("Nome do curso: "+nome+", quantidade de aulas: "+quantidade);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------------");
            System.out.println("1- CADASTRAR PROFESSOR");
            System.out.println("2- CADASTRAR CURSO");
            System.out.println("--------------------------");
            System.out.print("Digite a opção desejada: ");

            int op = entrada.nextInt();

            if (op==1) {
                cadastrarProfessorMetodo();
                System.out.println("--------------------------");
                System.out.println("Deseja continuar com os cadastros? Sim (S) ou não (N)?: ");
                entrada.nextLine(); // da um clear para que eu possa fazer o input novamente
                String opC = entrada.nextLine();

                if(opC.equalsIgnoreCase("S")) {
                    continue;
                }
                else if (opC.equalsIgnoreCase("N")) {
                    break;
                }
                else {
                    System.out.println("ERRO: Valor Inserido Inválido...");
                }
            }
            else if (op==2) {
                cadastrarCursoMetodo();
                System.out.println("--------------------------");
                System.out.println("Deseja continuar com os cadastros? Sim (S) ou não (N)?: ");
                entrada.nextLine(); // da um clear para que eu possa fazer o input novamente
                String opC = entrada.nextLine();

                if(opC.equalsIgnoreCase("S")) {
                    continue;
                }
                else if (opC.equalsIgnoreCase("N")) {
                    break;
                }
                else {
                    System.out.println("ERRO: Valor Inserido Inválido...");
                }
            }
            else {
                System.out.println("ERRO: Valor Inserido Inválido...");
            }
        }
    }
}
