// Nome do aluno: Fernando Gonçalves
// Turma: 3190

import javax.swing.*; // import de bibliotecas

public class Exercicio05 // classe pública
{
    public static void main(String[] args) { // inicializa o código:
        int contador = 0, contadorM = 0, contadorF = 0, pesoF = 0; // inicializacao de contadores
        double maiorAltura = 0, menorAltura = 0, mediaPesoF = 0;

        // loop
        while (contador<20) {
            contador++;

            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de sua altura: "));
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu peso: "));
            String sexo = JOptionPane.showInputDialog("Digite o seu sexo: Masculino (M) ou Feminino (F): ");

            menorAltura = altura; // assume que a menor altura sempre será o valor inserido primeiro

            //  atribuição de contadores
            if (sexo.equalsIgnoreCase("M")) {
                contadorM++;
            }
            else if (sexo.equalsIgnoreCase("F")) {
                contadorF++;
                pesoF+=peso;
            }
            else {
                JOptionPane.showMessageDialog(null, "ERRO: Valor inserido inválido. ");
            }

            // define a maior e menor altura:
            if (menorAltura > maiorAltura) {
                maiorAltura = menorAltura;
            }
            else {
                menorAltura = altura;
            }
        }

        mediaPesoF = pesoF/contadorF; // calcula a media de peso

        // print final:
        JOptionPane.showMessageDialog(null, "Maior altura: "+maiorAltura+
                                                                    "\n Menor altura: "+menorAltura+
                                                                    "\n Média de peso das mulheres: "+mediaPesoF+
                                                                    "\n Número de homens: "+contadorM+
                                                                    "\n Número de mulheres: "+contadorF);

    }
}
