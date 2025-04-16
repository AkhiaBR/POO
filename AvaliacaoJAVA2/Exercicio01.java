import javax.swing.*;

public class Exercicio01
{
    public static void main(String[] args) { // void main
        int contadorPar = 0; // inicializa o contador de numeros pares
        int [][] Matriz = { // inicializa uma matriz (3x2)
                {2,3},
                {3,6},
                {7,2}
        };

        for (int i=0; i<Matriz.length; i++) { // inicializa a variavel i, somando uma unidade de linha de acordo com o tamanho da matriz
            for (int j=0; j<Matriz[i].length; j++) { // inicializa a variavel j, somando uma unidade de coluna de acordo com o tamanho da linha da matriz
                if (Matriz[i][j] % 2 == 0) { // se o elemento dentro da matriz não tiver resto, ele é par
                    contadorPar++; // adiciona uma unidade para o contador par
                }
            }
        }

        JOptionPane.showMessageDialog(null, "O total de número pares é: "+contadorPar);
    }
}
