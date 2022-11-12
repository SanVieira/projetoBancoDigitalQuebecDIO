public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void statusConta() {
        System.out.println("--- Status CC ---");
        super.dadosComuns();
    }
}