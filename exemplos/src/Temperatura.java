// exemplo 01 sobre

public class Temperatura // classe pública com nome: Temperatura
{
       // void - nao retorna nada
       // static - o static funciona como um metodo independente, nao precisa de nada (uma instancia dentro da classe, por exemplo) para executa-lo, pois e estatico. Se nao fosse estatico, o programa nao rodaria, pois nao existe nada para que o Java execute o metodo, ja que e a primeira vez rodando o programa
       // main(String[] args) - array de strings (String[]) que espera um argumento no command-line, por enquanto, esse codigo nao inclui nenhum argumento por cmd, ele so serve para executar o codigo

    public static void main(String[] args)
    {
        double celsius, fah, kelvin, re, ra; // criação de variáveis decimais

        celsius = 30; // valor da temperatura inicial

        // fórmulas:
        fah = celsius * 1.8 + 32;
        kelvin = celsius + 273.15;
        re = celsius * 0.8;
        ra = celsius * 1.8 + 32 + 459.67;

        // print das temperaturas convertidas
        System.out.println("Temperatura em Fahrenheit: "+fah);
        System.out.println("Temperatura em Kelvin: "+kelvin);
        System.out.println("Réaumur: "+re);
        System.out.println("Rankine: "+ra);
    }
}