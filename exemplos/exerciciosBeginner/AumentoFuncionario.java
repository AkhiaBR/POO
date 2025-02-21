import java.sql.SQLOutput;
import java.util.Scanner;

public class AumentoFuncionario
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario: ");
        String nome = entrada.nextLine();
        System.out.println("Digite o cargo do funcionario: ");
        String cargo = entrada.nextLine();
        System.out.println("Digite o valor do salario do funcionario: ");
        double salario = entrada.nextDouble();

        double total = (salario+(salario*0.05));

        System.out.println("O funcionario "+nome+", cargo: "+cargo+", obteve um aumento, tendo como total:"+total);
    }
}
