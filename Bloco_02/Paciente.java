public class Paciente {
    // Atributos
    double peso;
    double altura;

    // Método calcularIMC
    double calcularIMC() {
        return peso / (altura * altura);
    }
}
