public class Lampada {
    // Atributos Privados
    private boolean estaLigada;

    // Métodos Públicos
    
    public void ligar() {
        this.estaLigada = true;
    }

    public void desligar() {
        this.estaLigada = false;
    }

    public boolean isEstaLigada() {
        return this.estaLigada;
    }

}
