public class Estudante {
    // Atributo privado para armazenar as notas
    private double[] notas = new double[4];

    // Método para definir as notas
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    // Método para calcular a média das notas
    double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }
}
