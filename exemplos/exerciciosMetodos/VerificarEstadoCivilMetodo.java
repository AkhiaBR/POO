import javax.swing.JOptionPane;

public class VerificarEstadoCivilMetodo
{
    public static String verificarEstadoCivil () { // static: o metodo verificarEstadoCivil é somente da classe VerificarEstadoCivilMetodo (depois de static precisa adicionar algum termo, ex: String)
        String estadoCivil = JOptionPane.showInputDialog("Digite seu estado civil: Solteiro (S), Casado (C), Viúvo (V) ou Divorciado (D): ");

        if (estadoCivil.equalsIgnoreCase("S")) {
            estadoCivil = "solteiro(a)";
        }
        else if (estadoCivil.equalsIgnoreCase("C")) {
            estadoCivil = "casado(a)";
        }
        else if (estadoCivil.equalsIgnoreCase("V")) {
            estadoCivil = "viúvo(a)";
        }
        else if (estadoCivil.equalsIgnoreCase("D")) {
            estadoCivil = "divorciado(a)";
        }

        return estadoCivil; // quando chamada, o metodo retornara o estado cvil
    }

    public static void main(String[] args) { // void: não retorna (return) nada
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        JOptionPane.showMessageDialog(null,nome+", seu estado civil é: "+verificarEstadoCivil()); // print final
        System.exit(0);
    }
}
