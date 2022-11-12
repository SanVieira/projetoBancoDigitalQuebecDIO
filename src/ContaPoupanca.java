public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void statusConta() {
        System.out.println("--- Status CP ---");
        super.dadosComuns();
    }

}