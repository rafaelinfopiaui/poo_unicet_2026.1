public class Termometro {
    // Atributo privado para armazenar a temperatura
    private double temperatura;

    // Método público para ajustar a temperatura
    public void ajustarTemperatura(double novaTemp) {
        if (novaTemp < -100) {
            System.out.println("Erro: A temperatura não pode ser inferior a -100°C.");
        } else {
            this.temperatura = novaTemp;
        }
    }

    // Método público para obter a temperatura
    public double getTemperatura() {
        return temperatura;
    }
}
