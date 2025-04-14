import javax.swing.*;

public class ChecarNegativos
{
    public static String printarNegativo (int[] numeros) {
        String numerosNegativos = "";

        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] < 0) {
                numerosNegativos += "[ "+numeros[i]+" ]";
            }
        }

        return numerosNegativos;
    }

    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i=0; i<numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        }

        JOptionPane.showMessageDialog(null, "Números negativos digitados: "+printarNegativo(numeros));
    }
}
