import java.util.Scanner;

public class verificarCursos
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int contadorINF=0,contadorMEC=0,contadorELE=0,contadorDES=0;

        while (contador < 50) {
            contador+=1;
            String nomeCurso = "NULL";

            System.out.print("Digite seu nome: ");
            String nome = entrada.nextLine();
            System.out.print("Qual seu curso? INF (Informática), MEC (Mecatrônica), ELE (Eletrônica) e DES (Design): ");
            String curso = entrada.nextLine();

            if (curso.equalsIgnoreCase("INF")) {
                contadorINF++;
                nomeCurso = "Informática";
            }
            else if (curso.equalsIgnoreCase("MEC")) {
                contadorMEC++;
                nomeCurso = "Mecatrônica";
            }
            else if (curso.equalsIgnoreCase("ELE")) {
                contadorELE++;
                nomeCurso = "Eletrônica";
            }
            else if (curso.equalsIgnoreCase("DES")) {
                contadorDES++;
                nomeCurso = "Design";
            }
            else {
                System.out.print("ERRO: Valor inserido errado.");
            }

            System.out.println(nome+", seu curso é: "+nomeCurso);
            System.out.println("------------------------------------------");
        }

        System.out.println("Total de alunos nos referentes cursos: ");
        System.out.println("Informática: "+contadorINF);
        System.out.println("Mecatrônica: "+contadorMEC);
        System.out.println("Eletrônica: "+contadorELE);
        System.out.println("Design: "+contadorDES);
    }
}
