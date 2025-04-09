import javax.swing.*;

public class CalcularMaiorArray
{
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        int maiorNumero = 0, menorNumero = 0;

        for (int i=0; i<numeros.length; i++) {
            int numero = numeros[i];

            if (numero>maiorNumero) {
                numero = maiorNumero;
            }
            else if (numero<menorNumero){
                numero = menorNumero;
            }
        }

        JOptionPane.showMessageDialog(null, "O maior número é: "+maiorNumero+
                                                                    "\nO menor número é: "+menorNumero);


    }
}
