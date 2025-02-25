import java.util.Scanner;

public class calcularAprovacaoAluno
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota do aluno:");
        double nota1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota do aluno:");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10) { // confere se o aluno tirou 10 primeiro, pois se nao, ai sim aparece a mensagem de somente aprovado, e ano aprovado com distincao
            System.out.print("O aluno foi aprovado com distincao");
        }
        else if (media >= 7) { // se essa condicao fosse colocada primeira, so seria printado o aprovado, ja que qualquer um que tirar nota 7 sera aprovado
            System.out.print("O aluno foi aprovado");
        }
        else {
            System.out.print("O aluno foi reprovado");
        }
    }
}
