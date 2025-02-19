import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o nome do seu curso: ");
        String curso = scanner.next();
        System.out.println("Digite o nome da sua disciplina: ");
        String disciplina = scanner.next();
        System.out.println("----------------------------------------------");
        System.out.println("Digite a sua primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite a sua segunda nota: ");
        double n2 = scanner.nextDouble();
        System.out.println("Digite a sua terceira nota: ");
        double n3 = scanner.nextDouble();

        double media = (n1+n2+n3)/3;

        System.out.println("A media final do aluno: "+nome+", "+"curso: "+curso+", "+"disciplina: "+disciplina+", obteve média: "+media);

    }
}
