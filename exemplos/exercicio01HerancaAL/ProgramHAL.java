import java.util.ArrayList;
import java.util.Scanner;

public class ProgramHAL
{
    public static void menu() {
        System.out.println("-----------------------------------");
        System.out.println("1 - Cadastrar Cão");
        System.out.println("2 - Cadastrar Gato");
        System.out.println("3 - Cadastrar Peixe");
        System.out.println("4 - Sair");
        System.out.println("-----------------------------------");
    }

    public static AnimalHAL cadastrarAnimalHAL() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do animal: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade do animal: ");
        int idade = Integer.parseInt(sc.nextLine());

        return new AnimalHAL(nome, idade);
    }

    public static CaoHAL cadastrarCao(AnimalHAL animal) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a raça do cão: ");
        String raca = sc.nextLine();

        return new CaoHAL(animal.nome, animal.idade, raca);
    }

    public static GatoHAL cadastrarGato(AnimalHAL animal) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a raça do gato: ");
        String raca = sc.nextLine();

        return new GatoHAL(animal.nome, animal.idade, raca);
    }

    public static PeixeHAL cadastrarPeixe(AnimalHAL animal) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tipo do peixe: ");
        String tipo = sc.nextLine();

        return new PeixeHAL(animal.nome, animal.idade, tipo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<AnimalHAL> animais = new ArrayList<>();

        while (true) {
            menu();

            int op = Integer.parseInt(sc.nextLine());

            if (op==1) {
                AnimalHAL animal = cadastrarAnimalHAL();
                CaoHAL cao = cadastrarCao(animal); // o objeto da classe filha tem que ser 'exportado' para ser utilizado no comando abaixo, por isso não é um metodo void

                animais.add(cao); // adiciona o animal ao array list animais
            }
            else if (op==2) {
                AnimalHAL animal = cadastrarAnimalHAL();
                GatoHAL gato = cadastrarGato(animal); // o objeto da classe filha tem que ser 'exportado' para ser utilizado no comando abaixo, por isso não é um metodo void

                animais.add(gato); // adiciona o animal ao array list animais
            }
            else if (op==3) {
                AnimalHAL animal = cadastrarAnimalHAL();
                PeixeHAL peixe = cadastrarPeixe(animal); // o objeto da classe filha tem que ser 'exportado' para ser utilizado no comando abaixo, por isso não é um metodo void

                animais.add(peixe); // adiciona o animal ao array list animais
            }
            else if (op==4) {
                break;
            }
            else {
                System.out.println("ERRO: Valor inserido inválido.");
            }
        }

        System.out.println("ANIMAIS CADASTRADOS: ");

        for (AnimalHAL animal : animais) { // cria uma variável animal da classe AnimalHAL que percorre cada item do array list animais
            System.out.println(animal.toString()); // chama a funcao 'toString()' para cada objeto (animal) do array list
        }

        sc.close();
    }
}
