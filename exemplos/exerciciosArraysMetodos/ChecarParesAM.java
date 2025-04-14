import javax.swing.*;

public class ChecarParesAM
{
    public static String printarArray (int[] numeros) { // arrays numeros é passado como parâmetro do metodo
        String numerosPares = ""; // faz uma String para armazenar os valores pares

        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                numerosPares += numeros[i] + ", "; // armazena os valores pares
            }
        }

        return numerosPares; // retorna somente os valores pares
    }

    public static void main(String[] args) {
        int [] numeros = new int[3];

        for (int i=0; i<numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        }

        JOptionPane.showMessageDialog(null, "Os números pares digitados são: "+printarArray(numeros)); // define o array numeros como entrada do método
    }
}
