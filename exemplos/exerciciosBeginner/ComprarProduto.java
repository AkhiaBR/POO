import java.util.Scanner;

public class ComprarProduto
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Qual o nome do produto: ");
        String produto = entrada.nextLine();
        System.out.println("Digite a quantidade do produto: ");
        int quantidade = entrada.nextInt();
        System.out.println("Digite o preço fixo do produto: ");
        double preco = entrada.nextDouble();

        double total = (quantidade*preco);

        System.out.println(nome+", o valor total do produto: "+produto+", teve o valor total de: "+total);
    }
}
