import javax.swing.*;

public class ArmazenarInteiros
{
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int quantidadeNegativos = 0;
        int quantidadePositivos = 0;

        for (int i=0; i<10; i++) { // define a variável 'i' e já faz as condições
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: ")); // acrescenta o input na posicao 'i' no array numeros[]
        }

        for (int i=0; i<10; i++) {
            if (numeros[i] < 0) {
                quantidadeNegativos++;
            }
            else if (numeros[i] > 0) {
                quantidadePositivos++;
            }
        }

        JOptionPane.showMessageDialog(null, "Quantidade de números positivos: "+quantidadePositivos+
                                                                    "\n Quantidade de números negativos: "+quantidadeNegativos);
        System.exit(0); // encerra o programa
    }
}
