public class Funcionario {
    // Atributos
    String nome;
    String cargo;
    double salario;

    // Método aumentarSalario
    void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
    }
}
