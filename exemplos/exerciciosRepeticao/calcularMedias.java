import java.util.Scanner;

public class calcularMedias
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;

        while (contador < 30) {
            contador+=1;

            System.out.print("Digite seu nome: ");
            String nome = entrada.nextLine();
            System.out.print("Digite sua primeira nota: ");
            double nota1 = entrada.nextDouble();
            System.out.print("Digite sua segunda nota: ");
            double nota2 = entrada.nextDouble();
            entrada.nextLine(); // precisa pular depois de todos os INPUTS

            double resultado = (nota1+nota2)/2;
            System.out.println(nome+", sua média final é: "+resultado);
            System.out.println("------------------------------------------");
        }
    }
}
