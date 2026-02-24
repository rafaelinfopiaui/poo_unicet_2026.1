// Classe Pessoa2 com Composição
public class Pessoa2 {
    // Atributos
    String nome;
    int idade;
    Endereco endereco; // Atributo do tipo Endereco (Composição)

    // Método Saudar
    void saudar() {
        // Imprimindo o nome e a idade
        System.out.println("Olá! Eu sou " + nome + ", tenho " + idade + " anos.");
        // Imprimindo o endereço, se existir
        if (endereco != null) {
            System.out.println("Moro no endereço: " + endereco.rua + ", na cidade: " + endereco.cidade + ".");
        } else {
            System.out.println("Não possuo endereço cadastrado.");
        }
    }
}
