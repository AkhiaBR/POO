import javax.swing.*;
import java.util.Arrays;

public class ArrayCopyExampleArray
{
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int [] copiaArray = new int[array.length];

                        // (origem, posicao, destino, posicao, numero de posicoes a serem copiadas)
        System.arraycopy(array, 0, copiaArray, 0, array.length);

        String mensagem = "Array original: "+Arrays.toString(array)+
                "\nArray copiado: "+Arrays.toString(copiaArray);

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
