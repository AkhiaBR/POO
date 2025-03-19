// Nome do aluno: Fernando Gonçalves
// Turma: 3190

import javax.swing.*; // importa a biblioteca Swing

public class Exercicio01 // classe pública
{
    public static void main(String[] args) { // inicializa o código:
        int contadorJose = 0, contadorMaria = 0, contadorBranco = 0; // inicializa os contadores
        String vencedor = "";

        // loop:
        while (true) {
            int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção desejeada: "+ // menu de opções
                                                                    "\n"+
                                                                    "\n 1- Candidato José"+
                                                                    "\n 2- Candidato Maria"+
                                                                    "\n 3- Voto em Branco"+
                                                                    "\n 4- Encerrar Eleição"));

            // sistema de contagens:
            if (op==1) {
                contadorJose++;
            }
            else if (op==2) {
                contadorMaria++;
            }
            else if (op==3) {
                contadorBranco++;
            }
            else if (op==4) {
                break;
            }
            else {
                JOptionPane.showMessageDialog(null,"ERRO: Valor inserido inválido.");
            }
        }

        // sistema de decisão do vencedor:
        if (contadorJose>contadorMaria) {
            vencedor = "José";
        }
        else if (contadorMaria>contadorJose) {
            vencedor = "Maria";
        }
        else {
            vencedor = "Empate";
        }
        if (contadorBranco>contadorJose || contadorBranco>contadorMaria) {
            JOptionPane.showMessageDialog(null,"Maioria dos votos foi nulo, refaça a eleição.");
            System.exit(0);
        }

        // print do final do programa:
        JOptionPane.showMessageDialog(null, "Total de votos do candidato José: "+contadorJose+
                                                                    "\n Total de votos do candidato Maria: "+contadorMaria+
                                                                    "\n Total de votos nulos: "+contadorBranco+
                                                                    "\n ----------------------------------------------------"+
                                                                    "\n VENCEDOR DA ELEIÇÃO: "+vencedor);
        System.exit(0);
    }
}
