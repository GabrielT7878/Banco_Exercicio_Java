package banco;

public class Conta {
    private double saldo;

    public Conta(double saldoInicial){
        saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double amount){
        saldo -= amount;
    }

}
