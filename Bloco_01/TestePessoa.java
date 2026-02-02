class TestePessoa {
    public static void main(String[] args) {
        // Instanciando a primeira pessoa (p1)
        Pessoa p1 = new Pessoa();
        p1.nome = "Rafael";
        p1.idade = 38;

        // Instanciando a segunda pessoa (p2)
        Pessoa p2 = new Pessoa();
        p2.nome = "Maria";
        p2.idade = 25;

        // Execução
        System.out.println("Iniciando o teste no sistema: ");

        // Exibindo os dados
        System.out.println("\nDados da Pessoa 1:");
        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);

        System.out.println("\nDados da Pessoa 2:");
        System.out.println("Nome: " + p2.nome);
        System.out.println("Idade: " + p2.idade);

        // Utilizando o método saudar
        System.out.println("\nExecutando o método saudar:");
        System.out.println(); // Pula uma linha
        p1.saudar();
        System.out.println(); // Pula uma linha
        p2.saudar();
    }
}