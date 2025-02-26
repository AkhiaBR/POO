import java.util.Scanner;

public class reajustarSalario
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // definição das variáveis precocemente, pois se elas forem declaradas dentro de condicionais (ifs), elas não poderão ser chamadas fora das condicionais
        double aumentoP= 0;
        double valorAcrescentado = 0;


        System.out.print("Digite o salário atual do colaborador: ");
        double salario = entrada.nextDouble();

        if (salario<=280) {
            aumentoP = 0.2;
            valorAcrescentado = (salario*aumentoP);
        }
        else if (salario>280 && salario<=700) {
            aumentoP = 0.15;
            valorAcrescentado = (salario*aumentoP);
        }
        else if (salario>700 && salario<=1500) {
            aumentoP = 0.10;
            valorAcrescentado = (salario*aumentoP);
        }
        else if (salario>1500) {
            aumentoP = 0.05;
            valorAcrescentado = (salario*aumentoP);
        }

        System.out.print("O salário anterior era: "+salario+", o percentual aplicado foi de: "+(aumentoP*100)+"%, sendo assim, o valor do aumento foi: "+valorAcrescentado+", logo, o valor final será de: "+(salario+valorAcrescentado));
    }
}
