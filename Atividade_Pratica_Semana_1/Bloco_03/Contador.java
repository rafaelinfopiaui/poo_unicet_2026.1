public class Contador {
    // Atributo para armazenar o valor do contador
    int valor;

    // Método para incrementar o valor do contador
    void incrementar() {
        valor++;
    }

    // Método para exibir os números de 0 até o valor atual do contador
    void exibirAteAtual() {
        int i = 0;
        while (i <= valor) {
            System.out.println(i);
            i++;
        }
    }
}
