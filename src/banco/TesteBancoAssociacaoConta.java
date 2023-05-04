package banco;

public class TesteBancoAssociacaoConta {
    public static void main(String[] args) {
        boolean Resultado;
        Cliente cliente = new Cliente("Bruno","Henrique");
        Conta conta = new Conta(50_000);
        cliente.setConta(conta);
        Resultado = cliente.getConta().sacar(1_200);
        System.out.println("Sacando 1200 " + Resultado);
        cliente.getConta().depositar(8_525);
        cliente.getConta().sacar(12_800);
        cliente.getConta().sacar(50_000);
        System.out.println(cliente.getConta().getSaldo());
    }
}
