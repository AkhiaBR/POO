public class Conta
{
    protected double saldo = 0; // inicia a variável saldo

    public Conta (double saldoInicial) { // recebe o valor do saldoInicial de CadastrarConta
        this.saldo = saldoInicial; // saldo desse arquivo (classe) = saldo dado por parametro em CadastrarConta
    }

    public double depositar (double deposito) {
        saldo += deposito;
        return saldo;
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

    public double getSaldo () {
        return saldo;
    }
}
