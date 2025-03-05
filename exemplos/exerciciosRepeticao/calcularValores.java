import java.util.Scanner;

public class calcularValores
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = entrada.nextDouble();
        entrada.nextLine(); // pula a linha para que nao seja lido a linha já lida pelo valor1
        System.out.print("Escolha a operação matemática: A (Adição), S (Substração), M (Multiplicação) e D (Divisão): ");
        String op = entrada.nextLine();
        System.out.print("Digite um segundo valor: ");
        double valor2 = entrada.nextDouble();

        if (op.equalsIgnoreCase("A")) {
            double resultado = valor1+valor2;

            System.out.print("O resultado da operação é igual: "+resultado);
        }
        else if (op.equalsIgnoreCase("S")) {
            double resultado = valor1-valor2;

            System.out.print("O resultado da operação é igual: "+resultado);
        }
        else if (op.equalsIgnoreCase("M")) {
            double resultado = valor1*valor2;

            System.out.print("O resultado da operação é igual: "+resultado);
        }
        else if (op.equalsIgnoreCase("D")) {
            double resultado = (valor1/valor2);

            System.out.print("O resultado da operação é igual: "+resultado);
        }
        else {
            System.out.print("ERRO: Valor inserido errado.");
        }
    }
}
