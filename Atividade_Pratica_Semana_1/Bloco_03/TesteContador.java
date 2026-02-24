public class TesteContador {
    public static void main(String[] args) {
        System.out.println("=== Teste do Contador ===");
        System.out.println(); // Pula uma linha

        // Criando um objeto Contador
        Contador c = new Contador();

        // Incrementando o contador 10 vezes usando um laço for
        for (int i = 0; i < 10; i++) {
            c.incrementar();
        }

        // Exibindo os números de 0 até o valor atual do contador
        System.out.println("Contando até " + c.valor + ":");
        c.exibirAteAtual();
    }
}
