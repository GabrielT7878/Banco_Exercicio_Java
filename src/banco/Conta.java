package banco;

public class Conta {
    private double saldo;

    public Conta(double saldoInicial){
        saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor){
        saldo += valor;
        return true;
    }

    public boolean sacar(double amount) {
        if (amount > saldo) {
            return false;
        } else {
            saldo -= amount;
        }
        return true;
    }

}
