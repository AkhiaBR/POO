import javax.swing.*;

public class CalcularMaiorArray
{
    public static void main(String[] args) {
        int [] numeros = {7,3,1,6,7,8,5,3,2,9};
        int maiorNumero = numeros[0], menorNumero = numeros[0];

        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
            if (numeros[i] < menorNumero) {
                menorNumero = numeros[i];
            }
        }

        JOptionPane.showMessageDialog(null, "O maior número é: "+maiorNumero+
                                                                    "\nO menor número é: "+menorNumero);


    }
}
