import java.util.Scanner;

public class cadastrarAnimais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Escolher o tipo de animal
        System.out.println("Escolha o tipo de animal (1 - Peixe, 2 - Mamífero): ");
        int escolha = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer de entrada

        // Perguntar os dados comuns para todos os animais
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Comprimento (em cm): ");
        float comprimento = scanner.nextFloat();

        System.out.print("Cor: ");
        String cor = scanner.nextLine();

        System.out.print("Ambiente: ");
        String ambiente = scanner.nextLine();

        System.out.print("Velocidade média (m/s): ");
        float velocidadeMedia = scanner.nextFloat();
        scanner.nextLine();  // Limpar o buffer de entrada

        if (escolha == 1) {
            // Dados específicos para o Peixe
            System.out.print("Característica do peixe: ");
            String caracteristica = scanner.nextLine();

            // Criar o objeto Peixe
            Peixe peixe = new Peixe(nome, comprimento, cor, ambiente, velocidadeMedia, caracteristica);
            System.out.println("\n📋 Relatório do Peixe:");
            peixe.dadosPeixe();
        } else if (escolha == 2) {
            // Dados específicos para o Mamífero
            System.out.print("Alimento do mamífero: ");
            String alimento = scanner.nextLine();

            // Criar o objeto Mamífero
            Mamifero mamifero = new Mamifero(nome, comprimento, cor, ambiente, velocidadeMedia, alimento);
            System.out.println("\n📋 Relatório do Mamífero:");
            mamifero.dadosMamifero();
        } else {
            System.out.println("Opção inválida! Escolha 1 para Peixe ou 2 para Mamífero.");
        }

        scanner.close();
    }
}