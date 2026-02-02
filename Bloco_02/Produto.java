public class Produto {
    // Atributos
    String nome;
    double precoUnitario;
    int quantidade;

    // Método
    void exibirTotalEstoque() {
        double total = precoUnitario * quantidade;
        System.out.println("Total em estoque: " + total);
    }
}
