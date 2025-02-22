import java.util.Scanner;

public class CalcularIMC
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Digite o seu peso: ");
        double peso = entrada.nextDouble();
        System.out.println("Digite o seu altura: ");
        double altura = entrada.nextDouble();

        double imc = peso/(altura*altura);

        System.out.println(nome+", o seu valor de IMC: "+imc);
    }
}
