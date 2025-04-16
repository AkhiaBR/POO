import javax.swing.*;

public class Exercicio03
{
    // Metodo de verificar salario
    public static String VerificarSalario (double [] salarios) { // recebe como parametro o array salarios
        double maiorSalario = salarios[0], menorSalario = salarios[0]; // define que o primeiro salario sera o maior e o menor primeiramente

        for (int i=0; i<salarios.length; i++) { // inicia uma variavel i que irá corresponder a posicao do elementro inserido no array
            if (salarios[i]<menorSalario) { // se o elemento for menor do que o menor salário:
                menorSalario = salarios[i]; // o menor salário se torna o elementro
            }
            if (salarios[i]>maiorSalario) {
                maiorSalario = salarios[i];
            }
        }

        String resultado = ("O maior salário entre os funcionários é igual a: "+maiorSalario+", já o menor salário é igual a: "+menorSalario); // define uma variável para ser retornada

        return (resultado);
    }

    // Metodo para calcular novo salario
    public static Double CalcularNovoSalario (String cargo, double salario) { // recebe como parametros o cargo e o salario
        double aumento = 0, novoSalario = 0; // inicia o aumento e o novo salario como 0

        // Dependendo da escolha do cargo, as variáveis irão se adaptar
        if (cargo.equalsIgnoreCase("A")) {
            aumento = 0.08;
            novoSalario = salario+(salario*aumento);
        }
        else if (cargo.equalsIgnoreCase("P")) {
            aumento = 0.10;
            novoSalario = salario+(salario*aumento);
        }
        else if (cargo.equalsIgnoreCase("G")) {
            aumento = 0.05;
            novoSalario = salario+(salario*aumento);
        }

        return (novoSalario); // retorna o novo salario
    }

    // Metodo main
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Quantos funcionários deseja cadastrar?: ")); // define o tamanho do array que corresponde aos funcionarios

        // inicializacao dos arrays
        String [] nomes = new String[tamanho];
        String [] cargos = new String[tamanho];
        double [] salarios = new double[tamanho];

        for (int i=0; i<tamanho; i++) { // enquanto i for menor que a quantidade de funcionarios:
            // input:
            String nome = JOptionPane.showInputDialog("Digite o nome do funcionário: ");
            String cargo = JOptionPane.showInputDialog("Qual o cargo do funcionário? Analista Sistemas (A), Programador (P) ou Gerente Projetos (G): ");
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário desse funcionário: "));

            JOptionPane.showMessageDialog(null, "O funcionário: "+nome+", tem o novo salário de: "+CalcularNovoSalario(cargo, salario)); // define um print, definindo parametros para um metodo, que retorna os valores necessarios

            // agrega as variaveis para seus arrays correspondentes
            nomes[i] = nome;
            cargos[i] = cargo;
            salarios[i] = salario;
        }

        JOptionPane.showMessageDialog(null, VerificarSalario(salarios)); // printa uma mensagem com JOptionPane, já passando parametros para o metodo VerificarSalario
    }
}
