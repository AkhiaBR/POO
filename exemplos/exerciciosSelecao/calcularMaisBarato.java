import java.util.Scanner;

public class calcularMaisBarato
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preco do primeiro produto: ");
        double preco = entrada.nextDouble();
        System.out.print("Digite o preco do segundo produto: ");
        double preco2 = entrada.nextDouble();
        System.out.print("Digite o preco do terceiro produto: ");
        double preco3 = entrada.nextDouble();

        double menorPreco = preco;

        // o menor preco sera o primeiro numero digitado, pois e o primeiro. Os numeros procedentes sempre serao comaparados com o numero digitado anteriormente, que ate entao era o menor numero
        if (menorPreco > preco2) {
            menorPreco = preco2;
        }
        if (menorPreco > preco3) {
            menorPreco = preco3;
        }

        System.out.print("O menor preco registrado foi: "+menorPreco);
    }
}
