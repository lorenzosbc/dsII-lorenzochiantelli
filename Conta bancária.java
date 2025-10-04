public class ContaBancaria {
    // Atributos
    private String cliente;
    private int numConta;
    private float saldo;

    // Construtor
    public ContaBancaria(String cliente, int numConta, float saldoInicial) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldoInicial;
    }

    // Método para depositar
    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    // Método para sacar (saldo não pode ficar negativo)
    public void sacar(float valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    // Método para exibir informações da conta
    public void exibirInfo() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Número da Conta: " + numConta);
        System.out.println("Saldo: R$" + saldo);
    }

    // Getters e Setters
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public float getSaldo() {
        return saldo;
    }
}
