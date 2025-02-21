// exemplo 01 sobre

public class Temperatura // classe pública com nome: Temperatura
{
    /* void (método não possui retorno)
       Define o método como estático, isso quer dizer que a classe não precisa ser instanciada para chamar este método.)
       main(String[] args) - array de strings (String[]) e args pois sera recebido um INPUT
     */
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