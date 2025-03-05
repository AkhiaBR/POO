import java.util.Scanner;

public class verificarFormacao
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int contadorF=0,contadorM=0,contadorT=0,contadorG=0;

        while (contador < 50) {
            contador+=1;
            String nomeFormacao = "NULL";

            System.out.print("Digite seu nome: ");
            String nome = entrada.nextLine();
            System.out.print("Qual sua formação? F (Ensino Fundamental), M (Ensino Médio), T (Ensino Técnico) e G (Graduação): ");
            String formacao = entrada.nextLine();

            if (formacao.equalsIgnoreCase("F")) {
                contadorF++;
                nomeFormacao = "Ensino fundamental";
            }
            else if (formacao.equalsIgnoreCase("M")) {
                contadorM++;
                nomeFormacao = "Ensino Médio";
            }
            else if (formacao.equalsIgnoreCase("T")) {
                contadorT++;
                nomeFormacao = "Ensino Técnico";
            }
            else if (formacao.equalsIgnoreCase("G")) {
                contadorG++;
                nomeFormacao = "Graduação";
            }
            else {
                System.out.print("ERRO: Valor inserido errado.");
            }

            System.out.println(nome+", seu curso é: "+nomeFormacao);
            System.out.println("------------------------------------------");
        }

        System.out.println("Total de pessoas nas referentes formações: ");
        System.out.println("Ensino Fundamental: "+contadorF);
        System.out.println("Ensino Médio: "+contadorM);
        System.out.println("Ensino Técnico: "+contadorT);
        System.out.println("Graduação: "+contadorG);
    }
}
