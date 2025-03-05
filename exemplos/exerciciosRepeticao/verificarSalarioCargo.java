import java.util.Scanner;

public class verificarSalarioCargo
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int contadorA=0,contadorP=0,contadorC=0,contadorV=0;
        double valorTotal = 0; // acumula o total de todos os salarios a cada loop percorrido

        while (contador < 50) {
            contador+=1;
            String nomeCargo = "NULL";

            System.out.print("Digite seu nome: ");
            String nome = entrada.nextLine();
            System.out.print("Qual seu cargo? A (Almoxarifado), P (Produção), C (Contabilidade) e V (Vendas): ");
            String cargo = entrada.nextLine();
            System.out.print("Qual o valor do seu salário?: ");
            double salario = entrada.nextDouble();
            valorTotal+=salario;
            entrada.nextLine();

            if (cargo.equalsIgnoreCase("A")) {
                contadorA++;
                nomeCargo = "Almoxarifado";
            }
            else if (cargo.equalsIgnoreCase("P")) {
                contadorP++;
                nomeCargo = "Produção";
            }
            else if (cargo.equalsIgnoreCase("C")) {
                contadorC++;
                nomeCargo = "Contabildade";
            }
            else if (cargo.equalsIgnoreCase("V")) {
                contadorV++;
                nomeCargo = "Vendas";
            }
            else {
                System.out.print("ERRO: Valor inserido errado.");
            }

            System.out.println(nome+", seu curso é: "+nomeCargo);
            System.out.println("------------------------------------------");
        }

        System.out.println("Total de alunos nos referentes cursos: ");
        System.out.println("Almoxarifado: "+contadorA);
        System.out.println("Produção: "+contadorP);
        System.out.println("Contabilidade: "+contadorC);
        System.out.println("Vendas: "+contadorV);
        System.out.println("------------------------------------------");
        System.out.println("Valor total dos salários: "+valorTotal);
    }
}
