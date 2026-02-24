// Classe Pessoa
class Pessoa {
    // Atributos
    String nome;
    int idade;

    // Método Saudar
    void saudar() {
        System.out.println("Olá! Eu sou o " + nome + " e tenho " + idade + " anos.");
    }

    // Método para verificar maioridade
    boolean ehMaiorDeIdade() {
        return idade >= 18;
    }
}
