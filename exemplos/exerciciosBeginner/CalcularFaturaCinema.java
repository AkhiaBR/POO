import java.util.Scanner;

public class CalcularFaturaCinema
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do ingresso por pessoa: ");
        double ingresso = entrada.nextDouble();

        double totalDia = (ingresso*80)*3;
        double totalSemana = totalDia*7;
        double totalMes = totalDia*30;

        System.out.println("O faturamento total do cinema sera de : "+totalDia+" por dia, "+totalSemana+" por semana, e "+totalMes+" por mes");
    }
}
