import java.util.Scanner;

public class verificarIdade
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int contadorMenor=0,contadorMaior=0,contadorM=0,contadorF=0;

        while (contador < 2) {
            contador+=1;
            String nomeSexo = "NULL";

            System.out.print("Digite seu nome: ");
            String nome = entrada.nextLine();
            System.out.print("Qual o seu sexo? M (Masculino) ou F (Feminino): ");
            String sexo = entrada.nextLine();
            System.out.print("Qual sua idade?: ");
            int idade = entrada.nextInt();
            entrada.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                contadorM++;
                nomeSexo = "Masculino";
            }
            else if (sexo.equalsIgnoreCase("F")) {
                contadorF++;
                nomeSexo = "Feminino";
            }
            else {
                System.out.print("ERRO: Valor inserido errado.");
            }

            if (idade<18) {
                contadorMenor++;
            }
            else if (idade>=18) {
                contadorMaior++;
            }
            else {
                System.out.print("ERRO: Valor inserido errado.");
            }

            System.out.println(nome+", seu sexo é: "+nomeSexo+" e você tem "+idade+" anos");
            System.out.println("------------------------------------------");
        }

        System.out.println("Total sexos na universidade: ");
        System.out.println("Masculino: "+contadorM);
        System.out.println("Feminino: "+contadorF);
        System.out.println("------------------------------------------");
        System.out.println("Total de maiores e menores de idade: ");
        System.out.println("Maior de idade: "+contadorMaior);
        System.out.println("Menor de idade: "+contadorMenor);
    }
}
