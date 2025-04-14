import javax.swing.*;
import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class CadastrarFuncionariosAM
{
    public static void main(String[] args) {
        String [] funcionarios = new String [2];
        String [] cargos = new String [2];
        double [] salarios = new double [2];

        for (int i=0; i<funcionarios.length; i++) {
            String nome = JOptionPane.showInputDialog("Digite o nome do funcionário: ");
            funcionarios[i] = nome;

            String cargo = JOptionPane.showInputDialog("Digite o cargo: ");
            cargos[i] = cargo;

            double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário dele: "));
            salarios[i] = salario;
        }

        JOptionPane.showMessageDialog(null, "Funcionários: "+Arrays.toString(funcionarios)+
                                                                    "\nCargos: "+Arrays.toString(cargos)+
                                                                    "\nSalários: "+Arrays.toString(salarios));
    }
}
