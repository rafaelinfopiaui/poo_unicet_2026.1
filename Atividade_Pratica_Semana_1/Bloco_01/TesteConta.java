public class TesteConta {
    public static void main(String[] args) {
        // Criando uma nova conta
        Conta conta = new Conta();
        conta.numero = 123;
        conta.saldo = 500.0;

        // Execução
        System.out.println("Iniciando o teste no sistema: ");
        System.out.println(); // Pula uma linha

        // Exibindo os dados da conta
        System.out.println("Saldo inicial da conta " + conta.numero + ": " + conta.saldo);
        System.out.println(); // Pula uma linha

        // Depositando valor alterando o saldo diretamente
        double valorDeposito = 100.0;
        System.out.println("Depositando: " + valorDeposito);
        conta.saldo = conta.saldo + valorDeposito;
        System.out.println(); // Pula uma linha

        // Exibindo os dados da conta após o depósito
        System.out.println("Saldo final da conta " + conta.numero + ": " + conta.saldo);
    }
}
