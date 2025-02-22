import java.util.Scanner;

public class CalcularSalarioBruto
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite o seu numero de horas trabalhadas: ");
        int horasTrabalhadas = entrada.nextInt();
        System.out.print("Digite o valor por hora trabalhada: ");
        double valorHora = entrada.nextDouble();

        double salarioBruto = (valorHora*horasTrabalhadas);

        System.out.print(nome+", seu salario bruto e: "+salarioBruto+", ja seu valor final sera de: "+(salarioBruto-(salarioBruto*0.02))+" com o desconto do INSS");
    }
}
