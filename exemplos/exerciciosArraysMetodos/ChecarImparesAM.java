import javax.swing.*;

public class ChecarImparesAM
{
    public static String printarArray (int[] numeros) { // arrays numeros é passado como parâmetro do metodo
        String numerosImpares = ""; // faz uma String para armazenar os valores pares

        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                numerosImpares += numeros[i] + ", "; // armazena os valores pares
            }
        }

        return numerosImpares; // retorna somente os valores pares
    }

    public static void main(String[] args) {
        int [] numeros = new int[10];

        for (int i=0; i<numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        }

        JOptionPane.showMessageDialog(null, "Os números ímpares digitados são: "+printarArray(numeros)); // define o array numeros como entrada do método
    }
}
