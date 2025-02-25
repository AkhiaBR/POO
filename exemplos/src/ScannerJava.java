import java.util.Scanner;

public class ScannerJava
{
    public static void main(String[] args) {
        double celsius, fahrenheit;

        Scanner entrada = new Scanner(System.in); // cria um objeto ('new Scanner') dentro da classe importada 'Scanner' no comeco do argumento

        System.out.println("Digite alguma temperatura em celsius: ");
        celsius = entrada.nextDouble();
        fahrenheit = (9*celsius+160)/5;
        System.out.println("Temperatura em Fahrentheit: "+fahrenheit);
    }
}


