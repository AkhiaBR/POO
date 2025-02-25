import java.util.Scanner;

public class maiorNumero
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double numero1 = entrada.nextDouble();
        System.out.print("Digite outro numero: ");
        double numero2 = entrada.nextDouble();

        // se o primeiro numero for maior, ele e o mario se nao, automaticamente o segundo numero e o maior
        if(numero1 > numero2) {
            System.out.print("O maior numero e: "+numero1);
        }
        else {
            System.out.print("O maior numero e: "+numero2);
        }
    }
}
