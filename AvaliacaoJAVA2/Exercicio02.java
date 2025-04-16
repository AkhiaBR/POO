import javax.swing.*;
import java.util.Arrays;

public class Exercicio02
{
    public static void main(String[] args) {
        int [] Array = {2,6,3,3,1,3,8,4,9,10,23,5,1,2,6}; // cria o array
        Arrays.sort(Array); // ordena os elementos em ordem crescente


        JOptionPane.showMessageDialog(null, "Array em ordem decrescente: "+Arrays.toString(Array)); // Printa uma mensagem + utiliza o Arrays para transformar o array em uma String
    }
}
