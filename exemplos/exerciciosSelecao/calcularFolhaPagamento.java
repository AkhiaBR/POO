import java.sql.SQLOutput;
import java.util.Scanner;

public class calcularFolhaPagamento
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual o valor por hora trabalhada de seu emprego?: ");
        double valorHora = entrada.nextDouble();
        System.out.print("Qual foi o total de horas trabalhadas no mês: ");
        double quantidadeMes = entrada.nextDouble();

        double salarioLiquido = 0;
        double salarioBruto = (valorHora*quantidadeMes);
        double descontoINSS = 0.10;
        double descontoFGTS = 0.11;

        if (salarioBruto<=900) {
            salarioLiquido = salarioBruto-(salarioBruto*descontoINSS)-(salarioBruto*descontoFGTS);
        }
        else if (salarioBruto>900 && salarioBruto<=1500) {
            salarioLiquido = salarioBruto-(salarioBruto*descontoINSS)-(salarioBruto*descontoFGTS)-(salarioBruto*0.05); // o desconto é para o salário bruto, sendo assim, o cálculo tem que ser independente para cada 'salarioBruto'
        }
        else if (salarioBruto>1500 && salarioBruto<=2500) {
            salarioLiquido = salarioBruto-(salarioBruto*descontoINSS)-(salarioBruto*descontoFGTS)-(salarioBruto*0.10);
        }
        else if (salarioBruto>2500) {
            salarioLiquido = salarioBruto-(salarioBruto*descontoINSS)-(salarioBruto*descontoFGTS)-(salarioBruto*0.20);
        }

        System.out.print("O valor bruto do seu salário é: "+salarioBruto+", já o salário líquido é igual a: "+salarioLiquido);
    }
}
