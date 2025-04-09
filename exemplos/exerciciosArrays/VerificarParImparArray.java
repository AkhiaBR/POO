import javax.swing.*;

public class VerificarParImparArray
{
    public static void main(String[] args) {
        int [] valores = new int[10];
        int contador = 0, contadorPar = 0, contadorImpar = 0;

        while (contador<=valores.length-1) {
            contador++;
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
            valores[valor] = valor;

                if (valores[valor] % 2 == 0) {
                    contadorPar++;
                }
                else {
                    contadorImpar++;
                }

        }
        JOptionPane.showMessageDialog(null, "Números Pares: "+contadorPar+
                "\nNúmeros Ímpares: "+contadorImpar);
    }
}
