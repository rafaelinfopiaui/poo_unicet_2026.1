public class TesteProduto {
    public static void main(String[] args) {
        // Execução
        System.out.println("Execução do teste no sistema: ");
        System.out.println(); // Pula uma linha 

        // Instanciando os produtos
        Produto p1 = new Produto();
        p1.nome = "Caderno";
        p1.precoUnitario = 15.50;
        p1.quantidade = 10;

        Produto p2 = new Produto();
        p2.nome = "Caneta";
        p2.precoUnitario = 2.50;
        p2.quantidade = 50;

        // Exibe os produtos
        System.out.println("Produto: " + p1.nome);
        p1.exibirTotalEstoque();
        System.out.println(); // Pula uma linha 

        System.out.println("Produto: " + p2.nome);
        p2.exibirTotalEstoque();
    }
}
