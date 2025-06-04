import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio02AL
{
    public static void mostrarAnimaisCincoLetras (ArrayList<String> animaisCincoLetras) { // passa como parametro a lista
        System.out.println("Lista de animais com até cinco letras: "+animaisCincoLetras);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] animais = new String[5];
        ArrayList<String> animaisCincoLetras = new ArrayList<>(); // cria um ArrayList

        for (int i=0; i<animais.length; i++) {
            System.out.print("Digite o animal "+i+": ");
            String animal = sc.nextLine();
            animais[i] = animal;
            if (animais[i].length()<=5) { // se o tamanho do nome for menor ou igual a 5:
                animaisCincoLetras.add(animal); // adiciona esse nome ao array list
            }
        }

        for (int i=0; i<animais.length; i++) {
            System.out.println("Animal "+i+": "+animais[i]);
        }

        mostrarAnimaisCincoLetras(animaisCincoLetras); // chama a funcao para mostrar os animais de até 5 letras
    }
}
