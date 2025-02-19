// Exercício 01

import java.util.Scanner;

public class RegistroPessoa
{
    public static void main(String[] args)
    {
        // cria uma variavel chamada scanner utilizando a biblioteca Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // armazena o que será escrito na próxima linha em uma variável
        System.out.println("Digite o seu endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("Digite o nome da sua cidade: ");
        String cidade = scanner.nextLine();
        System.out.println("Digite o nome do seu estado: ");
        String estado = scanner.nextLine();
        System.out.println("Digite o número do seu telefone: ");
        int fone = scanner.nextInt(); // armazena o que será digitado (int) em uma variável

        // Printa tudo
        System.out.print(nome);
        System.out.println(endereco);
        System.out.println(cidade);
        System.out.println(estado);
        System.out.println(fone);
    }
}
