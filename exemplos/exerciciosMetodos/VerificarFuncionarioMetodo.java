import javax.swing.*;

public class VerificarFuncionarioMetodo
{
    public static void verificarFuncionario () {
        int contador = 0, totalFuncionarios = 0, totalMenos = 0, totalMeio = 0, totalMax = 0;

        while(contador<5) {
            contador++;
            String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
            float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite seu salário: "));

            if (salario<=3000) {
                totalMenos++;
            }
            else if (salario>3000 && salario<=5000) {
                totalMeio++;
            }
            else if (salario>5000) {
                totalMax++;
            }
        }

        JOptionPane.showMessageDialog(null,"Total de funcionários que recebem até R$ 3000,00: "+totalMenos+
                                                                    "\n Total de funcionários que recebem entre R$ 3000,00 e R$ 5000,00: "+totalMeio+
                                                                    "\n Total de funcionários que recebem mais que R$ 5000,00: "+totalMax);
    }

    public static void main(String[] args) {
        verificarFuncionario();
    }
}
