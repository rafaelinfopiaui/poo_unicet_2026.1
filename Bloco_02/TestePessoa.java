class TestePessoa {
    public static void main(String[] args) {
        // Execução
        System.out.println("Execução do teste no sistema: ");
        System.out.println(); // Pula uma linha 

        // Instanciando a primeira pessoa (p1)
        Pessoa p1 = new Pessoa();
        p1.nome = "Rafael";
        p1.idade = 38;

        // Instanciando a segunda pessoa (p2)
        Pessoa p2 = new Pessoa();
        p2.nome = "Maria";
        p2.idade = 15;

        // Utilizando o método saudar e verificar maioridade
        p1.saudar();
        System.out.println("Maior de idade: " + (p1.ehMaiorDeIdade() ? "Sim" : "Não"));
        System.out.println(); // Pula uma linha 

        p2.saudar();
        System.out.println("Maior de idade: " + (p2.ehMaiorDeIdade() ? "Sim" : "Não"));
    }
}
