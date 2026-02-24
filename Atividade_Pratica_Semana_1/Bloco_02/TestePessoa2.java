// Classe de Teste para Pessoa e Endereco
public class TestePessoa2 {
    public static void main(String[] args) {
        // Execução
        System.out.println("Execução do teste no sistema: ");
        System.out.println(); // Pula uma linha 

        // Instanciando Pessoa 1
        Pessoa2 pessoa1 = new Pessoa2();
        pessoa1.nome = "Rafael";
        pessoa1.idade = 38;
        
        // Instanciando Endereco da Pessoa 1
        Endereco end1 = new Endereco();
        end1.rua = "Av. Paulista";
        end1.cidade = "São Paulo";

        // Instanciando Pessoa 2
        Pessoa2 pessoa2 = new Pessoa2();
        pessoa2.nome = "Maria";
        pessoa2.idade = 25;

        // Conectando o Endereço à Pessoa 1 (Composição/Associação)
        pessoa1.endereco = end1;

        // Exibindo dados
        pessoa1.saudar();
        System.out.println(); // Pula uma linha 
        pessoa2.saudar();
    }
}
