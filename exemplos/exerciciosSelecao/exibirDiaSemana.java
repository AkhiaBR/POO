import java.util.Scanner;

public class exibirDiaSemana
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero de 1 a 7: ");
        int num = entrada.nextInt();

        switch (num) {
            case 1:
                System.out.print("Dia da semana: Domingo");
                break;
            case 2:
                System.out.print("Dia da semana: Segunda-feira");
                break;
            case 3:
                System.out.print("Dia da semana: Terca-feira");
                break;
            case 4:
                System.out.print("Dia da semana: Quarta-feira");
                break;
            case 5:
                System.out.print("Dia da semana: Quinta-feira");
                break;
            case 6:
                System.out.print("Dia da semana: Sexta-feira");
                break;
            case 7:
                System.out.print("Dia da semana: Sabado");
                break;
            default:
                System.out.print("ERRO: Valor invalido");
                break;
        }
    }
}
