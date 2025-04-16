import javax.swing.*;

public class Exercicio04
{
    public static String VerificarSenha (String senha) {
        if (senha.contains("A") || (senha.contains("E") || (senha.contains("I") || (senha.contains("O") || (senha.contains("U")))))) { // se na senha conter as vogais definidas:
            String resultado = ("Senha VÁLIDA: "+senha); // A senha é válida
            return (resultado); // retorna resultado
        }
        else { // caso contrário
            String resultado = ("Senha INVÁLIDA: "+senha); // a senha é inválida
            return (resultado); // retorna resultado
        }
    }

    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Digite uma senha: "); // input da senha

        if (senha.length() >= 4 && senha.length() <= 10 ) { // se a senha for maior ou igual a 4 digitos e menor ou igual a 10 digitos:
            JOptionPane.showMessageDialog(null, VerificarSenha(senha));
        }
        else { // caso contrário:
            JOptionPane.showMessageDialog(null, "ERRO: Tamanho inválido.");
        }
    }
}
