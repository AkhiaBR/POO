import java.sql.SQLOutput;
import java.util.Scanner;

public class calcularCombustivel
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual o tipo de combustível você irá usar? Álcool (A) ou Gasolina (G): ");
        String tipoCombustivel = entrada.nextLine().toUpperCase();
        System.out.print("Informe a quantidade em litros da quantidade de combustível que você deseja colocar: ");
        double litroCombustivel = entrada.nextDouble();
        double descontoPreco = 0;
        double precoLitro = 0;

        if (tipoCombustivel.equals("A")) {
            precoLitro = 1.90;
            if (litroCombustivel<=20) {
                descontoPreco = 0.03;
            }
            else {
                descontoPreco = 0.05;
            }

            System.out.print("O valor total a ser pago por: "+litroCombustivel+" de litros de combustível será igual a: "+(litroCombustivel*precoLitro-((litroCombustivel*precoLitro)*descontoPreco)));
        }
        else if (tipoCombustivel.equals("G")) {
            precoLitro = 2.50;
            if (litroCombustivel<=20) {
                descontoPreco = 0.04;
            }
            else {
                descontoPreco = 0.06;
            }

            System.out.print("O valor total a ser pago por: "+litroCombustivel+" de litros de combustível será igual a: "+(litroCombustivel*precoLitro-(litroCombustivel*precoLitro*descontoPreco)));
        }
        else {
            System.out.print("ERRO: Valor inserido errado.");
        }
    }
}
