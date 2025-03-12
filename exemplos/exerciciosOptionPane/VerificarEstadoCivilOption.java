import javax.swing.JOptionPane;
public class VerificarEstadoCivilOption
{
    public static void main(String[] args) {
        int contador = 0;
        int contadorS = 0, contadorC = 0, contadorV = 0, contadorD = 0;

        while (contador<2) {
            String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
            String estadoSigla = JOptionPane.showInputDialog("Digite a sigla do seu estado civil S (solteiro), C (casado), V (viúvo) e D (divorciado): ");

            switch (estadoSigla.toUpperCase()) {
                case "S":
                    contador++;
                    contadorS++;
                    JOptionPane.showMessageDialog(null,nome+", você está solteiro");
                    break;
                case "C":
                    contador++;
                    contadorC++;
                    JOptionPane.showMessageDialog(null,nome+", você está casado(a)");
                    break;
                case "V":
                    contador++;
                    contadorV++;
                    JOptionPane.showMessageDialog(null,nome+", você está viúvo(a)");
                    break;
                case "D":
                    contador++;
                    contadorD++;
                    JOptionPane.showMessageDialog(null,nome+", você está divorciado(a)");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"ERRO: Valor inserido inválido");
                    break;
            }
        }
        JOptionPane.showMessageDialog(null,"Total de pessoas: "+
                "\n Solteiro: "+contadorS+
                "\n Casado: "+contadorC+
                "\n Viúvo: "+contadorV+
                "\n Divorciado: "+contadorD);
    }
}
