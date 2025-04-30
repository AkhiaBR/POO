public class ContaEspecial extends Conta
{
    public ContaEspecial (double saldoInicial) { // recebe o valor do saldoInicial de CadastrarConta
        super(saldoInicial); //
    }

    public boolean sacar (double saque) {
        double saqueTaxa = saque+(saque*0.02);

        if (saldo>=saque) {
            saldo -= saqueTaxa;
            return true;
        }
        else {
            return false;
        }
    }
}
