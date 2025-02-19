import java.util.Scanner;

public class ScannerJava
{
    public static void main(String[] args) {
        double celsius, fahrenheit;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite alguma temperatura em celsius: ");
        celsius = entrada.nextDouble();
        fahrenheit = (9*celsius+160)/5;
        System.out.println("Temperatura em Fahrentheit: "+fahrenheit);
    }
}


