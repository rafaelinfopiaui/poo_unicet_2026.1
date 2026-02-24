public class TesteConta2 {
    public static void main(String[] args) {
        // Execução
        System.out.println("Iniciando o teste no sistema: ");
        System.out.println(); // Pula uma linha

        // Criando uma nova conta
        Conta2 conta = new Conta2();
        conta.setNumero(123);
        
        // Exibindo o número da conta
        System.out.println("Número da conta: " + conta.getNumero());
        System.out.println(); // Pula uma linha

        // Exibindo o saldo inicial
        System.out.println("Saldo inicial: " + conta.getSaldo());
        System.out.println(); // Pula uma linha
        
        // Depositando valor na conta
        conta.depositar(100.0);
        System.out.println(); // Pula uma linha

        // Exibindo o saldo final
        System.out.println("Saldo final: " + conta.getSaldo());
        System.out.println(); // Pula uma linha
    }
}
