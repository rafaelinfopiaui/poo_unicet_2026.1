// Definição do molde
public class Celular {
    // Atributos (o que o objeto sabe)
    String marca;
    int bateria;

    // Comportamento (o que o objeto faz)
    void mostrarStatus() {
        System.out.println("Marca: " + marca);
        System.out.println("Carga da Bateria: " + bateria + "%");
    }
}