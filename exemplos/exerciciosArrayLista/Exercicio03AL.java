import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio03AL
{
    public static void bananaExist (ArrayList<String> frutas) {
        boolean achouBanana = false;

        for (String fruta : frutas) { // cria uma variável fruta para se referenciar a cada posicao da lista frutas
            if (fruta.toLowerCase().contains("banana")) {
                achouBanana = true;
                break;
            }
        }

        if (achouBanana) {
            System.out.println("Contém banana");
        }
        else {
            System.out.println("NÃO contém banana");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> frutas = new ArrayList<>(); // cria um array list com o nome "frutas"

        for (int i=0; i<5; i++) {
            System.out.print("Digite uma fruta para adicionar a lista de cinco frutas essenciais: ");
            String fruta = sc.nextLine();
            frutas.add(fruta);
        }

        System.out.println("A lista de cinco frutas: "+frutas);

        bananaExist(frutas);

        sc.close();
    }
}
