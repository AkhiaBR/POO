import java.util.Scanner;

public class CalcularFaturaCarro
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de fabrica do veiculo: ");
        double valorFabrica = entrada.nextDouble();

        double valorTotal = (valorFabrica+(valorFabrica*0.20+valorFabrica*0.35));

        System.out.print("O valor total do veicula sera de: R$ "+valorTotal);
    }
}
