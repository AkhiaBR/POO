import java.util.Scanner;

public class Exercicio01AL
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] cores = new String[5]; // cria uma lista String com tamanho 5

        for (int i=0; i<cores.length; i++) {
            System.out.print("Digite uma cor: ");
            String cor = sc.nextLine();
            cores[i] = cor; // define que a posicao de i na lista é igual a cor
        }

        for (int i=0; i<cores.length; i++) {
            System.out.println("Cor "+i+": "+cores[i]); // loop para printar as cores
        }
    }
}
