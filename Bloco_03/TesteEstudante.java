public class TesteEstudante {
    public static void main(String[] args) {
        System.out.println("=== Teste do Estudante ===");
        System.out.println(); // Pula uma linha

        // Criando um objeto Estudante
        Estudante est = new Estudante();

        // Inserindo notas de uma vez
        est.setNotas(new double[] { 7.5, 8.0, 6.5, 9.0 });

        // Calculando e exibindo a média das notas
        double media = est.calcularMedia();
        System.out.println("Média das notas: " + media);
    }
}
