import javax.swing.*;

public class VerificarNomePessoasArray
{
    public static void main(String[] args) {
        String[] pessoas = {"Maria", "Umberto", "Vicenzo", "Arthur"}; // tem que ser em {} para armazenar mais valores e aspas duplas ("EXEMPLO") porque é uma sequencia de caracteres e nao somente uma ('E')

        String nome = JOptionPane.showInputDialog("Digite algum nome para verificar: ").toLowerCase();
        String todosNomes = "";
        boolean encontrado = false;

        for (int i=0; i<pessoas.length; i++) {
            if (pessoas[i].equalsIgnoreCase(nome)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado==true) {
            JOptionPane.showMessageDialog(null,"O nome: "+nome+" foi encontrado.");
        }
        else {
            JOptionPane.showMessageDialog(null,"O nome: "+nome+" não foi encontrado.");
        }

        for (int i=0; i<pessoas.length; i++) {
            todosNomes += pessoas[i]+"\n";
        }

        JOptionPane.showMessageDialog(null, "ARRAY:"+
                                                            "\n"+todosNomes);
        System.exit(0);
    }
}
